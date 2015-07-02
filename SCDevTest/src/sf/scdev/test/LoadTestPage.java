package sf.scdev.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import sf.scdev.pages.ArticleManagementPage;
import sf.scdev.pages.KnowledgePage;
import sf.scdev.pages.LoginPage;
import sf.scdev.pages.MainPage;
import sf.scdev.pages.SetupPage;

public class LoadTestPage {
	
	WebDriver driver = new FirefoxDriver();
	LoginPage lPage;
	MainPage mPage;
	
	@Before public void setUp(){lPage = new LoginPage(driver);}
	//@After public void tearDown(){driver.quit();}
	
	/*@Test
	public void goToDraft(){
		mPage = lPage.loginTest();
		System.out.println("Completed Login");
		KnowledgePage kPage = mPage.clickKnowledge();
		kPage.clickDraft();
		
		//kPage.textbox_SeachKnowledge("Cancel Subscription");
	//	kPage.clickEnter_SearchKnowledge();
		 
		
		
		
		kPage.clickDraft();
		kPage.clickPublished();
		kPage.textbox_SeachKnowledge();
		kPage.clickEnter_SearchKnowledge();
		kPage.findArticleOnPage();
		
		
		ArticleManagementPage amPage = mPage.clickArticleManagement();
		amPage.clickNewButton();
		amPage.clickCancelOnNewWindow();
		amPage.clickMyDraft();
	
		}
	*/
	
/*	@Test
	public void goToSubscription(){
		mPage = lPage.loginTest();
		System.out.println("Completed Login");
		KnowledgePage kPage = mPage.clickKnowledge();
		kPage.clickPublished();
		kPage.clickDraft();
		kPage.clickDraft();
		kPage.clickPublished();
		kPage.getViewScore();
		kPage.getRating();
		
	}*/
	
	
/*	@Test
	public void searchArticleScoreRating(){
		mPage = lPage.loginTest();
		System.out.println("Completed Login");
		KnowledgePage kPage = mPage.clickKnowledge();
		kPage.clickPublished();
		kPage.searchArticle("Holiday Policy");
	}*/
	
	
	@Test
	public void searchCCILog(){
		mPage = lPage.loginTest();
		SetupPage setP = mPage.clickSetup();
		setP.clickLog();
		System.out.println("Clicked Log");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setP.clickDebugLog();
		if (!setP.findRecords()){
			setP.clickNew();
		}
		
	}
	
}
