package project.steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;
import project.ui.pageObj.CorePageObjects;
import project.ui.xpath_locators.UIUXDesignPage;

public class UIUXDesignPageSteps extends ScenarioSteps {

    private CorePageObjects core;

    @Then("^UX/UI Design page is opened$")
    public void uXUIPageIsOpened() {
        Assert.assertTrue(
                "UX/UI Design page isn't opened",
                core.elementByXpathIsVisible(UIUXDesignPage.UIUX_DESIGN_TITLE)
        );
    }

    @Then("^Behance link in Find More section is displayed$")
    public void behanceLinkInFindMoreSectionIsDisplayed() {
        Assert.assertTrue(
                "Behance link in Find More section isn't displayed",
                core.elementByXpathIsVisible(UIUXDesignPage.BEHANCE_LINK)
        );
    }

    @When("^click on the Behance link$")
    public void clickOnTheBehanceLink() {
        core.clickUsingJSExecutor(UIUXDesignPage.BEHANCE_LINK);
    }

    @Then("^switch to the Behance tab$")
    public void switchToTheBehanceTab() {
        core.switchToTab(2);
    }

    @Then("^AIM link on Behance is displayed$")
    public void aimLinkOnBehanceIsDisplayed() {
        Assert.assertTrue(
                "AIM link on Behance isn't displayed",
                core.elementByXpathIsVisible(UIUXDesignPage.AIM_LINK_ON_BEHANCE)
        );
    }

    @When("^navigate on right arrow fifth in the Clients carousel$")
    public void navigateOnRightArrowFifthInTheClientsCarousel() {
        core.scrollToElementByXpathUsingJsExecutor(UIUXDesignPage.RIGHT_ARROW_FIFTH_IN_THE_CLIENTS_CAROUSEL);
    }

    @When("^click right arrow fifth in the Clients carousel$")
    public void clickRightArrowFifthInTheClientsCarousel() {
        core.clickUsingJSExecutor(UIUXDesignPage.RIGHT_ARROW_FIFTH_IN_THE_CLIENTS_CAROUSEL);
    }
}
