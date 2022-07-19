package com.example.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsDemoMouseOver {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");
        
        Actions a=new Actions(driver);
        
        WebElement move=driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));
        
        a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello")
        .doubleClick().build().perform();     
        
        a.moveToElement(move).contextClick().build().perform();
        
		Thread.sleep(2000);
		driver.quit();
		
	}

}
