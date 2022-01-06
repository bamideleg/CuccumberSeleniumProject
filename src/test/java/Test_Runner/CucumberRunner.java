package Test_Runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
    @CucumberOptions(

        features = "Features",
        glue = {"TestExecution"},
 //       plugin = {"pretty","html:target/HtmlReports"},
            plugin = {"pretty",
                    "html:target/cucumber",
                    "json:target/cucumber/test-report.json",
                    "junit:target/cucumber/test-report.xml"},
        monochrome = true,
        dryRun = false

    )
public class CucumberRunner {

}
