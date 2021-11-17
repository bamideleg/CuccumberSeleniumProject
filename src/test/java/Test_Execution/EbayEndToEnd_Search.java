package Test_Execution;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class EbayEndToEnd_Search {

    WebDriver driver;

    @Given("I navigate to https:\\/\\/www.ebay.co.uk\\/")
    public void i_navigate_to_https_www_ebay_co_uk() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\New folder\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.ebay.co.uk/");
        System.out.println("Open the browser");

    }

    @Then("I should see the EBY logo")
    public void i_should_see_the_eby_logo() {
        Boolean Status = driver.findElement(By.id("gh-logo")).isDisplayed();
        System.out.println("Status");

    }
    @And("close the browser")
    public void close_the_browser() {
       driver.close();
        System.out.println("close the browser");

    }
// Work on the feature-branch 2.1 - Add search functionality code
    @When("I enter product name as shirt")
    public void i_enter_product_name_as_shirt() {
       driver.findElement(By.name("_nkw")).sendKeys("Shirt");
       driver.findElement(By.id("gh-btn")).click();
    }
    @Then("system should display item_Count")
    public void system_should_display_item_count() {
        String productCount =driver.findElement(By.cssSelector(".srp-controls__count-heading")).getText();

    }
    @Then("close the browser2")
    public void close_the_browser2() {
        driver.close();
    }

    @When("I enter more than one product as {string}")
    public void i_enter_more_than_one_product_as(String Product) {
        driver.findElement(By.name("_nkw")).sendKeys(Product);
        driver.findElement(By.id("gh-btn")).click();

    }
    @Then("system should display items count for each product")
    public void system_should_display_items_count_for_each_product() {
        String productCount =driver.findElement(By.cssSelector(".srp-controls__count-heading")).getText();
        System.out.println(" The item count is " + productCount);
    }
    @Then("close the browser3")
    public void close_the_browser3() {
        driver.close();
    }
}

// Code development is progress
