package org.sample.pratice;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage extends HotelBase {
	public PaymentPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "first_name")
	private WebElement Firstname;

	@FindBy(id = "last_name")
	private WebElement lastname;

	@FindBy(xpath = "//textarea[@id='address']")
	private WebElement address;

	@FindBy(id = "cc_num")
	private WebElement ccNum;

	@FindBy(id = "cc_type")
	private WebElement cctype;

	@FindBy(id = "cc_exp_month")
	private WebElement ccmon;

	@FindBy(id = "cc_exp_year")
	private WebElement ccyear;

	@FindBy(id = "cc_cvv")
	private WebElement ccv;

	@FindBy(id = "book_now")
	private WebElement bookNow;

	public WebElement getFirstname() {
		return Firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCcNum() {
		return ccNum;
	}

	public WebElement getCctype() {
		return cctype;
	}

	public WebElement getCcmon() {
		return ccmon;
	}

	public WebElement getCcyear() {
		return ccyear;
	}

	public WebElement getCcv() {
		return ccv;
	}

	public WebElement getBookNow() {
		return bookNow;
	}
}
