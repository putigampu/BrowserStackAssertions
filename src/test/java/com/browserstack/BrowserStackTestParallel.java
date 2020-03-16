package com.browserstack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


public class BrowserStackTestParallel extends BrowserStackTestNGTest {

    @Test
    public void AssertionsTest() throws Exception {
        driver.get("https://www.macys.com/");
        WebElement element = driver.findElement(By.id("logo"));
        Assert.assertTrue(element.isDisplayed());

    }

}

