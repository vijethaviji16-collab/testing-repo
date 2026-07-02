package my_programs;

public class TwoDArraysInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String[][]  numbers = {{"one", "two", "three"},
				               {"two",  "three", "four"},
				               {"three", "four"}};
				               
				               for(int i=0; i<numbers.length; i++) {
				            	   System.out.println();
				            	   
				            	for(int j=0; j<numbers[i].length; j++) {
				            		System.out.print(numbers[i][j]+ " ");
				            	}
				              		}

}
}