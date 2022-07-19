package com.example.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Scroll {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

		WebElement scroll = driver.findElement(By.id("product"));

		Point point = scroll.getLocation();

		JavascriptExecutor js = (JavascriptExecutor) driver;

		// 1st type for scroll table & get coordinates
		js.executeScript("window.scrollBy(" + point.getX() + "," + point.getY() + ")"); 
					
		// 2nd type for scroll table & get coordinates
//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", scroll); 
																									
																									
		Thread.sleep(2000);

		js.executeScript("document.querySelector('.tableFixHead').scrollTop+=100"); 

		List<WebElement> values = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));

		int sum = 0;

		for (int i = 0; i < values.size(); i++) {
			sum = sum + Integer.parseInt(values.get(i).getText());
		}

		System.out.println(sum);
		driver.findElement(By.cssSelector(".totalAmount")).getText();

		int total = Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());

		Assert.assertEquals(sum, total);

		Thread.sleep(2000);
		driver.quit();

	}

}
