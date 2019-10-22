package se.iths.Selenium;

import gherkin.lexer.De;
import net.bytebuddy.asm.Advice;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrinterWithLongName {
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
        public void CreateDeviceWithLongName() throws InterruptedException{
        chrome.get(("https://gryphonqa-portal.azurewebsites.net/device/list"));
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
        WebElement Name = chrome.findElement(By.xpath("//*[@id=\"Device_Name\"]"));
        Name.sendKeys("ddpdjobzuboudaoayoyaodygugdhnhnishnishbbbyesuesususjrsdj");
        WebElement Location =chrome.findElement(By.xpath("//*[@id=\"Device_Location\"]"));
        Location.sendKeys("ddobzuboudaoayoyaodygugdhnhnishnishbbbyesuesususjrsdjsweden");
        WebElement Url = chrome.findElement(By.xpath("//*[@id=\"Device_Url\"]"));
        Url.sendKeys("http://udemy");
        WebElement AdminUrl = chrome.findElement(By.xpath("//*[@id=\"Device_AdminUrl\"]"));
        AdminUrl.sendKeys("http://pdjobzuboudaoayoyaodygugdhnhnishnishbbbyesuesususjrsdj.local");
        WebElement Capabilities = chrome.findElement(By.xpath("//*[@id=\"rowProperties\"]/div[2]/ul/li[1]/label"));
        Capabilities.click();
        WebElement Save = chrome.findElement(By.xpath("//*[@id=\"create-button\"]"));
        Save.submit();
        Thread.sleep(5000);

    }

        @Test
    public void CreatePrinterWithLongName() throws InterruptedException{
      chrome.get(("https://gryphonqa-portal.azurewebsites.net/directprinter/list"));
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
            WebElement CreatePrinter = chrome.findElement(By.xpath("//*[@id=\"Printer_Name\"]"));
            CreatePrinter.sendKeys("ffbvbwfdeyfiifffiifiwywygjgkfgkuahwfhkayghahwlghliqwhvqoiutoquuypuqpubypupgpgpeyuyjjujuj");
            Thread.sleep(2000);
            WebElement Tags = chrome.findElement(By.xpath("//*[@id=\"printerProperties\"]/div[1]/div[2]/div[1]/div/span/span[1]/span/ul/li/input"));
            Tags.click();
            Tags.sendKeys("hgahgggewgrtygwgefweghhdhhggjfcgkfckfkgsgshshsyseuyhhfkihewaighiuwqyghqwiuhgiqqyugbywqyubgyuegyuegrwybudhd");
            Tags.sendKeys(Keys.ENTER);
            WebElement Adddrivers = chrome.findElement(By.xpath("//*[@id=\"win64\"]/div[2]/a[1]"));
            Adddrivers.click();
            Select drp3 = new Select(chrome.findElement(By.id("brand-win64")));
            drp3.selectByVisibleText("Ricoh");
            WebElement ip9 = chrome.findElement(By.xpath("//*[@id=\"windows-64-driver\"]/div/div[5]/input"));
            Thread.sleep(2000);
            ip9.click();
            Thread.sleep(500);
           WebElement Add =chrome.findElement(By.xpath("//*[@id=\"printerProperties\"]/div[2]/div[2]/div/div/div"));
            Add.click();
            Thread.sleep(2000);
            WebElement Searchdevice = chrome.findElement(By.xpath("//*[@id=\"associated-device-search\"]/span/span[1]/span/ul/li/input"));
            Searchdevice.sendKeys("Lexmark");
            WebElement ClickSearch = chrome.findElement(By.xpath("//*[@id=\"advsearch\"]/span"));
            ClickSearch.click();
            WebElement Checkbox = chrome.findElement(By.xpath("//*[@id=\"add-device\"]/table/tbody/tr[6]/td[1]/input"));
            Checkbox.click();
            WebElement Adddevice = chrome.findElement( By.xpath("//*[@id=\"add-device\"]/div[2]/input"));
            Adddevice.submit();
            WebElement CreateConfiguration = chrome.findElement(By.xpath("//*[@id=\"create-printer-form\"]/div/div[2]/div/ul/li[2]/a"));
            CreateConfiguration.click();
            WebElement clickplussign = chrome.findElement(By.xpath("//*[@id=\"win10-64\"]/td[5]/a/span"));
            clickplussign.click();
            WebElement Configname = chrome.findElement(By.xpath("//*[@id=\"create-configuration-dialog\"]/div[1]/div[1]/input"));
            Configname.sendKeys("gususrrwsigfqffhggjkftkgs<ghtetyutesryseahgahwjhthertjertykrtklrklpoojasolankipoojarathorepoojalrspoojalrstestpoojalrsportalpoojalgdhsjrsjtjrirtlk");
            WebElement Addcomment = chrome.findElement(By.xpath("//*[@id=\"create-configuration-dialog\"]/div[1]/div[2]/textarea"));
            Addcomment.sendKeys("dujddqqfwgfdhgggktfkdgs<gtssyeesuyaytayhdifhgoihrohgqhihgiuqhgihi7gy7q8tg978ytq9yg9yq0hgqhqeh");
            WebElement Create = chrome.findElement(By.xpath("//*[@id=\"create-configuration-dialog\"]/div[2]/button[2]"));
            Create.click();
            WebElement Save = chrome.findElement(By.xpath("//*[@id=\"create-printer-button\"]"));
            Save.submit();
            WebElement SearchPrinter = chrome.findElement(By.xpath("//*[@id=\"printer-search\"]/span/span[1]/span/ul/li/input"));
           SearchPrinter.sendKeys("ff");
            Thread.sleep(2000);
            WebElement InstallPrinter = chrome.findElement(By.xpath("//*[@id=\"list-item-content\"]/tr[5]/td[4]/div[1]/button"));
            InstallPrinter.click();
            Thread.sleep(6000);
            WebElement UninstallPrinter = chrome.findElement(By.xpath("//*[@id=\"list-item-content\"]/tr[5]/td[4]/div[1]/button"));
            UninstallPrinter.click();
            Thread.sleep(6000);
            WebElement DeletePrinter = chrome.findElement(By.xpath("//*[@id=\"list-item-content\"]/tr[5]/td[2]/ul[1]/li"));
            DeletePrinter.click();
            WebElement Delete = chrome.findElement(By.xpath("//*[@id=\"list-item-content\"]/tr[5]/td[2]/ul[2]/li[2]/a"));
            Thread.sleep(2000);
            Delete.click();
            chrome.switchTo().alert().accept();




































    }


    }


