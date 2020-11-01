# KSWPCalculatorTests
#Westpac KiwiSaver Scheme Retirement Calculator

 used Cucumber Junit BDD framework to automate the test scenarios to calculate KiwiSaver projected balance at Retirement covering different user scenarios like Employed,Self-Employed and Not employed users also created a tesct scenario to validate help text messages for all the fields on the Kiwisaver calculator page using test assertions.
 --Page Object model is used in this framework:
 --KiwiSaverCalculatorPage.java has got all the Web Elements and corresponding methods from the Kiwisaver-calculator page.
 --Feature Files are created for the 4 test scenarios in features package.
 --Step Definitions are created in steps package for the corresponding feature files.
 --TestRunner is created to glue Features with Step Defintions.
 --CucumberOptions:
Contains the test runner class and function to execute all tests.
Selenium WebDriver-This project is configured to use Chrome WebDriver in windows.chromediver.exe is added to the drivers folder.   

#Pre-requisites

    installed Java and Maven
    
Run Scripts

    Fork this repo
    Run the following maven command from command line
    mvn clean test or run TestRunner.java as a jUnit test
