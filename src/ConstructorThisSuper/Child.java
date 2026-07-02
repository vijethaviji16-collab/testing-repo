package ConstructorThisSuper;

class Parent {
	Parent() {
		System.out.println("Parent Constructor");
	}
}

public class Child extends Parent {
	
	Child() {
		super();
		System.out.println("Child constructor");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Child c = new Child();
	}




	}


