package project.steps;

import cucumber.api.java.en.Then;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;
import project.ui.pageObj.CorePageObjects;
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


}
