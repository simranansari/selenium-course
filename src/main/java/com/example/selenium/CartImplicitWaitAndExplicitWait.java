package com.example.selenium;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartImplicitWaitAndExplicitWait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        
        //Implicit wait
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        
        
        int j=0;
        
        String[] itemsNeeded= {"Cucumber","Brocolli","Beetroot","Carrot"};
        
        driver.get("https://rahulshettyacademy.com/seleniumPractise/");
        // Thread.sleep(3000);
         
         List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));
         
         for(int i=0;i<products.size();i++)
        	 
         {
        	 String[] name=products.get(i).getText().split("-");
        	 String formattedName=name[0].trim();
        	
        	 List itemsNeededList = Arrays.asList(itemsNeeded);
        
            if(itemsNeededList.contains(formattedName))

              {
            	  j++;
            	  
            	  driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
            	  
            	  if(j==itemsNeeded.length)
            	  {
            		  break;
            	  }
              }
            
         }
        
         proceedToCheck(driver);
         
        Thread.sleep(2000);
        driver.quit();
        
	}

	public static void proceedToCheck(WebDriver driver) {
		
		 //Explicit wait
        WebDriverWait w =new WebDriverWait(driver,Duration.ofSeconds(5));
		
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
		
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
	}
	
}
