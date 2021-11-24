package com.saucedemo.test;

import org.testng.annotations.Test;
import saucedemo.pages.CheckOut;
import static com.saucedemo.test.SetUp.driver;

public class CheckoutTest {

    public static CheckOut checkoutObj;

    @Test
    public static void checkOutTest() throws InterruptedException {
        checkoutObj = new CheckOut(driver);
        checkoutObj.checkoutCart();
         /* I used thread.sleep to slow down my script to be able
         to record demo video for run but i know that it's not recommended to use it
        because it has performance issue
        */
        Thread.sleep(2000);
    }
}
