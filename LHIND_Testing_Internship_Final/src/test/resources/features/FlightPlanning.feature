Feature: Planning a trip in different scenarios
  Scenario: One Way Trip
    Given user is on landing page
    When user picks one way flight option
    And user picks route from "Barcelona (" to "Munich (MUC)"
    When user picks 2 adults for travelers
    And user picks date "22-05-2023"
    And user clicks search button
    When user picks "Light Economy" on the prices
    And user picks seat "22A" or "window seat" if not available
    When user picks "Cash" payment
    Then confirms "booking reference number" and "Please, write down or remember this number" is displayed

  Scenario: Round Trip
    Given user is on landing page
    When user picks return flight option and "Non-stop flights" under advanced options
    And user picks route from "Frankfurt (FRA) to "Budapest (BUD)"
    When user picks 2 adults and 1 infant for travelers
    And user picks date "22-05-2023" for departure and "13-06-2023" for return
    When user picks "Any business" on the prices
    And user fills all the details for travelers
    When user adds car rental for the dates and location
    And user picks "Credit Card" and then clicks "Add a Car"
    When confirms "booking reference number" and "Please, write down or remember this number" is displayed
    Then user verifies all the travelers names are displayed as expected

  Scenario: Multi leg Trip
    Given user is on landing page
    When user picks multileg flight option and "Non-stop flights" under advanced options
    And user picks route from "Tirana (TIA)" to "Vienna (VIE)" and then "Bangkok (BKK)" and then "Vienna (VIE)"
    When user picks "Austrian Airlines" under preferred airline in advanced options
    And user picks 3 adults and 2 children for travelers
    When user fills all the details for travelers with children two to eleven years old
    And user picks "Credit Card" and then clicks "Add a hotel"
    When user picks accommodation and max price is 3500 a night and a max total of 25000 on the list
    When confirms "booking reference number" and "Please, write down or remember this number" is displayed
    Then user verifies all the travelers names are displayed as expected


