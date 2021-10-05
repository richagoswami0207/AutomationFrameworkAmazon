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



  @CheckForDiscounts
  Scenario: As an Amazon registered member when I add Eligible product to the cart I am able to place order successfully
    And I enter text "Subscribe and Save items only" in the input box and click Enter
    And I add one product from the list
    Then I click " Subscribe & Save: " radio button product details page
    And I click "Set Up Now" button on product details page
    And I Login using Email "testamazon01@test.com" and click Continue
    And I Login using Password "Test!ng123" and click SignIn
    Then the Subscribe and Save checkbox is checked and Order Total is displayed




  @CheckForDiscountsForSpecificProduct
  Scenario Outline: Verify that the Subscribe and Save messaging is displayed with a specific product
    And I enter text "<ProductName>" in the input box and click Enter
    And I add one product from the list
  #  Then the discounts are displayed for Eligible products on product detail page

    Examples:
      |ProductName               |
      | Life Breakfast Cereal    |

