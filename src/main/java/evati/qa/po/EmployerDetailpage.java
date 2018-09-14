package evati.qa.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import io.appium.java_client.AppiumDriver;

public class EmployerDetailpage {
	
	private AppiumDriver driver;
	@FindBy(xpath = "//*[@id='mobiscroll1531992181614']")
	private WebElement Choose_employment_status;

	@FindBy(xpath = "//*[@id='mobiscroll1531992181619']//div[41]")
	private WebElement Choose_employment_value;
	
	@FindBy(xpath = "//*[@class='mbsc-fr-btn0 mbsc-fr-btn-e mbsc-fr-btn']")
	private WebElement Choose_employment_close;
	
	@FindBy(xpath = "//*[@id='master-footer']//button")
	private WebElement Next_button;
	
	public EmployerDetailpage( AppiumDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void selectemployment() {
		Choose_employment_status.click();
		Choose_employment_value.click();
		Choose_employment_value.click();
		Choose_employment_close.click();
	
		Reporter.log("<br>selectChoose_employment_status", true);
}

	public ComplianceInformationpage selectNextbutton() {
		 Next_button.click();
		
		 Reporter.log("<br>select_Next_button", true);
		 return new ComplianceInformationpage(driver);
}
	private EmployerDetailpage waitForPage() {
		// TODO Auto-generated method stub
		return null;
}

}
