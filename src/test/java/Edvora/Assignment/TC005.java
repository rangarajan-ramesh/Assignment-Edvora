package Edvora.Assignment;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.MainPage;
import resources.base;

public class TC005 extends base {
	public WebDriver driver;
	 @BeforeTest
		public void initialize() throws IOException
		{
		
			 driver =initializeDriver();
			 driver.manage().window().maximize();
		}
	 @Test
	 public void Testcase05() throws InterruptedException {
		 driver.get(prop.getProperty("url"));
		 LandingPage lp = new LandingPage(driver);
		Thread.sleep(10*60*1000);
		try {
		driver.switchTo().alert().accept();
		}
		catch(Exception ex) {
			
		}
		lp.username().sendKeys(prop.getProperty("user"));
		lp.Password().sendKeys(prop.getProperty("password"));
		lp.login().click();

		
	 }
	 @AfterTest
		public void teardown()
		{
			
			driver.close();

}


}
