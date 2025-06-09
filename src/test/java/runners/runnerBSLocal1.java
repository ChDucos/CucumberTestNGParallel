package runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
            features = {"src/test/resources/features/WebLocal1.feature"},
            glue = {"stepdefinitions", "hooks"},
           plugin = {"pretty", "html:target/cucumber1.html"},
            monochrome = true)
public class runnerBSLocal1 extends AbstractTestNGCucumberTests {


}
