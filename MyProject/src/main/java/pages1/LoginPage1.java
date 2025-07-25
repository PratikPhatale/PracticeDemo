package pages1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage1 {

	  WebDriver driver;

	    // Locators
	    By emailInput = By.xpath("//input[@data-qa='login-email']");
	    By passwordInput = By.xpath("//input[@data-qa='login-password']");
	    By loginButton = By.xpath("//button[@data-qa='login-button']");

	    public LoginPage1(WebDriver driver) {
	        this.driver = driver;
	    }

	    public void login(String email, String password) {
	        driver.findElement(emailInput).sendKeys(email);
	        driver.findElement(passwordInput).sendKeys(password);
	        driver.findElement(loginButton).click();
	    }
	}



