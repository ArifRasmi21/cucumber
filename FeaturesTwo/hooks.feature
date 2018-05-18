
Feature: As a vaild user when  I enter my cred, I should be able to login 
 
@First
  Scenario Outline: As an edtior I should be able to login to the app
  
      And I will use valid "<username>" >and vaild  "<password>"
    Examples:
    |username|password|
    |admin|admin|