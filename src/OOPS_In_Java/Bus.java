package OOPS_In_Java;

public class Bus extends vehicle {
	
	int a = 20;
	int b = 25;
	@Override
	void go() {
		
		int speed = a+b;
		System.out.println("The vehicle is moving at speed" +speed);
	}

}
