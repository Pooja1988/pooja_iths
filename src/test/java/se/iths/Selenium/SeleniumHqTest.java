package se.iths.Selenium;


        import org.junit.After;
        import org.junit.Assert;
        import org.junit.Before;
        import org.junit.Test;
        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.chrome.ChromeDriver;
        import se.iths.Selenium.pages.DownloadPage;
        import se.iths.Selenium.pages.TopMenu;

        import java.util.List;

public class SeleniumHqTest {

    WebDriver chrome;

    @Before
    public void startBrowser(){
        chrome = new ChromeDriver();
    }

    @After
    public void closeBrowser(){
        chrome.quit();
    }

    @Test
    public void searchForChromeInSereachBoxAndCheckThatFirstHitIsGithub(){

        chrome.get("https://www.seleniumhq.org");
        WebElement searchBox = chrome.findElement(By.id("q"));
        searchBox.sendKeys("chrome");
        searchBox.submit();

        WebElement firstSearchHit = chrome.findElement(By.xpath("//*[@id=\"___gcse_0\"]/div/div/div/div[5]/div[2]/div/div/div[1]/div[1]/div[2]/div[2]"));

        Assert.assertEquals(
                "https://github.com/SeleniumHQ/selenium/wiki/ChromeDriver",
                firstSearchHit.getText()
        );
    }

    @Test
    public void validateVersion() {

        chrome.get("https://www.seleniumhq.org");
        TopMenu topMenu = new TopMenu(chrome);
        topMenu.clickDownloadTab();

        DownloadPage downloadPage = new DownloadPage(chrome);
        String version = downloadPage.getVersion();


        Assert.assertEquals(
                "3.141.59",
                version
        );


    }
    @Test
public void validateVersion1(){

        chrome.get("https://www.seleniumhq.org");
        TopMenu topMenu = new TopMenu(chrome);
        topMenu.clickSupportTab();

       List<WebElement> optionCount = chrome.findElements(By.cssSelector("h2"));
        System.out.println(optionCount.size());

    }


    @Test

    public void validateVersion2(){
        chrome.get("https://www.seleniumhq.org");
        TopMenu topMenu = new TopMenu(chrome);
        topMenu.clickAboutTab();

        List<WebElement> optionCount = chrome.findElements(By.cssSelector(".contributor>h3>a"));
        System.out.println(optionCount);



    }
}
