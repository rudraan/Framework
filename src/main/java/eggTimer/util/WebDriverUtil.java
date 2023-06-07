package eggTimer.util;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class WebDriverUtil {

     WebDriver driver;
    PropertyReaderUtil propertyReaderUtil;
    //DriverUtil driverUtil;

    //creating constructor of WebDriverUtil class to initialise the objects
    public WebDriverUtil(){
        //driverUtil = DriverUtil.getInstance();
        //driver = driverUtil.getDriver();
        driver = DriverUtil.getInstance().getDriver();
       propertyReaderUtil = new PropertyReaderUtil();
    }


    /**Wait for the Alert present ignoring the StaleElementReferenceException
     *
     * @return boolean value true if alert is present
     * */
    public boolean waitForAlertPresent(String waitTimeString) {
        boolean flag = false;
        long waitTime = Long.parseLong(waitTimeString);
            new WebDriverWait(driver, Duration.ofSeconds(waitTime)).ignoring(StaleElementReferenceException.class)
                    .until(ExpectedConditions.alertIsPresent());

        try{
            driver.switchTo().alert();
            return flag = true;
        }catch(Exception Ex){
            return flag;
        }
    }


    /** wrapper method to navigate to url
     *
     * @param url takes the url value from Config file and navigates to it
     * */
    public void navigate(String url) {
       // driver = DriverUtil.getInstance().getDriver();
       // driverUtil.getDriver().navigate().to(url);
        driver.navigate().to(url);

    }

    /** to get text from alert
     * @return the text present in the alert
     * */
    public String getTextFromAlert() {
        Alert alert = driver.switchTo().alert();
        return alert.getText();
    }

    /** to capture the path of error screenshot
     * @return the path where the screenshots are captured
     * */
    public static String captureScreenshot(WebDriver driver) throws IOException {
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File Dest = new File("src/../FrameworkImages/" + System.currentTimeMillis() + ".png");
        String errflpath = Dest.getAbsolutePath();
        FileUtils.copyFile(scrFile, Dest);
        return errflpath;
    }

}
