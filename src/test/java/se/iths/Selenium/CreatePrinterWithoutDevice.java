package se.iths.Selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class CreatePrinterWithoutDevice {

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
    public void CreatePrinterWithoutDevice() throws InterruptedException{
    chrome.get(("https://gryphonqa-portal.azurewebsites.net/directprinter/list"));
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
    WebElement CreatePrinter = chrome.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/header/a"));
    CreatePrinter.click();
    WebElement PrinterName = chrome.findElement(By.xpath("//*[@id=\"Printer_Name\"]"));
    PrinterName.sendKeys("Ricohpooja");
    WebElement Adddevice = chrome.findElement(By.xpath("//*[@id=\"printerProperties\"]/div[2]/div[2]/div/div/div/a"));
    Adddevice.click();
    Thread.sleep(2000);
    WebElement Searchdevice = chrome.findElement(By.xpath("//*[@id=\"associated-device-search\"]/span/span[1]/span/ul/li/input"));
    Searchdevice.sendKeys("Ap");
    WebElement ClickSearch = chrome.findElement(By.xpath("//*[@id=\"advsearch\"]/span"));
    ClickSearch.click();
    WebElement Checkbox = chrome.findElement(By.xpath("//*[@id=\"add-device\"]/table/tbody/tr[10]/td[1]/input"));
    Checkbox.click();
    WebElement ClickCheckbox = chrome.findElement(By.xpath("//*[@id=\"add-device\"]/table/tbody/tr[1]/td[1]/input"));
    ClickCheckbox.submit();
    Thread.sleep(2000);
    WebElement Removedevice = chrome.findElement(By.xpath("//*[@id=\"printerProperties\"]/div[2]/div[2]/div/div/div/span"));
    Removedevice.click();
    Thread.sleep(2000);
    WebElement Adddeployment = chrome.findElement(By.xpath("//*[@id=\"win64\"]/div[2]/a[1]"));
    Adddeployment.click();
    WebElement Option = chrome.findElement(By.xpath("//*[@id=\"brand-win64\"]"));
    Option.sendKeys("Ricoh");
   // WebElement Ok = chrome.findElement(By.xpath("//*[@id=\"windows-64-driver\"]/div/div[5]/input"));
    //Ok.click();
    WebElement Adddrivers = chrome.findElement(By.xpath("//*[@id=\"windows-64-driver\"]/div/div[5]/input"));
    Thread.sleep(2000);
    Adddrivers.click();
    //Creating printer successfully
    //driver.find_element_by_id('abc').clear();

 WebElement ClearName = chrome.findElement(By.xpath("//*[@id=\"Printer_Name\"]"));
 ClearName.clear();
    Thread.sleep(2000);
    ClearName.click();
 WebElement NewName = chrome.findElement(By.xpath("//*[@id=\"Printer_Name\"]"));
 NewName.sendKeys("LrsTestnew");
    WebElement AssociatedDevice = chrome.findElement(By.xpath("//*[@id=\"printerProperties\"]/div[2]/div[2]/div/div/div/a"));
    AssociatedDevice.click();
    Thread.sleep(2000);
    WebElement Searchdevice1 = chrome.findElement(By.xpath("//*[@id=\"associated-device-search\"]/span/span[1]/span/ul/li/input"));
    Searchdevice1.sendKeys("Ap");
    WebElement ClickSearch1 = chrome.findElement(By.xpath("//*[@id=\"advsearch\"]/span"));
    ClickSearch1.click();
    WebElement Checkbox1 = chrome.findElement(By.xpath("//*[@id=\"add-device\"]/table/tbody/tr[10]/td[1]/input"));
    Checkbox1.click();
    WebElement ClickCheckbox1 = chrome.findElement(By.xpath("//*[@id=\"add-device\"]/table/tbody/tr[1]/td[1]/input"));
    ClickCheckbox1.submit();
    Thread.sleep(2000);
    WebElement Save = chrome.findElement(By.id("create-printer-button"));
    Save.submit();




















}









}
