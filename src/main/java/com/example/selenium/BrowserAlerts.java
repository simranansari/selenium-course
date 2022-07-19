package com.example.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserAlerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String text="Hayat";
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        
        driver.findElement(By.id("name")).sendKeys(text);
        
        driver.findElement(By.cssSelector("[id='alertbtn']")).click();
        
        System.out.println(driver.switchTo().alert().getText());
        
        driver.switchTo().alert().accept();
        
        Thread.sleep(2000);
        
        driver.findElement(By.id("confirmbtn")).click();
        
        System.out.println(driver.switchTo().alert().getText());
        
        Thread.sleep(2000);
        driver.switchTo().alert().dismiss();
        
        Thread.sleep(2000);
        driver.quit();
        
        
        
        
		
		
		
	}

}
