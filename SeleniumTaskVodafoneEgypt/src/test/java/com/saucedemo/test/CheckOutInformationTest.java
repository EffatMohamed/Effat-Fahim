package com.saucedemo.test;

import org.testng.annotations.Test;
import saucedemo.pages.CheckoutInformation;
import static com.saucedemo.test.SetUp.driver;

public class CheckOutInformationTest {

    public static CheckoutInformation checkOutInformationObj;

    @Test
    public static void checkOutTest() throws InterruptedException {
        checkOutInformationObj=new CheckoutInformation(driver);
        checkOutInformationObj.setFirstName("Effat");
        checkOutInformationObj.setLastName("Mohamed");
        checkOutInformationObj.setPostalCode("12345");
        checkOutInformationObj.clickContinue();
          /* I used thread.sleep to slow down my script to be able
         to record demo video for run but i know that it's not recommended to use it
        because it has performance issue
        */
        Thread.sleep(2000);


    }
}
