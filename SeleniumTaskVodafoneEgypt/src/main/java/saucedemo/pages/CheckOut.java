package saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOut {

    WebDriver driver;
    By checkOutButton=By.id("checkout");


    public CheckOut(WebDriver driver)
    {
        this.driver = driver;
    }

    //checkout product
    public void checkoutCart()
    {
        driver.findElement(checkOutButton).click();
    }
}
