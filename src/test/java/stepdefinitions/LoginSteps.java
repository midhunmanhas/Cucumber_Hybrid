package stepdefinitions;

import org.junit.Assert;

import com.DriverFactory.DriverFactory;
import com.Pages.LoginPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	LoginPage loginpage  = new LoginPage(DriverFactory.getDriver()); 
	/**
	 * above getDriver is the argument -> that will be passedto webdriver driver in the login page class
	 */

	@Given("User is on the Home Page")
	public void User_is_on_the_Home_Page() {
		DriverFactory.getDriver().get("http://www.automationpractice.pl");
		loginpage.getPageTitle();
		System.out.println(loginpage.getPageTitle());
	}
	
	@Then("User navigates to the login page {string}")
	public void User_navigates_to_the_login_Page(String RealTitle) {
		loginpage.signInClick();
		String title = loginpage.getPageTitle();
		System.out.println(title);
		Assert.assertTrue(title.contains(RealTitle));
		
	}
	
	@Then("User enters the email id {string}")
	public void User_enters_the_email_id(String usernme) {
		loginpage.enterEmail(usernme);
	}
	
	@Then("User enters the password {string}")
	public void User_enters_the_password(String pswd) {
		loginpage.enterPassword(pswd);
	}
	
	@And("User click on the signin button")
	public void User_click_on_the_signin_button(){
		loginpage.clickSignInButton();
	}
	
    @When ("User gets the title of the page")
    public void User_gets_the_title_of_the_page() {
    	loginpage.getPageTitle();
		System.out.println(loginpage.getPageTitle());
    }
	
    @Then ("User verifies the Page title")
    public void User_verifies_the_Page_title() {
    	System.out.println("test");
    }
}
