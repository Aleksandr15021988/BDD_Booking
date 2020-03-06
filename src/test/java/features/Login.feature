Feature: LoginFeature

  Scenario: Verify that user can login in on the Booking portal with correct user and password
    
    Given I open 'Login page' on Booking portal
    When I feel 'Default User' as a login in 'User Name' field on Login Page
         And I click button 'Continue' on Login Page
         And I feel 'Default Password' as a password in 'Password' field on Password Page
         And I click button 'Sign in' on Password Page
    Then I verify that  login in with correct user and password is successfully and 'Profile picture' is displayed
