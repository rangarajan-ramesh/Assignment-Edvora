package Edvora.Assignment;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.MainPage;
import resources.base;

public class TC003 extends base {
	 public WebDriver driver;
	 @BeforeTest
		public void initialize() throws IOException
		{
		
			 driver =initializeDriver();
			 driver.manage().window().maximize();
		}
	 @Test
	 public void Testcase03() throws InterruptedException {
		 driver.get(prop.getProperty("url2"));
		MainPage mp = new MainPage(driver);
		mp.proedit().click();
		mp.mobile().sendKeys(prop.getProperty("mobile"));
		mp.name().sendKeys(prop.getProperty("name"));
		mp.save().click();
		Thread.sleep(8000);
		String num = mp.mobile().getText();
		Thread.sleep(2000);
		Assert.assertEquals(num, prop.getProperty("mobile"));
	
	 }
	 @AfterTest
		public void teardown()
		{
			
			driver.close();

}

}
