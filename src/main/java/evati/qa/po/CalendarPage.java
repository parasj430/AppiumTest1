package evati.qa.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import io.appium.java_client.AppiumDriver;

public class CalendarPage extends BasePage {
	private  AppiumDriver driver;
	
	
	@FindBy(xpath =  "(//div[@role='option'][contains(.,'1991')])[1]")
	private WebElement Date;
	
	@FindBy(xpath = "//*[@ class='mbsc-fr-btn0 mbsc-fr-btn-e mbsc-fr-btn']")
	private WebElement Date_close;

	
	
	public CalendarPage( AppiumDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	

    public  void selectDate() {
		
	    Date.click();
	   
		Reporter.log("<br>selectDate_of_birth", true);	
}

   public  PersonalInformationPage selectDateclose() {
	
    
    Date_close.click();
	Reporter.log("<br>selectDate_of_birth", true);
	return new  PersonalInformationPage (driver);	
}
	
	
	
	

	
	
	public PersonalInformationPage waitForPage() {
		// TODO Auto-generated method stub
		return null;
}


}
