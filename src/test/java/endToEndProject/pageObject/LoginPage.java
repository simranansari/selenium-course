package endToEndProject.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

private WebDriver driver;
	
	By emailBy=By.cssSelector("[id='user_email']");
	By passwordBy=By.cssSelector("[type='password']");
	By loginBy=By.cssSelector("[value='Log In']");

	
	public LoginPage(WebDriver driver) {
		
		this.driver=driver;
	
	}

	public void login(String username, String password)
	{
	     driver.findElement(emailBy).sendKeys(username);
	     driver.findElement(passwordBy).sendKeys(password);
	     driver.findElement(loginBy).click();

	}

}
