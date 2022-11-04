@SEAMLES-2471
Feature: Login Functionality

  Background:
    Given user is on the login page

  @SEAMLES-2445
  Scenario: User should be able to login with valid credentials
    Given user enter correct username "Employee61"
    When user enters valid password "Employee123"
    And user click the Log in button
    Then user should see the dashboard page

  @SEAMLES-2446
  Scenario Outline: User cannot login with invalid credentials
    Given user enters invalid username "<username>"
    When user enters invalid password "<password>"
    And user click the Log in button
    And user see "<errorOrAlertMessage>" message
    Then user should not login with invalid credentials

    Examples:
      | username    | password     | errorOrAlertMessage         |
      | employee61  | Employee123  | Wrong username or password. |
      | Employee61  | employee123  | Wrong username or password. |
      | Employee 61 | Employee123  | Wrong username or password. |
      | Employee61  | Employee 123 | Wrong username or password. |
      | Employee61  |              | Please fill out this field  |
      |             | Employee123  | Please fill out this field  |
      | 61Employee  | Employee123  | Wrong username or password. |
      | Employee61  | 123Employee  | Wrong username or password. |

  @SEAMLES-2447
  Scenario: User can see the password in a form of dots by default(when empty and filled )
    Given User goes to Seamlessly login page
    When User enters password as "Employee123"
    Then Verify that the default visibility of the password input box is dot


  @SEAMLES-2448
  Scenario: User can see the password explicitly if needed
    Given User goes to Seamlessly login page
    When User enters password as "Employee123"
    And User clicks the eye button
    Then Verify that user can see password explicitly


  @SEAMLES-2449
  Scenario: User can see the "Forgot password?" link on the login page and
  can see the "Reset Password" button on the next page after clicking on forget password link
    Given User goes to Seamlessly login page
    When User clicks on the "Forgot Password?" link
    Then User can see "Reset Password" button on the next page


  @SEAMLES-2450
  Scenario: User can see valid placeholders on Username and Password fields
    Given User goes to Seamlessly login page
    Then Verify that user can see valid placeholders on the related input boxes