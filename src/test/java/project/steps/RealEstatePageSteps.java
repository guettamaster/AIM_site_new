package project.steps;

import cucumber.api.java.en.Then;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;
import project.ui.pageObj.CorePageObjects;
import project.ui.xpath_locators.RealEstatePage;

public class RealEstatePageSteps extends ScenarioSteps {

    private CorePageObjects core;

    @Then("^Real Estate page is opened$")
    public void realEstatePageIsOpened() {
        Assert.assertTrue(
                "Real Estate page isn't opened",
                core.elementByXpathIsVisible(RealEstatePage.REAL_ESTATE_TITLE)
        );
    }

}
