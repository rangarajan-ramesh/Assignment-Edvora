package Edvora.Assignment;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.MainPage;
import resources.base;

public class TC004 extends base {
	 public WebDriver driver;
	 @BeforeTest
		public void initialize() throws IOException
		{
		
			 driver =initializeDriver();
			 driver.manage().window().maximize();
		}
	 @Test
	 public void Testcase04() throws InterruptedException {
		 driver.get(prop.getProperty("url2"));
		MainPage mp = new MainPage(driver);
		Thread.sleep(3000);
		

		mp.proedit().click();
		mp.name().sendKeys(prop.getProperty("name"));
		Thread.sleep(2000);
		mp.mobile().sendKeys(prop.getProperty("mobile"));
		mp.save().click();
		String Fname = mp.name().getText();
		Assert.assertEquals(Fname, prop.getProperty("name"));
	 }
	 @AfterTest
		public void teardown()
		{
			
			driver.close();

}
}
