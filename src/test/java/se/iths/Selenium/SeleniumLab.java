package se.iths.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumLab {

    WebDriver driver;


    public SeleniumLab(WebDriver driver ){
        this.driver= driver;

    }
    public void BuyingAShiffonDess(){

        driver.get("http://automationpractice.com");
        driver.findElement(By.xpath("//*[@id=\"search_query_top\"]")).sendKeys("Printed Chiffon Dress");
        driver.findElement(By.xpath("//*[@id=\"search_query_top\"]")).submit();

        WebElement clickForAddTOCart =  driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/div[2]/a[1]/span"));
        clickForAddTOCart.click();

        WebElement clickForProceedToCheckout = driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span"));
        ExpectedCondition proceedToCheckoutIsClickable = ExpectedConditions.elementToBeClickable(clickForProceedToCheckout);
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(proceedToCheckoutIsClickable);
        clickForProceedToCheckout.click();

        driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span")).click();
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("slask@apa.se");
        driver.findElement(By.xpath("//*[@id=\"passwd\"]")).sendKeys("slask");
        driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span")).click();

        driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button/span")).click();
        driver.findElement(By.xpath("//*[@id=\"form\"]/div/p[2]/label")).click();

        driver.findElement(By.xpath("//*[@id=\"form\"]/p/button/span")).click();

        driver.findElement(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a")).click();

        driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button/span")).submit();
    }
    }

