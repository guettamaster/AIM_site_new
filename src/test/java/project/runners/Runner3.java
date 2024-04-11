package project.runners;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
//@CucumberOptions(features = "src/test/resources/features", glue = "v1", tags = {"@performance_testing_oneCloud"})
@CucumberOptions(features = {

//        "src/test/resources/features/01.HomePage.feature"


},
        glue = "project.steps net.serenitybdd.cucumber.actors"
)
public class Runner3 {
}
