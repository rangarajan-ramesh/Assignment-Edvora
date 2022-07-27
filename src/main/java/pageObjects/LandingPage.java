package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	public WebDriver driver;
By signin = By.xpath("//button[text()='SignIn']");
By login = By.xpath("//button[text()='Login']");
By username = By.xpath("//input[@autocomplete='username']");
By password = By.xpath("//input[@autocomplete='current-password']");
By createacc = By.xpath("//button[text()='Create Account']");
By profile = By.xpath("//p[text()='Your Profile']");
public LandingPage(WebDriver driver) {
	this.driver = driver;
}
public WebElement username() {
	return driver.findElement(username);
}
public WebElement signin() {
	return driver.findElement(signin);
}
public WebElement login() {
	return driver.findElement(login);
}
public WebElement Password() {
	return driver.findElement(password);
}
public WebElement createacc() {
	return driver.findElement(createacc);
}
public WebElement profile() {
	return driver.findElement(profile);
}
}
