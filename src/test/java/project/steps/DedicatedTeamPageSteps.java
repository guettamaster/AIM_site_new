package project.steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;
import project.ui.pageObj.CorePageObjects;
import project.ui.xpath_locators.DedicatedTeamPage;

public class DedicatedTeamPageSteps extends ScenarioSteps {

    private CorePageObjects core;

    @Then("^Dedicated Team page is opened$")
    public void dedicatedTeamPageIsOpened() {
        Assert.assertTrue(
                "Dedicated Team page isn't opened",
                core.elementByXpathIsVisible(DedicatedTeamPage.DEDICATED_TEAM_TITLE)
        );
    }

    @Then("^\"([^\"]*)\" animation tile with highlight is displayed$")
    public void animationTileWithHighlightIsDisplayed(String text) throws Throwable {
        Assert.assertTrue(
                "animation tile with highlight isn't displayed",
                core.elementByXpathIsVisible(DedicatedTeamPage.ANIMATION_TILE_WITH_HIGHLIGHT_IN_THE_BENEFITS.replace("$1", text))
        );
    }

    @Then("^\"([^\"]*)\" technology in stack section is displayed$")
    public void technologyInStackSectionIsDisplayed(String text) throws Throwable {
        Assert.assertTrue(
                "technology in stack section isn't displayed",
                core.elementByXpathIsVisible(DedicatedTeamPage.TECHNOLOGY_IN_STACK.replace("$1", text))
        );
    }

    @Then("^switch to the IT Outsourcing Services tab$")
    public void switchToTheITOutsourcingServicesTab() {
        core.switchToTab(5);
    }

    @Then("^IT Outsourcing Company page is opened$")
    public void itOutsourcingCompanyPageIsOpened() {
        Assert.assertTrue(
                "IT Outsourcing Company page isn't opened",
                core.elementByXpathIsVisible(DedicatedTeamPage.IT_OUTSOURCING_COMPANY_TITLE)
        );
    }

    @Then("^Learn more button first is displayed$")
    public void learnMoreButtonFirstIsDisplayed() {
        Assert.assertTrue(
                "Learn more button first isn't displayed",
                core.elementByXpathIsVisible(DedicatedTeamPage.LEARN_MORE_BUTTON_FIRST)
        );
    }

    @When("^click on Learn more button first$")
    public void clickOnLearnMoreButtonFirst() {
        core.clickUsingJSExecutor(DedicatedTeamPage.LEARN_MORE_BUTTON_FIRST);
    }

    @Then("^switch to the Offshore Software Development Company tab$")
    public void switchToTheOffshoreSoftwareDevelopmentCompanyTab() {
        core.switchToTab(6);
    }

    @Then("^Offshore Software Development Company page is opened$")
    public void offshoreSoftwareDevelopmentCompanyPageIsOpened() {
        Assert.assertTrue(
                "Offshore Software Development Company page isn't opened",
                core.elementByXpathIsVisible(DedicatedTeamPage.OFFSHORE_SOFTWARE_DEVELOPMENT_COMPANY_TITLE)
        );
    }

    @Then("^Learn more button second is displayed$")
    public void learnMoreButtonSecondIsDisplayed() {
        Assert.assertTrue(
                "Learn more button second isn't displayed",
                core.elementByXpathIsVisible(DedicatedTeamPage.LEARN_MORE_BUTTON_SECOND)
        );
    }

    @When("^click on Learn more button second$")
    public void clickOnLearnMoreButtonSecond() {
        core.clickUsingJSExecutor(DedicatedTeamPage.LEARN_MORE_BUTTON_SECOND);
    }

    @Then("^switch to the IT Staff Augmentation Company tab$")
    public void switchToTheITStaffAugmentationCompanyTab() {
        core.switchToTab(7);
    }

    @Then("^IT Staff Augmentation Company page is opened$")
    public void itStaffAugmentationCompanyPageIsOpened() {
        Assert.assertTrue(
                "IT Staff Augmentation Company page isn't opened",
                core.elementByXpathIsVisible(DedicatedTeamPage.IT_STAFF_AUGUMENTATION_COMPANY_TITLE)
        );
    }

    @Then("^Learn more button third is displayed$")
    public void learnMoreButtonThirdIsDisplayed() {
        Assert.assertTrue(
                "Learn more button third isn't displayed",
                core.elementByXpathIsVisible(DedicatedTeamPage.LEARN_MORE_BUTTON_THIRD)
        );
    }

    @When("^click on Learn more button third$")
    public void clickOnLearnMoreButtonThird() {
        core.clickUsingJSExecutor(DedicatedTeamPage.LEARN_MORE_BUTTON_THIRD);
    }

    @Then("^switch to the Hire Full Stack Developers tab$")
    public void switchToTheHireFullStackDevelopersTab() {
        core.switchToTab(8);
    }

    @Then("^Hire Full Stack Developers page is opened$")
    public void hireFullStackDevelopersPageIsOpened() {
        Assert.assertTrue(
                "Hire Full Stack Developers page isn't opened",
                core.elementByXpathIsVisible(DedicatedTeamPage.HIRE_FULL_STACK_DEVELOPERS_TITLE)
        );
    }
}