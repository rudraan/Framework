package eggTimer.util;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebElementUtil {

    //DriverUtil driverUtil = DriverUtil.getInstance();
    WebDriver driver = DriverUtil.getInstance().getDriver();

    /** wrapper method to click a webElement in selenium
     *
     * @param by Takes the locators as input
     * @return boolean true once element is found and clicked
     * */
    public boolean click(By by){
        WebElement ele = findElement(by);
        if(ele.isDisplayed()){
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView();", ele);
            ele.click();
            return true;
        }
        else
            return false;

    }

    /** wrapper method to send text in textbox in selenium
     *
     * @param by Takes the locators as input
     * @param value takes the value to be send to the textbox WebElement
     * @return boolean value true once user enters text in the textBox
     * */
    public boolean sendKeys(By by, String value){
        WebElement ele = findElement(by);
        ele.clear();
        ele.sendKeys(value);
        return true;
    }

    /** wrapper method for finding Elements in selenium
     *
     * @param by Takes the locators as input
     * @return the element found by locating the xpath of the locator specified
     * */
    public WebElement findElement(By by){
        return driver.findElement(by);
    }

    /** to get the text of a webelement
     *
     * @param ele takes webElement as the input value
     * @return as 'String' the text present in the webElement
     * */
    public String getText(WebElement ele) {
        if(!ele.isDisplayed()) {
            return null;
        }else
        return ele.getText();
    }

    /**
     * wrapper to verify page is loaded
     *
     * @return
     */
    public boolean verifyPageLoad(){
        driver = DriverUtil.getInstance().getDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        boolean pageLoadValidation = js.executeScript("return document.readyState").equals("complete");
        //System.out.println("pageLoadValidation: " +pageLoadValidation);
        return pageLoadValidation;
    }



}
