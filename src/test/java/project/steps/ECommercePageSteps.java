package project.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;
import project.ui.pageObj.CorePageObjects;
import project.ui.xpath_locators.ECommercePage;
import project.ui.xpath_locators.EducationPage;

public class ECommercePageSteps extends ScenarioSteps {

    private CorePageObjects core;

    @Then("^ECommerce page is opened$")
    public void eCommercePageIsOpened() {
        Assert.assertTrue(
                "ECommerce page isn't opened",
                core.elementByXpathIsVisible(ECommercePage.ECOMMERCE_TITLE)
        );
    }

    @Then("^View project in portfolio link is displayed$")
    public void viewProjectInPortfolioLinkIsDisplayed() {
        Assert.assertTrue(
                "View project in portfolio link isn't displayed",
                core.elementByXpathIsVisible(ECommercePage.VIEW_PROJECT_IN_PORTFOLIO_LINK)
        );
    }

    @When("^click View project in portfolio link$")
    public void clickViewProjectInPortfolioLink() {
        core.clickUsingJSExecutor(ECommercePage.VIEW_PROJECT_IN_PORTFOLIO_LINK);
    }

    @Then("^\"([^\"]*)\" portfolio page is opened$")
    public void portfolioPageIsOpened(String text) throws Throwable {
        Assert.assertTrue(
                "portfolio page isn't opened",
                core.elementByXpathIsVisible(ECommercePage.PORTFOLIO_BREADCRUMBS.replace("$1", text))
        );
    }
}
