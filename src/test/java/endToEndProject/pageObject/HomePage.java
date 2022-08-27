package endToEndProject.pageObject;

import java.io.IOException;
import java.net.URISyntaxException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import endToEndProject.BrowserName;
import endToEndProject.DriverUtility;


public class HomePage {
	 
	public static Logger log =LogManager.getLogger(HomePage.class.getName());
	WebDriver driver;
	
	@Test(dataProvider="getData")
	public void basePageNavigation(String username, String password) throws InterruptedException, IOException, URISyntaxException{
		// TODO Auto-generated method stub
		
		driver= DriverUtility.getDriver(BrowserName.CHROME);
		
		driver.get(DriverUtility.getProperty("url"));
		// one is inheritance
		// creating object to that class & invoke methods of it
		LandingPage LP=new LandingPage(driver);
		
		// compare the text frm the browser text with actul text ... - Error..
		Assert.assertEquals(LP.getTitle().getText(), "FEATURED COURSES");
				
				
		LP.getLogin().click();                //driver.findElement()By.css...
	
		LoginPage loginPage=new LoginPage(driver);
		loginPage.login(username, password);
		log.info("Login process completed");
		
		
	}
	@DataProvider
	public Object[][] getData()
	{
		// Row stands for how many diff data types test should run
		// Column stands for how many values per each test
		
		Object[][] data= new Object[2][2];
		
		data[0][0]="nonrestricteduser@qw.com";
		data[0][1]="12345";
		
		data[1][0]="restricteduser@qw.com";
		data[1][1]="23456";
		
		return data;
	}
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
}
