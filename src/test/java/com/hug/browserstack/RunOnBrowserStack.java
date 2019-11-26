package com.hug.browserstack;





import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.remote.DesiredCapabilities;

import org.openqa.selenium.remote.RemoteWebDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;



import java.io.IOException;

import java.net.URL;

import java.util.concurrent.TimeUnit;



public class RunOnBrowserStack {



	public static final String USERNAME = "mohammedirfanahm2";

	public static final String AUTOMATE_KEY = "SqGmQ2BHrLMXPrUDZihk";

	public static final String URL = "http://" + USERNAME + ":" + AUTOMATE_KEY + "@hub.browserstack.com/wd/hub";

	public static WebDriver driver=null;



	public static void main(String[] args) throws Exception {


		//Generate below code for capabilities from https://www.browserstack.com/automate/capabilities
		DesiredCapabilities caps = new DesiredCapabilities();

		caps.setCapability("browser", "Chrome");

		caps.setCapability("browser_version", "78.0");

		caps.setCapability("os", "Windows");

		caps.setCapability("os_version", "8.1");

		caps.setCapability("browserstack.debug", "true");



		driver = new RemoteWebDriver(new URL(URL), caps);

		driver.get("https://timetracker.anuko.com/login.php");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// maximize the window.

		driver.manage().window().maximize(); 

		//WebElement enterusername=driver.findElement(By.id("login"));
		
		WebElement enterusername=driver.findElement(By.xpath("//input[@id='login']"));
		

		waitforelement(enterusername);

		// if success then enter data to username

		enterusername.sendKeys("guest");

		//WebElement enterpwd=driver.findElement(By.id("password"));
		
		WebElement enterpwd=driver.findElement(By.xpath("//input[@id='password']"));

		waitforelement(enterpwd);

		// if success then enter data to username

		enterpwd.sendKeys("guest");

		// to click on button 

		//WebElement loginbtn=driver.findElement(By.id("btn_login"));

		WebElement loginbtn=driver.findElement(By.xpath("//input[@id='btn_login']"));

		waitforelement(loginbtn);

		// if success then enter data to username

		loginbtn.click();

		Thread.sleep(5000);

		driver.close();



	}



	public static String waitforelement(WebElement element) throws IOException{

		String msg;

		try {

			WebDriverWait wait = new WebDriverWait(driver, 30);

			// below method will check for visibility of the element i.e in this case its username element 

			wait.until(ExpectedConditions.visibilityOf(element));

			msg="PASS";

			System.out.println(msg);

		} catch (Exception e) {

			System.out.println("waitForElementPresent method failed! "+ e.getMessage());

			msg="FAIL -waitForElementPresent method failed! "+ e.getMessage() ;

		}

		return msg;

	}



}