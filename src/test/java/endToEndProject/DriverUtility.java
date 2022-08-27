package endToEndProject;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverUtility {

	public static WebDriver getDriver(BrowserName browserName) {
		
		WebDriver driver = null;
		
		if (browserName == null) {
			throw new NullPointerException("browser name is not provided");
		}
		
		try {
			switch (browserName) {
				case CHROME:
					System.setProperty("webdriver.chrome.driver",
							ClassLoader.getSystemResource("localdata/chromedriver.exe").toURI().getPath());
					driver = new ChromeDriver();
					break;
				case EDGE:
					System.setProperty("webdriver.edge.driver",
							ClassLoader.getSystemResource("localdata/msedgedriver.exe").toURI().getPath());
					driver = new EdgeDriver();
					break;
				case FIREFOX:
					System.setProperty("webdriver.gecko.driver",
							ClassLoader.getSystemResource("localdata/geckodriver.exe").toURI().getPath());
	                driver = new FirefoxDriver();
					break;
				default:
					System.setProperty("webdriver.chrome.driver",
							ClassLoader.getSystemResource("localdata/chromedriver.exe").toURI().getPath());
					driver = new ChromeDriver();
					break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return driver;
	}
	
	public static String getProperty(String propertyName) throws IOException, URISyntaxException {
		
		String propertyValue = null;
		
		Properties prop= new Properties();
		FileInputStream fis = new FileInputStream(ClassLoader.getSystemResource("data.properties").toURI().getPath());
		prop.load(fis);
		propertyValue = prop.getProperty(propertyName);
		
		return propertyValue;
	}

	public static void getScreenShotPath(WebDriver driver, String testMethodName) throws IOException {
		// TODO Auto-generated method stub
		TakesScreenshot SS=(TakesScreenshot) driver;
		File source =SS.getScreenshotAs(OutputType.FILE);
		String destinationFile = System.getProperty("user.dir")+"/Myreports/"+testMethodName+".png";
		FileUtils.copyFile(source,new File(destinationFile));
		System.out.println("Screen Shot Taken");
	}
}
