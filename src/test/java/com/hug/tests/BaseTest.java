package com.hug.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.hug.utils.ReadProperties;



/**
 * @author irfan
 *
 */


public class BaseTest {
	public static WebDriver driver = null;
	ReadProperties properties = new ReadProperties();
	public static final String testDataExcelFileName = "testdata.xlsx";
	/**
	 * @author irfan
	 * Method to setup browser
	 */
	@Parameters({"brower", "driverPath"})
	@BeforeSuite
	public void setUp(@Optional("chrome") String browser, @Optional("C:\\Selenium\\drivers\\chromedriver.exe") String driverPath){
		if(browser.equalsIgnoreCase(browser)){
			System.setProperty("webdriver.chrome.driver", driverPath);
			driver = new ChromeDriver();
			//driver.get("http://automationpractice.com/index.php");
			driver.get(properties.getPropertyValue("url"));
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
		}else{

		}

	}

	
	//Method to close browser
	@AfterSuite
	public void tearDown(){
		driver.close();
		driver.quit();
	}


}