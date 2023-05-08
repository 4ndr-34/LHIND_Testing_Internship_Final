package pages;

import elements.FlightPassengerInfoPageElements;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseInformation;
import utilities.BasePageObject;

import java.util.Random;

public class FlightPassengerInfoPage {

    BasePageObject basePageObject = new BasePageObject(BaseInformation.getBaseInformation());
    FlightPassengerInfoPageElements flightPassengerInfoPageElements = new FlightPassengerInfoPageElements();

    public FlightPassengerInfoPage() {
        PageFactory.initElements(BaseInformation.getDriver(), this);
    }

    public void setAdult1Credentials(String firstName, String lastName,
                                     String email, String confEmail, String phone,
                                     String date, String month, String year) {
        setAdult1FirstName(firstName);
        setAdult1LastName(lastName);
        setAdult1Email(email);
        setAdult1ConfEmail(email);
        setAdult1PhoneNumber(phone);
        clickAdult1Male();
        selectAdult1BirthDate(date);
        selectAdult1BirthMonth(month);
        selectAdult1BirthYear(year);
    }

    public void setAdult2Credentials(String firstName, String lastName,
                                     String date, String month, String year) {
        setAdult2FirstName(firstName);
        setAdult2LastName(lastName);
        selectAdult2BirthDate(date);
        selectAdult2BirthMonth(month);
        selectAdult2BirthYear(year);
    }

    public void clickOnAdult2Accordion() {
                    basePageObject
                            .getWaitUtils()
                            .waitForElementClickable(flightPassengerInfoPageElements.accordionNonActiveTitle)
                            .click();
    }

    public void clickOnSeatSelectionBtn() {
        basePageObject
                .getWaitUtils()
                .waitForElementClickable(flightPassengerInfoPageElements.seatSelectionBtn)
                .click();
    }


    public void selectSeats(String seat1, String seat2) {
        //clicks seat selection button to trigger the popup
        clickOnSeatSelectionBtn();
        //selects first passenger's seat
        //select the first passenger seat
        for (int i = 0; i < flightPassengerInfoPageElements.windowSideSeats.size(); i++) {
            //first, tries to select 22A
            if(seat1.equals(flightPassengerInfoPageElements.windowSideSeats.get(i).getAttribute("data-code"))){
                basePageObject
                        .getWebElementUtils()
                        .javaScriptClick(flightPassengerInfoPageElements.windowSideSeats.get(i));
                break;
            }
            //if 22A not available, then selects another random window seat for passenger A
            else {
                Random random = new Random();
                int randomSeat = random.ints(0, flightPassengerInfoPageElements.windowSideSeats.size() - 1)
                        .findFirst()
                        .getAsInt();

                basePageObject
                        .getWebElementUtils()
                        .javaScriptClick(flightPassengerInfoPageElements.windowSideSeats
                                .get(randomSeat));
            }
        }
        //move to the second passenger selection
        basePageObject
                .getWaitUtils()
                .waitForElementClickable(flightPassengerInfoPageElements.otherPassengerSelectionTrigger)
                .click();
        //selects second passenger's seat
        //select the second passenger seat
        for (int i = 0; i < flightPassengerInfoPageElements.nextToWindowSideSeats.size(); i++) {
            //tries to select seat 22B (next to 22A)
            if(seat2.equals(flightPassengerInfoPageElements.nextToWindowSideSeats.get(i).getAttribute("data-code"))){
                basePageObject
                        .getWebElementUtils()
                        .javaScriptClick(flightPassengerInfoPageElements.nextToWindowSideSeats.get(i));
                break;
            }
            //if 22B not available, then selects another random window seat for passenger two
            else {
                Random random = new Random();
                int randomSeat = random.ints(0, flightPassengerInfoPageElements.windowSideSeats.size() - 1)
                        .findFirst()
                        .getAsInt();

                basePageObject
                        .getWebElementUtils()
                        .javaScriptClick(flightPassengerInfoPageElements.windowSideSeats
                                .get(randomSeat));
            }
        }
        //clicks save seats button
        basePageObject
                .getWaitUtils()
                .waitForElementClickable(flightPassengerInfoPageElements.saveSeatsBtn)
                .click();
    }

    public void clickCashPayment() {
        if(!flightPassengerInfoPageElements.cashPaymentRadio.isSelected()) {
            basePageObject
                    .getWaitUtils()
                    .waitForElementClickableWithCustomTime(5000, flightPassengerInfoPageElements.cashPaymentRadio)
                    .click();
        }
    }

    public void clickAgreeTermsAndConditions() {
        //jepte timeoutException me waitForElementClickable()
        flightPassengerInfoPageElements.termsAndConditionsChckBx.click();
    }
    public void sendKeysToCVVField(String code){
        basePageObject
                .getWaitUtils()
                .waitForElementVisibleWithCustomTime(5000, flightPassengerInfoPageElements.CVVField)
                .sendKeys(code);
    }

    public void clickConfirmBookingBtn() {
        basePageObject
                .getWaitUtils()
                .waitForElementClickable(flightPassengerInfoPageElements.confirmBookingBtn)
                .click();
    }


    public void setAdult1FirstName(String firstName) {
        basePageObject
                .getWaitUtils()
                .waitForElementVisible(flightPassengerInfoPageElements.adultFirstNameField1)
                .sendKeys(firstName);
    }

    public void setAdult2FirstName(String firstName) {
        basePageObject
                .getWaitUtils()
                .waitForElementVisibleWithCustomTime(5000, flightPassengerInfoPageElements.adultFirstNameField2)
                .sendKeys(firstName);
    }


    public void setAdult1LastName(String lastName) {
        basePageObject
                .getWaitUtils()
                .waitForElementVisibleWithCustomTime(5000, flightPassengerInfoPageElements.adultLastNameField1)
                .sendKeys(lastName);
    }

   public void setAdult2LastName(String lastName) {
        basePageObject
                .getWaitUtils()
                .waitForElementVisible(flightPassengerInfoPageElements.adultLastNameField2)
                .sendKeys(lastName);
    }

    public void setAdult1Email(String email) {
        basePageObject
                .getWaitUtils()
                .waitForElementVisible(flightPassengerInfoPageElements.adultEmailField1)
                .sendKeys(email);
    }

    public void setAdult1ConfEmail(String confEmail) {
        basePageObject
                .getWaitUtils()
                .waitForElementVisible(flightPassengerInfoPageElements.adultConfrmEmailField1)
                .sendKeys(confEmail);
    }

    public void setAdult1PhoneNumber(String phoneNumber) {
        basePageObject
                .getWaitUtils()
                .waitForElementVisible(flightPassengerInfoPageElements.adultPhoneField1)
                .sendKeys(phoneNumber);
    }

    public void clickAdult1Female() {
        basePageObject
                .getWaitUtils()
                .waitForElementClickable(flightPassengerInfoPageElements.adultFemaleChckBx1)
                .click();
    }

    public void clickAdult1Male() {
        basePageObject
                .getWaitUtils()
                .waitForElementClickable(flightPassengerInfoPageElements.adultMaleChckBx1)
                .click();
    }

   public void clickAdult2Male() {
        basePageObject
                .getWaitUtils()
                .waitForElementClickable(flightPassengerInfoPageElements.adultMaleChckBx2)
                .click();
    }

    public void selectAdult1BirthDate(String date) {
        basePageObject
                .getWebElementUtils()
                .selectFromDropDownElementByVisibleText(flightPassengerInfoPageElements.adultBirthDate1, date);
    }

   public void selectAdult2BirthDate(String date) {
        basePageObject
                .getWebElementUtils()
                .selectFromDropDownElementByVisibleText(flightPassengerInfoPageElements.adultBirthDate2, date);
    }

    public void selectAdult1BirthMonth(String month) {
        basePageObject
                .getWebElementUtils()
                .selectFromDropDownElementByVisibleText(flightPassengerInfoPageElements.adultBirthMonth1, month);
    }

   public void selectAdult2BirthMonth(String month) {
        basePageObject
                .getWebElementUtils()
                .selectFromDropDownElementByVisibleText(flightPassengerInfoPageElements.adultBirthMonth2, month);
    }

    public void selectAdult1BirthYear(String year) {
        basePageObject
                .getWebElementUtils()
                .selectFromDropDownElementByVisibleText(flightPassengerInfoPageElements.adultBirthYear1, year);
    }

 public void selectAdult2BirthYear(String year) {
        basePageObject
                .getWebElementUtils()
                .selectFromDropDownElementByVisibleText(flightPassengerInfoPageElements.adultBirthYear2, year);
    }






}
