package project.steps;

import cucumber.api.java.en.Then;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;
import project.ui.pageObj.CorePageObjects;
import project.ui.xpath_locators.BusinessAnalysisPage;

public class BusinessAnalysisPageSteps extends ScenarioSteps {

    private CorePageObjects core;

    @Then("^Business Analysis page is opened$")
    public void businessAnalysisPageIsOpened() {
        Assert.assertTrue(
                "Business Analysis page isn't opened",
                core.elementByXpathIsVisible(BusinessAnalysisPage.BUSINESS_ANALYSIS_TITLE)
        );
    }

}