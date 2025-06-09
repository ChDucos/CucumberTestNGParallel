package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class DriverManager {


    //private static WebDriver webDriver;
   private static final ThreadLocal<WebDriver> webDriver = new ThreadLocal<>();


    public static void  setDriver(){
//        webDriver = new ChromeDriver();
//       webDriver.manage().window().maximize();
        System.out.println("Thread : " + Thread.currentThread().getName());
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        webDriver.set(driver);
    }

    public static void  setDriverChrome(){
       // System.out.println("Thread : " + Thread.currentThread().getName());
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        webDriver.set(driver);
    }

    public static void  setDriverFirefox(){
     //   System.out.println("Thread : " + Thread.currentThread().getName());
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        webDriver.set(driver);
    }


    public static WebDriver getDriver() {
     // return webDriver;
       return webDriver.get();
    }
}
