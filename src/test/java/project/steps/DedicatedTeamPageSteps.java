package project.steps;

import cucumber.api.java.en.Then;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;
import project.ui.pageObj.CorePageObjects;
import project.ui.xpath_locators.DedicatedTeamPage;

public class DedicatedTeamPageSteps extends ScenarioSteps {

    private CorePageObjects core;

    @Then("^Dedicated Team page is opened$")
    public void dedicatedTeamPageIsOpened() {
        Assert.assertTrue(
                "Dedicated Team page isn't opened",
                core.elementByXpathIsVisible(DedicatedTeamPage.DEDICATED_TEAM_TITLE)
        );
    }

}