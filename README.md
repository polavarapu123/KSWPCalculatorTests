# KSWPCalculator
##Westpac KiwiSaver Scheme Retirement Calculator


    Test User Story 1: 
Priority: Major
As a Product Owner 
I want that while using the KiwiSaver Retirement Calculator all fields in the calculator have got the information icon present
So that 
The user is able to get a clear understanding of what needs to be entered in the field .

Acceptance Criteria
Scenario 1 
Given User Clicks information icon besides Current age the message “This calculator has an age limit of 64 years old as you need to be under the age of 65 to join KiwiSaver.” is displayed below the current age field.

 
    Test User Story 2:
Priority: Major
As a Product Owner 
I want that the KiwiSaver Retirement Calculator users are able to calculate what their KiwiSaver projected balance would be at retirement
So that 
The users are able to plan their investments better.

Acceptance Criteria

•User whose Current age is 30 is Employed @ a Salary 82000 p/a, contributes to KiwiSaver @ 4% and chooses a Defensive risk profile can calculate his projected balances at retirement.

•User whose current aged 45 is Self-employed, current KiwiSaver balance is $100000, voluntary contributes $90 fortnightly and chooses Conservative risk profile with saving goals requirement of $290000 can calculate his projected balances at retirement.

•User whose current aged 55 is not employed, current KiwiSaver balance is $140000, voluntary contributes $10 annually and chooses Balanced risk profile with saving goals requirement of $200000 is able to calculate his projected balances at retirement.

Repository URL: https://github.com/polavarapu123/Cucumber-Test

## Automated the 4 test scenarios listed above using Cucumber Junit BDD framework and using Page Object model.
*Page Object:
KiwiSaverCalculatorPage.java has got all the Web Elements and corresponding methods from the Kiwisaver-calculator page
Feature Files are created in the features package,for the 4 test scenarios listed below
Step Definitions are created in the Steps Package,for the corresponding feature files
TestRunner is created to glue Features with Step Defintions.
* CucumberOptions:
Contains the test runner class and function to execute all tests

Version Control: Git Repository using Git bash 2.28.0
Programming language: Java 1.8 with Selenium Webdriver	 3.141.59
IDE: Eclipse NEON
Maven: A build tool to build a maven project with the help of dependencies which are mentioned in pom.xml (jars).
IDE: Eclipse NEON

Selenium WebDriver
------------
This project is configured to use Chrome WebDriver.  Chromedriver.exe is added in the Drivers folder.  The WebDriver's added to this project to run in windows  
Page Object Model
-----
Page object model is used in this framework.  Each web page will have its own java.class and within each class contains page element mappings and functions / methods used to interact /verify a specific web page under test.  

#Pre-requisites

    Installed Java and Maven

Run Scripts

    Fork this repository and run the below listed Maven command from command line

     mvn clean test

OR Run testrunner.java as jUnit Test

view HTML Reports in the Project/HTMLReports/index.html