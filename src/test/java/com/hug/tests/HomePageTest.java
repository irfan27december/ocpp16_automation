/**
 * 
 */
package com.hug.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.hug.pages.HomePage;

/**
 * @author irfan
 *
 */
public class HomePageTest extends BaseTest{
	
	@Test
	public void openSignInPage() throws InterruptedException{
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		homePage.clickSignInLink();
		Thread.sleep(5000);
	}

}
