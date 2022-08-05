package com.example.selenium.devtools;

import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v103.fetch.Fetch;

import com.example.selenium.driverutility.BrowserName;
import com.example.selenium.driverutility.DriverUtility;

public class NetworkMocking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = (ChromeDriver) DriverUtility.getDriver(BrowserName.CHROME);
		DevTools devTools=driver.getDevTools();
		
        devTools.createSession();
        
        devTools.send(Fetch.enable(Optional.empty(), Optional.empty()));
        devTools.addListener(Fetch.requestPaused(), request->
        {
        	if(request.getRequest().getUrl().contains("shetty"))
        	{
        		String mockedUrl =request.getRequest().getUrl().replace("=shetty", "=BadGuy");
        		System.out.println(mockedUrl);
        		
        		devTools.send(Fetch.continueRequest(request.getRequestId(),Optional.of(mockedUrl), 
        				Optional.of(request.getRequest().getMethod()), Optional.empty(), Optional.empty(),Optional.empty()));
        	}
        	else {
        		devTools.send(Fetch.continueRequest(request.getRequestId(),Optional.of(request.getRequest().getUrl()), 
        				Optional.of(request.getRequest().getMethod()), Optional.empty(), Optional.empty(),Optional.empty()));
        	}
        });
        	
        driver.get("https://rahulshettyacademy.com/angularAppdemo/");
      		driver.findElement(By.cssSelector("button[routerlink*='library']")).click();
      		
      		System.out.println(driver.findElement(By.cssSelector("p")).getText());
	}

}
