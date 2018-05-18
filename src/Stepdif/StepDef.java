package Stepdif;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef {
	  WebDriver driver;
	  Actions getaction;
	  
		  
@Given("^I have firefox brower running$")
public void i_have_firefox_brower_running()  {
	System.setProperty("webdriver.gecko.driver","/Users/arifrasmi/Desktop/Work/geckodriver");
  driver = new FirefoxDriver();
}

@When("^once I get to the website$")
public void once_I_get_to_the_website()  {
	driver.get("http://opensource.demo.orangehrmlive.com");

   
}

@When("^i enter valid username$")
public void i_enter_valid_username()  {

	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	
}

@When("^i enter valid password$")
public void i_enter_valid_password() throws Throwable {

	driver.findElement(By.id("txtPassword")).sendKeys("admin");

}

@When("^i click on the login button$")
public void i_click_on_the_login_button()  {
	
	driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
}

@Then("^i should see a logout link$")
public void i_should_see_a_logout_link() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}
@Given("^I have chrome brower running$")
public void i_have_chrome_brower_running()  {
	System.setProperty("webdriver.chrome.driver", "/Users/arifrasmi/Desktop/Work/chromedriver");
 driver = new ChromeDriver();
}

@When("^once I get to the website facebook$")
public void once_I_get_to_the_website_facebook() throws Throwable {
	driver.get("http://facebook.com");
}

@When("^i enter valid username for facebook$")
public void i_enter_valid_username_for_facebook() throws Throwable {
   driver.findElement(By.name("email")).sendKeys("arif.rasmi@gmail.com");
}

@When("^i enter valid password for facebook$")
public void i_enter_valid_password_for_facebook() throws Throwable {
	 driver.findElement(By.name("pass")).sendKeys("rasmi26");
}

@When("^i click on the login button for facebook$")
public void i_click_on_the_login_button_for_facebook() throws Throwable {
  driver.findElement(By.xpath("//input[@type='submit']")).click();

}
@Then("^i want to log off facebook$")
public void i_want_to_log_off_facebook()  {
driver.switchTo().alert().accept();
	getaction = new Actions(driver);
getaction.moveToElement(driver.findElement(By.id("userNavigationLabel"))).click().build().perform();
 // getaction.moveToElement(driver.findElement(By.xpath("//div[@id='userNavigationLabel']"))).build().perform();
// getaction.moveToElement(driver.findElement(By.xpath("//li[@data-gt='{\"ref\":\"async_menu\",\"logout_menu_click\":\"menu_logout\"}']"))).click().build().perform();
}
}