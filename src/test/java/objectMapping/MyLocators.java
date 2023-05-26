package objectMapping;

import org.openqa.selenium.By;

public class MyLocators {

    private final By StartBtn = By.xpath("//button[contains(text(),'Start')]");
    private final By timerTxtBox = By.xpath("//input[contains(@placeholder,'Enter a time')]");
    private final By eggTimerHomePageTxt = By.xpath("//p[contains(text(),'E.ggTimer is a simple countdown timer.')]");
    private final By fiveminuteTimerBtn = By.xpath("//div[contains(@class,'EggTimer-start-quick-time')][1]/a[1]");
}
