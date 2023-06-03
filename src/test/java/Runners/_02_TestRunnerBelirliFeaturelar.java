package Runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
            features = {"src/test/java/FeatureFiles/_01_Login.feature", "src/test/java/FeatureFiles/_02_Countries.feature"},
            // buraya .feature files ın path'ini yapıştırıyoruz
            glue = {"StepDefinitions"} // Step Definitions klasorünün adını yazıyoruz.

)
         public class _02_TestRunnerBelirliFeaturelar extends AbstractTestNGCucumberTests{
}
