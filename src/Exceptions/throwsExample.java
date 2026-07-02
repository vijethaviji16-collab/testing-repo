package Exceptions;

import java.io.FileReader;
import java.io.IOException;

public class throwsExample {
	
	static void openRecord() throws IOException {
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			openRecord();
			
		} catch (IOException e) {
			System.out.println("Record file not found");
		}

	}

}
