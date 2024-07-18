package project.steps;

import cucumber.api.java.en.Then;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;
import project.ui.pageObj.CorePageObjects;
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



}
