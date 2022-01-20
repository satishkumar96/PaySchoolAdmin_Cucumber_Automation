Feature: Validate End to End testing on Home Page

  Scenario Outline: Validate Patron tab
    #When username and password field are display
    #And enter "<username>" and "<password>"
    #And click on Login button
    Then homepage should display
    And mouse over to Patron

    Examples: 
      | username  | password |
      | chimerasa | Test2021 |

  Scenario: Select Search Patron
    Given select Search Patron
    When Search Box visible
    Then enter Patron Name or ID
    And click search button

  Scenario: Select first patron
    Given After user is on view patron page
    When first patron display
    Then click on first patron

  Scenario: Quick Lunch Restriction
    When Select Quick Lunch Restriction button
    Then Validate each fields

  Scenario: Validate Report Tab
    Given check Report tab is visible and clickable
    Then click on Report Tab

  Scenario: Go to Patron Account Activity
    Given mouse over to Patron Tab
    And mouse over to Account Reports
    Then Select Patron Account Activity

  Scenario: Generate Report
    Given user is on report page
    When click on patron tab
    And enter patronID, Last name and first name
    And click on search button
    Then click on Add All button
    And go to Home Page
    And perform logout
