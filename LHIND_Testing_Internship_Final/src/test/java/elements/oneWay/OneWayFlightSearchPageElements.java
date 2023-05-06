package elements.oneWay;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseInformation;

import java.util.List;

public class OneWayFlightSearchPageElements {

    public OneWayFlightSearchPageElements() {
        PageFactory.initElements(BaseInformation.getDriver(), this);
    }

    @FindBy(css = "a[data-description='Economy Class']")
    public List<WebElement> EconomyPriceBtns;

    @FindBy(xpath = "//div[contains(@class, 'non-mobile')]//button[@class = 'ui button red  ']")
    public List<WebElement> BookNowBtns;
}
