package pages;

import elements.FlightSearchPageElements;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseInformation;
import utilities.BasePageObject;

public class FlightSearchPage {

    BasePageObject basePageObject = new BasePageObject(BaseInformation.getBaseInformation());
    FlightSearchPageElements flightSearchPageElements =  new FlightSearchPageElements();

    public FlightSearchPage() {
        PageFactory.initElements(BaseInformation.getDriver(), this);
    }

    public void clickOnFlightLink(String flightType) {
        switch(flightType) {
            case "one way":
                //given that the order is base on lowest to highest price,
                //we select the cheapest one
                basePageObject
                        .getWebElementUtils()
                        .javaScriptClick(flightSearchPageElements.economyClassBtns.get(0));
                break;
            case "round trip":
                basePageObject
                        .getWebElementUtils()
                        .javaScriptClick(flightSearchPageElements.premiumClassBtns.get(0));
        }

    }

    public void clickOnCheapestFlightOption() {
        basePageObject
                .getWaitUtils()
                .waitForElementClickable(flightSearchPageElements.bookNowBtns.get(0))
                .click();
    }
}
