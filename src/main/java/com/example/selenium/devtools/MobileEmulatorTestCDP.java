package com.example.selenium.devtools;

import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v103.emulation.Emulation;

import com.example.selenium.driverutility.BrowserName;
import com.example.selenium.driverutility.DriverUtility;

public class MobileEmulatorTestCDP {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = (ChromeDriver) DriverUtility.getDriver(BrowserName.CHROME);
		DevTools devTools=driver.getDevTools();
		
        devTools.createSession();
        
        //send cmd to CDP Methods-> CDP Methods will invoke & get access to chrome
        devTools.send(Emulation.setDeviceMetricsOverride(600, 1000, 50, true, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty()));
        
        driver.get("https://rahulshettyacademy.com/angularAppdemo/");
        
        driver.findElement(By.cssSelector(".navbar-toggler")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.linkText("Library")).click();
        Thread.sleep(2000);
        driver.quit();
	}

}
