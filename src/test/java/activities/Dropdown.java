package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver. get("https://omayo.blogspot.com/");
		
		WebElement drop = driver.findElement(By.id("drop1"));
		Select select = new Select (drop);
		
		select.selectByVisibleText("doc 3");
		//select.selectByIndex(2);
		//select.selectByValue("jk1");
		
		
		System.out.println(select.getFirstSelectedOption().getText());
		
	}
	
}
