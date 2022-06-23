package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        publish = true,
        features = "src/test/resources/features",
        glue = {"StepDefinitions"},
        dryRun = false,
        plugin = {"pretty", "html:target/cucumber-reports"},
        monochrome = true
)

public class TestRunner {}
