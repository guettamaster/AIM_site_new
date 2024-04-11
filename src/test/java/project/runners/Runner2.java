package project.runners;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
//@CucumberOptions(features = "src/test/resources/features", glue = "v1", tags = {"@performance_testing_mpls or @performance_testing_oneCloud or @performance_testing_api"})
////@CucumberOptions(features = {"src/test/resources/features/SPRINTS_PART/EVENTBRITE_TAB.feature",}, glue = "upshot")
@CucumberOptions(features = {

//        "src/test/resources/features/01.HomePage.feature"


},
        glue = "project.steps net.serenitybdd.cucumber.actors"
)
public class Runner2 {
}