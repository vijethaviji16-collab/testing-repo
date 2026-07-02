package OOPS_In_Java;

public class InheritenceInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		jasmine j = new jasmine();
		
		j.pluck();
		j.Throw();
		
		rose r = new rose();
		
		r.pluck();
		r.Throw();
		
		System.out.println(r.name);
		System.out.println(j.name);
		
		System.out.println(j.noofflowers);
		System.out.println(r.noofpetals);
		

	}

}
