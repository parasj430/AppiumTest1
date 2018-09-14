package evati.qa.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class YopmailPage {
	private WebDriver driver;

	@FindBy(xpath = "//*[@id='login']")
	private WebElement Email_id_text;
	
	@FindBy(xpath = "//*[@class='sbut']")
	private WebElement check_inbox;
		
	

	public YopmailPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void enterEmailtext(String str)
	{  
		Email_id_text.sendKeys(str);
		Reporter.log("<br>enterEmailtext", true);
	}
	
	public void clickcheck_inbox()
	{
		check_inbox.click();
		Reporter.log("<br>clickcheck_inbox", true);
	}
	
	



}
