package Exceptions;

public class MultiplecatchBlockJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
	//		String s = null;
	//	System.out.println(s.length());
	//	}
		
		int arr [] = new int [3];
	     arr[5] = 10;
		
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array issue");

	}
              catch (Exception e) {
            	  System.out.println("General error");
              }
	}

}