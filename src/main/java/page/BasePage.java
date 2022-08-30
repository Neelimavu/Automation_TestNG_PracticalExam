package page;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BasePage {
	
	WebDriver driver;

	public void selectFromDropdown() {
		
		Select sel = new Select(null);
		sel.selectByVisibleText(null);
	}
	
	public int generateRandomNo(int boundaryNo) {
		
		Random rnd = new Random();
		int generatedNo = rnd.nextInt(boundaryNo);
		return generatedNo;
		
		
	}
}
