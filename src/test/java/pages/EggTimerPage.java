package pages;

import eggTimer.util.PropertyReaderUtil;
import eggTimer.util.WebDriverUtil;
import eggTimer.util.WebElementUtil;
import objectMapping.MyDynamicLocators;
import objectMapping.MyLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.time.Duration;


public class EggTimerPage {
    WebDriverUtil webDriverUtil;
    WebElementUtil webElementUtil;
    MyLocators myLocators;
    MyDynamicLocators myDynamicLocators;

    public EggTimerPage(){
        webDriverUtil = new WebDriverUtil();
        webElementUtil = new WebElementUtil();
        myLocators = new MyLocators();
    }

    //public By timerTextBox = myLocators.timerTxtBox;
    public void navigateToUrl(String url) {
        webDriverUtil.navigate(url);
    }

    public void pageLoad() {
        webElementUtil.verifyPageLoad();
        Assert.assertTrue(webElementUtil.verifyPageLoad());
    }

    public void addTimer(String time) {
        //System.out.println("Time: "+time);
        webElementUtil.sendKeys(myLocators.timerTxtBox, time);
    }

    public void clickStartBtn() {
        webElementUtil.click(myLocators.StartBtn);
    }

    public void verifyAlertPopUp(String time) {
        webDriverUtil.waitForAlertPresent(time);
        String alertTxt = webDriverUtil.getTextFromAlert();
        System.out.println("Alert text displayed is: "+ alertTxt);
        Assert.assertEquals(alertTxt,"Time Expired!" );

    }

//    public void clickTimerBtn(String time) {
//        webElementUtil.click(new MyDynamicLocators(time).timerBtn);
//    }
}
