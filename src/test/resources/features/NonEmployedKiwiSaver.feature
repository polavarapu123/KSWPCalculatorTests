#Author: Loyce Polavarapu
Feature: Calculate KiwiSaver projected balance
  I want that the KiwiSaver Retirement Calculator users are able to calculate what their KiwiSaver projected balance would be at retirement
  So that 
  The users are able to plan their investments better

  @major
  Scenario: kiwiSaver Balance for Non employed users
    Given user has navigated to WP KiwiSaver calculator page
    And current age of user is 55 years
    And Employment status of user is Non-employed
    And Non-employed current KiwiSaver balance is $140000
    And Non-employedvoluntary contributes $10 Annually
    And Non-employed chooses a balanced risk profile
    And Non-employed saving goals requirement of $200000   
    When Non-employed user clicks on view Kiwisaver Retirement Projections 
    Then Non-employed user can see projected Kiwisaver balance details