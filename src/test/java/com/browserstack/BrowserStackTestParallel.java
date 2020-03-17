package com.browserstack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;


public class BrowserStackTestParallel extends BrowserStackTestNGTest {

    @Test
    public void AssertionsTest() throws Exception {
        driver.get("https://www.macys.com/");
        Thread.sleep(5000);
        String Expected = "Macy's - Shop Fashion Clothing & Accessories - Official Site - Macys.com";
        String Actual = driver.getTitle();
        //Assertion1 for a page Title
        Assert.assertEquals(Actual,Expected);
        WebElement ListHeader = driver.findElement(By.id("header-wishlist-label"));
        //Assertion2 for a 'LIST' on header
        Assert.assertTrue(ListHeader.isDisplayed());
        WebElement SignIn = driver.findElement(By.id("myRewardsLabel-status"));
        //Assertion3 for a 'Sign-in' on Header
        Assert.assertTrue(SignIn.isDisplayed());

    }

}

