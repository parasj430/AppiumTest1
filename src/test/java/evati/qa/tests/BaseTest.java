package evati.qa.tests;

import java.io.File;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;
import java.util.Random;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.reporters.XMLUtils;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public abstract class BaseTest {
	
	//public static RemoteWebDriver driver;
	public static AppiumDriver driver;
	//public static RemoteWebDriver driver; 
	public XMLUtils xmlUtils;
	public Map<String, Object> jobDetails;
	public String applyURL;

	private String originalHandle;
protected ExtentReports extent;
 protected ExtentTest logger;
 public BaseTest() {
	// reports = new ExtentReports("src\\test\\resources\\Reports\\reports.html");
 }
	@BeforeClass
	void test() throws MalformedURLException, InterruptedException {
		
DesiredCapabilities caps = new DesiredCapabilities();
		
     caps.setCapability(CapabilityType.BROWSER_NAME, " ");
		caps.setCapability("deviceName", "Galaxy on8");
		
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "8.0.0");
		caps.setCapability("appPackage", "com.elevation.evati");
		caps.setCapability("appActivity", "com.elevation.evati.MainActivity");
		caps.setCapability("noReset", "true");
		
		//Instantiate Appium Driver
		
			 
   /* caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
    caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.0");
    caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
    caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome"); */
	
	
	      //iOS mobile web automation
			
	/*		 caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
			 caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.0");
			 caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Safari");
			 caps.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 8");
    */
		
		//driver = new RemoteWebDriver(new URL("http://127.0.0.1:4725/wd/hub"), caps);
		driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), caps);
		//driver = new AndroidDriver(new URL("http://127.0.0.1:4725/wd/hub"), caps);
	}
	@AfterClass
	public void afterMainClass() {
		driver.quit();
	}


	@AfterTest
	public void afterMainTest() {

	}

	@BeforeMethod
	public void beforeMethod(Method method) {
		Reporter.log("<br>****************************************************************************************",
				true);
		Reporter.log("<br>****************************************************************************************",
				true);
		Reporter.log("<br>$$$$$$$$$$$$$$$$$$$        " + method.getName() + "        $$$$$$$$$$$$$$$$$$$$$$$", true);
		Reporter.log("<br>****************************************************************************************",
				true);
		Reporter.log("<br>****************************************************************************************",
				true);
	}

	@AfterMethod
	public void afterMethod(Method method) {
		afterTest();
		Reporter.log("<br>XXXXXXXXXXXXXXXXXXXXXXX             " + "-E---N---D-" + "             XXXXXXXXXXXXXXXXXXXXXX",
				true);
		Reporter.log("<br>", true);
		for (String handle : driver.getWindowHandles()) {
			if (!handle.equals(originalHandle)) {
				driver.switchTo().window(handle);
				driver.close();
			}
		}
		driver.switchTo().window(originalHandle);
	}
	

	public Map<String, Object> populateUniqueData(Map<String, Object> data) {
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String uid = "";
		Random random = new Random();
		for (int i = 0; i < 8; i++) {
			char c = alphabet.charAt(random.nextInt(26));
			uid += c;
		}
		for (Entry<String, Object> entry : data.entrySet()) {
			if (entry.getValue().toString().contains("UNIQUE")) {
				data.put(entry.getKey(), entry.getValue().toString().replaceAll("UNIQUE", uid));
			} else {
				data.put(entry.getKey(), entry.getValue().toString());
			}
		}
		return data;
	}
/*
	public static RemoteWebDriver getDriver(){
		return driver;
	}

	//public abstract void afterTest();

	public void beforeClass() throws InterruptedException, Exception {
		// TODO Auto-generated method stub
		
	}
*/
	public abstract void afterTest();
	public static AppiumDriver getDriver() {
		// TODO Auto-generated method stub
		return null;
	} 
	

	
	// public abstract void beforeTest();

	// public abstract void afterTest();



}
