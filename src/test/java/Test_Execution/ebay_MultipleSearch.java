package Test_Execution;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ebay_MultipleSearch<driver> {

    WebDriver driver;

    @Given("user open https:\\/\\/www.jobserve.com\\/")
    public void user_open_https_www_jobserve_com() {

        String projectPath = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", projectPath+"\\src\\test\\BrowserDrivers\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("https://www.jobserve.com/");
        System.out.println("Open the browser");

    }
    @When("enter JobType and location")
    public void enter_job_type_and_location() {
        driver.findElement(By.name("ctl00$main$srch$ctl_qs$txtKey")).sendKeys("Project Manager ");
        driver.findElement(By.name("ctl00$main$srch$ctl_qs$txtLoc")).sendKeys("London");
        System.out.println("Enter job type and location");

    }
    @When("click on search button")
    public void click_on_search_button() {
        driver.findElement(By.name("ctl00$main$srch$ctl_qs$btnSearch")).click();
        System.out.println("Click on search button");
    }

    @Then("I should see the number of jobs available")
    public void i_should_see_the_number_of_jobs_available() {
        String JobSearchResult =driver.findElement(By.cssSelector(".cutout2")).getText();
        System.out.println("The number of jobs for project Manager" + JobSearchResult );
        System.out.println("I should see the related jobs");
    }
    @Then("close the browser3")
    public void close_the_browser3() {
        driver.quit();
        System.out.println("User close the browser");

    }
    @When("enter {string} and {string}")
    public void enter_and(String JobType, String location) {
        driver.findElement(By.name("ctl00$main$srch$ctl_qs$txtKey")).sendKeys(JobType);
        driver.findElement(By.name("ctl00$main$srch$ctl_qs$txtLoc")).sendKeys(location);

        System.out.println("Test with multiple data set ");
    }
    @Then("close the browser4")
    public void close_the_browser4() {
        driver.quit();
        System.out.println("User close the browser4");
    }


}

