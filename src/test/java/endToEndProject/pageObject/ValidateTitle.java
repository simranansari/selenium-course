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


public class ValidateTitle {
	
	public static Logger log =LogManager.getLogger(ValidateTitle.class.getName());
	public WebDriver driver;

	@BeforeMethod
	public void initialize() throws IOException, URISyntaxException {
		driver = DriverUtility.getDriver(BrowserName.CHROME);
		log.info("Driver is initialized");
		
		driver.get(DriverUtility.getProperty("url"));
		log.info("Navigated to Home Page");
	}
	
	@Test
	public void basePageNavigation() throws InterruptedException, IOException {

		// TODO Auto-generated method stub

//		driver = DriverUtility.getDriver(BrowserName.CHROME);

//		driver.get(DriverUtility.getProperty("url"));
		// one is inheritance
		// creating object to that class & invoke methods of it
		LandingPage LP = new LandingPage(driver);

		// compare the text frm the browser text with actul text ... - Error..
		Assert.assertEquals(LP.getTitle().getText(), "FEATURED 12COURSES");
        log.info("Successfully validate Text msg");
	}

	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
}
