package Edvora.Assignment;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import resources.base;

public class TC008 extends base {
	public WebDriver driver;
	 @BeforeTest
		public void initialize() throws IOException
		{
		
			 driver =initializeDriver();
			 driver.manage().window().maximize();
		}
	 @Test
	 public void Testcase08() throws InterruptedException {
	String text = "";
		 driver.get(prop.getProperty("url"));
		 LandingPage lp = new LandingPage(driver);
		 lp.username().sendKeys(prop.getProperty("user1"));
		 Thread.sleep(2000);
		 lp.Password().sendKeys(prop.getProperty("password"));
		 Thread.sleep(2000);
		 lp.login().click();
		 Thread.sleep(10000);
		
	    text = driver.switchTo().alert().getText();		
		System.out.println(text);
	 }
	 @AfterTest
		public void teardown()
		{
			
			driver.close();

}


}
