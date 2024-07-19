package project.steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;
import project.ui.pageObj.CorePageObjects;
import project.ui.xpath_locators.HybrisDevelopmentPage;
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
}
