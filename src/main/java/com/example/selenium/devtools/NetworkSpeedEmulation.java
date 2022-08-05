package com.example.selenium.devtools;

import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v103.network.Network;
import org.openqa.selenium.devtools.v103.network.model.ConnectionType;

import com.example.selenium.driverutility.BrowserName;
import com.example.selenium.driverutility.DriverUtility;

public class NetworkSpeedEmulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = (ChromeDriver) DriverUtility.getDriver(BrowserName.CHROME);
		DevTools devTools = driver.getDevTools();

		devTools.createSession();
		// Network.emulateNetworkConditions
		devTools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));
		
		devTools.send(Network.emulateNetworkConditions(false, 3000, 20000, 100000, Optional.of(ConnectionType.CELLULAR2G)));
		// If we set True then listener will work
		devTools.addListener(Network.loadingFailed(), loadingFailed->
		{
			System.out.println(loadingFailed.getErrorText());
			System.out.println(loadingFailed.getTimestamp());
		});
		
		long startTime = System.currentTimeMillis();
		
		driver.get("https://rahulshettyacademy.com/angularAppdemo/");
		driver.findElement(By.cssSelector("[routerlink*='/library']")).click();
		long endTime = System.currentTimeMillis();
		System.out.println(endTime-startTime);
		
		driver.quit();
	}

}
