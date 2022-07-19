package com.example.selenium.assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        
        driver.findElement(By.name("name")).sendKeys("Simran");
       
        driver.findElement(By.name("email")).sendKeys("simran@email.com");
        
        driver.findElement(By.id("exampleInputPassword1")).sendKeys("*123*");
        
        driver.findElement(By.cssSelector("input[id*='exampleCheck1']")).click();
        
        driver.findElement(By.id("exampleFormControlSelect1")).sendKeys("Female");
        
        driver.findElement(By.id("inlineRadio1")).click();
        
        driver.findElement(By.name("bday")).sendKeys("01/12/1990");
       
        driver.findElement(By.cssSelector("input[type='submit']")).click();
        
       //driver.findElement(By.cssSelector("div[class='alert alert-success alert-dismissible']")).getText();
       
//       System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']/a/following-sibling::strong")).getText());
//       System.out.println(driver.findElement(By.cssSelector("div[class='alert alert-success alert-dismissible']")).getText());       
       
        String text = driver.findElement(
				By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText();
		List<WebElement> childs = driver.findElements(
				By.xpath("//div[@class='alert alert-success alert-dismissible']/a/following-sibling::strong"));
		for (WebElement child : childs) {
			
			text = text.substring(text.indexOf(child.getText()));
		
		}
		System.out.println(text);
        
        
       Thread.sleep(2000);
       driver.quit();
        
	}

}
