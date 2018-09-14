package evati.qa.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import io.appium.java_client.AppiumDriver;

public class InvestmentProfilepage  extends BasePage {
	
	private  AppiumDriver driver;
	@FindBy(xpath = "//*[@id='mobiscroll1532093756369']")
	private WebElement annualIncome;
	
	@FindBy(xpath = "//*[@id='mobiscroll1531988511247']/div[3]/div[3]/div[12]")
	private WebElement annualIncomevlue;
	
	@FindBy(xpath = "//*[@class= 'mbsc-fr-btn0 mbsc-fr-btn-e mbsc-fr-btn']")
	private WebElement annual_closebutton;
	
	@FindBy(xpath = "//*[@id='mobiscroll1531988511240']")
	private WebElement netWorth;
	
	@FindBy(xpath = "//*[@id='mobiscroll1531988511249']/div[3]/div[3]/div[12]")
	private WebElement netWorthvalue;
	
	@FindBy(xpath = "//*[@class='mbsc-fr-btn0 mbsc-fr-btn-e mbsc-fr-btn']")
	private WebElement netWorth_closebutton;
	
	@FindBy(xpath = "//*[@id='mobiscroll1531988511241']")
	private WebElement liquidNetWorth;
	
	@FindBy(xpath = "//*[@id='mobiscroll1531988511252']/div[3]/div[3]/div[11]")
	private WebElement liquidNetWorthvalue;
	
	@FindBy(xpath = "//*[@class='mbsc-fr-btn0 mbsc-fr-btn-e mbsc-fr-btn']")
	private WebElement liquid_closebotton;
	
	@FindBy(xpath = "//*[@id='mobiscroll1531992181582']")
	private WebElement riskTolerance;
	
	@FindBy(xpath = "//*[@id='mobiscroll1531992181586']/div[3]/div[2]/div/div[41]")
	private WebElement risk_value_low;
	
	@FindBy(xpath = "//*[@class='mbsc-fr-btn0 mbsc-fr-btn-e mbsc-fr-btn']")
	private WebElement risk_close;
	
	@FindBy(xpath = "//*[@id='mobiscroll1531992181583']")
	private WebElement taxPercentage;
	
	@FindBy(xpath = "//*[@id='mobiscroll1531992181590']/div[3]/div[3]/div[10]")
	private WebElement taxPercentage_value;
	
	@FindBy(xpath = "//* [@class='mbsc-fr-btn0 mbsc-fr-btn-e mbsc-fr-btn']")
	private WebElement taxPercentage_close;
	
	@FindBy(xpath = "//*[@id='mobiscroll1531992181584']")
	private WebElement investmentObjective;
	
	@FindBy(xpath = "//*[@id='mobiscroll1531992181592']/div[3]/div[3]/div[11]")
	private WebElement investmentObjective_value;
	
	@FindBy(xpath = "//*[@ class ='mbsc-fr-btn0 mbsc-fr-btn-e mbsc-fr-btn']")
	private WebElement investmentObjective_close;

	
	@FindBy(xpath = "//*[@id='mobiscroll1531992181585']")
	private WebElement investmentExperience;
	
	@FindBy(xpath = "//*[@id='mobiscroll1531992181593']/div[3]/div[3]/div[10]")
	private WebElement investmentExperience_value;
	
	@FindBy(xpath = "//*[@class='mbsc-fr-btn0 mbsc-fr-btn-e mbsc-fr-btn']")
	private WebElement investmentExperience_close;
	
	@FindBy(xpath = "//*[@id='master-footer']//button")
	private WebElement Next_button;
	
	public InvestmentProfilepage( AppiumDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void selectannualIncome() {
		annualIncome.click();
		//annualIncomevlue.click();
		//annual_closebutton.click();
		Reporter.log("<br>selectannualIncome", true);	
}
	public void select_netWorth() {
		 netWorth.click();
		 netWorthvalue.click();
		 netWorth_closebutton.click();
		 Reporter.log("<br>select_netWorth", true);
}
	public void selectliquidNetWorth() {
		liquidNetWorth.click();
		liquidNetWorthvalue.click();
		liquid_closebotton.click();
		Reporter.log("<br>selectliquidNetWorth", true);
		
}

	public void select_riskTolerance() {
		 riskTolerance.click();
		 risk_value_low.click();
		 risk_close.click();
		 Reporter.log("<br>select_riskTolerance", true);
			
}
	
	public void selecttaxPercentage() {
		taxPercentage.click();
		taxPercentage_value.click();
		taxPercentage_close.click();
		
		Reporter.log("<br>selecttaxPercentage", true);
}
    public void selectinvestmentObjective() {
		investmentObjective.click();
		investmentObjective_value.click();
		investmentObjective_close.click();
		Reporter.log("<br>selectinvestmentObjective", true);
}
    
    public void selectinvestmentExperience() {
    	investmentExperience.click();
		investmentExperience_value.click();
		investmentExperience_close.click();
		Reporter.log("<br>selectinvestmentExperience", true);
}

	public CreateGoaldateamountPage selectNextbutton() {
		 Next_button.click();
		 return new CreateGoaldateamountPage(driver);
		
		
}
	public InvestmentProfilepage waitForPage() {
		// TODO Auto-generated method stub
		return null;
}
}
