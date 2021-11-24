package saucedemo.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class FinishCheckOut {

    WebDriver driver;
    By finishButton=By.id("finish");

    public  FinishCheckOut(WebDriver driver)
    {
        this.driver = driver;
    }

    public void clickFinish()
    {
        driver.findElement(finishButton).click();
    }



}
