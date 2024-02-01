@author_VP @regression
Feature: Registration Functionality,


  Scenario Outline: Verify that User should enter the FirstName and LastName successfully
    When I open the URL
    And I accept cookies
    And I click on Sign Up button
    And I enter the firstName <firstname>
    Then I enter lastName <lastname>
    And I click on continue button
    Examples:
      | firstname | lastname |
      | "Vishal"  | "Patel"  |
      | "Minesh"  | "Patel"  |


