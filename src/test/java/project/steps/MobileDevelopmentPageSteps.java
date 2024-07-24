package project.steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;
import project.ui.pageObj.CorePageObjects;
import project.ui.xpath_locators.MobileDevelopmentPage;

public class MobileDevelopmentPageSteps extends ScenarioSteps {

    private CorePageObjects core;

    @Then("^Mobile Development page is opened$")
    public void mobileDevelopmentPageIsOpened() {
        Assert.assertTrue(
                "Mobile Development page isn't opened",
                core.elementByXpathIsVisible(MobileDevelopmentPage.MOBILE_DEVELOPMENT_TITLE)
        );
    }

    @Then("^View project in portfolio link fourth is displayed$")
    public void viewProjectInPortfolioLinkFourthIsDisplayed() {
        Assert.assertTrue(
                "View project in portfolio link fourth isn't displayed",
                core.elementByXpathIsVisible(MobileDevelopmentPage.VIEW_PROJECT_IN_PORTFOLIO_LINK_FOURTH)
        );
    }

    @When("^click View project in portfolio link fourth$")
    public void clickViewProjectInPortfolioLinkFourth() {
        core.clickUsingJSExecutor(MobileDevelopmentPage.VIEW_PROJECT_IN_PORTFOLIO_LINK_FOURTH);
    }

    @When("^click right arrow first in the Clients carousel$")
    public void clickRightArrowFirstInTheClientsCarousel() {
        core.clickUsingJSExecutor(MobileDevelopmentPage.RIGHT_ARROW_FIRST_IN_THE_CLIENTS_CAROUSEL);
    }

    @Then("^Read case study link second is displayed$")
    public void readCaseStudyLinkSecondIsDisplayed() {
        Assert.assertTrue(
                "Read case study link second isn't displayed",
                core.elementByXpathIsVisible(MobileDevelopmentPage.READ_CASE_STUDY_LINK_SECOND)
        );
    }

    @When("^click Read case study link second$")
    public void clickReadCaseStudyLinkSecond() {
        core.clickUsingJSExecutor(MobileDevelopmentPage.READ_CASE_STUDY_LINK_SECOND);
    }

    @When("^click right arrow third inside Our Clients section$")
    public void clickRightArrowThirdInsideOurClientsSection() {
        core.clickUsingJSExecutor(MobileDevelopmentPage.RIGHT_ARROW_THIRD_INSIDE_OUR_CLIENTS_SECTION);
    }
}
