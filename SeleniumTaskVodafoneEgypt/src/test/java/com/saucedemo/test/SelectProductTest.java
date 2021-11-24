package com.saucedemo.test;

import org.testng.annotations.Test;
import saucedemo.pages.SelectProduct;




public class SelectProductTest extends SetUp {

    public static SelectProduct selectProductObj;

    @Test
    public static void selectProductTest() throws InterruptedException {
        selectProductObj = new SelectProduct(driver);
        selectProductObj.selectProducts();

         /* I used thread.sleep to slow down my script to be able
         to record demo video for run but i know that it's not recommended to use it
        because it has performance issue
        */
        Thread.sleep(3000);
    }

}