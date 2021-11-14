package Test_Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
    @CucumberOptions(

        features = "Features",
        glue = {"TestExecution"},
        plugin = {"pretty","html:test-outout"},
        monochrome = true,
        dryRun = false

    )
public class CucumberRunner {

}
