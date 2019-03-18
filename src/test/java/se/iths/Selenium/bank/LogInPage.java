package se.iths.Selenium.bank;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogInPage {

    WebDriver chrome;

    @Before
    public void startBrowser(){chrome = new ChromeDriver();}

    @After
    public void closeBrowser(){chrome.quit();}

   @Test

    public void createUserTest(){
        
        chrome.get("http://www.way2automation.com/angularjs-protractor/banking/");


    }
}
