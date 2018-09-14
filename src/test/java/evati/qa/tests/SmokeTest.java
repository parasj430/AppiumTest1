package evati.qa.tests;

import java.io.File;
import java.net.URISyntaxException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Duration;
import org.openqa.selenium.support.ui.Sleeper;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import evati.qa.po.AccountAgreementpage;
import evati.qa.po.CalendarPage;
import evati.qa.po.ChooseGoaltypePage;
import evati.qa.po.ComplianceInformationpage;
import evati.qa.po.CreateFirstGoalPopupPage;
import evati.qa.po.CreateGoalDefaultimagePage;
import evati.qa.po.CreateGoalGoalnamePage;
import evati.qa.po.CreateGoalStrategiesPage;
import evati.qa.po.CreateGoaldateamountPage;
import evati.qa.po.DashboardPage;
import evati.qa.po.EmployerDetailpage;
import evati.qa.po.InvestmentProfilepage;
import evati.qa.po.LoginPage;
import evati.qa.po.PersonalInformationPage;
import evati.qa.po.Profilepage;
import evati.qa.po.SignupPage;
import evati.qa.po.TradierBrokeragepopuppage;
import evati.qa.utils.MailAPIUtils;
import evati.qa.utils.WaitTime;

public class SmokeTest extends BaseTest {

	private LoginPage loginPage;
	
	private DashboardPage dashboardPage;
	
	private SignupPage signupPage;
	
    private CreateFirstGoalPopupPage creategoalpopup;
   
    private ChooseGoaltypePage choosegoaltype;
    
    private CreateGoalGoalnamePage createGoalname;
     
    private CreateGoalDefaultimagePage createGoalDefaultimage ; 

    private Profilepage Profile ; 
     
    private PersonalInformationPage personalInformationPage ;
    
    private InvestmentProfilepage  Investmentpage ;
    
    private CreateGoaldateamountPage Goaldateamount;
    
    private CreateGoalStrategiesPage GoalStrategies;
    
    private EmployerDetailpage EmployeeDetail;
    
    private  ComplianceInformationpage  ComplianceInformation; 
    
    private AccountAgreementpage accountAgreement ;
    
    private TradierBrokeragepopuppage tradierBrokeragepopup; 
    
    private CalendarPage Calendar ;
    
	 //Verify that User is able to login the application.
	@Test
	public void loginExistingUser() throws Exception {
		//Map<String, Object> userData = ppulateUniqueData(xmlUtils.getXMLNodeValues("userData"));
		//driver.get(applyURL);
		loginPage = new LoginPage(driver);
		Thread.sleep(3000);
		loginPage.enterUserName("test29@yopmail.com");
		loginPage.enterPassword("App@0000");
		//dashboardPage= 
		loginPage.clickLoginBtn();
		Thread.sleep(50000);
		//String actual=dashboardPage.getActiveLeftNavigatorTab();
		//Assert.assertEquals(actual, "Dashboard");
		
	} 
	
	

	/* @Test
	public void SignupNewUser() throws Exception {
		//Map<String, Object> userData = ppulateUniqueData(xmlUtils.getXMLNodeValues("userData"));
		//driver.get(applyURL);
		//signupPage = new SignupPage(driver);
		//Thread.sleep(3000);
		signupPage.enterEmail_id("test29@yopmail.com");
		signupPage.enterPassword("App@0000");
		signupPage.enterconfirmPassword("App@0000");
		signupPage.enterToggle_customer_agreement();
		signupPage.enterToggle_US_citizen();
		dashboardPage= signupPage.enterButton_grt_started();
		Thread.sleep(5000);
		String actual=dashboardPage.getActiveLeftNavigatorTab();
		Assert.assertEquals(actual, "Dashboard");
		
	}*/
	
	/*@Test
	public void Creategoal() throws Exception {
		//Map<String, Object> userData = ppulateUniqueData(xmlUtils.getXMLNodeValues("userData"));
		driver.get(applyURL);
		signupPage = new SignupPage(driver);
		//Thread.sleep(10000);
		signupPage.enterEmail_id("test29@yopmail.com");
		signupPage.enterPassword("App@0000");
		signupPage.enterconfirmPassword("App@0000");
		signupPage.enterToggle_customer_agreement();
		signupPage.enterToggle_US_citizen();
		dashboardPage= signupPage.enterButton_grt_started();
		Thread.sleep(5000);
		dashboardPage.dashboardicon();
		creategoalpopup.CreateAGoal();
		choosegoaltype.selectHouse_Goal_icon();
		createGoalname.enterGoalname("Home");
		createGoalDefaultimage.selectNext_button();
		Thread.sleep(5000);
		Profile.enterFirst_name("kavita");
		Profile.selectLast_name("verma");
		Profile.selectAdress_First_line("jgh");
		Profile.selectAdress_second_line("joh");
		Profile.selectCity("iuhgi");
		Profile.selectState("HJ");
		Profile.selectZip_code("56255");
		Profile.select_Next_button();
		Thread.sleep(5000);
	    personalInformationPage.selectGender_male_button();
		personalInformationPage.selectMarital_status_single();
		personalInformationPage.selectsecurity_toggle_button();
		personalInformationPage.selectMobile_phone_number("2569856985");
		personalInformationPage.selectSocial_Security_Number("258852258");
		personalInformationPage.selectDate_of_birth();
		personalInformationPage.selectNext_button();
		Thread.sleep(5000);
		Investmentpage.selectannualIncome();
		Investmentpage.select_netWorth();
		Investmentpage.selectliquidNetWorth();
		Investmentpage.select_riskTolerance();
		Investmentpage.selecttaxPercentage();
		Investmentpage.selectinvestmentObjective();
		Investmentpage.selectinvestmentExperience();
		Investmentpage.select_Next_button();
		Thread.sleep(5000);
	    Goal_date_amount.selectGoal_Date();
	    Goal_date_amount.selectgoalAmount("50000");
	    Goal_date_amount.select_Next_button();
	    Thread.sleep(15000);
	    GoalStrategies.selectNext_Button();
	    Thread.sleep(5000);
	    EmployeeDetail.selectemployment();
	    EmployeeDetail.select_Next_button();
	    Thread.sleep(5000);
	    Compliance_Information.selectbroker_dealer_yes();
	    Compliance_Information.selectstock_owner_yes();
	    Compliance_Information.selectpublic_Official_yes();
	    Compliance_Information.selectIRS_notified_Yes();
	    Compliance_Information.select_Next_button();
	    Thread.sleep(5000);
	    AccountAgreement.selectElectronicTrasactionagreementcheck_box();
	    AccountAgreement.selectCustomeragreementcheck_box();
	    AccountAgreement.selectFORMADVcheckbox();
	    AccountAgreement.selectFirstSecondNameTextbox("kavita verma");
	    AccountAgreement.selectNextbutton();
	    Thread.sleep(10000);
	    Tradier_Brokerage_popup.selectCloseicon();
	    
		 } */
	
	
	/*@Test
	public void Creategoal() throws Exception {
		//Map<String, Object> userData = ppulateUniqueData(xmlUtils.getXMLNodeValues("userData"));
		driver.get(applyURL);
		
		signupPage = new SignupPage(driver);
		Thread.sleep(5000);
		signupPage.enterEmail_id("test994@yopmail.com");
		signupPage.enterPassword("App@0000");
		signupPage.enterconfirmPassword("App@0000");
		signupPage.enterToggle_customer_agreement();
		signupPage.enterToggle_US_citizen();
		dashboardPage= signupPage.enterButton_grt_started();
		String actual=dashboardPage.getActiveLeftNavigatorTab();
		Assert.assertEquals(actual, "Dashboard");
		Thread.sleep(5000);
		
		
		creategoalpopup=dashboardPage.dashboardicon();
		Thread.sleep(2000);
		choosegoaltype=creategoalpopup.CreateAGoal();
		Thread.sleep(2000);
		createGoalname=choosegoaltype.selectHouseGoalicon();
		createGoalname.enterGoalname("Home");
		Thread.sleep(2000);
		createGoalDefaultimage =createGoalname.ClickNext();
		Thread.sleep(2000);
		Profile= createGoalDefaultimage.selectNextbutton();
		Profile.enterFirstname("kavita");
		Profile.selectLast_name("verma");
		Profile.selectAdress_First_line("jgh");
		Profile.selectAdress_second_line("joh");
		Profile.selectCity("iuhgi");
		Profile.selectState("HJ");
		Profile.selectZip_code("56255");
		personalInformationPage=Profile.selectNextbutton();
		Thread.sleep(2000);
	    personalInformationPage.selectGender_male_button();
	    Thread.sleep(2000);
		personalInformationPage.selectMarital_status_single();
		Thread.sleep(2000);
		personalInformationPage.selectsecurity_toggle_button();
		personalInformationPage.selectMobile_phone_number("2569856985");
		personalInformationPage.selectSocial_Security_Number("258852258");
		Thread.sleep(2000);
		Calendar =	personalInformationPage.selectDateofbirth();
		Thread.sleep(2000);
		Calendar.selectDate();
		Thread.sleep(2000);
		personalInformationPage =Calendar.selectDateclose();
		Thread.sleep(2000);
		Investmentpage=personalInformationPage.selectNextbutton();
		Thread.sleep(2000);
		Investmentpage.selectannualIncome();
		Investmentpage.select_netWorth();
		Investmentpage.selectliquidNetWorth();
		Investmentpage.select_riskTolerance();
		Investmentpage.selecttaxPercentage();
		Investmentpage.selectinvestmentObjective();
		Investmentpage.selectinvestmentExperience();
		Goaldateamount=Investmentpage.selectNextbutton();
		Thread.sleep(2000);
	    Goaldateamount.selectGoal_Date();
	    Goaldateamount.selectgoalAmount("50000");
	    GoalStrategies=Goaldateamount.select_Next_button();
	    Thread.sleep(15000);
	    EmployeeDetail= GoalStrategies.selectNextButton();
	    Thread.sleep(5000);
	    EmployeeDetail.selectemployment();
	    ComplianceInformation= EmployeeDetail.selectNextbutton();
	    Thread.sleep(5000);
	    ComplianceInformation.selectbroker_dealer_yes();
	    ComplianceInformation.selectstock_owner_yes();
	    ComplianceInformation.selectpublic_Official_yes();
	    ComplianceInformation.selectIRS_notified_Yes();
	    accountAgreement= ComplianceInformation.select_Next_button();
	    Thread.sleep(5000);
	    accountAgreement.selectElectronicTrasactionagreementcheck_box();
	    accountAgreement.selectCustomeragreementcheckbox();
	    accountAgreement.selectFORMADVcheckbox();
	    accountAgreement.selectFirstSecondNameTextbox("kavita verma");
	    tradierBrokeragepopup= accountAgreement.selectNextbutton();
	    Thread.sleep(10000);
	    tradierBrokeragepopup.selectCloseicon();
	    
	   
	    
		 }
	*/
	
	@Override
	public void afterTest() {
		/*
		System.out.println("after test------------->>>");
		try {
			
			//driver.get("http://demo.openaxes.com:82/App#/investigations?view=list");
			System.out.println("test1");
			driver.navigate().refresh();
			driver.findElement(By.xpath("//a[@href='./logout']/parent::li/parent::ul/preceding-sibling::a")).click();
			System.out.println("test2");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//a[@href='./logout']")).click();
		} catch (Exception e) {
			driver.manage().deleteAllCookies();
			System.out.println("test3");
		}
		driver.manage().deleteAllCookies();
		*/
	}
		
	/*

	@Override
	public void beforeClass() throws InterruptedException, Exception {
	}
	*/

}
