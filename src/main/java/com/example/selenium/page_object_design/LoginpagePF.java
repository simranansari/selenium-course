package com.example.selenium.page_object_design;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginpagePF {

     WebDriver driver;
     public LoginpagePF(WebDriver driver) {
    	 this.driver=driver;
    	 PageFactory.initElements(driver, this);;
	}

     @FindBy (id="inputUsername")
     WebElement username;
     
     @FindBy (name="inputPassword")
     WebElement password;
     
     @FindBy (css="button[class='submit signInBtn']")
     WebElement signin;
     
     @FindBy (css="button[class='logout-btn']")
     WebElement logout;
     
     public WebElement getUserNameElement()
     {
    	 return username;
     }
     
     public WebElement getPasswordElement()
     {
    	 return password;
     }
     
     public WebElement getSignIn()
     {
    	 return signin;
     }
     
     public WebElement getLogout()
     {
    	 return logout;
     }
     
}
