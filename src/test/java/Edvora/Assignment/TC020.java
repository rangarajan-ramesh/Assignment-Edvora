package Edvora.Assignment;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.MainPage;
import resources.base;

public class TC020 extends base {
	public WebDriver driver;
	 @BeforeTest
		public void initialize() throws IOException
		{
		
			 driver =initializeDriver();
			 driver.manage().window().maximize();
		}
	 @Test
	 public void Testcase20() throws InterruptedException {
		 driver.get(prop.getProperty("url2"));
		 MainPage mp = new MainPage(driver);
		mp.address().click();
		mp.address().sendKeys("Palstreet");
		Thread.sleep(4000);
		String add =mp.address().getText();
		Assert.assertEquals(add, prop.getProperty("address"));
		
	 }
	 @AfterTest
		public void teardown()
		{
			
			driver.close();

}

}
