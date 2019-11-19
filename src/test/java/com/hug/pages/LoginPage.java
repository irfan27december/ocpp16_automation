/**
 * 
 */
package com.hug.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.hug.utils.ReadProperties;



 

/**
 * @author irfan
 *
 */
public class LoginPage {
	WebDriver driver;
	ReadProperties properties = new ReadProperties();

	//Constructor
	public LoginPage(WebDriver driver){
		this.driver = driver;		
	}

	//Using FindBy for locating elements
	@FindBy(id = "email") WebElement emailField;
	@FindBy(id = "passwd") WebElement passwordField;
	@FindBy(id = "SubmitLogin") WebElement signInButton;

	//Method to type email in Email field
	public void setEmailAddress(){
		emailField.click();
		emailField.clear();
		emailField.sendKeys(properties.getPropertyValue("userName"));		
	}


	//Method to type password in Password field
	public void setPassword(){
		passwordField.click();
		passwordField.clear();
		passwordField.sendKeys(properties.getPropertyValue("password"));		
	}
	
	//Method to click Sign In button
	public void clickSignInButton(){
		if(signInButton.isDisplayed() && signInButton.isEnabled()){
			signInButton.click();
			System.out.println("Sign In button is clicked successfully...");
		}else{
			System.out.println("Failed to click Sign In button...");
		}
	}
	
	//Method to Sign In
	public void signInMethod(){
		setEmailAddress();
		setPassword();
		clickSignInButton();
		verifyUserNameAfterSignIn();
	}
	
	//Verify user name after signing in
	public void verifyUserNameAfterSignIn(){
		//String actualUserName = driver.findElement(By.xpath("/div[@class='header_user_info']/a[@class='account']/span")).getText();
		String actualUserName = driver.findElement(By.xpath("//div[@class='header_user_info']")).getText();
		//System.out.println("Actual user name "+actualUserName);
		String expectedUserName = "Mohammed Irfan Ahmed";
		Assert.assertEquals(expectedUserName, actualUserName,"Logged in successfully...");
	}

}
