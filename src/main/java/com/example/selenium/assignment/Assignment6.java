package com.example.selenium.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class Assignment6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        
        driver.get("http://qaclickacademy.com/practice.php");
        
        driver.findElement(By.id("checkBoxOption1")).click();
        
        String option= driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[1]")).getText();
        
        WebElement staticDropdown = driver.findElement(By.id("dropdown-class-example"));
        
        Select dropdown=new Select(staticDropdown);
        
        dropdown.selectByVisibleText(option);
        
        driver.findElement(By.id("name")).sendKeys(option);
        
        driver.findElement(By.id("alertbtn")).click();
        
        Assert.assertTrue(driver.switchTo().alert().getText().contains(option));
        
        driver.switchTo().alert().accept();
        
        Thread.sleep(2000);
        driver.quit();
        
        
	}

}
