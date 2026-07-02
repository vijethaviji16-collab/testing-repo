package my_programs;

public class StringMethodsInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = " Vijetha ";
		
		boolean result1 = name.equals("vijetha");
		boolean result2 = name.contains("v"); 
		boolean result3 = name.equalsIgnoreCase("VIJETha");
		boolean result4 = name.isEmpty();
		char result5 = name.charAt(1);
        int result6 = name.length();
	    int result7 = name.indexOf("v");
	String result8 = name.toUpperCase();
    String result9 = name.toLowerCase(); 
    String resulta = name.trim();
     String resultb = name.strip();
     String resultc = name.replace("Vijetha", "Viji");
		
		System.out.print(result4);
	}

}
