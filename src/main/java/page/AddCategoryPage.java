package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddCategoryPage extends BasePage {
	
	WebDriver driver;
	
	public AddCategoryPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(name="categorydata") WebElement TYPE_NAME;
//	@FindBy(name="submit") WebElement ADD_CATEGORY;
	@FindBy(how = How.XPATH, using = "//input[@type='submit' and @value='Add category']") WebElement ADD_CATEGORY;
	public void addCategory(String categoryname ) {
		TYPE_NAME.sendKeys(categoryname + generateRandomNo(9999));
		
	}
	public void clickOnAddCategory() {
		ADD_CATEGORY.click();
	}
}
