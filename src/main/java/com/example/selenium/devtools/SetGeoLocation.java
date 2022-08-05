package com.example.selenium.devtools;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;

import com.example.selenium.driverutility.BrowserName;
import com.example.selenium.driverutility.DriverUtility;

public class SetGeoLocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = (ChromeDriver) DriverUtility.getDriver(BrowserName.CHROME);
		DevTools devTools=driver.getDevTools();
		
        devTools.createSession();
        
        // latitude-40 longitude-(-3) madrid   ---- latitude-17 longitude-78 Hydrabd
        
        Map<String,Object>coordinates = new HashMap<String,Object>();
        
        coordinates.put("latitude", 40);
        coordinates.put("longitude", -3);
        coordinates.put("accuracy", 1);
        
        driver.executeCdpCommand("Emulation.setGeolocationOverride", coordinates);
        driver.get("http://google.com");
        driver.findElement(By.name("q")).sendKeys("amazon",Keys.ENTER);
        driver.findElements(By.cssSelector(".LC20lb")).get(0).click();
        String title =driver.getTitle();
        System.out.println(title);
        
        driver.quit();
	}

}
