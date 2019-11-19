/**
 * 
 */
package com.hug.tests;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.hug.pages.HomePage;
import com.hug.pages.LoginPage;

/**
 * @author irfan
 *
 */

public class LoginPageTest extends BaseTest {
	Logger log = Logger.getLogger("rootLogger");
	@Test
	public void signInToApp() throws InterruptedException{
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		homePage.clickSignInLink();
		Thread.sleep(5000);
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		log.debug("Accessing signin page");
		loginPage.signInMethod();
	}

}
