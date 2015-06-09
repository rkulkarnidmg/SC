package sf.scdev.pages;

import java.util.List;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utility.SCDelay;

public class KnowledgePage extends Page{

	public KnowledgePage(WebDriver driver) {
		super(driver);
	}

	public void clickPublished(){
		
		/*
		 * check if draft is visible or published
		 */
		
		if (driver.findElement(By.id("PublishStatusFilterMenu")).getText().equals("Published")){
			//Don't Do Anything
		}
		else if (driver.findElement(By.id("PublishStatusFilterMenu")).getText().equals("Draft")){
			driver.findElement(By.id("PublishStatusFilterMenu")).click();
			SCDelay.forTime(1);
			driver.findElement(By.xpath("//*[@id='PublishStatusFilter_0']/a")).click();
			SCDelay.forTime(2);
		}
		else{
			System.out.println("Error** WRONG ** WRONG ** Now Showing : " + driver.findElement(By.id("PublishStatusFilterMenu")).getText());
		}
			
	}
	
	public void clickDraft(){

		/*
		 * Getting background color
		 */
		
	/*	WebElement wE = driver.findElement(By.id("PublishStatusFilterMenu"));
		String menuCSSValue = wE.getCssValue("background-color");
		System.out.println("Background color = " + menuCSSValue);
		*/
		System.out.println("Color of Published button is = "
						+ driver.findElement(By.id("PublishStatusFilterMenu")).getCssValue("color"));
		
		
		/*
		 * check if draft is visible or published
		 */
		
		if (driver.findElement(By.id("PublishStatusFilterMenu")).getText().equals("Published")){
			driver.findElement(By.id("PublishStatusFilterMenu")).click();
			SCDelay.forTime(1);
			driver.findElement(By.xpath("//*[@id='PublishStatusFilter_1']/a")).click();
		}
		else if (driver.findElement(By.id("PublishStatusFilterMenu")).getText().equals("Draft")){
			//Do Nothing
		}
		
		else {
			System.out.println("Error** WRONG ** WRONG ** Now Showing : " + driver.findElement(By.id("PublishStatusFilterMenu")).getText());
		}
		System.out.println("Color of Draft button is = "
				+ driver.findElement(By.xpath("//*[@id='PublishStatusFilter_1']/a")).getCssValue("color"));
		SCDelay.forTime(2);
		
	}
	
	
	public void textbox_SeachKnowledge(String searchString){
		driver.findElement(By.id("knowledgeSearch")).sendKeys(searchString);
		SCDelay.forTime(3);
		Assert.assertTrue(driver.findElement(By.id("knowledgeSearch")).getAttribute("value").equals(searchString));

	}
	
	public void clickEnter_SearchKnowledge(){
		driver.findElement(By.id("knowledgeSearch")).sendKeys(Keys.RETURN);
		SCDelay.forTime(4);
	}
	
	public void findArticleOnPage(String searchString){
		SCDelay.forTime(3);
		Assert.assertTrue(driver.findElement(By.linkText(searchString)).isDisplayed());
	}
	
/*	public String getArticleList(){
		System.out.println("Got the value from Article List " + driver.findElement(By.id("articleList")).getText());
		return(driver.findElement(By.id("articleList")).getText());
	}
	*/
	

	public void getArticleList(){
		SCDelay.forTime(3);
	/*	String myX = driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td/div[1]/div/div/table/tbody/tr/td[2]/div/div[4]/div[2]/ul/li[20]")).getText();
		System.out.println("Got Here : " + myX);
		*/
		
		List<WebElement> allElements = driver.findElements(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td/div[1]/div/div/table/tbody/tr/td[2]/div/div[4]/div[2]/ul/li")); 
		for (WebElement element: allElements) {
		      System.out.println("Now Reading ***** :" + element.getText());
		}
	}
	
	
	public void getValueFromArticleList(String searchString){
	
		//System.out.println(myList());
		
		System.out.println("Search String = " + searchString);
		
		String myValue = driver.findElement(By.linkText(searchString)).getText();
		
		System.out.println("Search for text in :");
		System.out.println(myValue);
		
		if (myValue.contains("New")){
			System.out.println("Found new. Test case passes");
		}
		else
		
		{
			System.out.println("Not Found.");
		}
	}
	
	
	public void getViewScore(){
		System.out.println("Getting score... ");
		System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td/div[1]/div/div/table/tbody/tr/td[2]/div/div[4]/div[2]/ul/li[1]/div/div[2]/p[1]/span/img[1]")).getAttribute("title"));
	}
	
	public void getRating(){
		System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td/div[1]/div/div/table/tbody/tr/td[2]/div/div[4]/div[2]/ul/li[1]/div/div[2]/p[1]/span/img[4]")).getAttribute("title"));
	}

	public void searchArticle(String string) {
		String myTitleSeachXPathElement = "/html/body/div[1]/div[2]/table/tbody/tr/td/div[1]/div/div/table/tbody/tr/td[2]/div/div[4]/div[2]/ul/li";
		String myScoreXPathElement = "/div/div[2]/p[1]/span/img[1]";
		String myRatingXPathElement = "/div/div[2]/p[1]/span/img[4]";
		List<WebElement> allElements = driver.findElements(By.xpath(myTitleSeachXPathElement));
		
		System.out.println("***************************************************************************************");
	int i = 1;
	for (WebElement element: allElements) {

				//System.out.println("Now Reading ***** :");
				//System.out.println(element.getText());
		    if (element.getText().contains(string)){
		    	//System.out.println("*************** Found you ****************** :");
		    	//System.out.println(" i = " + i);

		    	//System.out.println("Searching for Score " + myTitleSeachXPathElement+"["+i+"]"+myScoreXPathElement);
		    	//System.out.println("Searching for Rating " + myTitleSeachXPathElement+"["+i+"]"+myRatingXPathElement);
		    	
		    	
		    	System.out.println("Score = " + driver.findElement(By.xpath(myTitleSeachXPathElement+"["+i+"]"+myScoreXPathElement)).getAttribute("title"));
		    	System.out.println("Rating = " + driver.findElement(By.xpath(myTitleSeachXPathElement+"["+ i+ "]"+myRatingXPathElement )).getAttribute("title"));
		    	break;
		    }  
		    i++;
			}
	System.out.println("***************************************************************************************");
	}
}
