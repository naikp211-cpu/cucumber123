package stepdef;

import org.json.simple.JSONObject;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class PutMethod {
	RequestSpecification req;
	Response res;
	ValidatableResponse val;
	@Given("User wants to put data into database")
	public void user_wants_to_put_data_into_database() {
	    JSONObject jobj=new JSONObject();
	    jobj.put("email", "naikps@gmail.com");
		  jobj.put("id", 33);
		 jobj.put("name", "Prarthna");
		  jobj.put("password", "poo23");
		 jobj.put("phone", 888765631);
		 req=RestAssured.given()
				  .body(jobj)
				  .contentType(ContentType.JSON);
	}

	@When("User is able to put the data into URI {string}")
	public void user_is_able_to_put_the_data_into_uri(String string) {
	 res=req.post(string);
	    
	}

	@Then("User should be able to get the statusCode {int}")
	public void user_should_be_able_to_get_the_status_code(Integer int1) {
	   val=res.then();
	   val.assertThat().statusCode(int1).log().all();
	   
	}
}
