package project.steps;

import cucumber.api.java.en.Then;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;
import project.ui.pageObj.CorePageObjects;
import project.ui.xpath_locators.TelecomPage;

public class TelecomPageSteps extends ScenarioSteps {

    private CorePageObjects core;

    @Then("^Telecom page is opened$")
    public void telecomPageIsOpened() {
        Assert.assertTrue(
                "Telecom page isn't opened",
                core.elementByXpathIsVisible(TelecomPage.TELECOM_TITLE)
        );
    }

}
