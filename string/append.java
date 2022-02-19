package string;

public class append {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sbf = new StringBuffer("StringBuffer");
        System.out.println("string buffer = " + sbf);
  
        String strvalue = "is a peer class of String that provides much of the functionality of strings";
  
        // Here it appends the Object value
        sbf.append(strvalue);
  
        System.out.println("After appending result is = " + sbf);

	}

}
