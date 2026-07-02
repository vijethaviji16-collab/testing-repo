package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxRadio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/checkbox");
        
        driver.findElement(By.xpath("//span[@role='checkbox']")).click();
	}

}
