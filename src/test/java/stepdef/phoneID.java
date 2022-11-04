package stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class phoneID {
	Response res;
	ValidatableResponse validate;
	@Given("User Want to get  Data from database by phone")
	public void user_want_to_get_data_from_database_by_phone() {
	   
	}

	@When("User is able to get data by phoneID from URI {string}")
	public void user_is_able_to_get_data_by_phone_id_from_uri(String string) {
		res=RestAssured.get(string);
	}

	@Then("User should get a Status Code {int}")
	public void user_should_get_a_status_code(Integer int1) {
		validate=res.then();
		   validate.assertThat().statusCode(int1).log().all();
	}

}
