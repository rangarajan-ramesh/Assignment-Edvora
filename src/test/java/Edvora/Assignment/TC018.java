package Edvora.Assignment;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.MainPage;
import resources.base;

public class TC018 extends base{
	public WebDriver driver;
	 @BeforeTest
		public void initialize() throws IOException
		{
		
			 driver =initializeDriver();
			 driver.manage().window().maximize();
		}
	 @Test
	 public void Testcase18() throws InterruptedException {
		 driver.get(prop.getProperty("url2"));
		 MainPage mp = new MainPage(driver);
		String text = mp.persinfo().getText();
	     Assert.assertEquals(text, "Personal Info");
		 
		
	 }
	 @AfterTest
		public void teardown()
		{
			
			driver.close();

}


}
