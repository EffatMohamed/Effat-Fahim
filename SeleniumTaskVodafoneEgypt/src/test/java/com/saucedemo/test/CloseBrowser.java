package com.saucedemo.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;


public class CloseBrowser extends SetUp{

    public static WebDriver driver;

    @AfterSuite
    public static void tearDown() {

        driver.quit();
    }

}
