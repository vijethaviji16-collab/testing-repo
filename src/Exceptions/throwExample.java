package Exceptions;

public class throwExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int age = 20;
   if (age < 18) {
	   throw new ArithmeticException("Not eligible to vote");
   }
   System.out.println("Eligible to vote");
   
	   
   }

}
