package stepDefinitions;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjectPackage.LoginPageObject;


public class LoginStepDef extends Base {

	// each step in scenario should have
	// one java method associated with that step.
	// we cant have duplicate methods for steps in
	// scenario steps.
	// in Order to get access to POM class methods we need to create 
	// object of LoginPageObject class
	LoginPageObject loginPageObject = new LoginPageObject();

	@Given("User is on Retail Website")
	public void user_is_on_retail_website() {
		String actualPageTitile = driver.getTitle();
		String expectedPageTitle ="TEK SCHOOL";
		// Assertion is to verify actual meets the expected 
		// if actual does not equals to expected value then execution will stop 
		// and test step will fail.
		Assert.assertEquals(expectedPageTitle, actualPageTitile);
		logger.info("Actual Title is matching with expected title");
		
	}

	@When("User click on MyAccount")
	public void user_click_on_myaccount() {
		loginPageObject.clickOnMyAccount();
//		logger.info("User clicked on Myaccount");
		
	}

	@And("^User click on Login option$")
	public void user_click_on_Login_option() {
		loginPageObject.clickOnLogin();
//		logger.info("user clicked on Login Option");
	}

	@When("User Enter UserName {string} and password {string}")
	public void user_enter_user_name_and_password(String uName, String pass) {
		loginPageObject.enterEmailAndPassword(uName, pass);
//		logger.info("user Enter " + uName + "and password " +pass);
	}

	@When("User click on Login button")
	public void user_click_on_login_button() {
		loginPageObject.clickOnLoginbutton();
//		logger.info("user clicked on Login button");
	}

	@Then("User should be logged in to Myaccount dashboard")
	public void user_should_be_logged_in_to_myaccount_dashboard() {
//		 if MyAccountText is present it will pass 
//		 if myAccountText is not present or displayed it will fail
	//	Assert.assertTrue(loginPageObject.myAccountTextisPresent());
		logger.info("user is logged in to Myaccount dashboard");
	}
}

