Feature: Validate End to End testing on Home Page

  Scenario Outline: Validate Home Page
    Then homepage should display

    Examples: 
      | username  | password |
      | chimerasa | Test2021 |

  Scenario: Verify Home Tab visibility
    Given homepage should display
    Then validate Home Tab should visible

  Scenario: Verify Patrons Tab visibility
    Given homepage should display
    Then validate Patrons Tab should visible

  Scenario: Verify Reports Tab visibility
    Given homepage should display
    Then validate Reports Tab should visible

  Scenario: Verify Nurse Tracking Tab visibility
    Given homepage should display
    Then validate Nurse Tracking Tab should visible

  Scenario: Verify Quick Apps Tab visibility
    Given homepage should display
    Then validate Quick Apps Tab should visible

  Scenario: Verify Forms Tab visibility
    Given homepage should display
    Then validate Forms Tab should visible

  Scenario: Verify School Programs Tab visibility
    Given homepage should display
    Then validate School Programs Tab should visible

  Scenario: Select Search Patron
    Given mouse over to Patron
    And select Search Patron
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
