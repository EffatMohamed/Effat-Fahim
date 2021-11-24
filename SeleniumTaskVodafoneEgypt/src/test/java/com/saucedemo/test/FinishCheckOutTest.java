package com.saucedemo.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import saucedemo.pages.FinishCheckOut;
import static com.saucedemo.test.SetUp.driver;

public class FinishCheckOutTest {

    public static FinishCheckOut finishCheckOutObj;

    @Test
    public static void finishTest() throws InterruptedException {
        finishCheckOutObj = new FinishCheckOut(driver);
        finishCheckOutObj.clickFinish();

        String Actual=driver.findElement(By.className("complete-header")).getText();
        Assert.assertEquals("THANK YOU FOR YOUR ORDER",Actual,"Assertion miss match");
         /* I used thread.sleep to slow down my script to be able
         to record demo video for run but i know that it's not recommended to use it
        because it has performance issue
        */
        Thread.sleep(2000);
    }


}
