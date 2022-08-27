package com.example.selenium;

import java.net.URI;
import java.util.function.Predicate;

import org.openqa.selenium.HasAuthentication;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;

import com.example.selenium.driverutility.BrowserName;
import com.example.selenium.driverutility.DriverUtility;

public class BasicAuthentication {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = DriverUtility.getDriver(BrowserName.CHROME);
        
        // predicate, consumer
        Predicate<URI> uriPredicate =uri ->  uri.getHost().contains("httpbin.org");
        
        ((HasAuthentication)driver).register(uriPredicate,UsernameAndPassword.of("foo", "bar"));
        driver.get("http://httpbin.org/basic-auth/foo/bar");
        
        Thread.sleep(2000);
        driver.quit();
	}

}
