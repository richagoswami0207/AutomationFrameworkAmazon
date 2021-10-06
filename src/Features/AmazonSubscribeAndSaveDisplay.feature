@Amazon
Feature: There are some sample tests for Subscribe and Save feature on Amazon portal.

  Background:
    Given I open the browser
    When I enter url "http://www.amazon.com" in the browser
    Then The amazon home page is displayed



  @CheckSubscribeAndSaveBanner
  Scenario: Verify that the Subscribe and Save banner is displayed on the page and the banner displays the correct messaging
    And I enter text "Subscribe and Save" in the input box and click Enter
    Then the "Amazon Subscribe & Save" banner is displayed



  @CheckForDiscountsForAnEligibleProduct
  Scenario: As an Amazon registered member when I add Eligible product from the Subscriber & Save product listing I should able to see the "Subscriber and Save" checkbox checked and Order total so I can check out
    And I enter text "Subscribe and Save items only" in the input box and click Enter
    And I add one product from the list
    Then I click " Subscribe & Save: " radio button product details page
    And I click "Set Up Now" button on product details page
    And I Login using Email "testamazon01@test.com" and click Continue
    And I Login using Password "Test!ng123" and click SignIn
    Then the Subscribe and Save checkbox is checked and Order Total is displayed




  @CheckForDiscountsForSpecificProductSearchUsingProductName
  Scenario Outline: Seraching a specific eligible product and adding an item from the list should show the Order total and subscribe and save discount during checkout
    And I enter text "<ProductName>" in the input box and click Enter
    And I add nth product "4" product from the list
    Then I click " Subscribe & Save: " radio button product details page
    And I click "Set Up Now" button on product details page
    And I Login using Email "testamazon01@test.com" and click Continue
    And I Login using Password "Test!ng123" and click SignIn
    Then the Subscribe and Save checkbox is checked and Order Total is displayed


    Examples:
      |ProductName               |
      | Life Breakfast Cereal    |

