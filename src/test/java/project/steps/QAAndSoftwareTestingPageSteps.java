package project.steps;

import cucumber.api.java.en.Then;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;
import project.ui.pageObj.CorePageObjects;
import project.ui.xpath_locators.QAAndSoftwareTestingPage;

public class QAAndSoftwareTestingPageSteps extends ScenarioSteps {

    private CorePageObjects core;

    @Then("^QA and Software Testing page is opened$")
    public void qAAndSoftwareTestingPageIsOpened() {
        Assert.assertTrue(
                "QA and Software Testing page isn't opened",
                core.elementByXpathIsVisible(QAAndSoftwareTestingPage.QA_AND_SOFTWARE_TESTING_TITLE)
        );
    }

    @Then("^switch to the GoodFirms tab first$")
    public void switchToTheGoodFirmsTabFirst() {
        core.switchToTab(2);
    }

    @Then("^switch to the Upwork tab first$")
    public void switchToTheUpworkTabFirst() {
        core.switchToTab(3);
    }

    @Then("^switch to the Clutch tab first$")
    public void switchToTheClutchTabFirst() {
        core.switchToTab(4);
    }
}
