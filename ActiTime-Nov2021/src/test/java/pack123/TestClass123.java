package pack123;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import browser.Browser;
import pom.ApplicationHeaderPage;
import pom.LoginPage;
import utils.Utility;

public class TestClass123 extends  Browser{

private WebDriver driver ;
private LoginPage login;
private  ApplicationHeaderPage  applicationHeaderPage;
private SoftAssert soft;
String testID;
static ExtentTest test;
static ExtentHtmlReporter reporter;
		
 @BeforeTest
 @Parameters("browser")
 public void launchbrowser(String browserName) 
 {
	 reporter = new ExtentHtmlReporter("test-output"+File.separator+"ExtendReport"+File.separator+"extendReport.html");
		ExtentReports extend = new ExtentReports();
		extend.attachReporter(reporter);
	 System.out.println("LAUNCH BROWSER");
	if(browserName.equals("Chrome"))
	 {
	    driver = LaunchChromeBrowser();
     }
	 if(browserName.equals("Firefox"))
	 {
		driver = LaunchFirefoxBrowser();
	 }
	
 }
 
@BeforeClass
 public void login()
 {
	System.out.println("OBJECT CREATED");
	 login = new LoginPage(driver); 
	 applicationHeaderPage = new ApplicationHeaderPage(driver);
 }
 
 @BeforeMethod
 public void loginToApplication() throws InterruptedException
 {
	 System.out.println("LOGIN TO APPLICATION");
	 driver.get("http://localhost/login.do");
	 Thread.sleep(2000);
		login.senduserName();
		login.password();
		login.checkbox();
		login.login();
 }
	
 @Test 
 public void verifyUserTab() throws InterruptedException
 {

	 System.out.println("VERIFY USER TAB");
	// soft = new SoftAssert();
	 applicationHeaderPage.openTaskPage();
	 String ab = driver.getCurrentUrl();
	 String title = driver.getTitle();
	 System.out.println(ab);
	 System.out.println(title);
	// Assert.assertEquals(ab,"http://localhost/user/submit_tt");
	// boolean result = ab.equals("http://localhost/user/submit_tt.do");
	// System.out.println(result);
//	 
//	 soft.assertEquals(ab , "http://localhost/user/submit_tt.do");
//	 soft.assertEquals(title , "actiTIME - Enter Time-Track");
//	 soft.assertAll();
//
 }
 
 @AfterMethod
 public void logOut() throws InterruptedException, IOException
 {
	 testID= "101";
	 System.out.println("LOG OUT");
	 applicationHeaderPage.logout();
	Utility.screenshot(driver,testID);
	 Thread.sleep(2000);
 }
 
 @AfterClass
 public void closeBrowser() throws  InterruptedException
 {
	System.out.println("CLOSE BROWSER");
    Thread.sleep(2000);
 }
 
 @AfterTest
 public void close()
 {
	 driver.quit();
	 System.gc();
 }
 
		
}


