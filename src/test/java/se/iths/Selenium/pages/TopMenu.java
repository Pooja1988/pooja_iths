package se.iths.Selenium.pages;


 import org.openqa.selenium.By;
 import org.openqa.selenium.WebDriver;
 import org.openqa.selenium.WebElement;

public class TopMenu {

    WebDriver driver;
    By downloadLinkIdentifier = By.xpath("//*[@id=\"menu_download\"]/a");

    public TopMenu(WebDriver driver) {
        this.driver = driver;
    }

    public void clickDownloadTab() {

        WebElement downloadLink = driver.findElement(downloadLinkIdentifier);
        downloadLink.click();
    }


    public void clickSupportTab() {

        WebElement support = driver.findElement(By.xpath("//*[@id=\"menu_support\"]/a"));
        support.click();
    }

    public void clickAboutTab(){

        WebElement about = driver.findElement(By.xpath("//*[@id=\"menu_about\"]/a"));
        about.click();
    }

}



