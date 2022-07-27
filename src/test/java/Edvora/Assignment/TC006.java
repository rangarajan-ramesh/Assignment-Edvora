package Edvora.Assignment;

import java.io.IOException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import resources.base;

public class TC006 extends base {
	public WebDriver driver;
	 @BeforeTest
		public void initialize() throws IOException
		{
		
			 driver =initializeDriver();
			 driver.manage().window().maximize();
		}
	 @Test
	 public void Testcase06() throws InterruptedException {
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
		 
			 }
	 @AfterTest
		public void teardown()
		{
			
			driver.close();

}

}
