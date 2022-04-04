package Test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import Base.BaseClass;
import PomClass.HomePage;
import PomClass.LoginPage;

public class TestClass {
	
 static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException {
	
		driver = BaseClass.getWebDriver(); // base method called with help of classname because it is ststic method

		LoginPage loginpage = new LoginPage(driver);

		loginpage.emailid();
		loginpage.pass();
		loginpage.login();

		HomePage homepage = new HomePage(driver);
		Thread.sleep(2000);
		homepage.Box();
		homepage.Search();

	}

}
