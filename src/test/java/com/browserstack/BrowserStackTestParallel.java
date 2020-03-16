package com.browserstack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit


public class BrowserStackTestParallel extends BrowserStackTestNGTest {

    @Test
    public void AssertionsTest() throws Exception {
        driver.get("https://www.macys.com/");
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
        WebElement element = driver.findElement(By.id("logo"));
        Assert.assertTrue(element.isDisplayed());

    }

}

