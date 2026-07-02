package my_programs;

public class IfStatementInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// if (condition){}else{}
		
		int marks= 50;
		if (marks>=99) {
			System.out.println("Student passed in first class");
			
		}
		else if (marks>=35) {
			System.out.println("studemt just passed with pass mark");
			}
		else if (marks<35 && marks>30) {
			System.out.println("Student got below pass marks");
			
		}
		else {
			System.out.println("Student got failed in the exam");
			
		}
	}

}
