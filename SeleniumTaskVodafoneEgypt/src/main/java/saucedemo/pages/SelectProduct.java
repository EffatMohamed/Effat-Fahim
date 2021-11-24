package saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SelectProduct {

    WebDriver driver;
    By element=By.xpath("(//div[@class='inventory_item_name'])[4]");

    public SelectProduct(WebDriver driver)
    {
        this.driver = driver;
    }

    //select product
    public void selectProducts()
    {
        driver.findElement(element).click();
    }

}
