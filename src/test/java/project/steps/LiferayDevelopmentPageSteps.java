package project.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;
import project.ui.pageObj.CorePageObjects;
import project.ui.xpath_locators.EducationPage;
import project.ui.xpath_locators.HomePage;
import project.ui.xpath_locators.HybrisDevelopmentPage;
import project.ui.xpath_locators.LiferayDevelopmentPage;

public class LiferayDevelopmentPageSteps extends ScenarioSteps {

    private CorePageObjects core;

    @Then("^Liferay Development page is opened$")
    public void liferayDevelopmentPageIsOpened() {
        Assert.assertTrue(
                "Liferay Development page isn't opened",
                core.elementByXpathIsVisible(LiferayDevelopmentPage.LIFERAY_DEVELOPMENT_TITLE)
        );
    }

    @Then("^Liferay Community or Enterprise Editions link is displayed$")
    public void liferayCommunityOrEnterpriseEditionsLinkIsDisplayed() {
        Assert.assertTrue(
                "Liferay Community or Enterprise Editions link isn't opened",
                core.elementByXpathIsVisible(LiferayDevelopmentPage.LIFERAY_COMMUNITY_OR_ENTERPRISE_EDITIONS_LINK)
        );
    }

    @When("^click on the Liferay Community or Enterprise Editions link$")
    public void clickOnTheLiferayCommunityOrEnterpriseEditionsLink() {
        core.clickUsingJSExecutor(LiferayDevelopmentPage.LIFERAY_COMMUNITY_OR_ENTERPRISE_EDITIONS_LINK);
    }

    @Then("^switch to the Liferay Community or Enterprise Editions tab$")
    public void switchToTheLiferayCommunityOrEnterpriseEditionsTab() {
        core.switchToTab(2);
    }

    @Then("^\"([^\"]*)\" article is opened$")
    public void articleIsOpened(String text) throws Throwable {
        Assert.assertTrue(
                "article isn't opened",
                core.elementByXpathIsVisible(LiferayDevelopmentPage.ARTICLE_TITLE.replace("$1", text))
        );
    }

    @Then("^\"([^\"]*)\" active tab is displayed$")
    public void activeTabIsDisplayed(String text) throws Throwable {
        Assert.assertTrue(
                "active tab isn't displayed",
                core.elementByXpathIsVisible(LiferayDevelopmentPage.ACTIVE_TAB.replace("$1", text))
        );
    }

    @When("^click on the \"([^\"]*)\" active tab$")
    public void clickOnTheActiveTab(String text) throws Throwable {
        core.clickUsingJSExecutor(LiferayDevelopmentPage.ACTIVE_TAB.replace("$1", text));
    }

    @When("^navigate on \"([^\"]*)\" title in the Stack section$")
    public void navigateOnTitleInTheStackSection(String text) throws Throwable {
        core.scrollToElementByXpathUsingJsExecutor(LiferayDevelopmentPage.TECHNOLOGY_TITLE.replace("$1", text));
    }

    @Then("^\"([^\"]*)\" tile in the Cooperation With Us section is displayed$")
    public void tileInTheCooperationWithUsSectionIsDisplayed(String text) throws Throwable {
        Assert.assertTrue(
                "tile in the Cooperation With Us section isn't displayed",
                core.elementByXpathIsVisible(LiferayDevelopmentPage.TILE_IN_THE_COOPERATION_WITH_US_SECTION.replace("$1", text))
        );
    }

    @When("^navigate on \"([^\"]*)\" client title in the Testimonials section$")
    public void navigateOnClientTitleInTheTestimonialsSection(String text) throws Throwable {
        core.scrollToElementByXpathUsingJsExecutor(HomePage.CLIENTS_NAME_TITLE.replace("$1", text));
    }

    @When("^navigate on right arrow third in the Clients carousel$")
    public void navigateOnRightArrowThirdInTheClientsCarousel() {
        core.scrollToElementByXpathUsingJsExecutor(LiferayDevelopmentPage.RIGHT_ARROW_THIRD_IN_THE_CLIENTS_CAROUSEL);
    }

    @When("^click right arrow third in the Clients carousel$")
    public void clickRightArrowThirdInTheClientsCarousel() {
        core.clickUsingJSExecutor(LiferayDevelopmentPage.RIGHT_ARROW_THIRD_IN_THE_CLIENTS_CAROUSEL);
    }
}
