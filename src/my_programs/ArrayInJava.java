package my_programs;

public class ArrayInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] Digits = {"one" , "Two", "Three", "Four", "Five"};
//		                     0        1       2       3      4
		                     
		System.out.println(Digits[3]);
		
		int [] numbers = new int [4];
		
		numbers[0] = 1;
		numbers[1] = 2;
		numbers[2] = 3;
		numbers[3] = 4;
		
		for(int i=0; i<numbers.length; i++) {
			
			System.out.println(numbers[i]);
		}

	}

}
