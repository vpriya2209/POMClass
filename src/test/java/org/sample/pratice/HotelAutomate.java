package org.sample.pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HotelAutomate extends HotelBase {
	public static void main(String[] args) throws Throwable {
		LaunchBrowser();
		LoadUrl("https://adactin.com/HotelApp/");
		getTitle();
		getUrl();
		loginPage a = new loginPage();
		fill(a.getUserName(), "vishnupriya1997");
		fill(a.getPassword(), "Vpriya97");
		click(a.getBtnclick());
		Sleep(2000);
		SearchHotel b = new SearchHotel();
		selectByValue(b.getLocation(), "Melbourne");
		selectByVisibleText(b.getHotel(), "Hotel Hervey");
		selectByVisibleText(b.getRoom(), "Super Deluxe");
		selectByValue(b.getNoOfRoom(), "2");
		fill(b.getCheckin(), "25/12/2019");
		fill(b.getCheckout(), "26/12/2019");
		selectByValue(b.getAdultroom(), "2");
		click(b.getSubmit());
		ConfirmHotel c = new ConfirmHotel();
		click(c.getRadiobutton());
		click(c.getSubmit());
		PaymentPage d = new PaymentPage();
		fill(d.getFirstname(), "VishnuPriya");
		fill(d.getLastname(), "Senthilkumar");
		fill(d.getAddress(), "coimbatore");
		fill(d.getCcNum(), "12345678998765432");
		selectByValue(d.getCctype(), "VISA");
		selectByIndex(d.getCcmon(), 4);
		selectByIndex(d.getCcyear(), 4);
		fill(d.getCcv(), "123");
		click(d.getBookNow());
		Sleep(5000);
		WebElement orderNumber = driver.findElement(By.id("order_no"));
		String e = orderNumber.getAttribute("value");
		System.out.println(e);
	}

}
