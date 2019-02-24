package se.iths.Selenium;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLabTest {

    WebDriver chrome;

    @Before
    public void setUpBrowser(){
        chrome = new ChromeDriver();
    }

    @After
    public void closeBrowser(){
        chrome.quit();

    }

    @Test
    public void myVeryFirstTest()
    {
        SeleniumLab s = new SeleniumLab(chrome);
        s.BuyingAShiffonDess();
        chrome.manage().window().maximize();
        WebElement result = chrome.findElement(By.xpath("//*[@id=\"center_column\"]/h1"));

        Assert.assertEquals(
                "ORDER CONFIRMATION",
                result.getText()
        );

    }
}