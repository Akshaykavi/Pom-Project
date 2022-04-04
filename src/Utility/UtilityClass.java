package Utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass {
	

	public static void Screenshot(WebDriver driver, String Date) throws IOException
	{
		SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd-hh-mm-ss");
		//Date d = new Date();
		String str = date.format(new Date());
		
		File source =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Screenshots\\"+str+"urmila.jpg");
		FileHandler.copy(source, dest);
		
	}

}
