package stepdef;

import org.json.simple.JSONObject;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class postmethod {
	RequestSpecification req;
	Response res;
	ValidatableResponse val;
	@Given("User Want to post Data into database")
	public void user_want_to_post_data_into_database() {
	    JSONObject jobj=new JSONObject();
	    jobj.put("email", "nai@gmail.com");
		  jobj.put("id", 33);
		 jobj.put("name", "Pritiii");
		  jobj.put("password", "tytd23");
		 jobj.put("phone", 888765331);
	  req=RestAssured.given()
			  .body(jobj)
			  .contentType(ContentType.JSON);
	}

	@When("User is able to put data into URI {string}")
	public void user_is_able_to_put_data_into_uri(String uri) {
	   res=req.post(uri);
	    
	}

	@Then("User want to check the StatusCode {int}")
	public void user_want_to_check_the_status_code(Integer statusCode) {
	    val=res.then();
	    val.assertThat().statusCode(statusCode);
}}
