Feature: validate Login Page
  I want to validate end to end testing on Login Page

  Scenario: Title of Login Page
    When Login Page Display
    Then fetch login page title

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
