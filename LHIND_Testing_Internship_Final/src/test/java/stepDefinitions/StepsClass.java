package stepDefinitions;

import elements.LandingPageElements;
import elements.FlightSearchPageElements;
import elements.FlightPassengerInfoPageElements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.LandingPage;
import pages.FlightConfirmationPage;
import pages.FlightPassengerInfoPage;
import pages.FlightSearchPage;
import utilities.ConfigurationReader;

public class StepsClass {

    LandingPage landingPage = new LandingPage();
    LandingPageElements landingPageElements = new LandingPageElements();
    FlightSearchPageElements flightSearchPageElements = new FlightSearchPageElements();
    FlightSearchPage flightSearchPage =  new FlightSearchPage();
    FlightPassengerInfoPage flightPassengerInfoPage = new FlightPassengerInfoPage();
    FlightPassengerInfoPageElements flightPassengerInfoPageElements = new FlightPassengerInfoPageElements();
    FlightConfirmationPage flightConfirmationPage = new FlightConfirmationPage();

    @Given("user is on landing page")
    public void userIsOnLandingPage() {
        System.out.println("--STARTING TEST--");
        System.out.println("Going to Landing Page.");
        Hooks.driver.get(ConfigurationReader.getProperty("baseurl"));
    }

    @When("user picks one way flight option")
    public void userPicksOneWayFlightOption() {
        System.out.println("Selecting One-Way flight option.");
        landingPage.clickOneWay();
    }

    @And("user picks route from {string} to {string}")
    public void userPicksRouteFromTo(String arg0, String arg1) {
        System.out.println("Selecting Departure and Destination airport.");
        landingPage.setDepartureAirport(arg0);
        landingPage.setDestinationAirport(arg1);
    }

    @And("user picks date")
    public void userPicksDate() {
        System.out.println("Picking departure date");
        landingPage.setDepartureDate();
    }

    @When("user picks {int} adults for travelers")
    public void userPicksAdultsForTravelers(int arg0) {
        System.out.println("Selecting number of adults");
        landingPage.setNumberOfAdults(arg0);
    }

    @When("user picks {string} cabin preference")
    public void userPicksCabinPreference(String arg0) {
        System.out.println("Selecting cabin preference");
        landingPage.setCabinPreference(arg0);
    }

    @And("user clicks search button")
    public void userClicksSearchButton() {
        System.out.println("Clicking Search Button");
        landingPage.clickSearchBtn();
    }

    @When("user picks {string} on the prices when on {string}")
    public void userPicksOnThePrices(String arg0, String arg1) {
        System.out.println("Selecting cheapest Flight option");
        flightSearchPage.clickOnFlightLink(arg1);
        flightSearchPage.clickOnCheapestFlightOption();
    }

    @And("user sends all necessary credentials")
    public void userSendsAllNecessaryCredentials() {
        System.out.println("Adding credentials of adult 1");
        flightPassengerInfoPage.setAdult1Credentials(
                ConfigurationReader.getProperty("adult1FirstName"),
                ConfigurationReader.getProperty("adult1LastName"),
                ConfigurationReader.getProperty("adult1Email"),
                ConfigurationReader.getProperty("adult1Email"),
                ConfigurationReader.getProperty("adult1Phone"),
                ConfigurationReader.getProperty("adult1BirthDate"),
                ConfigurationReader.getProperty("adult1BirthMonth"),
                ConfigurationReader.getProperty("adult1BirthYear"));

        flightPassengerInfoPage.clickOnAdult2Accordion();

        System.out.println("Adding credentials of adult 2");
        flightPassengerInfoPage.setAdult2Credentials(
                ConfigurationReader.getProperty("adult2FirstName"),
                ConfigurationReader.getProperty("adult2LastName"),
                ConfigurationReader.getProperty("adult2BirthDate"),
                ConfigurationReader.getProperty("adult2BirthMonth"),
                ConfigurationReader.getProperty("adult2BirthYear"));
    }

    @And("user picks seat {string} or {string} if not available")
    public void userPicksSeatOrIfNotAvailable(String arg0, String arg1) {
        System.out.println("Selecting passenger seats");
        //oneWayFlightPassengerInfoPage.selectSeats(arg0, arg1);
    }

    @When("user picks Cash payment")
    public void userPicksCashPayment() {
        System.out.println("Selecting Cash Payment");
        flightPassengerInfoPage.clickCashPayment();
        flightPassengerInfoPage.sendKeysToCVVField(ConfigurationReader.getProperty("CVVcard"));
        flightPassengerInfoPage.clickAgreeTermsAndConditions();
        System.out.println("Confirming Booking");
        flightPassengerInfoPage.clickConfirmBookingBtn();
    }

    @Then("confirms {string} and {string} is displayed")
    public void confirmsAndIsDisplayed(String arg0, String arg1) {
        System.out.println("Verifying messages are displayed.");
        //System.out.println(oneWayFlightConfirmationPage.printMessagesDisplayed());
        Assert.assertTrue(flightConfirmationPage.verifyMessagesAreDisplayed());
        System.out.println("The one way flight booking reference number is: " +
                flightConfirmationPage.printBookingNumber());
    }

    @When("user picks return flight option and {string} under advanced options")
    public void userPicksReturnFlightOptionAndUnderAdvancedOptions(String arg0) {
        landingPage.clickRoundTrip();
        landingPage.clickAdvancedOptions();
        landingPage.selectFlightType(arg0);
    }

    @When("user picks {int} adults and {int} infant for travelers")
    public void userPicksAdultsAndInfantForTravelers(int arg0, int arg1) {
        System.out.println("Selecting adults and infants for passengers");
        landingPage.setNumberOfAdults(arg0);
        landingPage.setNumberOfInfants(arg1);
    }

    @And("user picks date for departure and for return")
    public void userPicksDateForDepartureAndForReturn() {
        landingPage.setDepartureDate();
        landingPage.setReturnDate();
    }

    @And("user fills all the details for travelers")
    public void userFillsAllTheDetailsForTravelers() {
    }

    @When("user adds car rental for the dates and location")
    public void userAddsCarRentalForTheDatesAndLocation() {
    }

    @And("user picks {string} and then clicks {string}")
    public void userPicksAndThenClicks(String arg0, String arg1) {
    }

    @Then("user verifies all the travelers names are displayed as expected")
    public void userVerifiesAllTheTravelersNamesAreDisplayedAsExpected() {
    }

    @When("user picks multi-leg flight option and {string} under advanced options")
    public void userPicksMultilegFlightOptionAndUnderAdvancedOptions(String arg0) {
        landingPage.clickMultiDestinations();
    }

    @And("user picks route from {string} to {string} and then {string} and then {string}")
    public void userPicksRouteFromToAndThenAndThen(String arg0, String arg1, String arg2, String arg3) {
    }

    @When("user picks {string} under preferred airline in advanced options")
    public void userPicksUnderPreferredAirlineInAdvancedOptions(String arg0) {
    }

    @And("user picks {int} adults and {int} children for travelers")
    public void userPicksAdultsAndChildrenForTravelers(int arg0, int arg1) {
    }

    @When("user fills all the details for travelers with children two to eleven years old")
    public void userFillsAllTheDetailsForTravelersWithChildrenTwoToElevenYearsOld() {
    }

    @When("user picks accommodation and max price is {int} a night and a max total of {int} on the list")
    public void userPicksAccommodationAndMaxPriceIsANightAndAMaxTotalOfOnTheList(int arg0, int arg1) {
    }



}
