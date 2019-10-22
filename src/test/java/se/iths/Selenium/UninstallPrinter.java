package se.iths.Selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UninstallPrinter {
    WebDriver chrome;
    @Before
    public void setUpBrowser() {
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");

        chrome = new ChromeDriver() ;  }
    @After
    public void closeBrowser(){
        // chrome.quit();

    }
    @Test
    public void CreateDeviceWithLongName() throws InterruptedException{
       chrome.get(("https://gryphonqa-portal.azurewebsites.net/device/list"));
        WebElement inputfield = chrome.findElement(By.xpath("//*[@id=\"i0116\"]"));
        inputfield.sendKeys("admin@gat.onmicrosoft.com");
        WebElement inputfield1 = chrome.findElement(By.xpath("//*[@id=\"idSIButton9\"]"));
        inputfield1.click();
        WebElement inputfield2 = chrome.findElement(By.xpath("//*[@id=\"i0118\"]"));
        inputfield2.sendKeys("Cirrato1");
        Thread.sleep(2000);
        WebElement inputfield3 = chrome.findElement(By.xpath("//*[@id=\"idSIButton9\"]"));
        inputfield3.click();
        WebElement inputfield4 = chrome.findElement(By.xpath("//*[@id=\"idSIButton9\"]"));
        inputfield4.click();
}}
