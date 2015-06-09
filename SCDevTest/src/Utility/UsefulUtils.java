package Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import sf.scdev.pages.Page;

public class UsefulUtils extends Page {

	
	public UsefulUtils(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public static WebElement waitForPageUnitElementIsPresent(By locator, int maxSeconds) {
		return (new WebDriverWait(driver, maxSeconds)).until(ExpectedConditions
				.visibilityOfElementLocated(locator));
	}
}
