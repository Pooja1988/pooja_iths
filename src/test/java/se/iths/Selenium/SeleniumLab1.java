package se.iths.Selenium;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLab1

{
    WebDriver chrome;
@Before
    public void startBrowser(){

    chrome = new ChromeDriver();

    }
    @After
    public void closeBrowser(){
    chrome.quit();
}

}
