package Test_Execution;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;
//import org.testng.Assert;

import static org.testng.Assert.*;

public class EbayHomepagelogo {

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
        Boolean status = driver.findElement(By.id("gh-logo")).isDisplayed();
       // Assert.assertArrayEquals(true, status);

        System.out.println(status);

    }
    @And("close the browser")
    public void close_the_browser() {
       driver.close();
        System.out.println("close the browser");

    }
// Work on the feature-branch 2.1 - Add search functionality code
    @When("I enter product name as shirt")
    public void i_enter_product_name_as_shirt() {
       driver.findElement(By.name("_nkw")).sendKeys("book");
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
}

// You can add to 10 test scenarios