package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DuplicatedcategoryPage {
	WebDriver driver;
	
	public DuplicatedcategoryPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(name="categorydata") WebElement TYPE_NAME;
	@FindBy(how = How.XPATH, using = "//input[@type='submit' and @value='Add category']") WebElement ADD_CATEGORY;
	public void addCategory(String categoryname ) {
		TYPE_NAME.sendKeys(categoryname);
		
	}
	public void addCategory() {
		ADD_CATEGORY.click();
	}
	

}
