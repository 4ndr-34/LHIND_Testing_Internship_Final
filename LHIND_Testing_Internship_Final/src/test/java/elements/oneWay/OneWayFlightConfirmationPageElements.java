package elements.oneWay;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseInformation;

public class OneWayFlightConfirmationPageElements {

    public OneWayFlightConfirmationPageElements() {
        PageFactory.initElements(BaseInformation.getDriver(), this);
    }

    @FindBy(css = "div.ref_num_btn")
    public WebElement bookingReferenceTab;


}
