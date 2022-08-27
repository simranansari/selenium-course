package endToEndProject.pageObject;

import java.io.IOException;
import java.net.URISyntaxException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import endToEndProject.BrowserName;
import endToEndProject.DriverUtility;


public class ValidateNavigationBar {
	
	public static Logger log =LogManager.getLogger(ValidateNavigationBar.class.getName());

	private WebDriver driver;
	
	@BeforeMethod
	public void initialize() throws IOException, URISyntaxException {
		driver = DriverUtility.getDriver(BrowserName.CHROME);
		
		driver.get(DriverUtility.getProperty("url"));
	}
	
	@Test 
	public void basePageNavigation() throws InterruptedException, IOException, URISyntaxException{
		// TODO Auto-generated method stub
		
		// one is inheritance
		// creating object to that class & invoke methods of it
		LandingPage LP=new LandingPage(driver);
		
		// compare the text frm the browser text with actul text ... - Error..
		Assert.assertTrue(LP.getNavigationBar().isDisplayed());
		log.info("Navigation Bar is displayed");
		// Assert.assertFalse(false);
				
	}
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
}
