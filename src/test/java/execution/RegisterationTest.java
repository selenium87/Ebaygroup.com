package execution;





	
	

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import POM.Registration;

public class RegisterationTest extends Base {

	@Test(priority = 1)
	public void start() throws IOException {
	
		driver.navigate().to(prop.getProperty("URL"));

		
	}
	@Test(priority = 2)
	public void validregister() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
		Registration re = new Registration(driver);
		
		re.register().click();
		re.setupaccount().click();

		try {
		re.Createaccount().click();
		re.firstname().sendKeys(prop.getProperty("first"));
		re.lastname().sendKeys(prop.getProperty("last"));
		re.email().sendKeys(prop.getProperty("email"));
		re.password().sendKeys(prop.getProperty("password"));	
		re.createbutton().click();
	} catch (Exception e) {
		
		re.ebaylogo().click();
	}
		}
	
}
