package stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class getByIdName {
	Response res;
	ValidatableResponse validate;
	@Given("User Want to get the Data from database")
	public void user_want_to_get_the_data_from_database() {
	  
	}

	@When("User is able to get data by id from URI {string}")
	public void user_is_able_to_get_data_by_id_from_uri(String string) {
		res=RestAssured.get(string);
	}

	@Then("User want to get Status Code {int}")
	public void user_want_to_get_status_code(Integer int1) {
		validate=res.then();
		   validate.assertThat().statusCode(int1).log().all();
	}

}
