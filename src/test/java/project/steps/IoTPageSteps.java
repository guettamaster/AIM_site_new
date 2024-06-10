package project.steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;
import project.ui.pageObj.CorePageObjects;
import project.ui.xpath_locators.IoTPage;

public class IoTPageSteps extends ScenarioSteps {

    private CorePageObjects core;

    @Then("^IoT page is opened$")
    public void ioTPageIsOpened() {
        Assert.assertTrue(
                "IoT page isn't opened",
                core.elementByXpathIsVisible(IoTPage.IOT_TITLE)
        );
    }

}
