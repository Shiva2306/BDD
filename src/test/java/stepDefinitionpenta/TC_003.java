package stepDefinitionpenta;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagespenta.Log1;
import pagespenta.Search1;

public class TC_003 {

	WebDriver driver;
	Log1 lo;
	Search1 se;

@Given("User launches browser and the application")
public void user_launches_browser_and_the_application() {
    
	 driver = new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.manage().window().maximize();
		
		 lo = new Log1(driver);
		  se= new Search1(driver);
}

@When("User enters valid Email ID")
public void user_enters_valid_email_id() {
	   lo.enterEmail();
}

@When("User enters valid Password")
public void user_enters_valid_password() {
    
	lo.enterPassword(null);
}

@When("User clicks on Login")
public void user_clicks_on_login() {
    lo.clickLoginBtn();
}

@When("User enters a product name in the search box")
public void user_enters_a_product_name_in_the_search_box() {
	 se.search();
}

@When("User clicks on the Search button")
public void user_clicks_on_the_search_button() {
    se.clicksearch();
	
}

@Then("User should see the relevant searched product")
public void user_should_see_the_relevant_searched_product() {
    se.validatetext();
}



}
