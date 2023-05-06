package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import utilities.BaseInformation;

import java.util.List;

public class LandingPageElements {

    public LandingPageElements() {
        PageFactory.initElements(new AjaxElementLocatorFactory(BaseInformation.getDriver(), 10), this);
    }

    @FindBy(css = "#RoundTrip")
    public WebElement roundTripBtn;

    @FindBy(css = "#OneWay")
    public WebElement oneWayBtn;

    @FindBy(css = "#MultiDestination")
    public WebElement multiDestinationBtn;

    @FindBy(css = "#departure_city")
    public WebElement departureCityField;

    @FindBy(css = "#destination_city")
    public WebElement destinationCityField;

    @FindBy(css = "#departure_date")
    public WebElement departureDateField;

    @FindBy(css = "td[data-month='4']>a")
    public List<WebElement> availableMayDepartureDates;

    @FindBy(css = "a[data-handler='next']")
    public WebElement nextMonthBtn;

    @FindBy(css = "#return_date")
    public WebElement returnDateField;

    @FindBy(css = "td[data-month='5']>a")
    public List<WebElement> availableJuneReturnDates;

    @FindBy(css = "#adult-counter")
    public WebElement adultsDropdown;

    @FindBy(css = "#child-counter")
    public WebElement childDropdown;

    @FindBy(css = "#infant-counter")
    public WebElement infantDropdown;

    @FindBy(css = "#pref_class")
    public WebElement cabinPreference;

    @FindBy(css = ".accordion")
    public WebElement advancedOptions;

    @FindBy(css = "#non_stop_flights")
    public WebElement flightTypesDropdown;

    @FindBy(css = "#pref_airline")
    public WebElement preferredAirlineField1;

    @FindBy(css = "#pref_airline-two")
    public WebElement preferredAirlineField2;

    @FindBy(css = "#pref_airline-three")
    public WebElement preferredAirlineField3;

    @FindBy(css = "#submitBTN")
    public WebElement searchBtn;
}
