package stepdefs;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.equalTo;

import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;



public class AlbumStepDefinitions {

    private Response response;
    private ValidatableResponse json;
    private RequestSpecification request;
    private String ENDPOINT_GET_ALBUM_BY_CODE = "https://jsonplaceholder.typicode.com/albums";

    @Given("an album exists")
    public void an_album_exists(){
        request = given();
    }

    @When("a user retrieves the album by code (.*)")
    public void user_retrieve_album_by_code(String code){
        response = request.when().get(ENDPOINT_GET_ALBUM_BY_CODE+"/"+code);
        System.out.println("response: " + response.prettyPrint());
    }

    @Then("the status code is (\\d+)")
    public void the_status_code_is(int statusCode) {
        json = response.then().statusCode(statusCode);
    }

    @And("the response includes the following$")
    public void response_equals(Map<String,String> responseFields){
        for (Map.Entry<String, String> field : responseFields.entrySet()) {
            if(StringUtils.isNumeric(field.getValue())){
                json.body(field.getKey(), equalTo(Integer.parseInt(field.getValue())));
            }
            else{
                json.body(field.getKey(), equalTo(field.getValue()));
            }
        }
    }


    /* AUTO-GENERATED

    Given("^an album exists with a code (\\d+)$", (Integer arg1) -> {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
});

When("^a user retrieves the album by code$", () -> {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
});

Then("^the status code is (\\d+)$", (Integer arg1) -> {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
});

Then("^the response includes the following$", (DataTable arg1) -> {
    // Write code here that turns the phrase above into concrete actions
    // For automatic transformation, change DataTable to one of
    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
    // E,K,V must be a scalar (String, Integer, Date, enum etc)
    throw new PendingException();
});

     */

}