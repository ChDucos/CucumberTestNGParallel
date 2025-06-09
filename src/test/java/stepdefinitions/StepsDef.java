package stepdefinitions;

import io.cucumber.java.en.Given;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import pages.BSPage;
import utils.DriverManager;


public class StepsDef {

    private WebDriver webDriver = DriverManager.getDriver();
    BSPage bsPage = new BSPage(webDriver);

    @Given("Tout est OK F1")
    public void toutEstOKF1(){
     //  System.out.println("Tout va bien F1");
       // System.out.println("Thread id is " + Thread.currentThread().getId());
    }

    @Given("Tout est OK F2")
    public void toutEstOKF2(){
       // System.out.println("Tout va bien F2");
       // System.out.println("Thread id is " + Thread.currentThread().getId());
    }


    @Given("I go to BS URL with local driver")
    public void localDriverBSURL(){
        DriverManager.getDriver().get("https://www.browserstack.com/");
        try {
            Thread.sleep(3*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Title = " + DriverManager.getDriver().getTitle());
//        System.out.println("Nav = " +  ((RemoteWebDriver) DriverManager.getDriver()).getCapabilities().getBrowserName());


        Assert.assertTrue(bsPage.getBtnGetStartedHere().isDisplayed()," Btn Get Started Here not displayed");


    }
}


