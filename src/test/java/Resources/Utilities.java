package Resources;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Utilities {
	RequestSpecification req;
	public RequestSpecification requestSpecBuilder() {
		
	 req=new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com").setContentType(ContentType.JSON).
		addQueryParam("key", "qaclick123").build();
	 return req;
	}

	
	public ResponseSpecification responseSpecBuilder() {
		
		 ResponseSpecification res=(ResponseSpecification) new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON);
		 return res;
	}
	
	
}
