package com.example.selenium.page_object_design;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpage {

     WebDriver driver;
     public Loginpage(WebDriver driver) {
    	 this.driver=driver;
	}

     By username=By.id("inputUsername");
     By password=By.name("inputPassword");
     By signin=By.cssSelector("button[class='submit signInBtn']");
     By logout=By.cssSelector("button[class='logout-btn']");
     
     
     public WebElement getUserNameElement()
     {
    	 return driver.findElement(username);
     }
     
     public WebElement getPasswordElement()
     {
    	 return driver.findElement(password);
     }
     
     public WebElement getSignIn()
     {
    	 return driver.findElement(signin);
     }
     
     public WebElement getLogout()
     {
    	 return driver.findElement(logout);
     }
     
}
