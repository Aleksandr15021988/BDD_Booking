Feature: LondonHotelsFeature

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
        And I choose first hotel and click 'Select Your Room' button