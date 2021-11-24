package com.saucedemo.test;

import org.testng.annotations.Test;
import saucedemo.pages.AddProductToCart;

public class AddProductToCartTest extends SetUp{

    public static AddProductToCart addProductToCartObj;

    @Test
    public static void addProductToCartTest() throws InterruptedException {
        addProductToCartObj = new AddProductToCart(driver);

        addProductToCartObj.addElementToCart();
        addProductToCartObj.checkShoppingCart();
         /* I used thread.sleep to slow down my script to be able
         to record demo video for run but i know that it's not recommended to use it
        because it has performance issue
        */
        Thread.sleep(2000);
    }

}
