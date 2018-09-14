package evati.qa.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import io.appium.java_client.AppiumDriver;

public class Profilepage extends BasePage {
	private  AppiumDriver driver;
	@FindBy(xpath = "//*[@id='mat-input-4']")
	private WebElement Firstname;

	@FindBy(xpath = "//*[@id='mat-input-5']")
	private WebElement Last_name;

	@FindBy(xpath = "//*[@id='mat-input-6']")
	private WebElement Adress_first_line;
	
	@FindBy(xpath = "//*[@id='mat-input-7']")
	private WebElement Adress_second_line;
	
	@FindBy(xpath = "//*[@id='mat-input-8']")
	private WebElement City;
	
	@FindBy(xpath = "//*[@id='mat-input-9']")
	private WebElement State;
	
	@FindBy(xpath = "//*[@id='postalCode']")
	private WebElement Zip_code;
	
	@FindBy(xpath = "//*[@id='master-footer']//button")
	private WebElement Nextbutton;
	
	public Profilepage( AppiumDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void enterFirstname(String str) {
		
		Firstname.sendKeys(str);
		
		Reporter.log("<br>enterFirst_name", true);
}
	public void selectLast_name(String str) {
		
		Last_name.sendKeys(str);
		
		Reporter.log("<br>selectLast_name", true);
}
	
	public void selectAdress_First_line( String str) {
		
		Adress_first_line.sendKeys(str);
		
		Reporter.log("<br>selectAdress_First_line", true);
}

	public void selectAdress_second_line( String str) {
		
		Adress_second_line.sendKeys(str);
		
		Reporter.log("<br>selectAdress_second_line", true);
}

	public void selectCity(String str) {
		
		City.sendKeys(str);
		Reporter.log("<br>selectCity", true);	
		
}
	
	public void selectState(String str) {
		
		State.sendKeys(str);
		
		Reporter.log("<br>selectHouse_Goal_icon", true);
}

	public void selectZip_code(String str) {
		
		Zip_code.sendKeys(str);
		Reporter.log("<br>selectZip_code", true);
	}	

	public PersonalInformationPage selectNextbutton() {
		 Nextbutton.click();
		 Reporter.log("<br>select_Next_button", true);
		 return new PersonalInformationPage(driver);
		
}
	public Profilepage waitForPage() {
		// TODO Auto-generated method stub
		return this;
}

}
