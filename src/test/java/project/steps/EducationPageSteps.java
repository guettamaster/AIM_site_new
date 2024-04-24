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
import project.ui.xpath_locators.TransitionToMainPagesFromHomePage;

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

    @When("^navigate on Educational Software Development Services title$")
    public void navigateOnEducationalSoftwareDevelopmentServicesTitle() {
        core.hoverOnElement(EducationPage.EDUCATIONAL_SOFTWARE_DEVELOPMENT_SERVICES_TITLE);
    }

    @Then("^E-learning software development with Aimprosoft title is displayed$")
    public void eLearningSoftwareDevelopmentWithAimprosoftTitleIsDisplayed() {
        Assert.assertTrue(
                "E-learning software development with Aimprosoft title is displayed",
                core.elementByXpathIsVisible(EducationPage.E_LEARNING_SOFTWARE_DEVELOPMENT_WITH_AIMPROSOFT_TITLE)
        );
    }

    @Then("^\"([^\"]*)\" subtitle is displayed$")
    public void subtitleIsDisplayed(String text) throws Throwable {
        Assert.assertTrue(
                "subtitle isn't displayed",
                core.elementByXpathIsVisible(EducationPage.SUBTITLE_INSIDE_PAGE.replace("$1", text))
        );
    }

    @When("^navigate on \"([^\"]*)\" general title$")
    public void navigateOnGeneralTitle(String text) throws Throwable {
        core.hoverOnElement(TransitionToMainPagesFromHomePage.GENERAL_TITLE_ON_THE_MAIN_PAGE.replace("$1", text));
    }

    @Then("^\"([^\"]*)\" link is presented$")
    public void linkIsPresented(String text) throws Throwable {
        Assert.assertTrue(
                "link isn't displayed",
                core.elementByXpathIsVisible(EducationPage.SCROLL_DOWN_TO_DISCOVER_LINK.replace("$1", text))
        );
    }

    @When("^click on \"([^\"]*)\" link$")
    public void clickOnLink(String text) throws Throwable {
        core.clickUsingJSExecutor(EducationPage.SCROLL_DOWN_TO_DISCOVER_LINK.replace("$1", text));
    }


    @When("^navigate on \"([^\"]*)\" title$")
    public void navigateOnTitle(String text) throws Throwable {
        core.hoverOnElement(EducationPage.NEED_ASSISTANCE_WITH_YOUR_PROJECT_TITLE.replace("$1", text));
    }

    @When("^navigate on \"([^\"]*)\" subtitle$")
    public void navigateOnSubtitle(String text) throws Throwable {
        core.hoverOnElement(EducationPage.SUBTITLE_INSIDE_PAGE.replace("$1", text));
    }

    @When("^navigate on right arrow inside Our Clients section$")
    public void navigateOnRightArrowInsideOurClientsSection() {
        core.scrollToElementByXpathUsingJsExecutor(EducationPage.RIGHT_ARROW_INSIDE_OUR_CLIENTS_SECTION);
    }

    @When("^click right arrow inside Our Clients section$")
    public void clickRightArrowInsideOurClientsSection() {
        core.clickUsingJSExecutor(EducationPage.RIGHT_ARROW_INSIDE_OUR_CLIENTS_SECTION);
    }

    @Then("^Read case study link is displayed$")
    public void readCaseStudyLinkIsDisplayed() {
        Assert.assertTrue(
                "Read case study link isn't displayed",
                core.elementByXpathIsVisible(EducationPage.READ_CASE_STUDY_LINK)
        );
    }

    @When("^click Read case study link$")
    public void clickReadCaseStudyLink() {
        core.clickUsingJSExecutor(EducationPage.READ_CASE_STUDY_LINK);
    }

    @Then("^\"([^\"]*)\" case study page is opened$")
    public void caseStudyPageIsOpened(String text) throws Throwable {
        Assert.assertTrue(
                "case study page isn't opened",
                core.elementByXpathIsVisible(EducationPage.CASE_STUDY_BREADCRUMBS.replace("$1", text))
        );
    }

    @Then("^Read case study link first is displayed$")
    public void readCaseStudyLinkFirstIsDisplayed() {
        Assert.assertTrue(
                "Read case study link first isn't displayed",
                core.elementByXpathIsVisible(EducationPage.READ_CASE_STUDY_LINK_FIRST)
        );
    }

    @When("^click Read case study link first$")
    public void clickReadCaseStudyLinkFirst() {
        core.clickUsingJSExecutor(EducationPage.READ_CASE_STUDY_LINK_FIRST);
    }

    @When("^navigate on right arrow first inside Our Clients section$")
    public void navigateOnRightArrowFirstInsideOurClientsSection() {
        core.scrollToElementByXpathUsingJsExecutor(EducationPage.RIGHT_ARROW_FIRST_INSIDE_OUR_CLIENTS_SECTION);
    }

    @When("^click right arrow first inside Our Clients section$")
    public void clickRightArrowFirstInsideOurClientsSection() {
        core.clickUsingJSExecutor(EducationPage.RIGHT_ARROW_FIRST_INSIDE_OUR_CLIENTS_SECTION);
    }
}
