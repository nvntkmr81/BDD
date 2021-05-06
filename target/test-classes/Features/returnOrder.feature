#Author: Navneet Kumar
#Date: 06-May-2021
@OrderTest
Feature: Feature to test order return
  @SuccessTest
  Scenario Outline: Check order return is successful when product_Id is valid
    Given user is on orders page
    When user enters valid <productId> and clicks on get product details
    And user clicks on return order
    Then user is navigated to return order page and a token is generated.

    Examples:
    |productId|
    |1257945872|