package pageObjectPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class LaptopsNoteBooksPageObject extends Base {

	public LaptopsNoteBooksPageObject() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Laptops & Notebooks']")
	private WebElement LaptopsNotebookstab;

	public void LaptopNotebookstabClick() {
		LaptopsNotebookstab.click();

	}

	@FindBy(xpath = "//a[text()='Show All Laptops & Notebooks']")
	private WebElement ShowAllLaptopsNotebooks;

	public void ShowAllLaptopsNotebooksClick() {
		ShowAllLaptopsNotebooks.click();

	}

	@FindBy(xpath = "//a[text()='MacBook']")
	private WebElement MacBook;

	public void MacBookClick() {
		MacBook.click();

	}

	@FindBy(xpath = "//button[@id ='button-cart']")
	private WebElement AddtoCart;

	public void AddtoCartClick() {
		AddtoCart.click();
	}

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible' and contains (text(),'Success: You have added')]")
	private WebElement successMessage;

	public boolean successMessageClick() {
	if (successMessage.isDisplayed())
		return true;
	else return false;

	}

	@FindBy(xpath = "//span[@id='cart-total']")
	private WebElement CartIteam;

	public void CartItemClick() {
		CartIteam.click();

	}

	@FindBy(xpath = "//button[@title='Remove']")
	private WebElement buttonToRemoveTteamFromCart;

	public void buttonToRemoveTteamFromCartClick() {
		buttonToRemoveTteamFromCart.click();

	}

	@FindBy(xpath = "//span[@id='cart-total' and text()=' 0 item(s) - $0.00']")
	private WebElement RemoveAndShowZeroItem;

	public void RemoveAndShowZeroItemClick() {
		RemoveAndShowZeroItem.click();

	}

	@FindBy(xpath = "//button[@onclick=\"compare.add('43');\"]")
	private WebElement productcomparisonMacBook;

	public void productcomparisonMacBookClick() {
		productcomparisonMacBook.click();

	}

	@FindBy(xpath = "//button[@onclick=\"compare.add('44');\"]")
	private WebElement productcomparisonMacBookAir;

	public void productcomparisonMacBookAirClick() {
		productcomparisonMacBookAir.click();

	}
	
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible' and contains (text(), ' Success: You have added')]")
	private WebElement Successmessage;

	public void SuccessmessageClick() {
		Successmessage.click();

	}

	@FindBy(xpath = "//a[text()='product comparison']")
	private WebElement ProductComparisonlink;

	public void ProductComparisonlinkClick() {
		ProductComparisonlink.click();

	}

	@FindBy(xpath = "//button[@onclick=\"wishlist.add('46');\"]")
	private WebElement WishListSonyVAIO;

	public void WishListSonyVAIOclick() {
		WishListSonyVAIO.click();
	}

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement LoginAlert;

	public boolean LoginAlertClick() {
		if(LoginAlert.isDisplayed()) {
		return true;
	} else
		return false;
		

	}

	@FindBy(xpath = "//a[text()='MacBook Pro']")
	private WebElement MacBookPro;

	public void MacBookProClick() {
		MacBookPro.click();

	}

	@FindBy(xpath = "//h2[text()='$2,000.00']")
	private WebElement MacBookProPrice;

	public boolean MacBookProPriceClick() {
		if (MacBookProPrice.isDisplayed())
			return true;
		else
			return false;

	}
}
