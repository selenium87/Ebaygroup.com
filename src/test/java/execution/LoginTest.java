package execution;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class LoginTest extends Base {

	@Test
	public void positiveLogin() throws InterruptedException {
		LogInUtilities log = new LogInUtilities(driver);

					
		driver.get(log.mainPageURL);
		String title = driver.getTitle();
		System.out.println(title);
		log.MyPageSetUp(20, 5);
		String SignInText = log.SignInLink.getText();
		System.out.println(SignInText);
		Assert.assertEquals(SignInText, "Sign in");
		log.SignInLink.click();
		Thread.sleep(2000);
		driver.close();

		/*
		 * driver.navigate().to(log.LogInPageURL);
		 * log.EmailFeild.sendKeys("alpha1944@gmail.com");
		 * log.Password.sendKeys("L@(@KJD454yeS"); log.SignInButton.click();
		 */
	}

}
