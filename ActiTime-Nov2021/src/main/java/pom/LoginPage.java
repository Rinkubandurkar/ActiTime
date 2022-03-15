package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoginPage {

		@FindBy (xpath = "//input[@name='username']")
		private WebElement userName ;
		
		@FindBy (xpath = "//input[@name='pwd']")
		private WebElement password;
		
		@FindBy (xpath = "//input[@name='remember']")
		private WebElement keepMeLoginCheckbox;
		
		@FindBy (xpath = "//div[text()='Login ']")
		private WebElement login;
		
		private WebDriverWait wait;
		
		public LoginPage (WebDriver driver)
		{
			PageFactory.initElements(driver, this);
			wait = new WebDriverWait(driver,20);
		}
		
		public void senduserName() {
			wait.until(ExpectedConditions.visibilityOf(userName));
			userName.sendKeys("admin");
		}
		
		public void password() {
			wait.until(ExpectedConditions.visibilityOf(password));
			password.sendKeys("manager");
		}

		public void checkbox() {
			wait.until(ExpectedConditions.visibilityOf(keepMeLoginCheckbox));
			keepMeLoginCheckbox.click();
		}

		public void login() {
			wait.until(ExpectedConditions.visibilityOf(login));
			login.click();
		}

		
	}


