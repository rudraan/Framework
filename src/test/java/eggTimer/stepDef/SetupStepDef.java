package eggTimer.stepDef;

import eggTimer.util.DriverUtil;
import io.cucumber.java.After;
import pages.SetupPage;
import io.cucumber.java.en.Given;

public class SetupStepDef {

    SetupPage setupPage = new SetupPage();
    @Given("read the browser from properties file")
    public void read_the_browser_from_properties_file() {
        setupPage.setBrowser();

    }

    @After
    public void tearDown(){
        DriverUtil.getInstance().getDriver().quit();
    }
}
