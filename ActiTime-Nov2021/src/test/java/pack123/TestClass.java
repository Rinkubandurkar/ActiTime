package pack123;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.ApplicationHeaderPage;
import pom.LoginPage;

public class TestClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://localhost/login.do");
		LoginPage login = new LoginPage(driver);
		Thread.sleep(2000);
		login.senduserName();
		Thread.sleep(2000);
		login.password();
		Thread.sleep(2000);
		login.checkbox();
		Thread.sleep(2000);
		login.login();
		
		ApplicationHeaderPage applicationHeaderPage = new ApplicationHeaderPage(driver);
		applicationHeaderPage.openTaskPage();
		String ab = driver.getCurrentUrl();
		System.out.println(ab);
		
		if(ab.equals("http://localhost/tasks/otasklist.do"))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
		Thread.sleep(2000);
		applicationHeaderPage.logout();

	}

}
