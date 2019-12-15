package org.sample.pratice;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel extends HotelBase {
	public SearchHotel() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//select[@name='location']")
	private WebElement location;
	@FindBy(xpath = "//select[@id='hotels']")
	private WebElement hotel;
	@FindBy(xpath = "//select[@id='room_type']")
	private WebElement room;
	@FindBy(xpath = "//select[@id='room_nos']")
	private WebElement noOfRoom;
	@FindBy(xpath = "//input[@id='datepick_in']")
	private WebElement checkin;
	@FindBy(xpath = "//input[@id='datepick_out']")
	private WebElement checkout;
	@FindBy(xpath = "//select[@id='adult_room']")
	private WebElement adultroom;
	@FindBy(xpath = "//input[@id='Submit']")
	private WebElement submit;

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoom() {
		return room;
	}

	public WebElement getNoOfRoom() {
		return noOfRoom;
	}

	public WebElement getCheckin() {
		return checkin;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public WebElement getAdultroom() {
		return adultroom;
	}

	public WebElement getSubmit() {
		return submit;
	}

}
