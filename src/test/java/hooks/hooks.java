package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import utils.DriverManager;

public class hooks {



    @Before
    public void setUp(Scenario scenario) {
        long threadId = Thread.currentThread().getId();
        System.out.println("[Thread " + threadId + "] Running: " + scenario.getName());

        if(scenario.getSourceTagNames().contains("@web")){
            if(scenario.getSourceTagNames().contains("@chrome")) {
                DriverManager.setDriverChrome();
            }
        }
            else{
                DriverManager.setDriverFirefox();
            }
    }


    @After
    public void tearDown(Scenario scenario){

        try {
            System.out.println("@After");
            if(scenario.getSourceTagNames().contains("@web")){
                DriverManager.getDriver().quit();
            }
        } catch (Exception e) {
            System.err.println("Erreur dans @After: " + e.getMessage());
        }


    }
}
