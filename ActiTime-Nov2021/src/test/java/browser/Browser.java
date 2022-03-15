package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {
	
	public static WebDriver LaunchChromeBrowser()
	{
		 System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     return driver;
	     
	}
	
	public static WebDriver LaunchFirefoxBrowser()
	{ 
		System.setProperty("webdriver.gecko.driver", "C:\\selenium\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
	    return driver;
	     
	}

}
