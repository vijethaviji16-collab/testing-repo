package OOPS_In_Java;

public class Encapsulation_inJavaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		van a = new van("Vijetha" , "Latest", 2025);
		a.setmake("Viji");
		a.setmodel("a-123");
		a.setyear(1999);
		
		
		System.out.println(a.getmake());
		System.out.println(a.getmodel());
		System.out.println(a.getyear());
		

	}

}
