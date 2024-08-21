package project.steps;

import cucumber.api.java.en.Then;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;
import project.ui.pageObj.CorePageObjects;
import project.ui.xpath_locators.DataSciencePage;

public class DataSciencePageSteps extends ScenarioSteps {

    private CorePageObjects core;

    @Then("^Data Science page is opened$")
    public void dataSciencePageIsOpened() {
        Assert.assertTrue(
                "Data Science page isn't opened",
                core.elementByXpathIsVisible(DataSciencePage.DATA_SCIENCE_TITLE)
        );
    }


}
