package runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
            features = {"src/test/resources/features/WebLocal2.feature"},
            glue = {"stepdefinitions", "hooks"},
           plugin = {"pretty", "html:target/cucumber2.html"},
            monochrome = true)
public class runnerBSLocal2 extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }


}
