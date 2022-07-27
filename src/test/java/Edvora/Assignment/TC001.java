package Edvora.Assignment;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import resources.base;

public class TC001 extends base {
	 public WebDriver driver;
	 @BeforeTest
		public void initialize() throws IOException
		{
		
			 driver =initializeDriver();
			 driver.manage().window().maximize();
		}
	 @Test
	 public void Testcase01() throws InterruptedException {
		 driver.get(prop.getProperty("url"));
		 LandingPage lp = new LandingPage(driver);
		 lp.signin().click();
		 try {
		 lp.username().sendKeys(prop.getProperty("user"));
		 Thread.sleep(2000);
		 }
		 catch(StaleElementReferenceException ex) {
			 
		 }
		 lp.Password().sendKeys(prop.getProperty("password"));
		 Thread.sleep(2000);
		
		 lp.createacc().click();
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
