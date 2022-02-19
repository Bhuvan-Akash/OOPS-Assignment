package oops;

public class SingletonInheritanceCheck {
	private static  SingletonInheritanceCheck one_instance =  null;
	  public String string;
 
	  private  SingletonInheritanceCheck()
	  {
	    string = "Assignment2Q2";
	  }
	 
	  public static  SingletonInheritanceCheck getInstance()
	  {
	    if(one_instance == null) {
	    	one_instance = new SingletonInheritanceCheck();
	    }
	    return one_instance;
	  } 

	public static void main(String[] args) {
 
		 SingletonInheritanceCheck a =  SingletonInheritanceCheck.getInstance();
		 SingletonInheritanceCheck b =  SingletonInheritanceCheck.getInstance();
		 SingletonInheritanceCheck c =  SingletonInheritanceCheck.getInstance();
		 if (a ==b && b==c) {
			 System.out.println("All objects belong to the same inheritnace");
		 }
		 else
			 System.out.println("Not Singleton");
		 
	   
	}

}
