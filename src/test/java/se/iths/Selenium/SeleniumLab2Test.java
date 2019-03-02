package se.iths.Selenium;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLab2Test {

    WebDriver webDriver;

    @Before
    public void setUpBrowser(){
        webDriver = new ChromeDriver(); }

    @After
    public void closeBrowser(){
        webDriver.quit(); }

    @Test
    public void testPurchaseDress() {
        SeleniumLab2 s = new SeleniumLab2();
        s.PurchaseDress(webDriver);
        webDriver.manage().window().maximize();
        WebElement element = webDriver.findElement(By.xpath("//*[@id=\"center_column\"]/h1"));
        Assert.assertNotNull(element.getText());
        Assert.assertEquals("ORDER CONFIRMATION", element.getText());

    }
}