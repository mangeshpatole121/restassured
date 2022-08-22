package test;

import static io.restassured.RestAssured.*;
//import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Putpatchdelete 
{
	
	@Test
	public void test_put()
	{
		JSONObject request = new JSONObject();
		
		request.put("name", "mangesh");
		request.put("job", "test Engineer");
		System.out.println(request.toJSONString());
		
		baseURI="https://reqres.in/api";
		
		given().
		header("Content-Type","application/json").
			contentType(ContentType.JSON).accept(ContentType.JSON).
			body(request.toJSONString()).
			when().
			put("/users/2").
		
			then().
			statusCode(200).log().all();
				
				
				
	}
	
	

	
	@Test
	public void test_patch()
	{
		JSONObject request = new JSONObject();
		
		request.put("name", "mangesh");
		request.put("job", "test Engineer");
		System.out.println(request.toJSONString());
		
		baseURI="https://reqres.in";
		
		given().
		header("Content-Type","application/json").
			contentType(ContentType.JSON).accept(ContentType.JSON).
			body(request.toJSONString()).
			when().
			patch("/api/users/2").
		
			then().
			statusCode(200).log().all();		
				
				
	}
	

	@Test
	public void test_delete()
	{
		
		baseURI="https://reqres.in";
		
		
			when().
			delete("/api/users/2").
		
			then().
			statusCode(204).log().all();		
				
				
	}	
	
	
	
	
}
