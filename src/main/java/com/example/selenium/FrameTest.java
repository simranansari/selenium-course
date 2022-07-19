package com.example.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:/Users/DELL/Downloads/chromedriver_win32/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        
        driver.get("https://jqueryui.com/droppable/");
        System.out.println(driver.findElements(By.tagName("iframe")).size());
        
        driver.switchTo().frame(0);
        
        Actions a =new Actions(driver);
        
        WebElement source =driver.findElement(By.id("draggable"));
        WebElement target =driver.findElement(By.id("droppable"));
        
        a.dragAndDrop(source, target).build().perform();
        
        driver.switchTo().defaultContent();
        
        Thread.sleep(2000);
        driver.quit();

        
        
	}

}
