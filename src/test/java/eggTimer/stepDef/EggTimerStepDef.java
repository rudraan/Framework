package eggTimer.stepDef;

import eggTimer.pages.EggTimerPage;
import eggTimer.util.DriverUtil;
import eggTimer.util.PropertyReaderUtil;
import eggTimer.util.WebDriverUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class EggTimerStepDef {

    WebDriverUtil webDriverUtil = new WebDriverUtil();

    PropertyReaderUtil propertyReaderUtil = new PropertyReaderUtil();
    EggTimerPage eggTimerPage = new EggTimerPage();
    @Given("read the browser from properties file")
    public void read_the_browser_from_properties_file() {
        propertyReaderUtil.loadConfigProperties();
        String browserName = propertyReaderUtil.getProperties("browser");
        DriverUtil.getInstance().setBrowser(browserName);

    }
    @Given("read the url from properties file and navigates")
    public void read_the_url_from_properties_file_and_navigates() {
        propertyReaderUtil.loadConfigProperties();
        String url = propertyReaderUtil.getProperties("url");
        System.out.println("url: "+ url);
        eggTimerPage.navigateToUrl(url);

    }
    @Then("verify that the page gets loaded")
    public void verify_that_the_page_gets_loaded() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user enters {string} in the textbox")
    public void user_enters_in_the_textbox(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("clicks on start button")
    public void clicks_on_start_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("verify user is able to see the alert when {string} is reached")
    public void verify_user_is_able_to_see_the_alert_when_is_reached(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}