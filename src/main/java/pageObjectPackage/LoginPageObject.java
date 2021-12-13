package pageObjectPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class LoginPageObject extends Base{
	
	public LoginPageObject() {
		PageFactory.initElements(driver, this);
		
			
	}
	
	@FindBy (xpath = "//a[@title='My Account']")
	private WebElement myAccount;
	@FindBy (xpath = "//a[text() = 'Login']")
	private WebElement login;
	@FindBy (id = "input-email")
	private WebElement email;
	@FindBy (id = "input-password")
	private WebElement password;
	@FindBy (xpath = "//input[@value='Login']")
	private WebElement loginbutton;
	
	
	public void clickOnMyAccount() {
		myAccount.click();
	}

	public void clickOnLogin() {
		login.click();
	}

	public void enterEmailAndPassword(String emailValue, String passwordValue) {
		email.sendKeys(emailValue);
		password.sendKeys(passwordValue);
	}
	
	public void clickOnLoginButton() {
		loginbutton.click();
	
	}
}
