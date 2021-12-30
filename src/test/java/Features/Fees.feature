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
