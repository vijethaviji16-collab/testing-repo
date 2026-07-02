package activities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myfirstprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		 driver.get("https://www.google.com");
		 
		 System.out.println(driver.getTitle());
		 
		 driver.quit();
	}

}
