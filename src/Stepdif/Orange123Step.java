package Stepdif;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class Orange123Step {
WebDriver driver;


@And("^i clicked on pim$")
public void i_clicked_on_pim() {
  

	driver.findElement(By.xpath("//*[@id='menu_pim_viewPimModule']")).click();
}

@Given("^click add employee$")
public void click_add_employee() {
	driver.findElement(By.xpath("//a[contains(@id,'addEmployee')]")).click();
  
}

@Given("^click Create Login Details$")
public void click_Create_Login_Details()  {
driver.findElement(By.xpath("x//input[contains(@type,'checkbox')]")).click();   
}

@Given("^add the username(\\d+) and password(\\d+) and password(\\d+)$")
public void add_the_username_and_password_and_password( DataTable data)  {
   List<List<String>> dataW = data.raw();
   driver.findElement(By.xpath("//input[contains(@name,'user_name')]")).sendKeys(dataW.get(0).get(0)); 
   driver.findElement(By.xpath("//input[contains(@id,'user_password')]")).sendKeys(dataW.get(0).get(1));; 
   driver.findElement(By.xpath("//input[contains(@name,'re_password')]")).sendKeys(dataW.get(0).get(2)); 
}

@Given("^click on the status$")
public void click_on_the_status() throws Throwable {
    Select getselect= new Select(driver.findElement(By.xpath("//select[@id='status']")));
    getselect.selectByValue("Enabled");
}

@Given("^click save$")
public void click_save()  {
  driver.findElement(By.id("btnSave")).click();
}

@Given("^add the \"([^\"]*)\" and add \"([^\"]*)\"and \"([^\"]*)\"$")
public void add_the_and_add_and(String user1, String pass2, String pass3) throws Throwable {
    driver.findElement(By.xpath("//input[contains(@name,'firstName')]")).sendKeys(user1);
    driver.findElement(By.xpath("//input[contains(@id,'lastName')]")).sendKeys(pass2);
    driver.findElement(By.xpath("//input[contains(@maxlength,'10')]")).sendKeys(pass3);
}
@Before
public void openwebiste() {
	System.setProperty("webdriver.chrome.driver", "/Users/arifrasmi/Desktop/Work/chromedriver");
	WebDriver driver = new ChromeDriver();
	driver.get("http://opensource.demo.orangehrmlive.com");
	driver.findElement(By.name("txtUsername")).sendKeys("admin");
    driver.findElement(By.name("txtPassword")).sendKeys("admin");
}


}