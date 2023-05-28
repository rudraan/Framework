package eggTimer.stepDef;

import pages.EggTimerPage;
import eggTimer.util.PropertyReaderUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.time.Duration;

public class EggTimerStepDef {


    PropertyReaderUtil propertyReaderUtil = new PropertyReaderUtil();
    EggTimerPage eggTimerPage = new EggTimerPage();



    @Given("read the url from properties file and navigates")
    public void read_the_url_from_properties_file_and_navigates() {
        String url = propertyReaderUtil.getProperties("url");
        eggTimerPage.navigateToUrl(url);

    }
    @Then("verify that the page gets loaded")
    public void verify_that_the_page_gets_loaded() {

        eggTimerPage.pageLoad();
    }
    @When("user enters {string} in the textbox")
    public void user_enters_in_the_textbox(String time)
    {
        eggTimerPage.addTimer(time);
    }


    @When("clicks on start button")
    public void clicks_on_start_button() {
        eggTimerPage.clickStartBtn();
    }


    @Then("verify user is able to see the alert when {string} is reached")
    public void verify_user_is_able_to_see_the_alert_when_is_reached(String time) {
        eggTimerPage.verifyAlertPopUp(time);
    }

//    @When("user clicks on {string} button")
//    public void user_clicks_on_button(String time){
//        eggTimerPage.clickTimerBtn(time);
//    }
}