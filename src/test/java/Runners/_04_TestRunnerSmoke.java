package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
        tags = "@Smoke",
        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefinitions"},
        plugin ={"json:target/cucumber/cucumber.json"}
)
public class _04_TestRunnerSmoke extends AbstractTestNGCucumberTests {

}
