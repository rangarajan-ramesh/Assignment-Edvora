package resources;
	import java.io.File;

	import java.io.FileInputStream;
	import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.apache.commons.io.FileUtils;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	
	
	



	public class base {

		public  WebDriver driver;
		public Properties prop;

	public WebDriver initializeDriver() throws IOException
	{
		
		
	 prop= new Properties();
	FileInputStream fis=new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\Assignment\\src\\main\\java\\resources\\data.properties");

	prop.load(fis);
	String browserName=prop.getProperty("browser");
	System.out.println(browserName);

	if(browserName.equals("chrome"))
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
	
		
	}
	else if (browserName.equals("firefox"))
	{
		WebDriverManager.firefoxdriver().setup();
		 driver= new FirefoxDriver();
	
	}
	else if (browserName.equals("IE"))
	{
		WebDriverManager.iedriver().setup();
		driver= new InternetExplorerDriver();
	}

	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	return driver;


	}

	public String getScreenShotPath(String testCaseName,WebDriver driver) throws IOException
	{
	
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source =ts.getScreenshotAs(OutputType.FILE);
		String destinationFile = System.getProperty("user.dir")+"\\reports\\"+testCaseName+".png";		
		FileUtils.copyFile(source,new File(destinationFile));
		return destinationFile;


	}

	
	

	}


