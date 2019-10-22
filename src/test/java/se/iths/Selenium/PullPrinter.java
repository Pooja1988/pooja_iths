package se.iths.Selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PullPrinter {
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
public void PullPrinter () throws InterruptedException {
    chrome.get(("https://gryphonqa-portal.azurewebsites.net/pullprinter/list"));
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
    WebElement CreatePullPrinter = chrome.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/header/a"));
    CreatePullPrinter.click();
    WebElement Name =chrome.findElement(By.xpath("//*[@id=\"Printer_Name\"]"));
    Name.sendKeys("PoojaPrinter");
    Thread.sleep(2000);
    WebElement UploadDriver = chrome.findElement(By.xpath("//*[@id=\"win64\"]/div[2]/a[1]"));
    UploadDriver.click();
    Select drp3 = new Select(chrome.findElement(By.id("brand-win64")));
    drp3.selectByVisibleText("Ricoh");
    WebElement Ok = chrome.findElement(By.xpath("//*[@id=\"windows-64-driver\"]/div/div[5]/span"));
    Thread.sleep(2000);
    Ok.click();
    WebElement TTL = chrome.findElement(By.xpath("//*[@id=\"Printer_PrintJobTtlMinutes\"]"));
    TTL.clear();
    Thread.sleep(2000);
    WebElement NewTime =chrome.findElement(By.xpath("//*[@id=\"Printer_PrintJobTtlMinutes\"]"));
    NewTime.sendKeys("2");
    NewTime.click();
    Thread.sleep(2000);
    WebElement AccessGroup = chrome.findElement(By.xpath("//*[@id=\"printerProperties\"]/div[1]/div[2]/div[2]/span/span[1]/span/ul/li/input"));
    AccessGroup.click();
    AccessGroup.sendKeys(Keys.ENTER);
    WebElement AddDevice =chrome.findElement(By.xpath("//*[@id=\"printerProperties\"]/div[2]/div[2]/div/div/div/a"));
    AddDevice.click();
    WebElement SearchDevice =chrome.findElement(By.xpath("//*[@id=\"associated-device-search\"]/span/span[1]/span/ul/li/input"));
    SearchDevice.sendKeys("Lex");
    WebElement ClickSearch1 = chrome.findElement(By.xpath("//*[@id=\"advsearch\"]/span"));
    ClickSearch1.click();
    WebElement Select = chrome.findElement(By.xpath("//*[@id=\"pull-printer-devices-dialog\"]/div/form/table/tbody/tr[10]/td[1]"));
    Select.submit();

   //WebElement SelectCheckBox = chrome.findElement(By.xpath("//*[@id=\"pull-printer-devices-dialog\"]/div/form/table/tbody/tr[10]/td[1]/input"));
   //SelectCheckBox.submit();



}
}
