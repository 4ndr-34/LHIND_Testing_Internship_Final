package stepDefinitions;

import elements.LandingPageElements;
import elements.oneWay.OneWayFlightSearchPageElements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LandingPage;
import pages.oneWay.OneWayFlightSearchPage;
import utilities.ConfigurationReader;

public class StepsClass {

    LandingPage landingPage = new LandingPage();
    LandingPageElements landingPageElements = new LandingPageElements();
    OneWayFlightSearchPageElements oneWayFlightSearchPageElements = new OneWayFlightSearchPageElements();
    OneWayFlightSearchPage oneWayFlightSearchPage =  new OneWayFlightSearchPage();

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

    @When("user picks {string} on the prices")
    public void userPicksOnThePrices(String arg0) {
        System.out.println("Selecting cheapest Flight option");
        oneWayFlightSearchPage.clickOnFirstFlight();
        System.out.println(oneWayFlightSearchPageElements.BookNowBtns.size());
        oneWayFlightSearchPage.clickOnCheapestFlightOption();
    }

    @And("user picks seat {string} or {string} if not available")
    public void userPicksSeatOrIfNotAvailable(String arg0, String arg1) {
    }

    @When("user picks {string} payment")
    public void userPicksPayment(String arg0) {
    }

    @Then("confirms {string} and {string} is displayed")
    public void confirmsAndIsDisplayed(String arg0, String arg1) {
    }

    @When("user picks return flight option and {string} under advanced options")
    public void userPicksReturnFlightOptionAndUnderAdvancedOptions(String arg0) {
        landingPage.clickRoundTrip();
    }

    @And("user picks route from {string}Budapest \\(BUD)\"")
    public void userPicksRouteFromBudapestBUD(String arg0) throws Throwable {    // Write code here that turns the phrase above into concrete actions    throw new cucumber.api.PendingException();}
    }

    @When("user picks {int} adults and {int} infant for travelers")
    public void userPicksAdultsAndInfantForTravelers(int arg0, int arg1) {
    }

    @And("user picks date {string} for departure and {string} for return")
    public void userPicksDateForDepartureAndForReturn(String arg0, String arg1) {
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

    @When("user picks multileg flight option and {string} under advanced options")
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
