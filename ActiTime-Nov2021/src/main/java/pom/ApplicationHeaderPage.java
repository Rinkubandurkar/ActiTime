package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApplicationHeaderPage {
	

	@FindBy (xpath = "//div[text()='Time-Track']")
	private WebElement timeTrack ;
	
	@FindBy (xpath = "//div[text()='Tasks']")
	private WebElement tasks ;
	
	@FindBy (xpath = "//div[text()='Reports']")
	private WebElement reports ;
	
	@FindBy (xpath = "//div[text()='Users']")
	private WebElement users ;
	
	@FindBy (xpath = "//div[text()='Work Schedule']")
	private WebElement workSchedule ;
	
	@FindBy (xpath = "//td[@class='logoutCell']")
	private WebElement logout;
	
	public ApplicationHeaderPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public void openTaskPage() throws InterruptedException 
	{
		timeTrack.click();
		Thread.sleep(2000);
	}

	public void logout() throws InterruptedException {
		logout.click();
		Thread.sleep(2000);
	}
}
