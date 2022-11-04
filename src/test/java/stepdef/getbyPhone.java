package stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class getbyPhone {
	Response res;
	ValidatableResponse validate;
	
	@Given("User Want to get  Data from database")
	public void user_want_to_get_data_from_database() {
	    
	}

	@When("User is able to get data by phone from URI {string}")
	public void user_is_able_to_get_data_by_phone_from_uri(String url) {
		 res=RestAssured.get(url);
	}

	@Then("User should get Status Code {int}")
	public void user_should_get_status_code(Integer int1) {
		 validate=res.then();
		   validate.assertThat().statusCode(int1).log().all();
	}

}
