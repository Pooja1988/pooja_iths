package se.iths.Selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DownloadPage {

    WebDriver browser;

    public DownloadPage(WebDriver driver){
        this.browser = driver;

    }

    public String getVersion(){

        WebElement Version = browser.findElement(By.xpath("//*[@id=\"mainContent\"]/p[3]/a")) ;
        return Version.getText();
    }

}
