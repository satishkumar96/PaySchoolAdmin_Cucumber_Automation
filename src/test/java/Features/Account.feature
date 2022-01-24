Feature: Validate end to end testing on Account Tab

  Scenario Outline: Validate Fees tab
    When username and password field are display
    And enter "<username>" and "<password>"
    And click on Login button
    Then homepage should display
    Then verify Fees Tab

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

  Scenario: Go to Account Page and insert
    Given Account Tab display
    When Click on Account Tab
    #And check and click on Add Patron account
    #And Validate Account page fields
    #Then click on insert button
    #And click on Refresh button
    
    Scenario: Edit Account
    Given Account Tab display
    And click on Refresh button
    When click on edit button
    And validate edit fields
    Then click on Save button
    And click on Refresh button
    And go to Home Page