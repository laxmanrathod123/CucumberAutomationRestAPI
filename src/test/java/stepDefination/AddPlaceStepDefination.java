package stepDefination;
import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

import Resources.TestDataBuilder;
import Resources.Utilities;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class AddPlaceStepDefination extends Utilities {
	RequestSpecification req1;
	ResponseSpecBuilder res;
	Response response;
	ResponseSpecification resspec;

	TestDataBuilder data = new TestDataBuilder();
	@Given("User add the payload")
	public void user_add_the_payload() {
	 req1=given().log().all().spec(requestSpecBuilder()).body(data.addplacepayload());
	 resspec=new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();

	}
	@When("User call  {string} payload with http post request")
	public void user_call_payload_with_http_post_request(String string) {
  	response= req1.when().post("/maps/api/place/add/json").then().spec(resspec).extract().response();
	
	}
	@Then("User API call got sucess with status code {int}")
	public void user_api_call_got_sucess_with_status_code(Integer expectedStatuscode) {
		int ActualStatusCode=response.getStatusCode();
		System.out.println("ActualStatusCode : " + ActualStatusCode);
		assertEquals(response.getStatusCode(), expectedStatuscode);
	
	}
	@And("{string} in response body is {string}")
	public void in_response_body_is(String keyvalue, String expectedKeyvalue) {
		
		String resp=response.asString();
		JsonPath js= new JsonPath(resp);
		String actualkeyvalue=js.get(keyvalue).toString();
		System.out.println("keyvalue : " + keyvalue);
		System.out.println("actualkeyvalue : " + actualkeyvalue);
		System.out.println("expectedKeyvalue : " + expectedKeyvalue);
		
		assertEquals(actualkeyvalue, expectedKeyvalue);
		
		
	
	}
	

}
