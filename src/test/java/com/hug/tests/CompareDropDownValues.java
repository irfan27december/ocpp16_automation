package com.hug.tests;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CompareDropDownValues {
	@Test
	public void verifyDropdowns() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://chercher.tech/practice/dropdowns");
		// original dropdown
		//Find the dropdown Element using FindElement method in selenium
		WebElement originalDropdown = driver.findElement(By.cssSelector("select#first"));

		//Create an object for Select class
		Select original = new  Select(originalDropdown);

		//get all the values present in the dropdown to compare the values. So use getOptions() methods from Select class object
		//Store the list of values using ArrayList in a variable originalListElements
		List<WebElement> originalListElements = original.getOptions();
		System.out.println("No.of items in dropdown 1: "+originalListElements.size());

		//Iterate the option that you have received and get the text from all the options and store in a List originalList
		List<String> originalList = new ArrayList<String>();
		for (WebElement webElement : originalListElements) {
			originalList.add(webElement.getText());
		}

		// target dropdown
		WebElement targetDropdown = driver.findElement(By.id("order-same"));
		Select target = new  Select(targetDropdown);
		List<WebElement> targetListElements = target.getOptions();
		System.out.println("No.of items in dropdown 2: "+targetListElements.size());
		List<String> targetList = new ArrayList<String>();
		for (WebElement webElement : targetListElements) {
			targetList.add(webElement.getText());
		}
		Assert.assertEquals(originalList, targetList);
		driver.quit();
	}
}
