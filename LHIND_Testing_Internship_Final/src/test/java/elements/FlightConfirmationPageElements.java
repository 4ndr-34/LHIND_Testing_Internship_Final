package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseInformation;

public class FlightConfirmationPageElements {

    public FlightConfirmationPageElements() {
        PageFactory.initElements(BaseInformation.getDriver(), this);
    }

    @FindBy(css = ".ref_num_btn>h2")
    public WebElement textConfirmationHeader;

    @FindBy(css = ".ref_num_btn>h2>span")
    public WebElement bookingReferenceNumber;


}
