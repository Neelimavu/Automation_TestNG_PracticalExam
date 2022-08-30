package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddCategoryPage;
import util.BrowserFactory;

public class AddCategoryTest {
	
	WebDriver driver;
	@Test
	public void UserShouldBeAbleToAddCategory( ) throws InterruptedException  {
		
		driver = BrowserFactory.init();
		
		AddCategoryPage cp = PageFactory.initElements(driver, AddCategoryPage.class);
		cp.addCategory("Neelima456");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		cp.clickOnAddCategory();
		
		Thread.sleep(2000);
		BrowserFactory.tearDown();
	}
	

}
