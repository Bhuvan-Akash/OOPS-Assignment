package oops3;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public abstract class DesertItem {abstract public int getCost();
public List<String> getList() {
	List<String> list = new ArrayList<>();
	list.add("Candy");
	list.add("Cooky");
	list.add("IceCream");
	return list;
}
static int totalAmount =0;
}
class Candy extends DesertItem {
List<String> itemList = new ArrayList<>();
public List<String> addItem(String name) {
	itemList.add(name);
	return itemList;
}
public static int addCandies(int candies){
	totalAmount +=candies*60;
	return totalAmount;
}

@Override
public int getCost() {
	
	return totalAmount;
}

public List<String> getList() {
	return itemList;
}
}
class Cookie extends DesertItem {
List<String> itemList = new ArrayList<>();
public List<String> addItem(String name) {
	itemList.add(name);
	return itemList;
}
public int addCookies(int cookies){
	totalAmount += cookies*70;
	return totalAmount;
}

@Override
public int getCost() {
	// TODO Auto-generated method stub
	return totalAmount;
}

@Override
public List<String> getList() {
	// TODO Auto-generated method stub
	return itemList;
}
}
class IceCream extends DesertItem {
List<String> itemList = new ArrayList<>();
public List<String> addItem(String name) {
	itemList.add(name);
	return itemList;
}

public int addIceCreams(int iceCream){
	totalAmount += iceCream*70;
	return totalAmount;}

@Override
public int getCost() {
	// TODO Auto-generated method stub
	return totalAmount;
}

@Override
public List<String> getList() {
	// TODO Auto-generated method stub
	return itemList;
}
}
class TotalCost extends DesertItem {
	
@Override
public int getCost() {
	// TODO Auto-generated method stub
	return totalAmount;
}
}
