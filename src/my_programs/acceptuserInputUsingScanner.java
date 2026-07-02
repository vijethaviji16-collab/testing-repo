package my_programs;

import java.util.Scanner;

public class acceptuserInputUsingScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("What is your name? ");
		String name = scanner.nextLine();
		System.out.println("What is your age? ");
		int age = scanner.nextInt();
		scanner.nextLine();
		System.out.println("What is your favourite food? ");
		String foodname = scanner.nextLine();
		System.out.println("Hello:"+name);
		System.out.println("you are "+age+"year old");
		System.out.println("your favourite food is "+ foodname);
		

	}

}
