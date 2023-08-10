Feature: Testing login scenario for saucelabs application.
  Scenario Outline: Test user is performing login successfully.
    Given opening browser window in chrome browser.
    When user should provide credentials <username> and <password> for login page
    Then user should clikable login button successfully.
    And closing the broswer.

    Examples: 
      | username  | password |
      | standard_user | secret_sauce |
      | standard_user | secret_sauce |