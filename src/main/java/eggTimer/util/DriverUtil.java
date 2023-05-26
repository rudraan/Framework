package eggTimer.util;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverUtil {

    //creating instance of DriverUtil singleton class
    private static DriverUtil driverInstance = null;
    WebDriver driver;

    //creating constructor
    private DriverUtil() {

    }

    //to create instance of class
    public static DriverUtil getInstance() {
        if (driverInstance == null) {
            try {
                driverInstance = new DriverUtil();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return driverInstance;
    }

    //return the browser driver instance to all classes which require it
    public WebDriver getDriver() {
        return this.driver;
    }

    //Set browser
    public void setBrowser(String browserType) {
        switch (browserType) {
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                this.driver = new FirefoxDriver();
                break;
            case "chrome":
                WebDriverManager.chromedriver().setup();
                this.driver = new ChromeDriver();
                break;
//            case "chromium":
//                WebDriverManager.chromiumdriver().create();
//                driver = new ChromiumDriver();
//                break;
            case "edge":
                WebDriverManager.edgedriver().setup();
                this.driver = new EdgeDriver();
                break;
            case "IE":
                WebDriverManager.iedriver().setup();
                this.driver = new InternetExplorerDriver();
                break;
            default:
                System.out.println("browser : " + browserType + " is invalid..");

        }

    }

}