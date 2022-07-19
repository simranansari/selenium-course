package com.example.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        
        driver.get("https://www.path2usa.com/travel-companions");
        
        driver.findElement(By.xpath(".//*[@id='travel_date']")).click();
        
        while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch'] ")).getText().contains("August"))
        {
        	driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
        }
        
       List<WebElement> dates= driver.findElements(By.cssSelector(".datepicker-days .day"));
        
        int count=dates.size();
        
        for(int i=0;i<count;i++)
        {
        	String text=dates.get(i).getText();
        	if(text.equalsIgnoreCase("19"))
        	{
        		dates.get(i).click();
        		break;
        	}
        }
        
        Thread.sleep(2000);
        driver.quit();
	}

}
