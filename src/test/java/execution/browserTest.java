package execution;

import java.io.IOException;

import org.testng.annotations.Test;

public class browserTest extends Base{
	
	@Test
	public void open() throws IOException {
		prop.load(dpFile.data());
		driver.get(prop.getProperty("searchURL"));
	}

}
