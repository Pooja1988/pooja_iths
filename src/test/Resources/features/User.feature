Feature: Just a cucumber lab
  Scenario: I want to enter with user and correct password
    When enter right user name and password

  Scenario: I want to enter with user and wrong password
    When enter right user name and wrong password

  Scenario: I want to create user Multiple user
    When enter right user name and wrong password
    Then create multiple user

  Scenario: I want to update email address
    Then create user with updated email