package Edvora.Assignment;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.MainPage;
import resources.base;

public class TC012 extends base {
	public WebDriver driver;
	 @BeforeTest
		public void initialize() throws IOException
		{
		
			 driver =initializeDriver();
			 driver.manage().window().maximize();
		}
	 @Test
	 public void Testcase12() throws InterruptedException {
		 driver.get(prop.getProperty("url2"));
		 MainPage mp = new MainPage(driver);
		 mp.dob().sendKeys(prop.getProperty("dob"));
		 Thread.sleep(3000);
		 String dob = mp.dob().getText();
		 Assert.assertEquals(dob, prop.getProperty("dob"));
		
		 
		
	 }
	 @AfterTest
		public void teardown()
		{
			
			driver.close();

}

}
