#Author: Loyce Polavarapu
Feature: Calculate KiwiSaver projected balance
  I want that the KiwiSaver Retirement Calculator users are able to calculate what their KiwiSaver projected balance would be at retirement
  So that 
  The users are able to plan their investments better

  @major
  Scenario: kiwiSaver Balance for Self employed users
    Given user has navigated to KiwiSaver calculator page
    And current age of the user is 45 years
    And Employment status of the user is Self-employed
    And current KiwiSaver balance is $100000
    And voluntary contributes $90 fortnightly
    And chooses a Conservative risk profile
    And saving goals requirement of $290000  
    When user clicks on view Kiwisaver Retirement Projections 
    Then user can see projected Kiwisaver balance details
