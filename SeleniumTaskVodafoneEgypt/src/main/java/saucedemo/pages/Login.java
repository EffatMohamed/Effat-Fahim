package saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
    WebDriver driver;
    By userNameTextBox = By.id("user-name");
    By passwordTextBox = By.id("password");
    By loginButton = By.id("login-button");

    public Login(WebDriver driver) {
        this.driver = driver;
    }

    //Set username in username textbox
    public void setUserName(String strUserName)
    {
        driver.findElement(userNameTextBox).sendKeys(strUserName);
    }

    //Set password in password textbox
    public void setPassword(String strPassword)
    {
        driver.findElement(passwordTextBox).sendKeys(strPassword);
    }

    //Click on login button
    public void clickLogin()
    {
        driver.findElement(loginButton).click();
    }

}
