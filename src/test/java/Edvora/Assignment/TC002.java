package Edvora.Assignment;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import resources.base;

public class TC002 extends base {
	 public WebDriver driver;
	 @BeforeTest
		public void initialize() throws IOException
		{
		
			 driver =initializeDriver();
			 driver.manage().window().maximize();
		}
	 @Test
	 public void Testcase02() throws InterruptedException {
		 driver.get(prop.getProperty("url"));
		 LandingPage lp = new LandingPage(driver);
		 lp.username().sendKeys(prop.getProperty("user"));
		 Thread.sleep(2000);
		 lp.Password().sendKeys(prop.getProperty("password"));
		 Thread.sleep(2000);
		 lp.login().click();
		 
		 Thread.sleep(5000);

		 try {
			 driver.switchTo().alert().accept();
		 }
		 catch(Exception ex) {
			 
		 }
		 Thread.sleep(2000);
		 Assert.assertTrue(lp.profile().isDisplayed());
	 }
	 @AfterTest
		public void teardown()
		{
			
			driver.close();

}
}
