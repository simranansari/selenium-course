package com.example.selenium.assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assignment8 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

		driver.findElement(By.id("autocomplete")).sendKeys("ind");
		Thread.sleep(2000);
		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item']"));

		 for(WebElement option :options)
	        { 
	        WebElement name= option.findElement(By.tagName("div"));
	        
	        if(name.getText().equalsIgnoreCase("INDIA"))
	        {
	        	name.click();
	        	break;
	        }
	        }
		Assert.assertTrue(driver.findElement(By.id("autocomplete")).getAttribute("value").equalsIgnoreCase("INDIA"));
        
		Thread.sleep(2000);
		driver.quit();
	}

}
