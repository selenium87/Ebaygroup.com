package execution;
import java.io.File;
import java.io.IOException;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.junit.BeforeClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class Base {
WebDriver driver;
	@BeforeClass
	public void Startup() {
		
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "\\Driver\\chromedriver.exe");
		
		driver= new ChromeDriver();
		
		//driver.get("https://www.ebay.com");
		
	}
	
	//Imal  listners
	//Sukrat reports  under utilities
	//Sayeed data.properties
	
	
	

	
	
	// sukrat reports 
	//screenshots 
	
	
	//search  pagefactory execution class 
	
	
	
	// screenshots  sukrat

	public void screens() throws IOException {
		
		File take =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(take ,new File(System.getProperty("user.dir")+ "\\screenshots\\"+phototime()+".jpg"));
	
	
	}
	public String phototime() {
		
		return new SimpleDateFormat("yy-MM-dd-HH-mm-ss").format(new Date());
	}
}
