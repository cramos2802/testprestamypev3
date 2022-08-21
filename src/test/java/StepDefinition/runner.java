package StepDefinition;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;




@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty","junit:target/JUnitReports/report.xml",
        "json:target/JSONReports/report.json",
        "html:target/HtmlReports"},
        //junit = {"--step-notifications"},
        features = {"src/test/resources/feature/empresario.feature"},
        glue = {"StepDefinition"},
        tags = "@empresario"

)
public class runner {



}


