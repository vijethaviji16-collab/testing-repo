      package base;

		import java.io.File;
		import java.io.IOException;

		import org.apache.commons.io.FileUtils;
		import org.openqa.selenium.OutputType;
		import org.openqa.selenium.TakesScreenshot;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.testng.annotations.AfterMethod;
		import org.testng.annotations.BeforeMethod;

		public class BaseTest {

			protected static WebDriver driver;
			
		  
			public void setUp() {
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://admin-demo.nopcommerce.com/login");
			}
		   
		  
		   public void tearDown() {
		    	
		    	if(driver != null) {
		    		driver.quit();
		    	}
		    }
		   
		   //Capture Screenshot on Failure
		   
		   public static String takeScreenshot(String testName) throws IOException {

			    TakesScreenshot ts = (TakesScreenshot) driver;

			    File source = ts.getScreenshotAs(OutputType.FILE);

			    String destination = System.getProperty("user.dir")
			            + "/screenshots/" + testName + ".png";

			    FileUtils.copyFile(source, new File(destination));

			    return destination;

			}

	}


