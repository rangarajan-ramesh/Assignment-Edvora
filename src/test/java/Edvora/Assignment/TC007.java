package Edvora.Assignment;

import java.io.IOException;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.MainPage;
import resources.base;

public class TC007 extends base {
	public WebDriver driver;
	 @BeforeTest
		public void initialize() throws IOException
		{
		
			 driver =initializeDriver();
			 driver.manage().window().maximize();
		}
	 @Test
	 public void Testcase07() throws InterruptedException {
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
		 Thread.sleep(5000);
		try { 
	    driver.switchTo().alert().accept();
		}
		catch(Exception ex) {
			
		}
	    MainPage mp = new MainPage(driver);
	    
	    
	    try {
	    	Assert.assertFalse(mp.proedit().isDisplayed());
	    }
	    catch(Exception ex) {
	    	
	    }
		 
			 }
	 @AfterTest
		public void teardown()
		{
			
			driver.close();


}
}
