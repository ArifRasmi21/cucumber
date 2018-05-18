
Feature: As a vaild user when  I enter my cred, I should be able to login 
 
@Firefox
  Scenario Outline: As an edtior I should be able to login to the app
    Given I will used Firefox Browers 
    When  then will go to orange website 
    And I will use valid "<username>" >and vaild  "<password>"
    Examples:
    |username|password|
    |rr   |ww|
    |sss|ttt|
    |admin55|admin55|
 