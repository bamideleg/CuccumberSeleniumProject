package Test_Execution;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;


public class extentReport {


    ExtentHtmlReporter htmlReporter;
    ExtentReports extent;
    WebDriver driver;

    @BeforeSuite
    public void setup() throws Exception {

        htmlReporter = new ExtentHtmlReporter("extent.html");
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);

        }
        @BeforeTest
        public  void setupTest() throws IOException {

            // creates a toggle for the given test, adds all log events under it
            ExtentTest test = extent.createTest("As user I want to navigate to job search homepage", "Sample description");

            String projectPath = System.getProperty("user.dir");
            System.setProperty("webdriver.chrome.driver", projectPath+"\\src\\test\\BrowserDriver\\chromedriver.exe");
            driver = new ChromeDriver();

            driver.get("https://www.jobserve.com/");
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            //   driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
            System.out.println("Open the browser");

            driver.manage().window().maximize();
            System.out.println("Open the browser");
            String urlTitle =  driver.getCurrentUrl();
            System.out.println(urlTitle);
            test.pass("navigated to homepage");


            test.log(Status.INFO, "This step shows usage of log(status, details)");
            // info(details)
            test.info("This step shows usage of info(details)");
            // log with snapshot
            test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());

            // test with snapshot
            test.addScreenCaptureFromPath("screenshot.png");

        }
        @Test
        public  void Test1() throws IOException {

            // creates a toggle for the given test, adds all log events under it
            ExtentTest test = extent.createTest("As user I want to navigate to job search homepage", "Sample description");

            driver.findElement(By.name("ctl00$main$srch$ctl_qs$txtKey")).sendKeys("Project Manager ");
            driver.findElement(By.name("ctl00$main$srch$ctl_qs$txtLoc")).sendKeys("London");
            driver.findElement(By.name("ctl00$main$srch$ctl_qs$btnSearch")).click();
            System.out.println("Click on search button");

            System.out.println("Enter job type and location");

            test.pass("As user I want to search for job");
            // log(Status, details)

            // log(Status, details)
            test.log(Status.INFO, "This step shows usage of log(status, details)");
            // info(details)
            test.info("This step shows usage of info(details)");
            // log with snapshot
            test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());

            // test with snapshot
            test.addScreenCaptureFromPath("screenshot.png");
        }

    @Test
    public  void Test2() throws IOException {

        // creates a toggle for the given test, adds all log events under it
        ExtentTest test = extent.createTest("As user I want to navigate to job search homepage", "Sample description");

        String JobSearchResult =driver.findElement(By.cssSelector(".cutout2")).getText();
        System.out.println("The number of jobs for project Manager" + JobSearchResult );
        System.out.println("I should see the related jobs");

        test.log(Status.INFO, "This step shows usage of log(status, details)");
        // info(details)
        test.info("This step shows usage of info(details)");
        // log with snapshot
        test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());

        // test with snapshot
        test.addScreenCaptureFromPath("screenshot.png");


    }

    @Test
    public  void Test3() throws IOException {

        // creates a toggle for the given test, adds all log events under it
        ExtentTest test = extent.createTest("As user I want to navigate to job search homepage", "Sample description");

        driver.findElement(By.name("ctl00$main$srch$ctl_qs$txtKey")).sendKeys("Project Manager ");
        driver.findElement(By.name("ctl00$main$srch$ctl_qs$txtLoc")).sendKeys("London");
        driver.findElement(By.name("ctl00$main$srch$ctl_qs$btnSearch")).click();
        System.out.println("Click on search button");

        System.out.println("Enter job type and location");

        test.pass("As user I want to search for job");
        // log(Status, details)

        // log(Status, details)
        test.log(Status.INFO, "This step shows usage of log(status, details)");
        // info(details)
        test.info("This step shows usage of info(details)");
        // log with snapshot
        test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());

        // test with snapshot
        test.addScreenCaptureFromPath("screenshot.png");
    }


    @AfterTest
        public void tearDownTest() {
        driver.quit();

        System.out.println("Close the browser");
        // calling flush writes everything to the log file
        extent.flush();

        }
        @AfterSuite
        public void tearDown() {

            // calling flush writes everything to the log file
            extent.flush();

        }
}

