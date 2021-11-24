package com.saucedemo.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import saucedemo.pages.Login;

public class LoginTest extends SetUp {

   public static Login loginObj;

    @Test
    public static void loginTest() throws InterruptedException {
        loginObj=new Login(driver);
        loginObj.setUserName("standard_user");
        loginObj.setPassword("secret_sauce");
        loginObj.clickLogin();
        String strUrl = driver.getCurrentUrl();
        Assert.assertEquals("https://www.saucedemo.com/inventory.html",strUrl,"Assertion miss match");
         /* I used thread.sleep to slow down my script to be able
         to record demo video for run but i know that it's not recommended to use it
        because it has performance issue
        */
        Thread.sleep(3000);


    }



}
