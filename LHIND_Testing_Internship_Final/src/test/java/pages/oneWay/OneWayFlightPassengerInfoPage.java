package pages.oneWay;

import elements.oneWay.OneWayFlightPassengerInfoPageElements;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseInformation;
import utilities.BasePageObject;
import utilities.ConfigurationReader;

public class OneWayFlightPassengerInfoPage {

    BasePageObject basePageObject = new BasePageObject(BaseInformation.getBaseInformation());
    OneWayFlightPassengerInfoPageElements oneWayFlightPassengerInfoPageElements = new OneWayFlightPassengerInfoPageElements();

    public OneWayFlightPassengerInfoPage() {
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
        if(oneWayFlightPassengerInfoPageElements.accordionNonActiveTitles.size() > 0) {
            for (WebElement element : oneWayFlightPassengerInfoPageElements.accordionNonActiveTitles) {
                if (element.getText().equals(oneWayFlightPassengerInfoPageElements.headerText)) {
                    basePageObject
                            .getWaitUtils()
                            .waitForElementClickable(element)
                            .click();
                }
            }
        }
    }

    public void setAdult1FirstName(String firstName) {
        basePageObject
                .getWaitUtils()
                .waitForElementVisible(oneWayFlightPassengerInfoPageElements.adultFirstNameField1)
                .sendKeys(firstName);
    }

    public void setAdult2FirstName(String firstName) {
        basePageObject
                .getWaitUtils()
                .waitForElementVisible(oneWayFlightPassengerInfoPageElements.adultFirstNameField2)
                .sendKeys(firstName);
    }


    public void setAdult1LastName(String lastName) {
        basePageObject
                .getWaitUtils()
                .waitForElementVisible(oneWayFlightPassengerInfoPageElements.adultLastNameField1)
                .sendKeys(lastName);
    }

   public void setAdult2LastName(String lastName) {
        basePageObject
                .getWaitUtils()
                .waitForElementVisible(oneWayFlightPassengerInfoPageElements.adultLastNameField2)
                .sendKeys(lastName);
    }

    public void setAdult1Email(String email) {
        basePageObject
                .getWaitUtils()
                .waitForElementVisible(oneWayFlightPassengerInfoPageElements.adultEmailField1)
                .sendKeys(email);
    }

    public void setAdult1ConfEmail(String confEmail) {
        basePageObject
                .getWaitUtils()
                .waitForElementVisible(oneWayFlightPassengerInfoPageElements.adultConfrmEmailField1)
                .sendKeys(confEmail);
    }

    public void setAdult1PhoneNumber(String phoneNumber) {
        basePageObject
                .getWaitUtils()
                .waitForElementVisible(oneWayFlightPassengerInfoPageElements.adultPhoneField1)
                .sendKeys(phoneNumber);
    }

    public void clickAdult1Female() {
        basePageObject
                .getWaitUtils()
                .waitForElementClickable(oneWayFlightPassengerInfoPageElements.adultFemaleChckBx1)
                .click();
    }

    public void clickAdult1Male() {
        basePageObject
                .getWaitUtils()
                .waitForElementClickable(oneWayFlightPassengerInfoPageElements.adultMaleChckBx1)
                .click();
    }

   public void clickAdult2Male() {
        basePageObject
                .getWaitUtils()
                .waitForElementClickable(oneWayFlightPassengerInfoPageElements.adultMaleChckBx2)
                .click();
    }

    public void selectAdult1BirthDate(String date) {
        basePageObject
                .getWebElementUtils()
                .selectFromDropDownElementByVisibleText(oneWayFlightPassengerInfoPageElements.adultBirthDate1, date);
    }

   public void selectAdult2BirthDate(String date) {
        basePageObject
                .getWebElementUtils()
                .selectFromDropDownElementByVisibleText(oneWayFlightPassengerInfoPageElements.adultBirthDate2, date);
    }

    public void selectAdult1BirthMonth(String month) {
        basePageObject
                .getWebElementUtils()
                .selectFromDropDownElementByVisibleText(oneWayFlightPassengerInfoPageElements.adultBirthMonth1, month);
    }

   public void selectAdult2BirthMonth(String month) {
        basePageObject
                .getWebElementUtils()
                .selectFromDropDownElementByVisibleText(oneWayFlightPassengerInfoPageElements.adultBirthMonth2, month);
    }

    public void selectAdult1BirthYear(String year) {
        basePageObject
                .getWebElementUtils()
                .selectFromDropDownElementByVisibleText(oneWayFlightPassengerInfoPageElements.adultBirthYear1, year);
    }

 public void selectAdult2BirthYear(String year) {
        basePageObject
                .getWebElementUtils()
                .selectFromDropDownElementByVisibleText(oneWayFlightPassengerInfoPageElements.adultBirthYear2, year);
    }






}
