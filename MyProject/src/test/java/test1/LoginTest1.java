package test1;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base1.BaseClass1;
import pages1.LoginPage1;
import utilities1.ConfigReader;


@Listeners(utilities1.Listeners1.class)
public class LoginTest1 extends BaseClass1 {
	

    @Test
    public void loginToAutomationExercise() {
        LoginPage1 lp = new LoginPage1(driver);
        lp.login(
            ConfigReader.getProperty("username"),
            ConfigReader.getProperty("password")
        );
    }
}




