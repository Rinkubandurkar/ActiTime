package utils;


import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {
	
	public static void screenshot(WebDriver driver , String testID) throws IOException
	{
		SimpleDateFormat formatter = new SimpleDateFormat("ddMMyyyyHHmmSS");
		Date date = new Date();
		String screenshotNameFormat = testID+" " + formatter.format(date);
		
		File screenshot =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(screenshot,new File("C:\\Users\\lenovo\\Desktop\\New folder\\" +screenshotNameFormat +".png"));
	}

}
