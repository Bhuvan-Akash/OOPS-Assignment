package oops;

public abstract class Shape {
	abstract public String draw();
}
class Rectangle extends Shape{

	@Override
	public String draw() {
		return "Rectangle";
	}
}
class Line extends Shape{

	@Override
	public String draw() {
		return "Line";
	}
}
class Cube extends Shape{

	@Override
	public String draw() {
		return "Cube";
	}
	public class Assignment2Q5 {
		public static void main(String[] args)
		{
			Cube cb=new Cube();
			Line ln=new Line();
			Rectangle rc=new Rectangle();
			System.out.println(cb.draw());
			System.out.println(ln.draw());
			System.out.println(rc.draw());
		}
}
}


