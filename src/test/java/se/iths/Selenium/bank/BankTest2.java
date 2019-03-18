package se.iths.Selenium.bank;

import com.codeborne.selenide.Selenide;
import org.junit.Test;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.open;

public class BankTest2 {

    @Test
    public void addCustomer(){

        open("http://www.way2automation.com/angularjs-protractor/banking/#/login\n");
        $("body > div.ng-scope > div > div.ng-scope > div > div.borderM.box.padT20 > div:nth-child(3) > button").click();
        $("body > div.ng-scope > div > div.ng-scope > div > div.center > button:nth-child(1)").click();


}




}