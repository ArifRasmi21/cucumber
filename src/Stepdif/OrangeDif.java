package Stepdif;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class OrangeDif {
WebDriver driver;	
	@Before
	@Given("^I will used Firefox Browers$")
	public void i_will_used_Firefox_Browers()  {
		System.setProperty("webdriver.gecko.driver", "/Users/arifrasmi/Desktop/Work/geckodriver");
	    driver = new FirefoxDriver();  
	}

	@When("^then will go to orange website$")
	public void then_will_go_to_orange_website()  {
		driver.get("http://opensource.demo.orangehrmlive.com");
	}
	@When("^I will use valid username and password$")
	public void i_will_use_valid_username_and_password(DataTable data) {
	    List<List<String>>dataT= data.raw(); 
	    driver.findElement(By.name("txtUsername")).sendKeys(dataT.get(0).get(0));
	    driver.findElement(By.name("txtPassword")).sendKeys(dataT.get(0).get(1));
	    
	  
	}


	@Then("^I will login into$")
	public void i_will_login_into() {
		driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
	}

	@Then("^The login validation$")
	public void the_login_validation() {
	   driver.findElement(By.xpath("//a[@class='panelTrigger']")).isDisplayed();
	}
	@Given("^I will use Chrome Browers$")
	public void i_will_use_Chrome_Browers()  {
		System.setProperty("webdriver.chrome.driver", "/Users/arifrasmi/Desktop/Work/chromedriver");
     driver = new ChromeDriver();

	}
	@When("^I get login in i will click on Req$")
	public void i_get_login_in_i_will_click_on_Req()  {
	  driver.findElement(By.xpath("//*[@id='menu_recruitment_viewRecruitmentModule']")).click();
	}

	@When("^click add$")
	public void click_add()  {
	  driver.findElement(By.id("btnAdd")).click();
	}

	@When("^Add First Name and Last Name and email$")
	public void add_First_Name_and_Last_Name_and_email(DataTable data3)  {
	  List<List<String>> DataW= data3.raw();
	  
	  driver.findElement(By.xpath("//*[@id='addCandidate_firstName']")).sendKeys(DataW.get(0).get(0));
	 driver.findElement(By.xpath("//*[@id='addCandidate_lastName']")).sendKeys(DataW.get(0).get(1));
	 driver.findElement(By.xpath("//*[@id='addCandidate_email']")).sendKeys(DataW.get(0).get(2));
	}

	@When("^Click save$")
	public void click_save() {
	  driver.findElement(By.xpath("//*[@id='btnSave']")).click();
	}
//	@When("^I will use valid \"([^\"]*)\" and vaild  \"([^\"]*)\"$")
//	public void i_will_use_valid_and_vaild(String user1, String pass2) throws Throwable {
//		driver.findElement(By.name("txtUsername")).sendKeys(user1);
//	    driver.findElement(By.name("txtPassword")).sendKeys(pass2);
	    
//	}
	@When("^I will use valid \"([^\"]*)\" >and vaild  \"([^\"]*)\"$")
	public void i_will_use_valid_and_vaild(String user1, String pass2)  {
		driver.findElement(By.name("txtUsername")).sendKeys(user1);
	    driver.findElement(By.name("txtPassword")).sendKeys(pass2);
	   
	}
	@Before 
	public void runBrowser() {
		System.setProperty("webdriver.gecko.driver", "/Users/arifrasmi/Desktop/Work/geckodriver");
	    driver = new FirefoxDriver(); 
	}
	
@Before("@First")
public void getWeb() {
	driver.get("http://opensource.demo.orangehrmlive.com");
}
@After("@First")
public void quitbro(){
	driver.quit();
}
	@After
	public void closeBrowser() {
		driver.quit();
	}
}