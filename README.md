###### **Cucumber project**

# **Java**

Install OpenJDK 16


**Run the Project:**

The tests can be executed on the feature file at these levels:
       
        Feature
        Scenario level
        Based on tags in the CucumberTestRunner file




**Framework:**
selenium-cucumber is a behavior driven development (BDD) approach to write automation test script to test Web. It enables you to write and execute automated acceptance/unit tests. It is cross-platform, open source and free
The framework is build on POM modal with the following kep components:
        
        Features
        Step definition
        CucumberTestRunner
        PageObjects
        Hooks(Driver Setup)



**Drivers:** 
The framework currenlty supports:
        
        Chrome driver
        Firefox




**Logs:** 
Logback logs can be viewed in the terminal
Logging levels:
        
        Info
        Debug
        Warn



**Test Execution Reports:**
The "cucumber-reports.html" reports generated can be accessed under the target directory

Same test report:
        
        Execution summary
        failed	1 scenarios
        passed	1 scenarios
        Duration	  1m 14.1s
        Implementation	cucumber-jvm - 6.9.1
        Runtime	OpenJDK 64-Bit Server VM - 16.0.2+7-67
        OS	Windows 10
        CPU	amd64
        Some text or @tags

You can use either plain text for the search or  cucumber tag expressions  to filter the output.

Filter by scenario status:
        failed
        passed
        
        @Amazon
        Feature: There are some sample tests for Subscribe and Save feature on Amazon portal.
        
        Background:
        Given I open the browser
        When I enter url "http://www.amazon.com" in the browser
        Then The amazon home page is displayed
        
        @CheckBanner
        Scenario: Verify that the Subscribe and Save banner is displayed on the page and the banner displays the correct messaging
        And I enter text "Subscribe and Save" in the input box and click Enter
        Then the "Amazon Subscribe & Save" banner is displayed
        
        
        @CheckDiscounts
        Scenario Outline: Verify that the Subscribe and Save messaging is displayed when Eligible products are selected
        And I enter "<Products>" in the input box and click Enter on home page
        And I select the product "<Products>" from the listing
        Then the "5%" and "15%" discounts are displayed on product detail page
        And I "Set Up Now" button is displayed on Selected product page
        


**_FYI: The credentials mentioned in Feature file are NOT valid.
Please enter test email and password to execute the tests._**
        
        
        @CheckForDiscounts
        And I Login using Email "testamazon01@test.com" and click Continue
        And I Login using Password "Test!ng123!" and click SignIn