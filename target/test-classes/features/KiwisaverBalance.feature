#Author: Loyce Polavarapu

Feature: Calculate KiwiSaver projected balance 
As a Product Owner,I want that the KiwiSaver Retirement Calculator self employed users are able to calculate what their KiwiSaver projected balance would be at retirement
So that the users are able to plan their investments better

   

  @major
  Scenario: Employed users Projected Balance at age 30 
    Given user is on the Kiwisaver Retirement Calculator page
    And current age of the user is 30 years
    And Employment status of the user is Employed
    And user types salary of 82000 
    And selects 4 percentage Kiwisaver memeber contribution
    And chooses a Defensive risk profile 
    When user clicks on view your Kiwisaver Retirement Projections 
    Then user can see estimated Kiwisaver balance details

  
