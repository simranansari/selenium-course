package com.example.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class EndToEndUIComponents {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:/Users/DELL/Downloads/chromedriver_win32/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        
        driver.get("https://www.rahulshettyacademy.com/dropdownsPractise/");
        
       driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
        
       driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
       
       driver.findElement(By.xpath("//a[@value='DEL']")).click();
       
       driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
       
       driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
       
       Assert.assertTrue(driver.findElement(By.id("Div1")).getAttribute("style").contains(".5"));
      
       
       driver.findElement(By.id("divpaxinfo")).click();
       Thread.sleep(1000);
       for(int i=1;i<=3;i++)
       {
    	   driver.findElement(By.id("hrefIncAdt")).click();
       }
       
       
       driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
       driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
       
        
        Thread.sleep(3000);
        driver.quit();
        
		
	}

}
