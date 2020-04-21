package execution;

import java.io.File;
import java.io.IOException;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(utilities.Listner.class)
public class Base{
	WebDriver driver;

	@BeforeClass
	public void Startup() throws IOException {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://www.ebay.com");
		driver.manage().window().maximize();
		
		
		screens();
		
	}

	public void screens() throws IOException {
		
		File take = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(take, new File(System.getProperty("user.dir") + "\\screenshots\\" + phototime() + ".png"));

	}

	public String phototime() {

		return new SimpleDateFormat("yy-MM-dd-HH-mm-ss").format(new Date());
	}
}
