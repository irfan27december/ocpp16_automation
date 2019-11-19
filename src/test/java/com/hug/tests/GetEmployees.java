/**
 * 
 */
package com.hug.tests;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.hug.utils.ReadProperties;
import com.hug.utils.RESTCalls;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;


/**
 * @author irfan
 *
 */
public class GetEmployees {
	Response response;
	ReadProperties property = new ReadProperties();
	private static Logger log = LogManager.getLogger(GetEmployees.class.getName());
	
	@Parameters({ "firstName" })
	@Test(priority = 1)
	public void getSingleEmployeeDetails(@Optional("Irfan") String firstName) {
		log.info("Starting getSingleEmployeeDetails Test");
		response = RESTCalls.GETRequest(property.getPropertyValue("baseURI"), property.getPropertyValue("employeeResource") 
				+ property.getPropertyValue("userID"));
		//System.out.println("Complete response :" + response.asString());
		//System.out.println("Does response contains 'employee_name'? :" + response.asString().contains("employee_name"));
		Assert.assertEquals(response.getStatusCode(), Integer.parseInt(property.getPropertyValue("statusCode200")));
		Assert.assertEquals(response.asString().contains("employee_name"), true);

		// First get the JsonPath object instance from the Response interface
		JsonPath jsonPathEvaluator = response.jsonPath();

		// Then simply query the JsonPath object to get a String value of the node
		// specified by JsonPath: id (Note: You should not put $. in the Java code)
		String id = jsonPathEvaluator.get("id");

		// Print the ID 
		System.out.println("Employee ID is:" + id);
	}
	
	@Test(priority = 2)
	public void getAllEmployeeDetails(){
		log.info("Starting getAllEmployeeDetails Test");
		//System.out.println(" Test   "+property.getPropertyValue("baseURI")+property.getPropertyValue("employeesResource"));
		response = RESTCalls.GETRequest(property.getPropertyValue("baseURI"), property.getPropertyValue("employeesResource"));
		//System.out.println("Complete response :" + response.asString());
		Assert.assertEquals(response.getStatusCode(), Integer.parseInt(property.getPropertyValue("statusCode200")));
	}
	
}
