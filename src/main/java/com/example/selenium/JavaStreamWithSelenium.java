package com.example.selenium;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class JavaStreamWithSelenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
        
        // click on column
        driver.findElement(By.xpath("//tr/th[1]")).click();
        
        //capture all webelements into list
        List<WebElement> elementsList = driver.findElements(By.xpath("//tr/td[1]"));
        
        //capture text of all webelements into new(original) list
        List<String> originalList = elementsList.stream().map(s->s.getText()).collect(Collectors.toList());
        
        //sort on the original list of step 3 -> sorted list
        List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());
        
        //compare original list vs sorterd list
        Assert.assertTrue(originalList.equals(sortedList));
        
        //scan the name column with getText ->Beans ->print the price of the Rice
        
        // 1st way
        List<String>price= elementsList.stream().filter(s->s.getText().contains("Beans")).
        		map(s->getPriceVeggie(s)).collect(Collectors.toList());
        price.forEach(a->System.out.println(a));
        
        // 2nd way by Khadus
        System.out.println(driver.findElement(By.xpath("(//tr/td[1])[text() = 'Beans']/following-sibling::td[1]")).getText());
        
       
        //scan the name column with getText ->Beans ->print the price of the Rice
        
        List<WebElement> prices;
        WebElement nextButton = driver.findElement(By.cssSelector("a[aria-label='Next"));
        boolean clickable = false;
        
        // 1st way
        do
        {
        	 List<WebElement> rows = driver.findElements(By.xpath("//tr/td[1]"));
        	 price = rows.stream().filter(s->s.getText().contains("Rice"))
        			 .map(s->getPriceVeggie(s)).collect(Collectors.toList());
        	 
        	 if(price.size()<1)
        	 {
        		 driver.findElement(By.cssSelector("a[aria-label='Next']")).click();
        	 }

        }while(price.size()<1);
       
        
        // find the price of a specific item with deal
        // 2nd way
       
        do
        {
        	 List<WebElement> rows = driver.findElements(By.xpath("//tr/td[1]"));
        	 prices = rows.stream().filter(s->s.getText().contains("Rice"))
        			 .map(element-> {
        		 return element.findElement(By.xpath("following-sibling::td[1]"));
        	 }).collect(Collectors.toList());
        	 
        	 if(!prices.isEmpty()){
        		 System.out.println(prices.get(0).getText());
        	 } else {
        		 clickable = !Boolean.parseBoolean(nextButton.getAttribute("aria-disabled"));
        		 
        		 if(clickable) {
        			 nextButton.click();
        		 }
        	 }

        }while(prices.isEmpty() && clickable);
        
        
        
        
        //using Filter 
        
        driver.findElement(By.id("search-field")).sendKeys("Rice");
        List<WebElement> veggies=driver.findElements(By.xpath("//tr/td[1]"));
        
        List<WebElement> filteredList= veggies.stream().filter(veggie->veggie.getText().contains("Rice"))
        		.collect(Collectors.toList());
        Assert.assertEquals(veggies.size(),filteredList.size());
        
        
        Thread.sleep(2000);
        driver.quit();
        
	}

	  private static String getPriceVeggie(WebElement s) {
      	
      	String pricevalue= s.findElement(By.xpath("following-sibling::td[1]")).getText();
      	
      	return pricevalue;
      }
}
