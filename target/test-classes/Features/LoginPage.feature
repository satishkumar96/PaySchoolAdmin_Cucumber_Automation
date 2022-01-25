Feature: validate Login Page
  I want to validate end to end testing on Login Page

  Scenario: Title of Login Page
    When Login Page Display
    Then fetch login page title

  Scenario: Verify Password Reset button is visible
    When Login Page Display
    Then password reset button should be visible

  Scenario: Verify Password Reset button is clickable
    When Login Page Display
    Then password reset button should be clickable
    And click on Back to SignIn Page

  Scenario: Verify Privacy Policy is visible
    When Login Page Display
    Then Privacy Policy should be visible

  Scenario: Verify Terms and Condition is visible
    When Login Page Display
    Then Terms and Condition should be visible

  Scenario: Validate bar menu
    When Login Page Display
    Then click on bar menu icon
    And click on each Tab
    And click on Back to SignIn Page

  Scenario Outline: do positive login
    When username and password field are display
    And enter "<username>" and "<password>"
    And click on Login button
    Then homepage should display
    And perform logout

    Examples: 
      | username  | password |
      | chimerasa | Test2021 |

  Scenario Outline: do Negative Login
    When username and password field are display
    And enter "<username>" and "<password>"
    And click on Login button
    Then error message should display

    Examples: 
      | username  | password |
      | chimerasa | Test202  |
