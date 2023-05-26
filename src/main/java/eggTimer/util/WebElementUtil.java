package eggTimer.util;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebElementUtil {

    DriverUtil driverUtil = DriverUtil.getInstance();
    WebDriver driver = driverUtil.getDriver();

    //wrapper method of click() in selenium
    public boolean click(WebElement ele){

        if(ele.isDisplayed()){
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView();", ele);
            ele.click();
            return true;
        }
        else
            return false;

    }

    //wrapper method of sendKeys() in selenium
    public boolean sendKeys(WebElement ele, String value){
        ele.clear();
        ele.sendKeys(value);
        return true;
    }


    //to get the text of a webelement
    public String getText(WebElement ele) {
        if(!ele.isDisplayed()) {
            return null;
        }else
        return ele.getText();
    }





}
