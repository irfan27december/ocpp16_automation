/**
 * 
 */
package com.hug.utils;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

/**
 * @author irfan
 *
 */
public class RESTCalls {

	/*
	 * This call will be responsible to fire requests
	 */

	private static Logger log = LogManager.getLogger(RESTCalls.class.getName());

	public static Response GETRequest(String URI, String resourceName) {
		log.info("Inside GETRequest Call...");
		RestAssured.baseURI = URI;
		Response response = null;
		try{
			response = RestAssured.given()
					.contentType(ContentType.JSON)
					.when()
					.get(resourceName);
		}catch(Exception e){
			e.printStackTrace();
		}
		return response;
	}

}
