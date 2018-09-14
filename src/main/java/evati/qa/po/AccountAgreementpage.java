package evati.qa.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import io.appium.java_client.AppiumDriver;


public class AccountAgreementpage extends BasePage  {
	//test
	//This is a test comment.
	private  AppiumDriver driver;
	@FindBy(xpath = "//*[@id='mat-checkbox-5']/label/div")
	private WebElement Electronic_Trasaction_agreement_check_box;

	@FindBy(xpath = "//*[@id='mat-checkbox-6']/label/div")
	private WebElement FORM_ADV_check_box;

	@FindBy(xpath = "//*[@id='mat-checkbox-7']/label/div")
	private WebElement Customer_agreement_check_box;
	
	@FindBy(xpath = "//*[@id='mat-input-32']")
	private WebElement  First_Second_Name_Textbox;
	
	@FindBy(xpath = "//*[@id='mat-input-41']")
	private WebElement  Next_button;
	
	public AccountAgreementpage( AppiumDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void selectElectronicTrasactionagreementcheck_box(){
		Electronic_Trasaction_agreement_check_box.click();
		
		Reporter.log("<br>selectElectronic_Trasaction_agreement_check_box", true);	
	}
	public void selectFORMADVcheckbox() {
		FORM_ADV_check_box.click();
		
		Reporter.log("<br>selectFORM_ADV_check_box", true);	
	}
	public void selectCustomeragreementcheckbox() {
		Customer_agreement_check_box.click();
		
		Reporter.log("<br>selectCustomer_agreement_check_box", true);	
	}
	
	public void selectFirstSecondNameTextbox(String str) {
		First_Second_Name_Textbox.sendKeys(str);
		
		Reporter.log("<br>selectHouse_Goal_icon", true);	
	}
	public TradierBrokeragepopuppage selectNextbutton() {
		Next_button.click();
		
        Reporter.log("<br>selectNext_button", true);
        return new TradierBrokeragepopuppage(driver);		
		
	}
	
	public AccountAgreementpage waitForPage() {
		// TODO Auto-generated method stub
		return null;
	}

	public void selectElectronic_Trasaction_agreement_check_box() {
		// TODO Auto-generated method stub
		
	}
}
