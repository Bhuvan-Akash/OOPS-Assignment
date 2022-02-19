package oops3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ASSIGNMENTQ7 {
static Candy objCandy = new Candy();
static Cookie objCookie = new Cookie();
static IceCream objIceCream = new IceCream();
static TotalCost objCost =  new TotalCost();
static Scanner scanner=new Scanner(System.in);
public static void main(String[] args) {
	objCandy.addItem("Kimi");
	objCandy.addItem("Melody");
	objCandy.addItem("Pulse");
	objCookie.addItem("Hide and Seek");
	objCookie.addItem("GoodDay");
	objCookie.addItem("MariGold");
	objIceCream.addItem("Amul");
	objIceCream.addItem("Kwality Wall's");
	objIceCream.addItem("Arun");
	
	System.out.print(selectRoles());
	String role= scanner.nextLine();
	
	String quit = null;
	while(quit!="quit") {
    	System.out.print(roles(role));
    	String select = scanner.nextLine();
    	if(select.equals("Add Item")) {
    		System.out.print(addItems());
    	}
    	else if (select.equals("Display Items")) {
    		System.out.print(displayItems());
		}
    	else if (select.equals("Place Order")) {
    		System.out.print(placeOrder());
    	}
    	else if (select.equals("Get Amount")) {
    		System.out.print(displayTotalCost());
    	}
    	else if(select.equals("quit")) {
    		quit="quit";
    	}
	}
	System.out.println("Thank You");
	
}
private static String selectRoles(){
	return "Select Role \n\"Owner\" or \"Customer\"\n:";
	
}
private static String roles(String role){
	String Operations;
	if(role.equals("Owner")) {
		Operations="\"Add Item\" or \"Display Items\"\n(enter quit if you want to exit)\n:";
	}
	else if(role.equals("Customer")){
		Operations="\"Place Order\" or \"Get Amount\"(enter quit if you want to exit)\n:";
	}
	else {
		Operations="enter corrct role as show above";
	}
	return Operations;
}
private static String addItems() {
	System.out.print("Enter the Desert you want to add (i.e : Candy , Cooky , IceCream)\n:");
	String item = scanner.next();
	if(item.equals("Candy")) {
		System.out.println("Enter Name of Candy\n:");
		String candyName = scanner.next();
		objCandy.addItem(candyName);
	}
	else if (item.equals("Cooky")) {
		System.out.println("Enter Name of Cooky\n:");
		String cookyName = scanner.next();
		objCookie.addItem(cookyName);
	}
	else if(item.equals("IceCream")) {
		System.out.println("Enter Name of IceCream\n:");
		String iceCreamName = scanner.next();
		objIceCream.addItem(iceCreamName);
	}
	return item+" added successfully\n";
}
private static List<String> displayItems() {
	List<String> itemsList = new ArrayList<>();
	System.out.println("Enter the Desert want you to display (i.e : Candy , Cooky , IceCream)\n:");
	String item = scanner.next();
	if(item.equals("Candy"))
		itemsList=objCandy.getList();
	else if (item.equals("Cooky")) {
		itemsList=objCookie.getList();
	}
	else if(item.equals("IceCream")) {
		itemsList=objIceCream.getList();
	}
	return itemsList;
}
private static String placeOrder() {
	System.out.println("Enter the Desert want you to Place order (i.e : Candy , Cooky , IceCream)\n");
	String item = scanner.next();
	if(item.equals("Candy")) {
		System.out.println(objCandy.getList());
		System.out.print("Enter the candy you want from above list:");
		String candy = scanner.next();
		System.out.print("Enter the quantity you want: ");
		int quantity = scanner.nextInt();
		objCandy.addCandies(quantity);
	}
	else if (item.equals("Cooky")) {
		System.out.println(objCookie.getList());
		System.out.print("Enter the cookies you want from above list:");
		String cooky = scanner.next();
		System.out.print("Enter the quantity you want: ");
		int quantity = scanner.nextInt();
		objCookie.addCookies(quantity);
	}
	else if(item.equals("IceCream")) {
		System.out.println(objIceCream.getList());
		System.out.print("Enter the IceCream you want from above list:");
		String iceCream = scanner.next();
		System.out.print("Enter the quantity you want: ");
		int quantity = scanner.nextInt();
		objCandy.addCandies(quantity);
	}
	return item+" place Successfully\n";
}
private static int displayTotalCost() {
	System.out.print("Total cost Rupess: ");
	return objCost.getCost();
}
}
 

