package stepDefinitions;




import core.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjectPackage.RetailPageObjects; 


public class RetailStepDefinitions extends Base{

	RetailPageObjects retail = new RetailPageObjects();
	
//	@Given("^User is on Retail website$")
//	public void user_is_on_retail_website() {
//		String actualPageTitle = driver.getTitle();
//		String expectedPageTitle = "TEK SCHOOL";
//		//Assertion checks the expected vs the actual and will fail if it is not and stop test case
//		Assert.assertEquals(expectedPageTitle, actualPageTitle);
//		logger.info("Actual Title is matching with expected Title");
//		}
//	
//	@When ("^User click  on MyAccount$")
//	public void User_Click_On_Myaccount() {
//		retail.Myaccountretail();
//		logger.info("User Click On Myaccount");
//	}
//	@And("^User click on Login$")
//	public void User_Click_on_Login() {
//		retail.clickloginbuttonretail();
//		logger.info("User Click on Login Option");
//		
//	}
//	@When("User enter username {string} and password {string}")
//	public void User_Ente_UserName_and_Password (String emailv, String passwordm) {
//		retail.emailretail(emailv);
//		retail.passwordretail(passwordm);
//		logger.info("User"+emailv + "and password "+passwordm);
//		
//	}
//	
//	@And("^User click on Login button1$")
//	public void User_Click_On_Login_lOption() {
//		retail.loginclickretail();
//		logger.info("User Click on Login lOption");
//		
//	}
//	@And("^User should be logged in to MyAccount dashboard")
//	public void User_Should_Be_login_to_Myaccount_Dashboard() {
//		Assert.assertTrue(retail.myAccountTextisPresentretail());
//		logger.info("User Should Be Login To Myaccount Dashboard");
//	}
//	
	@And("^User click on Register for an Affiliate Account link$")
	public void User_click_on_Register_for_an_Affiliate_Account_link() {
		retail.affiliateaccount();
		logger.info("User click on Register for an Affiliate Account link");
		
	}
	@And("User fill affiliate form with below information {string} {string} {string} {string}")
	public void taxID_paymentMethod(String CompanyName, String website, String taxID, String pays) {
		retail.Companyname(CompanyName);
		retail.websiteName(website);
		retail.taxids(taxID);
		retail.paymentmethod();
		logger.info("User_fill_affiliate_form_with_below_information _company_website_taxID_paymentMethod");
		}
	@And("^User fill check detail$")
	public void User_fill_check_detail() {
		retail.paypalemail();
		logger.info("User fill check detail");
	}
	@And("^User check on About us check box$")
	public void User_check_on_About_us_check_box() {
		retail.aboutus();
		logger.info("User check on About us check box");
	}
	
	@And("^User click on Continue button$")
	public void User_click_on_Continue_button() {
		retail.continuebutton();
		logger.info("User click on Continue button");
	}
	
	@Then("^User should see a success message$")
	public void User_should_see_a_success_message() {
		retail.success();
		logger.info("User should see a success message");
		
	}
	
	
	@When("^User click on Edit your affiliate informationlink$")
	public void User_click_on_EditAffiliate () {
		retail.affiliate();
		logger.info("User click on Edit your affiliate informationlink");
		
	}
	
	@And("user click on Bank Transfer radio button")
	public void user_click_on_Bank_Transfer() {
		retail.BankTransfer();
		logger.info("user click on Bank Transfer radio button");
		}
	
	@And("User fill Bank information with below information {string} {string} {string} {string} {string}")
	public void User_fill_Bank_information_with_below_information(String Name, String BN, String Swift, String AcctName, String Num) {
		retail.BankName(Name);
		retail.BranchNumber(BN);
		retail.SwiftCode(Swift);
		retail.AccountName(AcctName);
		retail.AccountNum(Num);
		logger.info("User fill Bank information with below information");
	}
	
	@And("^User click on Continue button for Edit$")
	public void User_click_on_Continue_buttonfor_Edit() {
		retail.ContinueEdit();
		logger.info("User click on Continue button for Edit");
	}
	
	
	@Then("^User should see a success message Continue$")
	public void User_should_see_a_success_Continue() {
		retail.Successtext();
		logger.info("User should see a success message Continue");
		
	}
	@When("^User click on Edit your account information link$")
	public void User_click_on_Edityouraccount () {
		retail.EditRegister();
		logger.info("User click on Edit your account information link");
		
	}
	
	@And("User modify below information {string} {string} {string} {string}")
	public void User_modify_below_information(String fName, String lName, String eEmail, String pEdit) {
		retail.FirstNameEdit(fName);
		retail.LastNameEdit(lName);
		retail.emailEdit(eEmail);
		retail.phoneEdit(pEdit);
		logger.info("User modify below information");
	}
	@And("^User click on continue button Edit Button$")
	public void User_click_on_Continue_button_for_Edit() {
		retail.ContinueEditButton();
		logger.info("User click on continue button Edit Button");
	}
	@Then("^User should see a message Success: Your account has been successfully updated$")
	public void User_should_see_a_success() {
		retail.SuccessEdit();
		logger.info("User should see a message Success: Your account has been successfully updated");
		
	}
	
	
	}

