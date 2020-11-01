#Author: Loyce Polavarapu

Feature: Information Icons present for all fields in the KiwiSaver Retirement Calculator 
 As a Product Owner
 I want that while using the KiwiSaver Retirement Calculator all fields in the calculator have got the information icon present
So that the user is able to get a clear understanding of what needs to be entered in the field .
 file

  @major
  Scenario: validate that clicking Information icon for the Current Age field displayes expected message 
    Given user is on the Kiwisaver Retirement Calculator 
    When user clicks on Information icon besides Current Age field
    Then expected help message is displayed
    When user clicks on Information icon besides Employment status
	    Then expeceted employment status help text is displayed
	    When user clicks on Information icon besides Current KiwiSavebalance field
	    Then expecetd kiwisaver balance help text is dispalyed
	    When user clicks on Information icon besides voluntary contributions 
	    Then expected volunatry contribution help text is displayed
	    When user clicks on Information icon besides RiskProfile field
	    Then expected riskProfile help information is displayed
	    When user clicks on Information icon besides savings goal at retirement field
	    Then expected savings goal at retirement help text is displayed

