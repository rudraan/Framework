package eggTimer.util;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.manager.SeleniumManager;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Properties;

public class WebDriverUtil {

    WebDriver driver;
    PropertyReaderUtil propertyReaderUtil;
    public WebDriverUtil(){
       this.driver = DriverUtil.getInstance().getDriver();
       propertyReaderUtil = new PropertyReaderUtil();
    }
    //Wait for the Alert present ignoring the StaleElementReferenceException
    public boolean waitForAlertPresent( Duration waitTime) {
        boolean flag = false;
        new WebDriverWait(driver, waitTime).ignoring(StaleElementReferenceException.class)
                .until(ExpectedConditions.alertIsPresent());
        try{
            driver.switchTo().alert();
            return flag = true;
        }catch(Exception Ex){
            return flag;
        }
    }


    //wrapper method to navigate to url
    public void navigate(String url) {

        driver.navigate().to(url);
    }

    //to get the text from a alert
    public String getTextFromAlert() {
        Alert alert = driver.switchTo().alert();
        return alert.getText();
    }

}
