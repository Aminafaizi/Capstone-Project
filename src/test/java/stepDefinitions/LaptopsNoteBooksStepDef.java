package stepDefinitions;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjectPackage.LaptopsNoteBooksPageObject;
import utilities.UtilityClasses;

public class LaptopsNoteBooksStepDef extends Base{
	
	LaptopsNoteBooksPageObject Laptops=new LaptopsNoteBooksPageObject();	

	@When("User click on Laptop &NoteBook tab")
	public void user_click_on_laptop_note_book_tab() {
		Laptops.LaptopNotebookstabClick();
	}
	@When("User click on Show all Laptop &NoteBook option")
	public void user_click_on_show_all_laptop_note_book_option() {
		Laptops.ShowAllLaptopsNotebooksClick();
	}
	@When("User click on MacBook  item")
	public void user_click_on_mac_book_item() {
		Laptops.MacBookClick();
	}
	@When("User click add to Cart button")
	public void user_click_add_to_cart_button() {
	    Laptops.AddtoCartClick();
	}
	@Then("User should see a message ‘Success: You have added MacBook to your shopping cart!’")
	public void user_should_see_a_message_success_you_have_added_mac_book_to_your_shopping_cart() {
	    Assert.assertTrue(Laptops.successMessageClick());
	    UtilityClasses.takeScreenShot();
	}
	@Then("User should see {int} items {double} showed to the cart")
	public void user_should_see_tem_s_showed_to_the_cart(Integer int1, Double double1) {
	    //Laptops.CartItemClick();
	}
	@Then("User click on cart option")
	public void user_click_on_cart_option() {
	    Laptops.CartItemClick();
	}
	@Then("user click on red X button to remove the item from cart")
	public void user_click_on_red_x_button_to_remove_the_item_from_cart() {
	    Laptops.buttonToRemoveTteamFromCartClick();
	}
	@Then("item should be removed and cart should show ‘{int} item\\(s)’")
	public void item_should_be_removed_and_cart_should_show_item_s(Integer int1) {
	    Laptops.RemoveAndShowZeroItemClick();
	 }
	@When("User click on product comparison icon on MacBook")
	public void user_click_on_product_comparison_icon_on_mac_book() throws InterruptedException {
	    Laptops.productcomparisonMacBookClick();
	    UtilityClasses.takeScreenShot();
	    Thread.sleep(1000);
	}

	@When("User click on product comparison icon on MacBook Air")
	public void user_click_on_product_comparison_icon_on_mac_book_air() {
	   Laptops.productcomparisonMacBookAirClick();
	   UtilityClasses.takeScreenShot();
	}
	
	@Then("User should see a message ‘Success: You have added MacBook Air to your product comparison!’")
	public void user_should_see_a_message_success_you_have_added_mac_book_air_to_your_product_comparison() {
	    Laptops.SuccessmessageClick();
	    
	}

	@Then("User should see Product Comparison Chart \\/\\/")
	public void user_should_see_product_comparison_chart() {
	    Laptops.ProductComparisonlinkClick();
	    
	}
	@Then("User click on Product comparison link")
	public void user_click_on_product_comparison_link() {
	    Laptops.successMessageClick();
	}
	    

	@When("User click on heart icon to add ‘Sony VaIO’ laptop to wish list")
	public void user_click_on_heart_icon_to_add_sony_va_io_laptop_to_wish_list() {
	    Laptops.WishListSonyVAIOclick();
	}

	@Then("User should get a message ‘You must login or create an account to save Sony VAIO to your wish list!’")
	public void user_should_get_a_message_you_must_login_or_create_an_account_to_save_sony_vaio_to_your_wish_list() {
	    Laptops.LoginAlertClick();
	}
	
	@When("User click on ‘MacBook Pro’ item")
	public void user_click_on_mac_book_pro_item() {
	    Laptops.MacBookProClick();
	}
	
	@Then("User should see  ‘${double}’ price tag is present on UI.")
	public void user_should_see_$_price_tag_is_present_on_ui(Double double1) {
	    Laptops.MacBookProPriceClick();
	}

}
