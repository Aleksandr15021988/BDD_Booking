Feature: MainPageFeature

  Scenario: Verify that filter fields on Main page should be displayed and button search is enabled

    Given I open 'Login page' on Booking portal
    When I feel 'Default User' as a login in 'User Name' field on Login Page
        And I click button 'Continue' on Login Page
        And I feel 'Default Password' as a password in 'Password' field on Password Page
        And I click button 'Sign in' on Password Page
    Then Verify that button 'Search' is enabled on Main Page
        And Verify that following filter fields should be displayed on Main Page
            |Where are you going    |
            |Check in               |
            |Check out              |
            |Choose number of Guests|