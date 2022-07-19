package com.example.selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        
        driver.get("https://www.rahulshettyacademy.com/loginpagePractise/#");
        
        driver.findElement(By.cssSelector(".blinkingText")).click();
        
        Set<String> windows = driver.getWindowHandles();
        
        Iterator<String>it = windows.iterator();
        
        String parentId = it.next();
        String childId = it.next();
        
        driver.switchTo().window(childId);
        
       // System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
       // driver.findElement(By.cssSelector(".im-para.red")).getText();
        
       // String emailId= driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split("")[0];
        
        String emailId= driver.findElement(By.cssSelector("p.im-para.red strong a")).getText();
        
        driver.switchTo().window(parentId);
        
        driver.findElement(By.id("username")).sendKeys(emailId);
        
        Thread.sleep(2000);
        driver.quit();
        
		
	}

}
