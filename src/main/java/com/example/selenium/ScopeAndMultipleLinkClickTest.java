package com.example.selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScopeAndMultipleLinkClickTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:/Users/DELL/Downloads/chromedriver_win32/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        
        driver.get("https://qaclickacademy.com/practice.php");
        
        System.out.println(driver.findElements(By.tagName("a")).size());
        
        WebElement footerdriver=driver.findElement(By.id("gf-BIG"));  //Limiting webdriver scope
        
        System.out.println(footerdriver.findElements(By.tagName("a")).size());
        
        WebElement columndriver=footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
        
        System.out.println(columndriver.findElements(By.tagName("a")).size());

		//click on each link in the column & check if the pages are opening
        
        for(int i=1;i<columndriver.findElements(By.tagName("a")).size();i++)
        {
        	String clickonlinkTab=Keys.chord(Keys.CONTROL,Keys.ENTER);
        	
        	columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
        	Thread.sleep(5000);
        	
        }                                                //opens all the tabs
        
        Set<String> links=driver.getWindowHandles();
        Iterator<String> it=links.iterator();
        
        while(it.hasNext())
        {
        	driver.switchTo().window(it.next());
        	System.out.println(driver.getTitle());
        }                                                // open all links and print title
        
        
        
        Thread.sleep(2000);
        driver.quit();
	}

}
