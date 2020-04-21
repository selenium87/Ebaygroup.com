package utilities;

import java.io.FileInputStream;
import java.io.IOException;

public class dataProp {

	public FileInputStream data() throws IOException {
		FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\java\\utilities\\testdata.txt");

		
		return ip;
		
	}
	
	
}
