package saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutInformation {
    WebDriver driver;
    By firstName=By.id("first-name");
    By lastName=By.id("last-name");
    By postalCode=By.id("postal-code");
    By continueButton=By.id("continue");

    public  CheckoutInformation(WebDriver driver)
    {
        this.driver = driver;
    }

    //Set first name in first name textbox
    public void setFirstName(String fName)
    {
        driver.findElement(firstName).sendKeys(fName);
    }

    //Set last name in last name text box
    public void setLastName(String lName)
    {
        driver.findElement(lastName).sendKeys(lName);
    }

    //Set postal code in postal code textbox
    public void setPostalCode(String postalNumber)
    {
        driver.findElement(postalCode).sendKeys(postalNumber);
    }

    //Click on Continue button
    public void clickContinue()
    {
        driver.findElement(continueButton).click();
    }

}
