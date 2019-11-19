/**
 * 
 */
package com.hug.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.seleniumhq.jetty9.servlet.jmx.HolderMBean;

/**
 * @author irfan
 *
 */


public class HomePage{
	WebDriver driver;

	//Constructor
	public HomePage(WebDriver driver){
		this.driver=driver;
		//PageFactory.initElements(driver, HomePage.class);
	}
	
	//Using FindBy for locating elements
	//@FindBy(linkText = "Sign in") WebElement signInLink;
	
	@FindBy(xpath = "//a[contains(.,'Sign in')]") WebElement signInLink;
	
	@FindBy(id = "login_form") WebElement loginForm;
	
	//Method to click Sign In link
	public void clickSignInLink(){
		if(signInLink.isDisplayed()){
			System.out.println("Sign in link is displayed...");
			signInLink.click();
		}else{
			System.out.println("Sign in link is not  displayed...");
		}
		if(loginForm.isDisplayed()){
			System.out.println("Login form is displayed...");
		}else{
			System.out.println("Login form is not displayed...");
		}
	}
	
}