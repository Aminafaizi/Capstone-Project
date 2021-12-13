package stepDefinitions;

import org.junit.Assert;

import pageObjectPackage.DesktopsPageObject;
import core.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.UtilityClasses;

public class DesktopsStepDefinition extends Base{
DesktopsPageObject desktops = new DesktopsPageObject();
	
	
	@When("user click on Desktops tab$")
	public void user_click_on_desktops_tab() {
	  desktops.DesktopsClick();
	  logger.info("user click on desktop tab");
	  UtilityClasses.takeScreenShot();
	}
	@When("user click on Show all desktops$")
	public void user_click_on_show_all_desktops() {
	  desktops.ShowAllDesktops();
	  UtilityClasses.takeScreenShot();
	}
	@Then("user should see all items are present in Desktop page$")
	public void user_should_see_all_items_are_present_in_desktop_page() {
	    desktops.AllItems();
	    UtilityClasses.takeScreenShot();
	}
	@Then("user add HP LP 3065 from Desktops tab to the cart$")
	public void user_add_HP_LP_3065_from_Desktops_tab_to_the_cart() {
		desktops.add();
		UtilityClasses.takeScreenShot();
	}
	@When("user click  ADD TO CART option on HP LP3065 item")
	public void user_click_add_to_cart_option_on_hp_lp3065_item() {
	    desktops.AddToCart();
	    UtilityClasses.takeScreenShot();
	}
	@When("user select quantity \\({int})")
	public void user_select_quantity(Integer int1) {
	    desktops.quantity(int1);
	    UtilityClasses.takeScreenShot();
	}
	@When("user click add to Cart button")
	public void user_click_add_to_cart_button() {
	   desktops.add();
	   UtilityClasses.takeScreenShot();
	}
	@Then("user should see a message Success: you have added HP LP {int} to your Shopping cart!")
	public void user_should_see_a_message_success_you_have_added_hp_lp_to_your_shopping_cart(Integer int1) {
	  Assert.assertTrue(desktops.Success());
	  UtilityClasses.takeScreenShot();
	}
	
	@When("user click on Canon EOS 5D item")
	public void user_click_on_canon_eos_5d_item() {
		desktops.imgclick();
	}
	   
	@And("user click  ADD TO CART option on Canon EOS 5D item")
	public void user_click_AddToCart_Option_Canon_EOS() {
	desktops.AddCanon();
	}
	@And("user select color from droppdown Red")
		public void user_select_color_Red() {
		desktops.selectRed();
	}
	
	
	@Then("user should see a message Success: You have added Canon EOS 5D to your shopping cart!")
	public void user_see_Success() {
		Assert.assertTrue(desktops.Success());
		  UtilityClasses.takeScreenShot();
	}
	@And ("user click on write a review link")
	public void user_write_review() {
		desktops.Review();
	}
	@When("user fill the review information with below information {string} {string} {string}")
	public void user_fill_info(String yourname, String yourReview, String Rating) throws InterruptedException {
	desktops.yourname();
	desktops.yourReview();
	desktops.yourRating();
	Thread.sleep(5000);
	}
	@And ("user click on Continue Button")
	public void user_click_Continue_Button() {
		desktops.continueB();
	}
	
	@Then("user should see a message with Thank you for your review. It has been submitted to the webmaster for approval")
	public void user_should_see_a_message_with_thank_you_for_your_review_it_has_been_submitted_to_the_webmaster_for_approval() {
		Assert.assertTrue(desktops.Success());
		  UtilityClasses.takeScreenShot();
	}
}
	
	
	
	

