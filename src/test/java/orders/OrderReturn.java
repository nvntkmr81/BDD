package orders;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class OrderReturn {

    @Given("user is on orders page")
    public void user_is_on_orders_page() {
        System.out.println("Given");
    }

    @When("user enters valid {int} and clicks on get product details")
    public void user_enters_valid_and_clicks_on_get_product_details(Integer int1) {
        System.out.println("When");
    }

    @When("user clicks on return order")
    public void user_clicks_on_return_order() {
        System.out.println("And");
    }

    @Then("user is navigated to return order page and a token is generated.")
    public void user_is_navigated_to_return_order_page_and_a_token_is_generated() {
        System.out.println("Then");
    }


}
