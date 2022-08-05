package com.example.selenium.devtools;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v103.fetch.Fetch;
import org.openqa.selenium.devtools.v103.fetch.model.RequestPattern;
import org.openqa.selenium.devtools.v103.network.model.ErrorReason;

import com.example.selenium.driverutility.BrowserName;
import com.example.selenium.driverutility.DriverUtility;

public class NetworkFailedRequest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = (ChromeDriver) DriverUtility.getDriver(BrowserName.CHROME);
		DevTools devTools=driver.getDevTools();
		
        devTools.createSession();
        
        Optional<List<RequestPattern>> patterns = Optional.of(Arrays.asList(new RequestPattern(Optional.of("*GetBook*"),
        		Optional.empty(), Optional.empty())));
        		
        		devTools.send(Fetch.enable(patterns, Optional.empty()));
        		devTools.addListener(Fetch.requestPaused(), request ->
        		{
        			devTools.send(Fetch.failRequest(request.getRequestId(),  ErrorReason.FAILED));
        		});
        
        driver.get("https://rahulshettyacademy.com/angularAppdemo/");
		driver.findElement(By.cssSelector("[routerlink='/library']")).click();
	
//		driver.quit();
	}

}
