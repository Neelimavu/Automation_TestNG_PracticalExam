package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.MonthDropdownPage;
import util.BrowserFactory;

public class MonthDropdownTest {
	WebDriver driver;
@Test
	public void validatethemonthdropdown() throws InterruptedException {
		
		driver = BrowserFactory.init();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		MonthDropdownPage mp = PageFactory.initElements(driver, MonthDropdownPage.class);
		mp.validateDropdown();
		
		Thread.sleep(2000);
		BrowserFactory.tearDown();
	}
		
}
