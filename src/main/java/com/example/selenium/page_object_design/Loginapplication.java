package com.example.selenium.page_object_design;

import java.net.URISyntaxException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginapplication {

	public static void main(String[] args) throws URISyntaxException {

		System.setProperty("webdriver.chrome.driver",
				ClassLoader.getSystemResource("localdata/chromedriver.exe").toURI().getPath());
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://rahulshettyacademy.com/locatorspractice/");
//		Loginpage login = new Loginpage(driver);
		LoginpagePF login = new LoginpagePF(driver);

		login.getUserNameElement().sendKeys("rahul");
		login.getPasswordElement().sendKeys("rahulshettyacademy");
		login.getSignIn().click();
		login.getLogout().click();

		driver.quit();
	}

}
