package runner;

import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

public class runner {


    @RunWith(Cucumber.class)
    @CucumberOptions(
            plugin = {"json:target/build/cucumber.json"},
            //junit = {"--step-notifications"},
            features = {"src/test/resources/feature"},

            glue = {"StepDefinition.login.feature"},
            tags = "@login"
    )
    class CukesRunner {
   }
}


/*//import cucumber.api.junit.Cucumber;
//import org.junit.runner.RunWith;
//@RunWith(Cucumber.class)
//@Cucumber.Options(
//        format={"pretty", "html:target/cucumber"},
//        features="src/test/resources"
//)
//class CukesRunner {
//}*/
