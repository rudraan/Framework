package objectMapping;

import org.openqa.selenium.By;

public class MyLocators {

    public final By StartBtn;
    public final By timerTxtBox;
    public final By eggTimerHomePageTxt;
    public final By timerFiveMinBtn;

    public MyLocators(){
        StartBtn = By.xpath("//button[contains(text(),'Start')]");
        timerTxtBox = By.xpath("//input[contains(@placeholder,'Enter a time')]");
        eggTimerHomePageTxt = By.xpath("//p[contains(text(),'E.ggTimer is a simple countdown timer.')]");
        timerFiveMinBtn = By.xpath("//div[contains(@class,'EggTimer-start-quick-time')][1]/a[1]");
    }


}
