package sf.scdev.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utility.SCDelay;

public class ArticleManagementPage extends Page{

	public ArticleManagementPage(WebDriver driver) {
		super(driver);
		
	}
	
	public void clickNewButton(){
		driver.findElement(By.id("ext-gen32")).click();
		SCDelay.forTime(2);
		System.out.println("test");
	}
	
	public void clickCancelOnNewWindow(){
		
		driver.findElement(By.xpath("//*[@id='NewArticleDialog_SimpleDialog_buttons']/input[2]")).click();
		SCDelay.forTime(2);
	}

	public void clickMyDraft(){
		//System.out.println(driver.findElement(By.linkText("Test Article - Learning 1")).isDisplayed());
		driver.findElement(By.linkText("Test Article - Learning 1")).click();
		
	}
	
}
