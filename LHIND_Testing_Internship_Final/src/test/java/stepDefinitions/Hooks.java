package stepDefinitions;

import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import utilities.BaseInformation;

public class Hooks {

    public static WebDriver driver;

    @Before
    public void setup() {
        driver = BaseInformation.getDriver();
    }

    /*@After
    public void quit() {
        driver.quit();
    }*/
}
