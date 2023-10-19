package saucedemo.cucumber.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/java/saucedemo/cucumber/feature",
        glue = "saucedemo.cucumber.stepDef",
        plugin = {"html:target/HTML_report.html"},
        tags = "@Positive"
)
public class TestRunner {
}
