package project.steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;
import project.ui.pageObj.CorePageObjects;
import project.ui.xpath_locators.HealthcarePage;

public class HealthcarePageSteps extends ScenarioSteps {

    private CorePageObjects core;

    @Then("^Healthcare page is opened$")
    public void healthcarePageIsOpened() {
        Assert.assertTrue(
                "Healthcare page isn't opened",
                core.elementByXpathIsVisible(HealthcarePage.HEALTHCARE_TITLE)
        );
    }

}