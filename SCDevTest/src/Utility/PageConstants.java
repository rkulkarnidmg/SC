package Utility;

import org.openqa.selenium.By;



public class PageConstants {
	
	public PageConstants(){
		
	}
	public static String UAT_LOGIN_URL =  "http://test.salesforce.com/";
	public static String UAT_LOGIN_TITLE = "salesforce.com - Customer Secure Login Page";
	public static String MAINPAGE_SETUP_LINK = "Setup";
	
	public static final By Join_Button					        = By.xpath("//div[@class='large-12 columns mm_accountDetails']/p/a[2]");	
	public static final By text_LoginUserName			     = By.id("username");

	
	
}


