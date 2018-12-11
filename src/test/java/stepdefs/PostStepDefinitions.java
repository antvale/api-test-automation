package stepdefs;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;


import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;


public class PostStepDefinitions {

    private Response response;
    private ValidatableResponse json;
    private RequestSpecification request;
    private String ENDPOINT_GET_POSTS = "https://jsonplaceholder.typicode.com/posts";


    @Given("almost a post exists")
    public void almost_a_post_exists() {
        // Write code here that turns the phrase above into concrete actions
        request=given();
    }

    @When("a user retrieves all the list of posts")
    public void user_retrieves_all_posts(){
        response = request.when().get(ENDPOINT_GET_POSTS);
        System.out.println("response: " + response.prettyPrint());
    }

    @Then("the status code of the posts is (\\d+)$")
    public void status_code_post_is (int statusCode){
        json = response.then().statusCode(statusCode);
    }

    @And("response includes (\\d+) items")
    public void response_length (int length){
        json.body("size()", equalTo(length));
        }


}