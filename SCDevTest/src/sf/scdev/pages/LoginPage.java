package sf.scdev.pages;




import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import Utility.PageConstants;
import Utility.UsefulUtils;



public class LoginPage extends Page{
	

	//private static final String UAT_LOGIN_URL = null;


	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	//public String PAGE_URL = "http://test.salesforce.com/";
	//public String PAGE_TITLE = "salesforce.com - Customer Secure Login Page";
	
	//By lg = PageConstants.text_LoginUserName;

	public void loadPage() {
		//driver.get(PAGE_URL);
		driver.get(PageConstants.UAT_LOGIN_URL);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		//SCDelay.forTime(2);
		
		//waitForPageUnitElementIsPresent(By.id("username"), 15000);
		UsefulUtils.waitForPageUnitElementIsPresent(PageConstants.text_LoginUserName, 15000);
		
		//Assert.assertTrue(driver.findElement(By.id("username")).isDisplayed());
		}
	


	public void enterUserId(){
		//driver.findElement((PageConstants.text_LoginUserName)).sendKeys("rahul.kulkarni@mailnewspapers.co.uk.sc.scdev");
		driver.findElement(PageConstants.text_LoginUserName).sendKeys("rahul.kulkarni@mailnewspapers.co.uk.sc.scdev");
		Assert.assertTrue(driver.findElement(By.id("username")).getAttribute("value").equals("rahul.kulkarni@mailnewspapers.co.uk.sc.scdev"));
	}
	
	public void enterCCIUserId(){
		//driver.findElement((PageConstants.text_LoginUserName)).sendKeys("rahul.kulkarni@mailnewspapers.co.uk.sc.scdev");
		driver.findElement(PageConstants.text_LoginUserName).sendKeys("rahul.kulkarni@mailnewspapers.co.uk.admin.prodmirror");
		Assert.assertTrue(driver.findElement(By.id("username")).getAttribute("value").equals("rahul.kulkarni@mailnewspapers.co.uk.admin.prodmirror"));
	}
	
	public void enterPassword(){
		//UsefulUtils.waitForPageUnitElementIsPresent(By.id("password"), 15000);
		driver.findElement(By.id("password")).sendKeys("cake))007");
		Assert.assertTrue(driver.findElement(By.id("password")).getAttribute("value").equals("cake))007"));
	}
	
	
	public MainPage loginTest(){
		loadPage();
		//enterUserId();
		enterCCIUserId();
		enterPassword();
		Assert.assertTrue(driver.findElement(By.id("Login")).isDisplayed());
		
		System.out.println("Color of Login button is = "
				+ driver.findElement(By.id("Login")).getCssValue("color"));
		
		driver.findElement(By.id("Login")).click();
		System.out.println("clicked on Login");
		return new MainPage(driver);
	}
	
	public MainPage loginCCITest(){
		loadPage();
		enterUserId();
		enterPassword();
		Assert.assertTrue(driver.findElement(By.id("Login")).isDisplayed());
		
		System.out.println("Color of Login button is = "
				+ driver.findElement(By.id("Login")).getCssValue("color"));
		
		driver.findElement(By.id("Login")).click();
		System.out.println("clicked on Login");
		return new MainPage(driver);
	}
	

}
