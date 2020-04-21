package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registration {

	@FindBy(xpath = "//*[text()='Registration']")
	private WebElement register;
	
	@FindBy(xpath="(//a)[32]")
	private WebElement setaccount;
	@FindBy(xpath="(//a)[32]")
	private WebElement signup;
	
	@FindBy(xpath="//*[@id=\"article_content\"]/div[2]/div[2]/div/div/div/a")
	private WebElement create;

	@FindBy(id = "firstname")
	private WebElement first;

	@FindBy(id = "lastname")
	private WebElement last;

	@FindBy(id = "email")
	private WebElement emil;

	@FindBy(id = "PASSWORD")
	private WebElement pass;

	@FindBy(xpath = "//button[text()='Create account']")
	private WebElement button;

	@FindBy(xpath="//a[@id=\"gh-la\"]")
	private WebElement logo;
	@FindBy(xpath="//*[@type=\"text\"]")
	private WebElement search;
	@FindBy(xpath="//*[@type=\"submit\"]")
	private WebElement clicksearch;
	
	@FindBy(xpath="//*[@class=\"s-item__title s-item__title--has-tags\"]")
	private WebElement iphone;
	
	@FindBy(id="isCartBtn_btn")
	private WebElement add;
	@FindBy(xpath="//button[text()='No thanks']")
	private WebElement no;


	
	public Registration(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	public WebElement register() {

		return register;
		
	}
	
	public WebElement setupaccount() {

		return setaccount;
		
	}

	
	public WebElement Createaccount() {

		return create;
		}
	
	public WebElement firstname() {

		return first;

	}

	public WebElement lastname() {

		return last;

	}

	public WebElement email() {

		return emil;
	}

	public WebElement password() {

		return pass;

	}

	public WebElement createbutton() {

		return button;

	}
	public WebElement ebaylogo() {

		return logo;

	}
	
	

	
	
}
	
	
	
	

