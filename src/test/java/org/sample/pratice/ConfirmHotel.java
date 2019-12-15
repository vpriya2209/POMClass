package org.sample.pratice;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmHotel extends HotelBase {
	public ConfirmHotel() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='radiobutton_0']")
	private WebElement radiobutton;
	@FindBy(xpath = "//input[@id='continue']")
	private WebElement submit;

	public WebElement getRadiobutton() {
		return radiobutton;
	}

	public WebElement getSubmit() {
		return submit;
	}

}
