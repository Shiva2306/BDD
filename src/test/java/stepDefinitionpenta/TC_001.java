package stepDefinitionpenta;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagespenta.Reg1;

public class TC_001 {
	public static WebDriver driver;
	Reg1 r;
	
	@Given("User has opened the browser and launched the application for registration")
	public void user_has_opened_the_browser_and_launched_the_application_for_registration() {
	    
		 
		 driver = new ChromeDriver();
		 Hooks.driver = driver;

		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
		driver.manage().window().maximize();
		
		 r = new Reg1(driver);
	}

	@When("User enters valid First name")
	public void user_enters_valid_first_name() {
	   r.firstname();
	}

	@And("User enters valid Last name")
	public void user_enters_valid_last_name() {
	   r.lastname();
	}

	@When("User enters valid Email ID for Registration")
	public void user_enters_valid_email_id_for_registration() {
	    r.Email();
	}

	@When("User enters valid Telephone")
	public void user_enters_valid_telephone() {
	   r.Telephone();
	}

	@When("User enters valid Password for Registration")
	public void user_enters_valid_password_for_registration() {
	    r.Password();
	}

	@When("User enters valid Confirm Password")
	public void user_enters_valid_confirm_password() {
       r.ConfirmPassword();	   
	}

	@When("User clicks on radion button no")
	public void user_clicks_on_radion_button_no() {
	    r.radiobutton();
	}

	@When("User clicks on privacy policy checkbox")
	public void user_clicks_on_privacy_policy_checkbox() {
	   r.checkbox();
	}

	@When("User clicks on continue button")
	public void user_clicks_on_continue_button() {
	   r.continuebutton();
	}

	@Then("User should be Registered")
	public void user_should_be_registered() {
	    
		Assert.assertEquals(driver.getTitle(), "Your Account Has Been Created!");
	}




}
