package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  WebDriver driver = new ChromeDriver();
		  
		  driver.get("https://demoqa.com/frames");
		  
		  driver.switchTo().frame("frame1");
		  
		  System.out.println(driver.findElement(By.id("sampleHeading")).getText());
		  
		  driver.switchTo().defaultContent();
		  
		  //switch using Web element
		  
		  WebElement frame = driver.findElement(By.id("frame2"));
		  driver.switchTo().frame(frame);
		  
		  System.out.println(driver.findElement(By.id("sampleHeading")).getText());
		  driver.switchTo().defaultContent();
		  
		  
		  // nested Frames
		  
		  driver.get("https://demoqa.com/nestedframes");
		  driver.switchTo().frame("frame1");
		  
		  System.out.println(driver.findElement(By.tagName("body")).getText());
		  
		  driver.switchTo().frame(0);
		  
		System.out.println(driver.findElement(By.tagName("body")).getText());
		driver.switchTo().defaultContent();
		  
		  
		  
		  
		  
		  
		  
	}
}
