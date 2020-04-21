package execution;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import POM.Search;

public class SearchTest extends Base{
	
	
	
	@Test
	public void test1() throws IOException {
		//prop.load(dpFile.data());
		driver.navigate().to(prop.getProperty("URL"));
	}
	
	@Test (dataProvider = "dataset")
	public void test2(String item) throws IOException {
		prop.load(dpFile.data());
		Search objS = new Search(driver);	

		objS.searchbar().sendKeys(item);		
		screens("pic@"+item+"/");
		objS.pushsearch().click();
		screens("pic@"+item+"/");
		objS.searchbar().clear();
	}	
		
	@Test
	public void test3() throws IOException {
		prop.load(dpFile.data());
		Search objS = new Search(driver);
		
		String ns = prop.getProperty("num_of_all");
		int nn = Integer.parseInt(ns);
		
		for (int i = 1; i <= nn; i++) {
			String catxx = ("cat"+i);
			objS.allcat(driver, (prop.getProperty(catxx)));
			objS.pushsearch().click();
			screens("all/"+prop.getProperty(catxx));
			objS.searchbar().clear();			
		}
	}
	
	@Test
	public void test4() throws IOException {
		prop.load(dpFile.data());
		Search objS = new Search(driver);
		
		String ns = prop.getProperty("num_of_shop");
		int nn = Integer.parseInt(ns);
		
		for (int i = 1; i <= nn; i++) {
			String catxx = ("shop"+i);
			objS.pushshopbtn().click();
			objS.shopcat(driver, (prop.getProperty(catxx)));
			screens("shop/"+prop.getProperty(catxx));
		}		
	}
	
	@DataProvider
	public Object[][] dataset(){
		return new Object [][]	{
			new Object[] {"jackets"},
			new Object[] {"&&&"},
			new Object[] {"dsgghlrignvlne"}			
		};
	}
	
//---------------------------------------------------------
	/*		String ns = prop.getProperty("num_of_item");
	int nn = Integer.parseInt(ns);
	
	for (int i = 1; i <= nn; i++) {
		String itemxx = ("item" + i);
		objS.searchbar().sendKeys(prop.getProperty(itemxx));
		screens("pic@"+(prop.getProperty(itemxx))+"/");
		objS.pushsearch().click();
		screens("pic@"+(prop.getProperty(itemxx))+"/");
		objS.searchbar().clear();
	}*/	
//---------------------------------------------------------	
	
}
