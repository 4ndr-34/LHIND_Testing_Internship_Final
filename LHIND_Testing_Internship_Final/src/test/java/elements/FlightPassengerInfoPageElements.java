package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseInformation;

import java.util.List;

public class FlightPassengerInfoPageElements {

    public FlightPassengerInfoPageElements() {
        PageFactory.initElements(BaseInformation.getDriver(), this);
    }

    @FindBy(css = "#addCarTravelTypeDiv>button")
    public WebElement addCarBtn;

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

    @FindBy(css = "div[name='paxDetails']>div[class=' title']>h4")
    public WebElement accordionNonActiveTitle;

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

    @FindBy(css = "div[data-tab='flight-tab-0'] li[data-paxnumber='1']")
    public WebElement otherPassengerSelectionTrigger;

    //usuall there's two flight tabs in seat selection, so I had to choose the first flight and then the window seats
    @FindBy(css = "div[data-tab='flight-tab-0'] span[class*='available'][data-code*='A']")
    public List<WebElement> windowSideSeats;

    //chose the seat next to the one from the first passenger
    @FindBy(css = "div[data-tab='flight-tab-0'] span[class*='available'][data-code*='B']")
    public List<WebElement> nextToWindowSideSeats;

    @FindBy(css = "div[data-tab='flight-tab-0'] button[class*='save-seats']")
    public WebElement saveSeatsBtn;

    @FindBy(css = "#B2CallMeRadioButton")
    public WebElement cashPaymentRadio;

    @FindBy(css = "#CUSTOM_FIELD_834-0")
    public WebElement CVVField;

    @FindBy(css = "#cbRules")
    public WebElement termsAndConditionsChckBx;

    @FindBy(css = "#btnCreateBooking")
    public WebElement confirmBookingBtn;
}
