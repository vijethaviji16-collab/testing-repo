package my_programs;

import java.util.ArrayList;

public class ArrayListInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> food = new ArrayList<String>();
		
		food.add("pizza");
		food.add("chocolate");
		food.add("Burger");
		food.add("biscuit");
		food.set(0, "sireesha");
		//food.set(2, "Ramya");
	//	/food.add()/
		
	//	System.out.println(food.get(0));
		for(int i=0; i<food.size(); i++) {
			System.out.println(food.get(i));
		}

}
}