Feature: Testing few functionality of Homepage of BBC

  As a user I would like to test few functionality of navigating different pages

  Scenario: As a user I would like to navigate to different pages
    Given User is on homepage
    When User to accept cookie
    And user to click on sign in
    And user to enter email address on email address field "kuldip.patel0394@gmail.com"
    And user to enter password on password field "Skyline-89"
    Then user to click on sign in button

  Scenario: As a user I would navigate  to sport page
    Given User is on homepage
    And user to navigate to any of the categories from main menu
    And User to navigate to different page from selected page
    And User to click on article with comment function
    Then User to verify comment is enabled or not
