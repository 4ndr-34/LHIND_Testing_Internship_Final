package elements.oneWay;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseInformation;

import java.util.List;

public class OneWayFlightPassengerInfoPageElements {

    public OneWayFlightPassengerInfoPageElements() {
        PageFactory.initElements(BaseInformation.getDriver(), this);
    }

    @FindBy(css = "#fname_0")
    public WebElement adultFirstNameField1;

    @FindBy(css = "#lname_0")
    public WebElement adultLastNameField1;

    @FindBy(css = "#email_0")
    public WebElement adultEmailField1;

    @FindBy(css = "#email_c_0")
    public WebElement adultConfrmEmailField1;

    @FindBy(css = "#phone_0")
    public WebElement adultPhoneField1;

    @FindBy(css = "#gender_f_0")
    public WebElement adultFemaleChckBx1;

    @FindBy(css = "#gender_m_0")
    public WebElement adultMaleChckBx1;

    @FindBy(css = "#bdate_d_0")
    public WebElement adultBirthDate1;

    @FindBy(css = "#bdate_m_0")
    public WebElement adultBirthMonth1;

    @FindBy(css = "#bdate_y_0")
    public WebElement adultBirthYear1;

    @FindBy(css = "div[class='title']")
    public List<WebElement> accordionNonActiveTitles;

    @FindBy(css = "#fname_1")
    public WebElement adultFirstNameField2;

    @FindBy(css = "#lname_1")
    public WebElement adultLastNameField2;

    @FindBy(css = "#gender_f_1")
    public WebElement adultFemaleChckBx2;

    @FindBy(css = "#gender_m_1")
    public WebElement adultMaleChckBx2;

    @FindBy(css = "#bdate_d_1")
    public WebElement adultBirthDate2;

    @FindBy(css = "#bdate_m_1")
    public WebElement adultBirthMonth2;

    @FindBy(css = "#bdate_y_1")
    public WebElement adultBirthYear2;

    @FindBy(css = "#seatSelectionBtn")
    public WebElement seatSelectionBtn;

    @FindBy(css = "li[class='pax-item']")
    public WebElement otherPassengerSelectionTrigger;

    @FindBy(css = "span[data-code='22A']")
    public List<WebElement> firstAdultSeat;

    @FindBy(css = "span[data-code='22B']")
    public List<WebElement> secondAdultSeat;

    @FindBy(css = "button.save-seats")
    public List<WebElement> saveSeatsBtn;

    @FindBy(css = "#B2CallMeRadioButton")
    public WebElement cashPaymentRadio;

    @FindBy(css = "#CUSTOM_FIELD_834-0")
    public WebElement CVVField;

    @FindBy(css = "#cbRules")
    public WebElement termsAndConditionsChckBx;

    @FindBy(css = "#btnCreateBooking")
    public WebElement confirmBookingBtn;



}
