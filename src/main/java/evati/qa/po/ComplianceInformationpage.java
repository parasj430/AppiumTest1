package evati.qa.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import io.appium.java_client.AppiumDriver;

public class ComplianceInformationpage {
	private  AppiumDriver driver;
	@FindBy(xpath = "//*[@id='mat-button-toggle-10']")
	private WebElement broker_dealer_yes;

	@FindBy(xpath = "//*[@id='mat-button-toggle-11']")
	private WebElement broker_dealer_No;

	@FindBy(xpath = "//*[@id='mat-button-toggle-12']")
	private WebElement stock_owner_yes;

	@FindBy(xpath = "//*[@id='mat-button-toggle-13']")
	private WebElement stock_owner_No;
	
	@FindBy(xpath = "//*[@id='mat-button-toggle-14']")
	private WebElement public_Official_yes;
	
	@FindBy(xpath = "//*[@id='mat-button-toggle-15']")
	private WebElement public_Official_No;
	
	@FindBy(xpath = "//*[@id='mat-button-toggle-16']")
	private WebElement IRS_notified_Yes;
	
	@FindBy(xpath = "//*[@id='mat-button-toggle-17']")
	private WebElement IRS_notified_No;
	
	@FindBy(xpath = "//*[@class='btn btn-primary btn-block mat-button']")
	private WebElement Next_button;
	
	public ComplianceInformationpage( AppiumDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void selectbroker_dealer_yes() {
		broker_dealer_yes.click();
		
		Reporter.log("<br>selectbroker_dealer_yes", true);		
}

	public void selectbroker_dealer_No() {
		broker_dealer_No.click();
		Reporter.log("<br>selectbroker_dealer_No", true);	
}
	public void selectstock_owner_yes() {
		stock_owner_yes.click();
		
		Reporter.log("<br>selectstock_owner_yes", true);	
}
	public void selectstock_owner_No() {
		stock_owner_No.click();
		Reporter.log("<br>selectstock_owner_No", true);	
		
}
	public void selectpublic_Official_yes() {
		public_Official_yes.click();
		Reporter.log("<br>selectpublic_Official_yes", true);		
	}
	public void selectpublic_Official_No() {
		public_Official_No.click();
		Reporter.log("<br>selectpublic_Official_No", true);	
		
}
	public void selectIRS_notified_Yes() {
		IRS_notified_Yes.click();
		
		Reporter.log("<br>selectIRS_notified_Yes", true);	
}
	public void selectIRS_notified_No() {
		IRS_notified_No.click();
		
		Reporter.log("<br>selectIRS_notified_No", true);		
}
	
	public AccountAgreementpage select_Next_button() {
		 Next_button.click();
		
		 Reporter.log("<br>select_Next_button", true);
		 return new AccountAgreementpage(driver);		
}
	private ComplianceInformationpage waitForPage() {
		// TODO Auto-generated method stub
		return null;
}
}
