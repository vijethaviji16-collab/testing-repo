
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	    private WebDriver driver;
	    
	    private By usernameTextBox = By.id("Email");
	    private By passwordTextBox = By.id("Password");
	    private By loginButton = By.xpath("//*[@id=\"main\"]/div/section/div/div[2]/div[1]/div/form/div[3]/button");
	    
//	    private By passwordTextBox = By.cssSelector(null)
	    private By passwordTextBox1 = By.partialLinkText("PayPal");
	    public LoginPage(WebDriver driver) {
		  this.driver = driver;
	    }
	    
	    public void enterUsername(String Username){
	    	driver.findElement(usernameTextBox).clear();
	    	driver.findElement(usernameTextBox).sendKeys(Username);
	    	
	    }
	    
	    public void enterPassword(String Password) {
	    	
	    	driver.findElement(passwordTextBox).clear();
	    	driver.findElement(passwordTextBox).sendKeys(Password);
	    }
	    
	    public void clickLogin() {
	    	driver.findElement(loginButton).click();
	    }
	    
	    public void verifyLoginbutton() {
	    	driver.findElement(loginButton).isDisplayed();
	    }
}