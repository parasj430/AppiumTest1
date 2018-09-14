package evati.qa.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import io.appium.java_client.AppiumDriver;

public class PersonalInformationPage extends BasePage {

	private  AppiumDriver driver;
	@FindBy(xpath = "//*[@id='mat-button-toggle-2']")
	private WebElement Gender_male_button;

	@FindBy(xpath = "//*[@id='mat-button-toggle-3']")
	private WebElement Gender_Female_button;

	@FindBy(xpath = "//*[@id='mat-button-toggle-4']")
	private WebElement Marital_status_single;
	
	@FindBy(xpath = "//*[@id='mat-button-toggle-5']")
	private WebElement Marital_status_Married;
	
	@FindBy(xpath = "//*[@id='usrMobilePhoneNumber']")
	private WebElement Mobile_phone_number;
	
	@FindBy(xpath = "//*[@id='mat-checkbox-3']")
	private WebElement security_toggle_button;
	
	@FindBy(xpath = "//*[@id='usrssN_AES']")
	private WebElement Social_Security_Number;
	
	@FindBy(xpath = "//*[@id='master-content']//mbsc-date")
	private WebElement Date_of_birth;
	
	@FindBy(xpath = "//*[@id='mobiscroll1532088446155']/div[3]/div[3]/div[7]")
	private WebElement Date;
	
	@FindBy(xpath = "//*[@ class='mbsc-fr-btn0 mbsc-fr-btn-e mbsc-fr-btn']")
	private WebElement Date_close;
	@FindBy(xpath = "//*[@id=\"master-footer\"]//button")
	private WebElement Next_button;
	
	public  PersonalInformationPage( AppiumDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public  void selectGender_male_button() {
		Gender_male_button.click();
		
		Reporter.log("<br>selectGender_male_button", true);
}
	public  void selectGender_Female_button() {
		Gender_Female_button.click();
		
		Reporter.log("<br>selectGender_Female_button", true);
}
	public  void selectMarital_status_single() {
		Marital_status_single.click();
		
		Reporter.log("<br>selectMarital_status_single", true);
}

	public  void selectMarital_status_Married() {
		Marital_status_Married.click();
		
		Reporter.log("<br>selectMarital_status_Married", true);	
}
	
	public  void selectMobile_phone_number(String str) {
		Mobile_phone_number.sendKeys(str);
		
		Reporter.log("<br>selectMarital_status_Married", true);	
		
	}

	public  void selectsecurity_toggle_button() {
		security_toggle_button.click();
		
		Reporter.log("<br>selectsecurity_toggle_button", true);		
}

	public void selectSocial_Security_Number(String str) {
		Social_Security_Number.sendKeys(str);
		
		Reporter.log("<br>selectSocial_Security_Number", true);
		
}
	public  CalendarPage selectDateofbirth() {
		Date_of_birth.click();
	     
		Reporter.log("<br>selectDate_of_birth", true);
		 return new  CalendarPage (driver);	
}
	public  void selectDate() {
		
	    Date.click();
	   
		Reporter.log("<br>selectDate_of_birth", true);	
}
public  void selectDateclose() {
		
	    
	    Date_close.click();
		Reporter.log("<br>selectDate_of_birth", true);	
}
	public   InvestmentProfilepage selectNextbutton() {
		Next_button.click();
		
		Reporter.log("<br>selectNext_button", true);
		 return new InvestmentProfilepage(driver);
		
}
	
	
	public PersonalInformationPage waitForPage() {
		// TODO Auto-generated method stub
		return null;
}

}
