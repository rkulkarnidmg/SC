package sf.scdev.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utility.PageConstants;
import Utility.SCDelay;

public class SetupPage extends Page{

	public SetupPage(WebDriver driver) {
		super(driver);

	}

	public void clickSetup(){
		driver.findElement(By.linkText(PageConstants.MAINPAGE_SETUP_LINK)).click();
	}

	public void clickLog() {
		SCDelay.forTime(4);
		driver.findElement(By.id("Logs_font")).click();
	}
	public void clickDebugLog() {
		SCDelay.forTime(4);
		driver.findElement(By.id("ApexDebugLogs_font")).click();
		
		//driver.findElement(By.linkText("Debug Logs")).click();	
	}

	public boolean findRecords() {
		System.out.println("Came in here");
		String abc = driver.findElement(By.cssSelector("tr.noRows > td")).getText();
		System.out.println("Found = " + abc);
		if (driver.findElement(By.cssSelector("tr.noRows > td")).getText().equals(abc)){
			return true;
		}
		else
			return false;
	}

	public void clickNew() {
		
		
	}
}
