Feature: Ups Login Feature
  This feature will test UPS login functionality

  Background: 
    Given UPS login page launched

  @Sanity @Sprint1 
  Scenario: Verify customer login using wrong username and wrong password
    When Customer input wrong Username "TalenTech" and wrong Password "Pass"
    And Customer clicks on LogIn button
    Then Customer should receive an error message

  @Regression @Sprint1 
  Scenario Outline: Verify customer login using corect username and correct password
    When Customer input correct Username "<Username>" and correct Password "<Password>"
    And Customer clicks on LogIn button
    Then Customer should be able to login

    Examples: 
      | Username  | Password   |
      | Talentech | Pass       |
      | xyz       | p@ss123    |

