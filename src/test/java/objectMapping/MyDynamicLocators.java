package objectMapping;

import org.openqa.selenium.By;

public class MyDynamicLocators {

    public final By timerBtn;

    public MyDynamicLocators(String time){
        timerBtn = By.xpath("//div[contains(@class,'EggTimer-start-quick-time')][1]/a['"+time+"']");
    }
}
