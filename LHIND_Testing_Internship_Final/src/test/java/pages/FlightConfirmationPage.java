package pages;

import elements.FlightConfirmationPageElements;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseInformation;
import utilities.BasePageObject;

public class FlightConfirmationPage {

    BasePageObject basePageObject = new BasePageObject(BaseInformation.getBaseInformation());
    FlightConfirmationPageElements flightConfirmationPageElements = new FlightConfirmationPageElements();

    public FlightConfirmationPage() {
        PageFactory.initElements(BaseInformation.getDriver(), this);
    }

    public boolean verifyMessagesAreDisplayed() {
        String expectedTexts = "booking reference number\n" +
                flightConfirmationPageElements.bookingReferenceNumber.getText() +
                "\n" +
                "Please, write down or remember this number";
        return expectedTexts.equals(flightConfirmationPageElements.textConfirmationHeader.getText());
    }

    public String printMessagesDisplayed() {
        return flightConfirmationPageElements.textConfirmationHeader.getText();
    }

    public String printBookingNumber() {
        return flightConfirmationPageElements.bookingReferenceNumber.getText();
    }
}
