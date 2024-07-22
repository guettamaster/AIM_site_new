package project.steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;
import project.ui.pageObj.CorePageObjects;
import project.ui.xpath_locators.HomePage;
import project.ui.xpath_locators.WebDevelopmentPage;

public class WebDevelopmentPageSteps extends ScenarioSteps {

    private CorePageObjects core;

    @Then("^Web Development page is opened$")
    public void webDevelopmentPageIsOpened() {
        Assert.assertTrue(
                "Web Development page isn't opened",
                core.elementByXpathIsVisible(WebDevelopmentPage.WEB_DEVELOPMENT_TITLE)
        );
    }

    @Then("^\"([^\"]*)\" link in Find More section is displayed$")
    public void linkInFindMoreSectionIsDisplayed(String text) throws Throwable {
        Assert.assertTrue(
                "link in Find More section isn't displayed",
                core.elementByXpathIsVisible(WebDevelopmentPage.LINK_IN_FIND_MORE_SECTION.replace("$1", text))
        );
    }

    @When("^click on the \"([^\"]*)\" link$")
    public void clickOnTheLink(String text) throws Throwable {
        core.clickUsingJSExecutor(WebDevelopmentPage.LINK_IN_FIND_MORE_SECTION.replace("$1", text));
    }

    @Then("^switch to the Github tab$")
    public void switchToTheGithubTab() {
        core.switchToTab(2);
    }

    @Then("^AIM logo on Github is displayed$")
    public void aIMLogoOnGithubIsDisplayed() {
        Assert.assertTrue(
                "AIM logo on Github isn't displayed",
                core.elementByXpathIsVisible(WebDevelopmentPage.AIM_LOGO_ON_GITHUB)
        );
    }

    @Then("^switch to the GoodFirms tab$")
    public void switchToTheGoodFirmsTab() {
        core.switchToTab(3);
    }

    @Then("^GoodFirms logo is displayed$")
    public void goodfirmsLogoIsDisplayed() {
        Assert.assertTrue(
                "GoodFirms logo isn't displayed",
                core.elementByXpathIsVisible(WebDevelopmentPage.GOODFIRMS_LOGO)
        );
    }

    @Then("^switch to the Upwork tab$")
    public void switchToTheUpworkTab() {
        core.switchToTab(4);
    }

    @Then("^Upwork logo is displayed$")
    public void upworkLogoIsDisplayed() {
        Assert.assertTrue(
                "Upwork logo isn't displayed",
                core.elementByXpathIsVisible(WebDevelopmentPage.UPWORK_LOGO)
        );
    }

    @Then("^switch to the Clutch tab$")
    public void switchToTheClutchTab() {
        core.switchToTab(5);
    }

    @Then("^Clutch logo is displayed$")
    public void clutchLogoIsDisplayed() {
        Assert.assertTrue(
                "Clutch logo isn't displayed",
                core.elementByXpathIsVisible(WebDevelopmentPage.CLUTCH_LOGO)
        );
    }

    @When("^click \"([^\"]*)\" title in the Industries we work with section$")
    public void clickTitleInTheIndustriesWeWorkWithSection(String text) throws Throwable {
        core.clickUsingJSExecutor(HomePage.TITLE_INSIDE_BUSINESS_PROCESS.replace("$1", text));
    }

    @Then("^View project in portfolio link second is displayed$")
    public void viewProjectInPortfolioLinkSecondIsDisplayed() {
        Assert.assertTrue(
                "View project in portfolio link second isn't displayed",
                core.elementByXpathIsVisible(WebDevelopmentPage.VIEW_PROJECT_IN_PORTFOLIO_LINK_SECOND)
        );
    }

    @When("^click View project in portfolio link second$")
    public void clickViewProjectInPortfolioLinkSecond() {
        core.clickUsingJSExecutor(WebDevelopmentPage.VIEW_PROJECT_IN_PORTFOLIO_LINK_SECOND);
    }

    @Then("^View project in portfolio link third is displayed$")
    public void viewProjectInPortfolioLinkThirdIsDisplayed() {
        Assert.assertTrue(
                "View project in portfolio link third isn't displayed",
                core.elementByXpathIsVisible(WebDevelopmentPage.VIEW_PROJECT_IN_PORTFOLIO_LINK_THIRD)
        );
    }

    @When("^click View project in portfolio link third$")
    public void clickViewProjectInPortfolioLinkThird() {
        core.clickUsingJSExecutor(WebDevelopmentPage.VIEW_PROJECT_IN_PORTFOLIO_LINK_THIRD);
    }

    @Then("^Read case study link on the Web Development page is displayed$")
    public void readCaseStudyLinkOnTheWebDevelopmentPageIsDisplayed() {
        Assert.assertTrue(
                "Read case study link on the Web Development page isn't displayed",
                core.elementByXpathIsVisible(WebDevelopmentPage.READ_CASE_STUDY_LINK_ON_THE_WEB_DEVELOPMENT_PAGE)
        );
    }

    @When("^click Read case study link on the Web Development page$")
    public void clickReadCaseStudyLinkOnTheWebDevelopmentPage() {
        core.clickUsingJSExecutor(WebDevelopmentPage.READ_CASE_STUDY_LINK_ON_THE_WEB_DEVELOPMENT_PAGE);
    }

    @When("^navigate on right arrow fourth in the Clients carousel$")
    public void navigateOnRightArrowFourthInTheClientsCarousel() {
        core.scrollToElementByXpathUsingJsExecutor(WebDevelopmentPage.RIGHT_ARROW_FOURTH_IN_THE_CLIENTS_CAROUSEL);
    }

    @When("^click right arrow fourth in the Clients carousel$")
    public void clickRightArrowFourthInTheClientsCarousel() {
        core.clickUsingJSExecutor(WebDevelopmentPage.RIGHT_ARROW_FOURTH_IN_THE_CLIENTS_CAROUSEL);
    }

    @Then("^Learn more button is displayed$")
    public void learnMoreButtonIsDisplayed() {
        Assert.assertTrue(
                "Learn more button isn't displayed",
                core.elementByXpathIsVisible(WebDevelopmentPage.LEARN_MORE_BUTTON)
        );
    }

    @When("^click on Learn more button$")
    public void clickOnLearnMoreButton() {
        core.clickUsingJSExecutor(WebDevelopmentPage.LEARN_MORE_BUTTON);
    }

    @Then("^Web Development Outsourcing page is opened$")
    public void webDevelopmentOutsourcingPageIsOpened() {
        Assert.assertTrue(
                "Web Development Outsourcing page isn't opened",
                core.elementByXpathIsVisible(WebDevelopmentPage.WEB_DEVELOPMENT_OUTSOURCING_TITLE)
        );
    }
}
