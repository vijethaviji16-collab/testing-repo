package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobutton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		
		
	driver.get("https://demoqa.com/radio-button");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//label[text()='Yes']")).click();
		
	}

}
