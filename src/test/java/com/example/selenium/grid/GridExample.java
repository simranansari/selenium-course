package com.example.selenium.grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GridExample {

	@Test
	public void HomePageCheck() throws MalformedURLException
	{
		DesiredCapabilities caps = new DesiredCapabilities();
//		caps.setBrowserName("chrome");
		caps.setCapability(CapabilityType.BROWSER_NAME, "chrome");
		caps.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		
		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.0.109:4444"), caps);
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		driver.findElement(By.name("q")).sendKeys("Senorita");
		driver.close();
		
	}
	
	

}
