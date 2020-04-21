package execution;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import utilities.dataProp;


public class Base {

WebDriver driver;

// add data properties setup for integration into other modules
Properties prop = new Properties();
dataProp dpFile = new dataProp();	



	@BeforeClass
	public void Startup() throws IOException {
		prop.load(dpFile.data());
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "\\Driver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	


	public void screens(String loc) throws IOException {
		
		String stamp = new SimpleDateFormat(" E, MMM-dd-yyyy HH-mm-ss.SSS").format(new Date());
		File take =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(take ,new File(System.getProperty("user.dir")+"\\screenshots\\"+loc+stamp+".png"));
	
	
	}
	
	@AfterClass
	public void teardown() throws InterruptedException {
		driver.manage().deleteAllCookies();
	//	driver.close();
		
	}	
	
	

}
