package string;

public class lowercase {
	public static void main(String args[]){
		String s1=" Java String pool refers to collection of Strings which are stored in heap\r\n"
				+ "memory ";
		String s1lower=s1.toLowerCase();
		System.out.println(s1lower);
		String s1upper=s1.toUpperCase();  
		System.out.println(s1upper);  
		String replaceString=s1.replace('a','$'); 
		System.out.println(replaceString);
		System.out.println(s1.contains("collection"));
		String s2= "java string pool refers to collection of strings which are stored in heap memory" ;
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		
	}
}
