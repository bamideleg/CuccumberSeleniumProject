package Test_Execution;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;

public class EbayHomepagelogo {

    WebDriver driver;

    @Given("I navigate to https:\\/\\/www.ebay.co.uk\\/")
    public void i_navigate_to_https_www_ebay_co_uk() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Open the browser");

    }
    @Then("I should see the EBY logo")
    public void i_should_see_the_eby_logo() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Logo is present");

    }
    @And("close the browser")
    public void close_the_browser() {
       System.out.println("close the browser");
    }

}
