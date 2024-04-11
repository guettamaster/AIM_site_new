package project.steps;


import cucumber.api.java.en.Given;
import net.thucydides.core.steps.ScenarioSteps;
import project.ui.pageObj.CorePageObjects;
import project.utils.PropertyManager;

public class BrowserSteps extends ScenarioSteps {

    private CorePageObjects core;

    @Given("^open home page$")
    public void openHomePage() {
        core.goToURL(PropertyManager.getInstance().getAimPageUrl());
    }

}
