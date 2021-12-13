package pageObjectPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.UtilityClasses;

public class RetailPageObjects extends Base {

	
	
	public RetailPageObjects () {
		PageFactory.initElements(driver, this);
		}
	
	@FindBy (xpath = "//span[contains(text(),'My Account')]")
	private WebElement MyAccount;
	
	@FindBy (xpath = "//a[text() = 'Login']")
	private WebElement loginbutton;
	
	@FindBy (xpath ="//input[@id='input-email']")
	private WebElement email;
	
	@FindBy (xpath ="//input[@id='input-password']")
	private WebElement password;
	
	@FindBy (xpath ="//input[@value='Login']")
	private WebElement loginclick;

	@FindBy (xpath = "//h2[text()='My Account']")
	private WebElement myAccountText;
	
	@FindBy (xpath = "//a[contains(text(),'Register for an affiliate account')]")
	private WebElement affiliateaccount;
	
	@FindBy (xpath = "//input[@id='input-company']")
	private WebElement Companyname;
	
	@FindBy (xpath = "//input[@id='input-website']")
	private WebElement websiteName;
	
	@FindBy (xpath = "//input[@id='input-tax']")
	private WebElement taxid;
	
	@FindBy (xpath = "//input[@value='paypal']")
	private WebElement paymentmethod;
	
	@FindBy (xpath = "//input[@id='input-paypal']")
	private WebElement paypalemail;
	
	@FindBy (xpath = "//input[@value='1']")
	private WebElement aboutus;
	
	@FindBy (xpath = "//input[@value='Continue']")
	private WebElement continuebutton;
	
	@FindBy (xpath = "//i[@class='fa fa-check-circle']")
	private WebElement success;
	
	@FindBy(xpath = "//a[text()='Edit your affiliate information']")
	private WebElement Editaffiliate;
	public void affiliate() {
		Editaffiliate.click();
	}
	
	@FindBy (xpath = "//input[@id='input-company']")
	private WebElement Editcompany;
	public void Editcompany() {
		Editcompany.sendKeys("ABC.Com");
	}
	
	@FindBy (xpath = "//input[@name='website']")
	private WebElement Editwebsite;
	public void Editwebsite() {
		Editwebsite.sendKeys("www.tekshcool.com");
	}
	
	@FindBy (xpath = "//input[@placeholder='Tax ID']")
	private WebElement EditTaxId;
	public void EditTaxID() {
		EditTaxId.sendKeys("0124578");
	}
	
	@FindBy (xpath = "//input[@value='bank']")
	private WebElement BankTransfer;
	public void BankTransfer() {
		BankTransfer.click();
	}
	
	@FindBy (xpath = "//input[@name='bank_name']")
	private WebElement BankName;
	public void BankName(String Name) {
		BankName.sendKeys(Name);
	}
	
	@FindBy (xpath = "//input[@name='bank_branch_number']")
	private WebElement BranchNumber;
	public void BranchNumber(String BN) {
		BranchNumber.sendKeys(BN);
	}
	
	@FindBy (xpath = "//input[@id='input-bank-swift-code']")
	private WebElement SwiftCode;
	public void SwiftCode(String Swift) {
		SwiftCode.sendKeys(Swift);
	}
	
	@FindBy (xpath = "//input[@name='bank_account_name']")
	private WebElement AccountName;
	public void AccountName(String AcctName) {
		AccountName.sendKeys(AcctName);
	}
	
	@FindBy (xpath = "//input[@name='bank_account_number']")
	private WebElement AccountNum;
	public void AccountNum(String Num) {
		AccountNum.sendKeys(Num);
	}
	
	@FindBy (xpath = "//input[@class='btn btn-primary']")
	private WebElement ContinueEdit;
	public void ContinueEdit() {
		ContinueEdit.click();
	}
	
	@FindBy (xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement Successtext;
	public void Successtext() {
		UtilityClasses.screenShotName();
	}
	
	@FindBy (xpath = "//*[@id=\"content\"]/ul[1]/li[1]/a")
	private WebElement EditRegister;
	public void EditRegister() {
		EditRegister.click();
	}
	
	@FindBy (xpath = "//*[@id=\"input-firstname\"]")
	private WebElement FirstNameEdit;
	public void FirstNameEdit(String fName) {
		FirstNameEdit.sendKeys(fName);
	}
	
	@FindBy (xpath = "//*[@id=\"input-lastname\"]")
	private WebElement LastNameEdit;
	public void LastNameEdit(String lName) {
		LastNameEdit.sendKeys(lName);
	}
	
	@FindBy (xpath = "//*[@id=\"input-email\"]")
	private WebElement emailEdit;
	public void emailEdit(String eEmail) {
		emailEdit.sendKeys("eEmail");

	}
	@FindBy (xpath ="//*[@id=\"input-telephone\"]")
	private WebElement phoneEdit;
	public void phoneEdit(String pEdit) {
		phoneEdit.sendKeys(pEdit);
	}
	
	@FindBy (xpath = "//*[@id=\"content\"]/form/div/div[2]/input")
	private WebElement ContinueEditButton;
	public void ContinueEditButton() {
		ContinueEditButton.click();
	}
	
	@FindBy (xpath = "//*[@id=\"account-account\"]/div[1]")
	private WebElement SuccessEdit;
	public void SuccessEdit() {
		UtilityClasses.screenShotName();
	}
	
	
	
	
	public void Myaccountretail() {
		MyAccount.click();
	}
	
	public void clickloginbuttonretail() {
		loginbutton.click();
	}
	
	public void emailretail(String emailv) {
		email.sendKeys(emailv);
	}
	public void passwordretail(String passwordm) {
		password.sendKeys(passwordm);
	}
	
	public void loginclickretail() {
		loginclick.click();
	}
	public boolean myAccountTextisPresentretail() {
		if (myAccountText.isDisplayed()) {
			return true;
		}else {
			return false;
		}
	}
	
	public void affiliateaccount() {
		affiliateaccount.click();
	}
	public void Companyname(String name) {
		Companyname.sendKeys(name);
	}
	
	public void websiteName(String website) {
		websiteName.sendKeys(website);
	}
	public void taxids(String tax) {
		taxid.sendKeys(tax);
	}
	public void paymentmethod() {
		paymentmethod.click();
	}
	public void paypalemail() {
		paypalemail.sendKeys("AF@gmail.com");
	}
	public void aboutus() {
		aboutus.click();
	}
	public void continuebutton() {
		continuebutton.click();
	}
	public void success() {
		UtilityClasses.screenShotName();
	}
}
