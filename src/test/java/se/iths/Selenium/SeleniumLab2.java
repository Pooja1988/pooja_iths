package se.iths.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumLab2 {

    public void PurchaseDress(WebDriver webDriver) {
        webDriver.get("http://automationpractice.com");
        webDriver.findElement(By.xpath("//*[@id=\"search_query_top\"]")).sendKeys("Chiffon Dress");
        webDriver.findElement(By.xpath("//*[@id=\"search_query_top\"]")).submit();

        WebElement webElement = webDriver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/div[2]/a[1]/span"));
        webElement.click();

        WebElement webElement1 = webDriver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span"));
        ExpectedCondition expectedCondition = ExpectedConditions.elementToBeClickable(webElement1);
        WebDriverWait webDriverWait = new WebDriverWait(webDriver, 4);
        webDriverWait.until(expectedCondition);
        webElement1.click();

        webDriver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span")).click();
        webDriver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("slask@apa.se");
        webDriver.findElement(By.xpath("//*[@id=\"passwd\"]")).sendKeys("slask");
        webDriver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span")).click();

        webDriver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button/span")).click();
        webDriver.findElement(By.xpath("//*[@id=\"form\"]/div/p[2]/label")).click();
        webDriver.findElement(By.xpath("//*[@id=\"form\"]/p/button/span")).click();

        webDriver.findElement(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a")).click();
        webDriver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button/span")).submit();
    }}