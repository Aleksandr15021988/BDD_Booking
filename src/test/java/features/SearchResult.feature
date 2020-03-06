Feature: SearchResultFeature

  @morethan3hotels
  Scenario: Verify that over the next weekend I can find more than three hotels
    Given I open 'Login page' on Booking portal
    When I feel 'Default User' as a login in 'User Name' field on Login Page
        And I click button 'Continue' on Login Page
        And I feel 'Default Password' as a password in 'Password' field on Password Page
        And I click button 'Sign in' on Password Page
        And I feel 'London' on 'Where are you going' field on Main Page
        And I click button 'Search' on Main Page
        And I choose 'Date of next weekends' in the calendar on Search Result Page
        And I click button 'Search results' on Search Result Page
    Then Verify that over the next weekend I can find more than '3' hotels

  @WhereAreYouGoing
  Scenario: Verify that filter 'Where are you going' works correct
    Given I open 'Main page' on Booking portal
         And I click on button 'Choose Language' on Main Page
         And I click button 'Choose English' on Main Page
         And I feel 'London' on 'Where are you going' field on Main Page
         And I click button 'Search' on Main Page
    Then I verify that all choosen hotels is located in 'London'


  Scenario: Verify that dropdown 'Group Adults' works correct
    Given I open 'Main page' on Booking portal
    When I click on button 'Choose Language' on Main Page
        And I click button 'Choose English' on Main Page
        And I feel 'London' on 'Where are you going' field on Main Page
        And I click button 'Search' on Main Page
        And I choose 'Date of next weekends' in the calendar on Search Result Page
        And I select '3 adults' in 'Group Adults' dropdown on Search Result Page
    Then Verify that '3 adults' should be selected in 'Group Adults' on Search Result Page

  Scenario: Verify that dropdown 'Group Adults' works correct
    Given I open 'Main page' on Booking portal
    When I click on button 'Choose Language' on Main Page
        And I click button 'Choose English' on Main Page
        And I feel 'London' on 'Where are you going' field on Main Page
        And I click button 'Search' on Main Page
        And I choose 'Date of next weekends' in the calendar on Search Result Page
        And I select '2 children' in 'Number of children' dropdown on Search Result Page
    Then Verify that '2 children' should be selected in 'Number of children' on Search Result Page

