package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {
	public WebDriver driver;
	By proedit = By.xpath("//p[text()='Your Profile']//following::button[text()='Edit']");
	By seedit = By.xpath("//p[text()='Security']//following::button[text()='Edit']");
	By name = By.xpath("//input[@name='fullname']");
	By uname = By.xpath("//input[@name='username']");
	By mobile = By.xpath("//input[@name='mobileNumber']");
	By dob = By.xpath("//input[@name='dateOfBirth']");
	By changepass = By.xpath("//input[@name='Password']");
	By save = By.xpath("//p[text()='Your Profile']//following::button[text()='Save'][1]");
	By cancel = By.xpath("//p[text()='Your Profile']//following::button[text()='Cancel']");
	By regsave = By.xpath("//p[text()='Security']//following::button[text()='Save']");
	By regcancel = By.xpath("//p[text()='Security']//following::button[text()='Cancel']");
	By logout = By.xpath("//button[text()='Logout']");
	By gender = By.xpath("//select[@class='chakra-select css-ibs81u']");
	By yourprofile = By.xpath("//p[text()='Your Profile']");
	By security = By.xpath("//p[text()='Security']");
	By services = By.xpath("//p[text()='Services']");
	By persinfo = By.xpath("//p[text()='Personal Info']");
	By cp = By.xpath("//p[text()='change password']");
	By address = By.xpath("//input[@name='address']");
	public MainPage(WebDriver driver) {
		this.driver = driver;
	}
	public WebElement proedit() {
		return driver.findElement(proedit);
	}
	public WebElement seedit() {
		return driver.findElement(seedit);
	}
	public WebElement name() {
		return driver.findElement(name);
	}
	public WebElement uname() {
		return driver.findElement(uname);
	}
	public WebElement mobile() {
		return driver.findElement(mobile);
	}
	public WebElement dob() {
		return driver.findElement(dob);
	}
	public WebElement changepass() {
		return driver.findElement(changepass);
	}
	public WebElement save() {
		return driver.findElement(save);
	}
	public WebElement cancel() {
		return driver.findElement(cancel);
	}
	public WebElement regsave() {
		return driver.findElement(regsave);
	}
	public WebElement regcancel() {
		return driver.findElement(regcancel);
	}
	public WebElement logout() {
		return driver.findElement(logout);
	}
	public WebElement gender() {
		return driver.findElement(gender);
	}
	public WebElement yourprofile() {
		return driver.findElement(yourprofile);
	}
	public WebElement security() {
		return driver.findElement(security);
	}
	public WebElement services() {
		return driver.findElement(services);
	}
	public WebElement persinfo() {
		return driver.findElement(persinfo);
	}
	public WebElement cp() {
		return driver.findElement(cp);
	}
	public WebElement address() {
		return driver.findElement(address);
	}
}
