package pageObjectPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import core.Base;

public class DesktopsPageObject extends Base{

	public DesktopsPageObject () {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//a[text()='Desktops']")
	private WebElement Desktops;
	public void DesktopsClick() {
		Desktops.click();
	}
	
	@FindBy(xpath="//a[text()='Show All Desktops']")
	private WebElement ShowAllDesktops;
	public void ShowAllDesktops() {
		ShowAllDesktops.click();
	}
	@FindBy(xpath="//h2[text()='Desktops']")
	private WebElement AllItems;
	public void AllItems() {
		AllItems.isDisplayed();
	}
	@FindBy(xpath="//*[@id=\"button-cart\"]")
	private WebElement AddToCart;
	public void add() {
		AddToCart.click();
	}
	@FindBy(id="input-quantity")
	private WebElement quantity;
	public void quantity(Integer int1) {
		quantity.clear();
		quantity.sendKeys(int1.toString());
	}
	@FindBy(xpath="//button[@onclick=\"cart.add('47', '1');\"]")
	private WebElement AddHPLP;
	public void AddToCart() {
		AddHPLP.click();
	}
	@FindBy(xpath="//*[@id=\"product-product\"]/div[1]")
	private WebElement Success;
	public boolean Success() {
		if(Success.isDisplayed( ))
			return true;
		else
			return false;
		
	}
	
	@FindBy(xpath="//button[@onclick=\"cart.add('30', '1');\"]")
	private WebElement AddCanon;
	public void AddCanon() {
		AddCanon.click();
	}
	
	@FindBy(xpath="//select[@id='input-option226']")
	private WebElement selectColorRed;
	public void selectRed() {
		Select selectColor= new Select(selectColorRed);
		selectColor.selectByVisibleText("Red");
	}
	
	@FindBy(xpath="//a[text()='Write a review']")
	private WebElement writeReview;
	public void Review() {
	writeReview.click();
	}
	
	@FindBy(xpath="//input[@id='input-name']")
	private WebElement yourname;
	public void yourname() {
		yourname.sendKeys("Saad");
	}
	@FindBy(xpath="//textarea[@id='input-review']")
	private WebElement review;
	public void yourReview() {
		review.sendKeys("WebSite is good for Tech stuff buying to your everday needs");
	}
	@FindBy(xpath="//input[@value='3']")
	private WebElement rating;
		public void yourRating() {
			rating.click();
	}
	@FindBy(xpath="//button[@id='button-review']")
	private WebElement continueButton;
	public void continueB() {
		continueButton.click();
	}
	@FindBy(xpath="//*[@id=\"form-review\"]/div[2]")
	private WebElement finalReview;
	public boolean thankyou() {
		if(finalReview.isDisplayed())
			return true;
		else
		return false;
	}
	
	@FindBy(xpath="//img[@title='Canon EOS 5D']")
	private WebElement img;
	public void imgclick() {
		img.click();
	}
	
	
}



