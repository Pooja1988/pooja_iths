package se.iths.cucumber;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class CucumberHooks {

    private static CucumberWorld world;

    public static CucumberWorld getWorld() {

        return world;
    }

    @Before
    public void setup2(){
        world = new CucumberWorld();
        world.setDriver(new ChromeDriver());
    }

    @After
    public void tearDown(){
        world.getDriver().quit();
    }

}
