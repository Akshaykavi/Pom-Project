package PomClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;

	private By Emaiid = By.xpath("(//input[@type='text'])[2]");

	private By Pass = By.xpath("(//input[@autocomplete='off'])[3]");

	private By Login = By.xpath("(//button[@type='submit'])[2]");


	public LoginPage(WebDriver driver)
	{
        this.driver = driver;
	}
	public void emailid()
	{
		driver.findElement(Emaiid).sendKeys("7378763004");

	}
	public void pass()
	{
		driver.findElement(Pass).sendKeys("Akshay@3004");
	}
	
	public void login()
	{
		driver.findElement(Login).click();
	}

}


