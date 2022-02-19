package oops;
 import java.util.Scanner;
 public class Assignment2Q2 {
		static int salary = 10000;
		public int getSalary(int salary) {
			return salary;
		}
		public int total_salary(int[] all_salary) {
			int sum=0;
			for(int i=0;i<all_salary.length;i++) {
				sum += all_salary[i];
			}
			return sum;
		}
public static class Employee{
public static class Labour extends Assignment2Q2 {
	@Override
 public int getSalary(int salary) {
		        int overtime = 500;
		        return salary+overtime;
		       
		    }
		}
public static class Manager extends Assignment2Q2 {
	@Override
    public int getSalary(int salary) {
        int incentive = 5000;
        return salary+incentive;
         
} 
}
}
 public static void main(String[] args) {
	  Employee.Manager me = new Employee.Manager();
      System.out.println(me.getSalary(100000));
      Assignment2Q2 all = new Assignment2Q2();
      int[] arr = {12000,35000,24000};
      System.out.println(all.total_salary(arr));
      

	}

}
