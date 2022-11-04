@SEAMLES-2482
Feature: Log out functionality

  Background:
    Given User is on the dashboard page

    @SEAMLES-2480
  Scenario: User can log out and end up in login page
    Given User clicks on profile button
    When User user clicks on logout button
    Then User should end up in login page


@SEAMLES-2481
    Scenario: User can not go to home page again by clicking step back button after successfully logged out
      Given  User clicks on profile button
      When User user clicks on logout button
      And User should end up in login page
      And User clicks on the step back button
      Then User should be still on the login page

