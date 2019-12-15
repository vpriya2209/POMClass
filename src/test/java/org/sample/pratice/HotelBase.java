package org.sample.pratice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HotelBase {
	static WebDriver driver;

	public static void LaunchBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\091819\\POMPratice\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	public static void LoadUrl(String Url) {
		driver.get(Url);

	}

	public static void fill(WebElement element, String value) {
		element.sendKeys(value);

	}

	public static void Sleep(int no) throws Throwable {
		Thread.sleep(no);

	}

	public static void getTitle() {
		String a = driver.getTitle();
		System.out.println(a);

	}

	public static void getUrl() {
		String a = driver.getCurrentUrl();
		System.out.println(a);

	}

	public static void quit() {
		driver.quit();

	}

	public static void click(WebElement button) {
		button.click();

	}

	public static void selectByValue(WebElement element, String Value) {
		Select a = new Select(element);
		a.selectByValue(Value);

	}

	public static void selectByIndex(WebElement element, int Value) {
		Select a = new Select(element);
		a.selectByIndex(Value);
	}
	public static void selectByVisibleText(WebElement element, String Value) {
		Select a = new Select(element);
		a.selectByVisibleText(Value);

	}
}
