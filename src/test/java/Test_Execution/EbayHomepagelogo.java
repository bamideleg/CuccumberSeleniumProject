package Test_Execution;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

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
        Boolean Status = driver.findElement(By.id("gh-logo")).isDisplayed();
        System.out.println("Status");

    }
    @And("close the browser")
    public void close_the_browser() {
       driver.close();
        System.out.println("close the browser");

    }
}
