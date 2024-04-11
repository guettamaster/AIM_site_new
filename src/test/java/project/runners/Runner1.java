package project.runners;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
//@CucumberOptions(features = "src/test/resources/features", glue = "v1", tags = {"@performance_testing_mpls or @performance_testing_oneCloud or @performance_testing_api"})
@CucumberOptions(features = {

        "src/test/resources/features/01.HomePage.feature",
//        "src/test/resources/features/02.HE-21.Billing Address(E-Store).feature"
},
        glue = "stepdefinitions"
)
public class Runner1 {
}

