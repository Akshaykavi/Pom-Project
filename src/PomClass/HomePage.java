package PomClass;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utility.UtilityClass;

public class HomePage extends UtilityClass {
	
	WebDriver driver;

	private By Box = By.xpath("//input[@type='text']");

	private By Search = By.xpath("//button[@class='L0Z3Pu']");

	public HomePage(WebDriver driver) 
	{
      this.driver = driver;
	}
	
	public void Box() throws IOException 
	{
		Screenshot(driver,"Date");
		driver.findElement(Box).sendKeys("RedMi Note 10");
	}
    
	public void Search()
	{
		driver.findElement(Search).click();
		
	}
   

}


