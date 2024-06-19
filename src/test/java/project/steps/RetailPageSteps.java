package project.steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
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

    @Then("^View project in portfolio link first is displayed$")
    public void viewProjectInPortfolioLinkFirstIsDisplayed() {
        Assert.assertTrue(
                "View project in portfolio link first isn't displayed",
                core.elementByXpathIsVisible(RetailPage.VIEW_PROJECT_IN_PORTFOLIO_LINK_FIRST)
        );
    }

    @When("^click View project in portfolio link first$")
    public void clickViewProjectInPortfolioLinkFirst() {
        core.clickUsingJSExecutor(RetailPage.VIEW_PROJECT_IN_PORTFOLIO_LINK_FIRST);
    }
}
