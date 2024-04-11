package project.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;
import project.ui.pageObj.CorePageObjects;
import project.ui.xpath_locators.EducationPage;
import project.ui.xpath_locators.HomePage;

public class EducationPageSteps extends ScenarioSteps {

    private CorePageObjects core;

    @When("^click \"([^\"]*)\" link$")
    public void clickLink(String text) throws Throwable {
        core.clickOnElementByXpath(HomePage.HEADER_LINK.replace("$1", text));
    }

    @Then("^Education page is opened$")
    public void educationPageIsOpened() {
        Assert.assertTrue(
                "Education page isn't opened",
                core.elementByXpathIsVisible(EducationPage.EDUCATION_TITLE)
        );
    }

    @Then("^Educational Software Development Services title is displayed$")
    public void educationalSoftwareDevelopmentServicesTitleIsDisplayed() {
        Assert.assertTrue(
                "Educational Software Development Services title isn't displayed",
                core.elementByXpathIsVisible(EducationPage.EDUCATIONAL_SOFTWARE_DEVELOPMENT_SERVICES_TITLE)
        );
    }

    @Then("^\"([^\"]*)\" button is displayed$")
    public void buttonIsDisplayed(String text) throws Throwable {
        Assert.assertTrue(
                "button isn't displayed",
                core.elementByXpathIsVisible(EducationPage.GET_STARTED_BUTTON.replace("$1", text))
        );
    }

    @When("^click on \"([^\"]*)\" button$")
    public void clickOnButton(String text) throws Throwable {
        core.clickUsingJSExecutor(EducationPage.GET_STARTED_BUTTON.replace("$1", text));
    }

    @Then("^Let us help with your title is displayed$")
    public void letUsHelpWithYourTitleIsDisplayed() {
        Assert.assertTrue(
                "Let us help with your title isn't displayed",
                core.elementByXpathIsVisible(EducationPage.LET_US_HELP_WITH_YOUR_TITLE)
        );
    }

    @Then("^e-learning title is displayed$")
    public void eLearningTitleIsDisplayed() {
        Assert.assertTrue(
                "e-learning title isn't displayed",
                core.elementByXpathIsVisible(EducationPage.E_LEARNING_TITLE)
        );
    }

    @When("^navigate on Educational Software Development Services title$")
    public void navigateOnEducationalSoftwareDevelopmentServicesTitle() {
        core.hoverOnElement(EducationPage.EDUCATIONAL_SOFTWARE_DEVELOPMENT_SERVICES_TITLE);
    }

    @Then("^scroll down to Education discover link is presented$")
    public void scrollDownToEducationDiscoverLinkIsPresented() {
        Assert.assertTrue(
                "scroll down to Education discover link isn't presented",
                core.elementByXpathIsVisible(EducationPage.SCROLL_DOWN_TO_EDUCATION_DISCOVER_LINK)
        );
    }

    @When("^click on scroll down to Education discover link$")
    public void clickOnScrollDownToEducationDiscoverLink() {
        core.clickOnElementByXpath(EducationPage.SCROLL_DOWN_TO_EDUCATION_DISCOVER_LINK);
    }

    @Then("^E-learning software development with Aimprosoft title is displayed$")
    public void eLearningSoftwareDevelopmentWithAimprosoftTitleIsDisplayed() {
        Assert.assertTrue(
                "E-learning software development with Aimprosoft title is displayed",
                core.elementByXpathIsVisible(EducationPage.E_LEARNING_SOFTWARE_DEVELOPMENT_WITH_AIMPROSOFT_TITLE)
        );
    }
}
