package runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/resources/features/F2.feature"},
        glue = {"stepdefinitions", "hooks"},
        plugin = {"pretty", "html:target/cucumber2.html"

       },
        monochrome = true)
public class runnerF2 extends AbstractTestNGCucumberTests {


}