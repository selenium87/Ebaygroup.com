package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search {
	
	@FindBy(id = "gh-ac")
	private WebElement search;
	
	@FindBy(id = "gh-shop-a")
	private WebElement shop;
	
	@FindBy(id = "gh-cat")
	private WebElement all;
	
	@FindBy(id = "gh-btn")
	private WebElement searchbtn;
	
	@FindBy(id = "gh-shop-a")
	private WebElement shopbtn;
	

	public Search(WebDriver driver) {
	 	PageFactory.initElements(driver, this);
	}
	
	
	public WebElement searchbar() {
		return search;
	}
	
	public WebElement shopby() {
		return shop;
	}
	
	public WebElement allcat() {
		return all;
	}
	
	public WebElement pushsearch() {
		return searchbtn;
	}
	
	public WebElement pushshopbtn() {
		return shopbtn;
	}
	
	public void allcat(WebDriver driver, String itm) {
		driver.findElement(By.xpath("//option[contains(text(),'"+itm+"')]")).click();
	}
	
	public void shopcat(WebDriver driver, String itm) {
		driver.findElement(By.xpath("//a[contains(text(),'"+itm+"')]")).click();
	}

}
