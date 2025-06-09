package runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
            features = {"src/test/resources/features/F1.feature"},
            glue = {"stepdefinitions", "hooks"},
           plugin = {"pretty", "html:target/cucumber1.html"},
            monochrome = true)
public class runnerF1 extends AbstractTestNGCucumberTests {


}
