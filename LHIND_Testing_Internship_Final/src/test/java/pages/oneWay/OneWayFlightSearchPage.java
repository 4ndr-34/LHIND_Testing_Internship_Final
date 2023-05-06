package pages.oneWay;

import elements.oneWay.OneWayFlightSearchPageElements;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseInformation;
import utilities.BasePageObject;

public class OneWayFlightSearchPage {

    BasePageObject basePageObject = new BasePageObject(BaseInformation.getBaseInformation());
    OneWayFlightSearchPageElements oneWayFlightSearchPageElements =  new OneWayFlightSearchPageElements();

    public OneWayFlightSearchPage() {
        PageFactory.initElements(BaseInformation.getDriver(), this);
    }

    public void clickOnFirstFlight() {
        //given that the order is base on lowest to highest price,
        //we select the cheapest one

        basePageObject
                .getWebElementUtils()
                .javaScriptClick(oneWayFlightSearchPageElements.EconomyPriceBtns.get(0));
    }

    public void clickOnCheapestFlightOption() {
        basePageObject
                .getWaitUtils()
                .waitForElementClickable(oneWayFlightSearchPageElements.BookNowBtns.get(0))
                .click();
    }
}
