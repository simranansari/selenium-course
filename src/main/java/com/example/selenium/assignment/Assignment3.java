package com.example.selenium.assignment;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        
        WebDriverWait w =new WebDriverWait(driver,Duration.ofSeconds(5));
        
        
        driver.get("https://www.rahulshettyacademy.com/loginpagePractise/");
        
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		
		driver.findElement(By.id("password")).sendKeys("learning");
		
		driver.findElement(By.xpath("//input[@type='radio'][@value='user']")).click();
		
		driver.findElement(By.id("okayBtn")).click();
		
		Select s =new Select(driver.findElement(By.tagName("select")));
		
		s.selectByVisibleText("Consultant");
		
		driver.findElement(By.id("terms")).click();
		
		driver.findElement(By.id("signInBtn")).click();
		
		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("div.card-footer button")));

		List<WebElement> buttons = driver.findElements(By.cssSelector("div.card-footer button"));
		
		for(WebElement button : buttons)
		{
			button.click();
			
		}
		
		driver.findElement(By.cssSelector("a.nav-link.btn.btn-primary")).click();
		
		Thread.sleep(2000);
		driver.quit();
        }
}
