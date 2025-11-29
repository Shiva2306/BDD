package stepDefinitionpenta;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagespenta.Log1;

public class TC_002 {
	public static WebDriver driver;
	Log1 l;
	@Given("User launches the browser and opens the login page")
	public void user_launches_the_browser_and_opens_the_login_page() {
	  
		 driver = new ChromeDriver();
		 Hooks.driver = driver;

			driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
			driver.manage().window().maximize();
			
			 l = new Log1(driver);
	}

	@When("User enters a valid Email ID")
	public void user_enters_a_valid_email_id() {
	   
		l.enterEmail();
	}

	@And("User enters a valid Password")
	public void user_enters_a_valid_password() {
	  l.enterPassword(null);
	}

	@And("User clicks on the Login button")
	public void user_clicks_on_the_login_button() {
	    l.clickLoginBtn();
	}

	@Then("User should be logged in successfully")
	public void user_should_be_logged_in_successfully() {
	    
		l.isLoginSuccessful();

	}

}
