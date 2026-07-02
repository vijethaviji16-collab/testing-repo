package my_programs;

import java.util.ArrayList;

public class TwoDArrayListInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<String>> Grocery = new ArrayList();
		
		ArrayList<String> Bakery = new ArrayList();
		
		Bakery.add("cake");
		Bakery.add("Mixture");
		Bakery.add("Coolcake");
		Bakery.add("Samosa");
		
		ArrayList<String> producelist = new ArrayList();
		
		producelist.add("Tomatos");
		producelist.add("Onions");
		producelist.add("Mirchi");
		
		ArrayList<String> Drinklist = new ArrayList();
		
		Drinklist.add("Sprite");
		Drinklist.add("Mazaa");
		Drinklist.add("Pulpi");
		Grocery.add(producelist);
		Grocery.add(Drinklist);
		Grocery.add(Bakery);
		
		System.out.println(Grocery.get(0).get(2));
		
	}
		
		
		
		
		

	}

