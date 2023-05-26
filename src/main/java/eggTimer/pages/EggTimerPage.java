package eggTimer.pages;

import eggTimer.util.WebDriverUtil;

public class EggTimerPage {
    WebDriverUtil webDriverUtil;
    public EggTimerPage(){
        webDriverUtil  = new WebDriverUtil();
    }

    public void navigateToUrl(String url) {

        webDriverUtil.navigate(url);
    }
}
