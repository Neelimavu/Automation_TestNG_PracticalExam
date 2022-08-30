package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MonthDropdownPage extends BasePage {
	
WebDriver driver;
	
	public MonthDropdownPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(name="due_month") WebElement DROP_DOWN;


	public void validateDropdown() {
		DROP_DOWN.click();
		
	}
}