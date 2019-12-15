package org.sample.pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AdactinHotel {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\091819\\POMPratice\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactin.com/HotelApp/");
		WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
		userName.sendKeys("vishnupriya1997");
		WebElement passWord = driver.findElement(By.xpath("//input[@id='password']"));
		passWord.sendKeys("Vpriya97");
		WebElement btn = driver.findElement(By.xpath("//input[@id='login']"));
		btn.click();
		Thread.sleep(200);
		WebElement location = driver.findElement(By.xpath("//select[@name='location']"));
		Select loc = new Select(location);
		loc.selectByValue("Melbourne");
		WebElement hotel = driver.findElement(By.xpath("//select[@id='hotels']"));
		Select hot = new Select(hotel);
		hot.selectByVisibleText("Hotel Hervey");
		WebElement room = driver.findElement(By.xpath("//select[@id='room_type']"));
		Select ro = new Select(room);
		ro.selectByVisibleText("Super Deluxe");
		WebElement noOfRoom = driver.findElement(By.xpath("//select[@id='room_nos']"));
		Select nor = new Select(noOfRoom);
		nor.selectByValue("2");
		WebElement checkIn = driver.findElement(By.xpath("//input[@id='datepick_in']"));
		Thread.sleep(500);
		checkIn.sendKeys("25/12/2019");
		WebElement checkOut = driver.findElement(By.xpath("//input[@id='datepick_out']"));
		Thread.sleep(500);
		checkOut.sendKeys("29/12/2019");
		WebElement noOfPeople = driver.findElement(By.xpath("//select[@id='adult_room']"));
		Select nop = new Select(noOfPeople);
		nop.selectByValue("4");
		WebElement submit = driver.findElement(By.xpath("//input[@id='Submit']"));
		submit.click();
		Thread.sleep(200);
		WebElement sell = driver.findElement(By.xpath("//input[@id='radiobutton_0']"));
		sell.click();
		WebElement sub = driver.findElement(By.xpath("//input[@id='continue']"));
		sub.click();
		WebElement firstName = driver.findElement(By.id("first_name"));
		firstName.sendKeys("VishnuPriya");
		WebElement lastName = driver.findElement(By.id("last_name"));
		lastName.sendKeys("SenthilKumar");
		WebElement address = driver.findElement(By.xpath("//textarea[@id='address']"));
		address.sendKeys("Coimbatore");
		WebElement ccNum = driver.findElement(By.id("cc_num"));
		ccNum.sendKeys("12345678998765432");
		WebElement cctype = driver.findElement(By.id("cc_type"));
		Select ccTyp = new Select(cctype);
		ccTyp.selectByValue("VISA");
		WebElement ccmon = driver.findElement(By.id("cc_exp_month"));
		Select ccm = new Select(ccmon);
		ccm.selectByIndex(4);
		WebElement ccyear = driver.findElement(By.id("cc_exp_year"));
		Select ccy = new Select(ccyear);
		ccy.selectByIndex(5);
		WebElement ccv = driver.findElement(By.id("cc_cvv"));
		ccv.sendKeys("123");
		WebElement bookNow = driver.findElement(By.id("book_now"));
		bookNow.click();
		Thread.sleep(5000);
		WebElement order = driver.findElement(By.xpath("//input[@id='order_no']"));
		String text = order.getText();
		System.out.println(text);

	}
}
