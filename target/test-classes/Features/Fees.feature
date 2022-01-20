Feature: Validate end to end testing on Admin. Manage fees

  Scenario Outline: Validate Fees tab
    When username and password field are display
    And enter "<username>" and "<password>"
    And click on Login button
    Then homepage should display
    Then verify Fees Tab

    Examples: 
      | username  | password |
      | chimerasa | Test2021 |

  Scenario: Go to Admin Manage Fees
    When mouse over to Fees
    And mouse over to Administration
    Then Select Manage Fees

  Scenario: verify search text box
    Given user is on Manage Fees page
    When Search text box display
    Then click on first school

  Scenario: select first school
    When user click on first school
    And click on Edit Action button
    Then choose fee type window displayed
    And select Assigned Fees
    And click start button

  Scenario: verify Required Information
    Given user is on Required Information page
    When user edit fee name, fee description and fee code
    And validate select district, select school, expire at end checkbox, start date and end date
    And validate fee category and fee type
    Then click on next button

  Scenario: verify Amount & Installation
    #Given user is on Amount & Installation page
    #When user validate fixed field
    #And validate Tiered field
    #And validate Variable filed
    #Then click on next button
    And go to Home Page
