package sf.scdev.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utility.SCDelay;



public class MainPage extends Page {

	public MainPage(WebDriver driver) {
		super(driver);
	}

	public void loadMainPage(){
		driver.get(mainLink);
	}
	
	public String link_Knowledge = "Knowledge";
	public String link_ArticleManagement = "Article Management";
	public String mainLink = "https://cs7.salesforce.com/home/home.jsp";
	public String link_Setup = "Setup";
	
	public KnowledgePage clickKnowledge(){
		SCDelay.forTime(4);
		driver.findElement(By.linkText(link_Knowledge)).click();
		return new KnowledgePage(driver);
		}

	public ArticleManagementPage clickArticleManagement() {
		SCDelay.forTime(2);
		driver.findElement(By.linkText(link_ArticleManagement)).click();
		SCDelay.forTime(2);
		
		return new ArticleManagementPage(driver);
	}

	public SetupPage clickSetup(){
		SCDelay.forTime(4);
		driver.findElement(By.linkText(link_Setup)).click();
		SCDelay.forTime(3);
		return new SetupPage(driver);
		}
	
	
	
	
}
