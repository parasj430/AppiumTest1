package evati.qa.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class Testharness_home_page {


	private WebDriver driver;

	@FindBy(xpath = "//*[@id='myDataTable_filter']//input")
	private WebElement Search_box;
	
	@FindBy(xpath = "//*[@value='Compute Activities' and @class='btn btn-primary batchProcesssBtn']")
	private WebElement ComputeActivitiesbutton;
		
	@FindBy(xpath = "//*[@value='Store Settled Transactions' and @class='btn btn-primary batchProcesssBtn']")
	private WebElement StoreSettledTransactionsbutton;
	
	@FindBy(xpath = "//*[@value='Execute Activities' and @class='btn btn-primary batchProcesssBtn']")
	private WebElement ExecuteActivitiesbutton;
	
	@FindBy(xpath = "//*[@value='Goal Snap Shot' and @class='btn btn-primary batchProcesssBtn']")
	private WebElement GoalSnapShotbutton;
	
	@FindBy(xpath = "//*[@value='Reconciliation Activities' and @class='btn btn-primary batchProcesssBtn']")
	private WebElement ReconciliationActivitiesbutton;
	
	@FindBy(xpath = "//*[@id='customerLoginId']")
	private WebElement CustomerLoginId_searchbox;

	public Testharness_home_page (WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void enterSearch_box(String str)
	{  
		Search_box.sendKeys(str);
		Search_box.click();
		Reporter.log("<br>enterSearch_box", true);
	}
	
	
	public void enterCustomerLoginId_searchbox(String str)
	{  
		CustomerLoginId_searchbox.sendKeys(str);
		
		Reporter.log("<br>CustomerLoginId_searchbox", true);
	}
	
	public void clickComputeActivitiesbutton()
	{  
		ComputeActivitiesbutton.click();
		
		Reporter.log("<br>clickComputeActivitiesbutton", true);
	}
	
	public void clickExecuteActivitiesbutton()
	{  
		ExecuteActivitiesbutton.click();
		
		Reporter.log("<br>clickExecuteActivitiesbutton", true);
	}
	
	public void clickStoreSettledTransactionsbutton()
	{  
		StoreSettledTransactionsbutton.click();
		
		Reporter.log("<br>clickStoreSettledTransactionsbutton", true);
	}
	
	public void clickGoalSnapShotbutton()
	{  
		GoalSnapShotbutton.click();
		
		Reporter.log("<br>clickGoalSnapShotbutton", true);
	}
	
	public void clickReconciliationActivitiesbutton()
	{  
		ReconciliationActivitiesbutton.click();
		
		Reporter.log("<br>clickReconciliationActivitiesbutton", true);
	}
	
	



}

