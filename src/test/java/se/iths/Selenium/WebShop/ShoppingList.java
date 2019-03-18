package se.iths.Selenium.WebShop;

import junit.lab.atm.AutomaticTellerMachine;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShoppingList {

    WebDriver chrome;

    @Before
    public void startBrowser(){
        chrome = new ChromeDriver();
    }

    @After
    public void closeBrowser(){
        chrome.quit();
    }

    @Test

    public void logIn(){
     chrome.get("http://automationpractice.com");
        AutomaticTellerMachine LogInPage = new AutomaticTellerMachine();



    }
}
