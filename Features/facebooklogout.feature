Feature: As a vaild user when  I enter my cred, I should be able to login 
 
@Facebooktwo
  Scenario: login into facebook
    Given I have firefox brower running 
    When once I get to the website facebook
    And i enter valid username for facebook
    And i enter valid password for facebook
    When i click on the login button for facebook
    Then i want to log off facebook
    
   
  