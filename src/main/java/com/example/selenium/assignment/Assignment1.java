package com.example.selenium.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        
        driver.findElement(By.cssSelector("input[id*='checkBoxOption1']")).click();
        System.out.println(driver.findElement(By.cssSelector("input[id*='checkBoxOption1']")).isSelected());
        driver.findElement(By.cssSelector("input[id*='checkBoxOption1']")).click();
        System.out.println(driver.findElement(By.cssSelector("input[id*='checkBoxOption1']")).isSelected());
        
       //count the no of checkboxes
        
        System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
       
        Thread.sleep(2000L);
        driver.quit();
        
		
	}

}
