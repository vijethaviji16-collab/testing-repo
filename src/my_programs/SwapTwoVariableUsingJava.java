package my_programs;

public class SwapTwoVariableUsingJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a ="Good";
		String b = "Bad";
		
		String temp = a;
		a=b;
		b= temp;
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		
		int x=1;
		int y=2;
		
		int Temp = x;
		x=y;
		y=Temp;
		
		System.out.println("X:"+x);
		System.out.println("Y:"+y);
	}

}
