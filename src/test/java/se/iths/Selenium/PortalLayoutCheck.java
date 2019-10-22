package se.iths.Selenium;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class PortalLayoutCheck {
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
    public void Portal () throws InterruptedException {
        chrome.get(("https://gryphonqa-portal.azurewebsites.net/device/list"));
        WebElement UserName = chrome.findElement(By.xpath("//*[@id=\"i0116\"]"));
        UserName.sendKeys("admin@gat.onmicrosoft.com");
        WebElement inputfield1 = chrome.findElement(By.xpath("//*[@id=\"idSIButton9\"]"));
        inputfield1.click();
        WebElement Password = chrome.findElement(By.xpath("//*[@id=\"i0118\"]"));
        Password.sendKeys("Cirrato1");
        Thread.sleep(2000);
        WebElement inputfield3 = chrome.findElement(By.xpath("//*[@id=\"idSIButton9\"]"));
        inputfield3.click();
        WebElement inputfield4 = chrome.findElement(By.xpath("//*[@id=\"idSIButton9\"]"));
        inputfield4.click();
         WebElement Filter = chrome.findElement(By.xpath("//*[@id=\"list-device-view\"]/div/div[2]/div/span"));
        Filter.click();
        WebElement CreateDevice = chrome.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/header/a"));
        CreateDevice.click();
        chrome.get(("https://gryphonqa-portal.azurewebsites.net/device/list"));
        Thread.sleep(2000);
        WebElement SelectDevice = chrome.findElement(By.xpath("//*[@id=\"list-item-content\"]/tr[1]/td[2]/ul[1]/li"));
        SelectDevice.click();
        WebElement CreatePrinter = chrome.findElement(By.xpath("//*[@id=\"list-item-content\"]/tr[1]/td[2]/ul[2]/li[2]/a"));
        CreatePrinter.click();
        Thread.sleep(2000);
        chrome.get(("https://gryphonqa-portal.azurewebsites.net/device/list"));
        Thread.sleep(2000);
        WebElement SelectDevice1 = chrome.findElement(By.xpath("//*[@id=\"list-item-content\"]/tr[1]/td[2]/ul[1]/li"));
        SelectDevice1.click();
        WebElement Association = chrome.findElement(By.xpath("//*[@id=\"list-item-content\"]/tr[1]/td[2]/ul[2]/li[3]/span"));
        Association.click();
        Thread.sleep(2000);
        chrome.get("https://gryphonqa-portal.azurewebsites.net/directprinter/list");
        WebElement CreatePrinterPage = chrome.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/header/a"));
        CreatePrinterPage.click();
        WebElement Drivers = chrome.findElement(By.xpath("//*[@id=\"create-printer-form\"]/div/div[2]/div/ul/li[1]/a"));
        Drivers.click();
        WebElement UploadDrivers = chrome.findElement(By.xpath("//*[@id=\"win64\"]/div[2]/a[1]"));
        UploadDrivers.click();
        WebElement Button1  =chrome.findElement(By.xpath("//*[@id=\"brand-win64\"]"));
        Button1.click();
        Select drp3 = new Select(chrome.findElement(By.id("brand-win64")));
        drp3.selectByVisibleText("Ricoh");
        WebElement Button2 = chrome.findElement(By.xpath("//*[@id=\"windows-64-driver\"]/div/div[5]/input"));
        Thread.sleep(2000);
        Button2.click();






    }




}
