package com.example.selenium.assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        
        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
        
        List<WebElement> table=driver.findElements(By.xpath("//*[@class='table-display']/tbody/tr"));
        
        System.out.println(table.size());
        
        List<WebElement> column= driver.findElements(By.xpath("//*[@class='table-display']/tbody/tr[1]/th"));
        
        System.out.println(column.size());
        
        WebElement name= driver.findElement(By.xpath("//*[@class='table-display']/tbody/tr[3]/td[1]"));
        WebElement name1= driver.findElement(By.xpath("//*[@class='table-display']/tbody/tr[3]/td[2]"));
        WebElement name2= driver.findElement(By.xpath("//*[@class='table-display']/tbody/tr[3]/td[3]"));

        System.out.println(name.getText());
        System.out.println(name1.getText());
        System.out.println(name2.getText());
        
        
        Thread.sleep(2000);
        driver.quit();
        
	}

}
