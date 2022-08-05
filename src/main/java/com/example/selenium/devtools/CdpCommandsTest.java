package com.example.selenium.devtools;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v103.emulation.Emulation;

import com.example.selenium.driverutility.BrowserName;
import com.example.selenium.driverutility.DriverUtility;

public class CdpCommandsTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = (ChromeDriver) DriverUtility.getDriver(BrowserName.CHROME);
		DevTools devTools = driver.getDevTools();

		devTools.createSession();
		Map<String, Object> deviceMetrics = new HashMap<String, Object>();
		deviceMetrics.put("width", 600);
		deviceMetrics.put("height", 1000);
		deviceMetrics.put("deviceScaleFactor", 50);
		deviceMetrics.put("mobile", true);

		// send cmd to CDP Methods-> CDP Methods will invoke & get access to chrome
		driver.executeCdpCommand("Emulation.setDeviceMetricsOverride", deviceMetrics);
		driver.get("https://rahulshettyacademy.com/angularAppdemo/");

		driver.findElement(By.cssSelector(".navbar-toggler")).click();
		Thread.sleep(2000);

		driver.findElement(By.linkText("Library")).click();
		Thread.sleep(2000);
		driver.quit();
	}

}