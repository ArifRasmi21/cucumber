
Feature: As a vaild user when  I enter my cred, I should be able to login 
 
@Firefox
  Scenario: As an edtior I should be able to login to the app
    Given I have firefox brower running 
    When once I get to the website
    And i enter valid username
    And i enter valid password 
    When i click on the login button
    Then i should see a logout link
     @Chrome
     Scenario: As an edtior I should be able to login to the app
    Given I have chrome brower running 
    When once I get to the website
    And i enter valid username
    And i enter valid password 
    When i click on the login button
    Then i should see a logout link
