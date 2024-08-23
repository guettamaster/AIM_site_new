package project.steps;

import cucumber.api.java.en.Then;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;
import project.ui.pageObj.CorePageObjects;
import project.ui.xpath_locators.ITOutsourcingPage;

public class ITOutsourcingPageSteps extends ScenarioSteps {

    private CorePageObjects core;

    @Then("^IT Outsourcing page is opened$")
    public void iTOutsourcingPageIsOpened() {
        Assert.assertTrue(
                "IT Outsourcing page isn't opened",
                core.elementByXpathIsVisible(ITOutsourcingPage.IT_OUTSOURCING_TITLE)
        );
    }


}
