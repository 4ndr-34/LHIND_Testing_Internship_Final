package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseInformation;

import java.util.List;

public class FlightSearchPageElements {

    public FlightSearchPageElements() {
        PageFactory.initElements(BaseInformation.getDriver(), this);
    }

    @FindBy(css = "a[data-description='Economy Class']")
    public List<WebElement> economyClassBtns;

    @FindBy(css = "a[data-description='Bussines Class']")
    public List<WebElement> businessClassBtns;
    @FindBy(css = "a[data-description='Premium Class']")
    public List<WebElement> premiumClassBtns;
    @FindBy(xpath = "//div[contains(@class, 'non-mobile')]//button[@class = 'ui button red  ']")
    public List<WebElement> bookNowBtns;
}
