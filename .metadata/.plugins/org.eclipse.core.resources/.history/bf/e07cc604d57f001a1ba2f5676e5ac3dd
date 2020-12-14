package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Loginstepdefinition {
WebDriver driver;
	
	@Given("^I have open the browser$")
	public void i_have_open_the_browser() throws Throwable {
		System.setProperty("webdriver.chrome.driver","F:\\Selenium Jar Files and Driver\\chromedriver.exe");  
	    driver=new ChromeDriver(); 
	}

	@When("^I open Facebook website$")
	public void i_open_Facebook_website() throws Throwable {
		driver.navigate().to("http://www.javatpoint.com/");
	}

	@Then("^Login button should exits$")
	public void login_button_should_exits() throws Throwable {
		driver.manage().window().maximize();  
	     driver.quit(); 
	}


	
}






