package project.steps;

import cucumber.api.java.en.Then;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;
import project.ui.pageObj.CorePageObjects;
import project.ui.xpath_locators.RetailPage;

public class RetailPageSteps extends ScenarioSteps {

    private CorePageObjects core;

    @Then("^Retail page is opened$")
    public void retailPageIsOpened() {
        Assert.assertTrue(
                "Retail page isn't opened",
                core.elementByXpathIsVisible(RetailPage.RETAIL_TITLE)
        );
    }

}
