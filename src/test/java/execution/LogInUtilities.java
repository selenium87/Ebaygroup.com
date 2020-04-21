package execution;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInUtilities {
	WebDriver driver;

	String mainPageURL = "https://ebay.com";
	String LogInPageURL = "https://signin.ebay.com/ws/eBayISAPI.dll?SignIn&ru=https%3A%2F%2Fwww.ebay.com%2F";

	@FindBy (xpath = "/html/body/header/div[1]/ul[1]/li[1]/span/a")
	WebElement SignInLink;
	@FindBy (xpath = "//*[@id=\"userid\"]")
	WebElement EmailFeild;
	@FindBy (xpath = "//*[@id=\"pass\"]")
	WebElement Password;
	@FindBy (xpath = "//*[@id=\"sgnBt\"]")
	WebElement SignInButton;
		
	
	public LogInUtilities (WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	
	}
	
	public void MyPageSetUp (int pageloadtime, int implicitwaitime)
	{
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(pageloadtime, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(implicitwaitime, TimeUnit.SECONDS);
		
	}
	
}


