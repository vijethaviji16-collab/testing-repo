package my_programs;

import java.util.Random;

public class GenerateRandomNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random random = new Random();
		
		int num =random.nextInt();
		int num1 =random.nextInt(5)+1;
		
		int num2 =100000+random.nextInt(999999);
		System.out.println(num2);
		
		String phonenum ="6172"+num2;
		
		System.out.println(phonenum);
		
		

	}

}
