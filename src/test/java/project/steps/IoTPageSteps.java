package project.steps;

import cucumber.api.java.en.Then;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;
import project.ui.pageObj.CorePageObjects;
import project.ui.xpath_locators.IoTPage;

public class IoTPageSteps extends ScenarioSteps {

    private CorePageObjects core;

    @Then("^IoT page is opened$")
    public void ioTPageIsOpened() {
        Assert.assertTrue(
                "IoT page isn't opened",
                core.elementByXpathIsVisible(IoTPage.IOT_TITLE)
        );
    }

    @Then("^A cross-platform mobile app to track changes in the food storage conditions title is displayed$")
    public void aCrossPlatformMobileAppToTrackChangesInTheFoodStorageConditionsTitleIsDisplayed() {
        Assert.assertTrue(
                "A cross-platform mobile app to track changes in the food storage conditions title isn't displayed",
                core.elementByXpathIsVisible(IoTPage.A_CROSS_PLATFORM_MOBILE_APP_TO_TRACK_CHANGES_IN_THE_FOOD_STORAGE_CONDITIONS_TITLE)
        );
    }
}
