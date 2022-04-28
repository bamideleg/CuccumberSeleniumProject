package Test_Execution;


// Shortcut
// Crtl + K - used to commit a code
// Alt = 9 - to view git log
// To open your branches window ( Crtl + Shift + A)

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Map;



public class jobsearchParamMap {



    WebDriver driver = null;

    @Given("that I on navigate to https:\\/\\/www.jobserve.com\\/gb\\/en\\/Job-Search\\/")
    public void that_i_on_navigate_to_https_www_jobserve_com_gb_en_job_search() {
        String projectPath = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", projectPath+"\\src\\test\\BrowserDrivers\\chromedriver.exe");
        driver = new ChromeDriver();


        driver.get("https://www.jobserve.com/");
        System.out.println("User open the browser");

    }
    // To commit a code, simply enter (Crtl + K
    @When("I entered the jobType and Location")
    public void i_entered_the_job_type_and_location(io.cucumber.datatable.DataTable testData) {

        Map<String,String> testDataAsMap = testData.asMap(String.class, String.class);

        driver.findElement(By.name("ctl00$main$srch$ctl_qs$txtKey")).sendKeys(testDataAsMap.get("jobType"));
        driver.findElement(By.name("ctl00$main$srch$ctl_qs$txtLoc")).sendKeys(testDataAsMap.get("location"));

        System.out.println("User enter job type and location");
        System.out.println(" Map data table code development is in progress");
    }
    @And("click on search submit button")
    public void click_on_search_submit_button() {
        driver.findElement(By.name("ctl00$main$srch$ctl_qs$btnSearch")).click();
    }

    @Then("I should see the jobs in the location")
    public void i_should_see_the_jobs_in_the_location() {

    }

    @And("close the browser5")
    public void close_the_browser5() {
        driver.close(); // bug fix
        System.out.println("Worked on the hotfixes");
        // Unit testing is completed on the feature
        // Deploy the code to system testing environment

    }

}
