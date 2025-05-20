#Author: john@example.com
#Date: 13th December, 2021
#Description: This feature is to check the status of the order
#Keywords: order
Feature: feature to check the status of the order for the user
 
  Scenario: fetching the state of the order for the user
    Given the user has paid for the order through internet banking
    When the user enters the email and password in the form
    And the user clicks the login button
    Then the user will be navigated to the home page