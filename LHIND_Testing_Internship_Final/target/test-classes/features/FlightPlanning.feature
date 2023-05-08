Feature: Planning a trip in different scenarios
  Scenario: One Way Trip
    #Landing Page
    Given user is on landing page
    When user picks one way flight option
    And user picks route from "NYC" to "TPA"
    When user picks date
    And user picks 2 adults for travelers
    When user picks "Economy" cabin preference
    And user clicks search button

    When user picks "Light Economy" on the prices when on "one way"
    And user sends all necessary credentials
    ####Only step not done yet####
    And user picks seat "22A" or "window seat" if not available
    ####
    When user picks Cash payment
    Then confirms "booking reference number" and "Please, write down or remember this number" is displayed

  Scenario: Round Trip
    #Landing Page
    Given user is on landing page
    When user picks return flight option and "Non-stop flights" under advanced options
    #Step also found in Scenario 1
    And user picks route from "NYC" to "TPA"
    When user picks 2 adults and 1 infant for travelers
    And user picks date for departure and for return
    When user picks "Premium" cabin preference
    And user clicks search button

    When user picks "Premium" on the prices when on "round trip"
    And user fills all the details for travelers
    When user adds car rental for the dates and location
    And user picks "Credit Card" and then clicks "Add a Car"
    When confirms "booking reference number" and "Please, write down or remember this number" is displayed
    Then user verifies all the travelers names are displayed as expected

  Scenario: Multi leg Trip
    #Landing Page
    Given user is on landing page
    When user picks multi-leg flight option and "Non-stop flights" under advanced options
    And user picks route from "Tirana (TIA)" to "Vienna (VIE)" and then "Bangkok (BKK)" and then "Vienna (VIE)"
    When user picks "Austrian Airlines" under preferred airline in advanced options
    And user picks 3 adults and 2 children for travelers
    And user clicks search button

    When user fills all the details for travelers with children two to eleven years old
    And user picks "Credit Card" and then clicks "Add a hotel"
    When user picks accommodation and max price is 3500 a night and a max total of 25000 on the list
    When confirms "booking reference number" and "Please, write down or remember this number" is displayed
    Then user verifies all the travelers names are displayed as expected


