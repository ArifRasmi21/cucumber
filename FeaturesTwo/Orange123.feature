Feature: Orange Webiste 
@SprintOne 
  Scenario Outline: OrangeWeb
    And click add employee
    And click Create Login Details
    And add the username1 and password1 and password2 
    |arif21|Rasmi69|Rasmi69|
    And click on the status
    And click save
    And add the "<first>" and add "<last >"and "<email>"
   Examples:
    |first|last|email|
   | Arif|Rasmi|www.ee@gmail.com|
    