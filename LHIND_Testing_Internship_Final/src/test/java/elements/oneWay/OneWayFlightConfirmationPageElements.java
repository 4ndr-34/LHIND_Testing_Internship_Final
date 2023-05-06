package elements.oneWay;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseInformation;

public class OneWayFlightConfirmationPageElements {

    public OneWayFlightConfirmationPageElements() {
        PageFactory.initElements(BaseInformation.getDriver(), this);
    }

    @FindBy(css = ".ref_num_btn>h2")
    public WebElement textConfirmationHeader;

    String expectedTexts = "\n" +
            "        booking reference number\n" +
            "        " + "\n" +
            "\n" +
            "        Please, write down or remember this number\n" +
            "\n" +
            "    ";

    @FindBy(css = ".ref_num_btn>h2>span")
    public WebElement bookingReferenceNumber;


}
