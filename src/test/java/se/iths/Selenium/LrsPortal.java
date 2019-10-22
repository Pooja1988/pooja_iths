package se.iths.Selenium;
import net.bytebuddy.utility.RandomString;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


import java.util.List;


public class LrsPortal {


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
    public void Login() throws InterruptedException {

        chrome.get("https://gryphonqa-portal.azurewebsites.net/directprinter/list");

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
    WebElement inputfield5 = chrome.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/header/a"));
    inputfield5.click();
    WebElement inputfield6 = chrome.findElement(By.xpath("//*[@id=\"Printer_Name\"]"));
    inputfield6.sendKeys("Test");

        Select drp1 = new Select(chrome.findElement(By.id("select2tags")));
        drp1.selectByVisibleText("Ricoh");
        Select drp2 = new Select(chrome.findElement(By.id("SelectedAccessGroups")));
        drp2.selectByVisibleText("GryphonAdmin");
        WebElement inputfield7 = chrome.findElement(By.xpath("//*[@id=\"create-printer-form\"]/div/div[2]/div/ul/li[1]/a"));
        inputfield7.click();
        WebElement ip8 = chrome.findElement(By.xpath("//*[@id=\"win64\"]/div[2]/a[1]"));
        ip8.click();
        Select drp3 = new Select(chrome.findElement(By.id("brand-win64")));
        drp3.selectByVisibleText("Ricoh");
        WebElement ip9 = chrome.findElement(By.xpath("//*[@id=\"windows-64-driver\"]/div/div[5]/input"));
        Thread.sleep(2000);
        ip9.click();
        WebElement ip10 = chrome.findElement(By.xpath("//*[@id=\"printerProperties\"]/div[2]/div[2]/div/div/div"));
        Thread.sleep(2000);
        ip10.submit();
        WebElement AssociatedDevice = chrome.findElement(By.xpath("//*[@id=\"printerProperties\"]/div[2]/div[2]/div/div/div"));
        AssociatedDevice.click();
        WebElement SearchPrinter = chrome.findElement(By.xpath("//*[@id=\"associated-device-search\"]/span/span[1]/span/ul/li/input"));
        SearchPrinter.sendKeys("HP");
       WebElement Search = chrome.findElement(By.xpath("//*[@id=\"advsearch\"]"));
       Search.click();
       WebElement CheckBox = chrome.findElement(By.xpath("//*[@id=\"add-device\"]/table/tbody/tr[2]/td[1]/input"));
       CheckBox.click();
        Thread.sleep(2000);
        WebElement Add = chrome.findElement(By.xpath("//*[@id=\"add-device\"]/div[2]/input"));
        Add.click();
        Thread.sleep(2000);
        WebElement Save = chrome.findElement(By.xpath("//*[@id=\"create-printer-button\"]"));
        Save.click();
        Thread.sleep(2000);
        String message = chrome.findElement(By.xpath("//*[@id=\"printerProperties\"]/div[1]/div[1]/span")).getText();
        if(message.contains("already exists, please use a unique name")){
            WebElement element  = chrome.findElement(By.xpath("//*[@id=\"Printer_Name\"]"));
            element.clear();
            String s = RandomStringUtils.randomAlphabetic(5);
            element.sendKeys(s);
            element.submit();
        }
        WebElement SearchPrinter1 = chrome.findElement(By.xpath("//*[@id=\"printer-search\"]/span/span[1]/span/ul/li/input"));
        SearchPrinter1.sendKeys("Test");








        }

/*        if(finalMessage.equals("Printer Already exist"))
        {
            System.out.println("Message is CORRECT.");
        }
        else
        {
            System.out.println("Message is INCORRECT.");
            WebElement element  = chrome.findElement(By.xpath("//*[@id=\"Printer_Name\"]"));
            element.clear();
            element.sendKeys("Lrs");
            element.submit();
        }*/
  /*      WebElement Newname  = chrome.findElement(By.xpath("//*[@id=\"Printer_Name\"]"));
        Newname.sendKeys("Lrs");
        Newname.submit();*/








    }

























