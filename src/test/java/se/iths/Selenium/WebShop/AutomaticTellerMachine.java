package se.iths.Selenium.WebShop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AutomaticTellerMachine {

    WebDriver chrome;

    public AutomaticTellerMachine(WebDriver driver){
        this.chrome = driver;
    }

    public void login(User user){
        chrome.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(user.getUsername());
        chrome.findElement(By.xpath("//*[@id=\"passwd\"]")).sendKeys(user.getPassword());
    }

    public void login(String user, String pass){

    }

}

