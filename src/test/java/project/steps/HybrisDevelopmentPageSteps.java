package project.steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;
import project.ui.pageObj.CorePageObjects;
import project.ui.xpath_locators.HybrisDevelopmentPage;

public class HybrisDevelopmentPageSteps extends ScenarioSteps {

    private CorePageObjects core;

    @Then("^Hybris Development page is opened$")
    public void hybrisDevelopmentPageIsOpened() {
        Assert.assertTrue(
                "Hybris Development isn't opened",
                core.elementByXpathIsVisible(HybrisDevelopmentPage.HYBRIS_DEVELOPMENT_TITLE)
        );
    }

    @Then("^\"([^\"]*)\" tile is displayed$")
    public void tileIsDisplayed(String text) throws Throwable {
        Assert.assertTrue(
                "tile isn't displayed",
                core.elementByXpathIsVisible(HybrisDevelopmentPage.TILE_INSIDE_BUSINESS_PROCESS.replace("$1", text))
        );
    }

    @Then("^\"([^\"]*)\" animation tile is displayed$")
    public void animationTileIsDisplayed(String text) throws Throwable {
        Assert.assertTrue(
                "animation tile isn't displayed",
                core.elementByXpathIsVisible(HybrisDevelopmentPage.ANIMATION_TILE_IN_THE_BENEFITS.replace("$1", text))
        );
    }

    @Then("^SAP silver partner link is displayed$")
    public void sapSilverPartnerLinkIsDisplayed() {
        Assert.assertTrue(
                "SAP silver partner link isn't displayed",
                core.elementByXpathIsVisible(HybrisDevelopmentPage.SAP_SILVER_PARTNER_LINK)
        );
    }

    @When("^click on the SAP silver partner link$")
    public void clickOnTheSAPSilverPartnerLink() {
        core.clickUsingJSExecutor(HybrisDevelopmentPage.SAP_SILVER_PARTNER_LINK);
    }

    @Then("^switch to the SAP tab$")
    public void switchToTheSAPTab() {
        core.switchToTab(2);
    }

    @Then("^SAP logo is displayed$")
    public void sapLogoIsDisplayed() {
        Assert.assertTrue(
                "SAP logo isn't displayed",
                core.elementByXpathIsVisible(HybrisDevelopmentPage.SAP_LOGO)
        );
    }

    @Then("^switch to the AIM tab$")
    public void switchToTheAIMTab() {
        core.switchToTab(1);
    }

    @When("^navigate on right arrow in the tiles section$")
    public void navigateOnRightArrowInTheTilesSection() {
        core.scrollToElementByXpathUsingJsExecutor(HybrisDevelopmentPage.RIGHT_ARROW_IN_THE_TILES_SECTION);
    }

    @When("^click right arrow in the tiles section$")
    public void clickRightArrowInTheTilesSection() {
        core.clickUsingJSExecutor(HybrisDevelopmentPage.RIGHT_ARROW_IN_THE_TILES_SECTION);
    }

    @Then("^SAP App Center link is displayed$")
    public void sapAppCenterLinkIsDisplayed() {
        Assert.assertTrue(
                "SAP App Center link isn't displayed",
                core.elementByXpathIsVisible(HybrisDevelopmentPage.SAP_APP_CENTER_LINK)
        );
    }

    @When("^click on the SAP App Center link$")
    public void clickOnTheSAPAppCenterLink() {
        core.clickUsingJSExecutor(HybrisDevelopmentPage.SAP_APP_CENTER_LINK);
    }

    @Then("^switch to the SAP tab first$")
    public void switchToTheSAPTabFirst() {
        core.switchToTab(3);
    }
}
