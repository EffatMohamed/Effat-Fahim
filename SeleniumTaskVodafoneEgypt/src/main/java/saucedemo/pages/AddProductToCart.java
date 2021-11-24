package saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddProductToCart {

    WebDriver driver;
    By addToCartButton=By.id("add-to-cart-sauce-labs-fleece-jacket");
    By shoppingCart=By.className("shopping_cart_link");

    public AddProductToCart(WebDriver driver)
    {
        this.driver = driver;
    }

    //add element to cart
    public void addElementToCart()
    {
        driver.findElement(addToCartButton).click();
    }

    //check shopping cart
    public void checkShoppingCart()
    {
        driver.findElement(shoppingCart).click();
    }
}
