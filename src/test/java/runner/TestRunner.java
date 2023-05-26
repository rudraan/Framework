package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

import static io.cucumber.testng.CucumberOptions.SnippetType.CAMELCASE;

@CucumberOptions(
            features = "src/test/resources/features",
            glue = {"eggTimer.stepDef"},
            plugin = { "pretty", "html:target/cucumber-reports", "summary"},
            snippets = CAMELCASE,
            monochrome = true,
            publish = true)
    public class TestRunner extends AbstractTestNGCucumberTests {

        public Object[][] scenario(){
            return super.scenarios();
        }
}
