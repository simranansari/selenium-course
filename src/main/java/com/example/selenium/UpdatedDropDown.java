package com.example.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class UpdatedDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        
        driver.get("https://www.rahulshettyacademy.com/dropdownsPractise/");
        
//        System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
//        driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
//        System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
//        
        
        Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
        driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
        System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
        Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
        
        
        
        
       //count the no of checkboxes
        
        System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
       
        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(2000L);
        
      
        /* int i=1;
        
        while(i<5)
        {
        	driver.findElement(By.id("hrefIncAdt")).click();
        	i++;
        } */
        
        
               System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
        
		for (int i=1;i<5;i++)
		{
			
			driver.findElement(By.id("hrefIncAdt")).click();
			
		}
		
		       driver.findElement(By.id("btnclosepaxoption")).click();
		
		       Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
		       System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		   Thread.sleep(2000);
		   driver.quit();
	}

}
