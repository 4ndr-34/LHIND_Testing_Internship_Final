package pages;

import elements.LandingPageElements;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utilities.BaseInformation;
import utilities.BasePageObject;

import java.util.Random;

public class LandingPage {

    BasePageObject basePageObject = new BasePageObject(BaseInformation.getBaseInformation());
    LandingPageElements landingPageElements = new LandingPageElements();

    public LandingPage() {
        PageFactory.initElements(BaseInformation.getDriver(), this);
    }

    public void clickOneWay() {
        basePageObject
                .getWaitUtils()
                .waitForElementVisible(landingPageElements.oneWayBtn)
                .click();
    }

    public void clickRoundTrip() {
        basePageObject
                .getWaitUtils()
                .waitForElementVisible(landingPageElements.roundTripBtn)
                .click();
    }

    public void clickMultiDestinations() {
        basePageObject
                .getWaitUtils()
                .waitForElementVisible(landingPageElements.multiDestinationBtn)
                .click();
    }

    public void setDepartureAirport(String name) {
        basePageObject
                .getWebElementUtils()
                .sendKeysToElementWithWait(landingPageElements.departureCityField, name, 1000);

        basePageObject
                .getWebElementUtils()
                .sendKeysToElementWithWait(landingPageElements.departureCityField, String.valueOf(Keys.ENTER), 0);
    }

    public void setDestinationAirport(String name) {
        basePageObject
                .getWebElementUtils()
                .sendKeysToElementWithWait(landingPageElements.destinationCityField, name, 1000);

        basePageObject
                .getWebElementUtils()
                .sendKeysToElementWithWait(landingPageElements.destinationCityField, String.valueOf(Keys.ENTER), 0);
    }

    public void setDepartureDate() {
        basePageObject
                .getWaitUtils()
                .waitForElementClickableWithCustomTime(5000, landingPageElements.departureDateField)
                .click();

        Random random = new Random();
        int randomDate = random.ints(0, landingPageElements.availableMayDepartureDates.size() - 1)
                .findFirst()
                .getAsInt();

        basePageObject
                .getWaitUtils()
                .waitForElementClickableWithCustomTime(5000, landingPageElements.availableMayDepartureDates.get(randomDate))
                .click();
    }

    public void setReturnDate() {
        //opens calendar dropdown
        basePageObject
                .getWaitUtils()
                .waitForElementClickable(landingPageElements.returnDateField)
                .click();
        //goes to next month calendar
        basePageObject
                .getWaitUtils()
                .waitForElementClickable(landingPageElements.nextMonthBtn)
                .click();

        //sets a random date of return
        Random random = new Random();
        basePageObject
                .getWaitUtils()
                .waitForElementClickableWithCustomTime(5000, landingPageElements.availableJuneReturnDates
                        .get(random.nextInt(landingPageElements.availableJuneReturnDates.size() - 1)))
                .click();
    }

    public void setCabinPreference(String preference) {
        basePageObject
                .getWebElementUtils()
                .selectFromDropDownElementByVisibleText(landingPageElements.cabinPreference, preference);
    }

    public void setNumberOfAdults(int number) {
        try {
            basePageObject
                    .getWebElementUtils()
                    .selectFromDropDownElementByVisibleText(landingPageElements.adultsDropdown, Integer.toString(number));
        } catch (Exception e) {
            System.out.println("ERROR!" + e.getMessage());
        }
    }

    public void setNumberOfChildren(int number) {
        try {
            basePageObject
                    .getWebElementUtils()
                    .selectFromDropDownElementByVisibleText(landingPageElements.childDropdown, Integer.toString(number));
        } catch (Exception e) {
            System.out.println("ERROR!" + e.getMessage());
        }
    }

    public void setNumberOfInfants(int number) {
        try {
            basePageObject
                    .getWebElementUtils()
                    .selectFromDropDownElementByVisibleText(landingPageElements.infantDropdown, Integer.toString(number));
        } catch (Exception e) {
            System.out.println("ERROR!" + e.getMessage());
        }
    }

    public void clickAdvancedOptions() {
        basePageObject
                .getWaitUtils()
                .waitForElementClickable(landingPageElements.advancedOptions)
                .click();
    }

    public void selectFlightType(String type) {
            basePageObject
                    .getWebElementUtils()
                            .javaScriptClick(landingPageElements.flightTypesDropdown);

            basePageObject
                    .getWebElementUtils()
                    .selectFromDropDownElementByVisibleText(landingPageElements.flightTypesDropdown, type);

    }

    public void setFirstPreferredAirline(String name) {
        basePageObject
                .getWaitUtils()
                .waitForElementVisible(landingPageElements.preferredAirlineField1)
                .sendKeys(name);
    }

    public void setSecondPreferredAirline(String name) {
        basePageObject
                .getWaitUtils()
                .waitForElementVisible(landingPageElements.preferredAirlineField2)
                .sendKeys(name);
    }

    public void setThirdPreferredAirline(String name) {
        basePageObject
                .getWaitUtils()
                .waitForElementVisible(landingPageElements.preferredAirlineField3)
                .sendKeys(name);
    }

    public void clickSearchBtn() {
        basePageObject
                .getWaitUtils()
                .waitForElementClickable(landingPageElements.searchBtn)
                .click();
    }

}
