package project.steps;

import cucumber.api.java.en.Then;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;
import project.ui.pageObj.CorePageObjects;
import project.ui.xpath_locators.AlfrescoDevelopmentPage;

public class AlfrescoDevelopmentPageSteps extends ScenarioSteps {

    private CorePageObjects core;

    @Then("^Alfresco Development page is opened$")
    public void alfrescoDevelopmentPageIsOpened() {
        Assert.assertTrue(
                "Alfresco Development page isn't opened",
                core.elementByXpathIsVisible(AlfrescoDevelopmentPage.ALFRESCO_DEVELOPMENT_TITLE)
        );
    }

    @Then("^Java icon on the Stack section is displayed$")
    public void javaIconOnTheStackSectionIsDisplayed() {
        Assert.assertTrue(
                "Java icon on the Stack section isn't opened",
                core.elementByXpathIsVisible(AlfrescoDevelopmentPage.JAVA_ICON)
        );
    }

    @Then("^Surf icon on the Stack section is displayed$")
    public void surfIconOnTheStackSectionIsDisplayed() {
        Assert.assertTrue(
                "Surf icon on the Stack section isn't opened",
                core.elementByXpathIsVisible(AlfrescoDevelopmentPage.SURF_ICON)
        );
    }

    @Then("^MyBatis icon on the Stack section is displayed$")
    public void mybatisIconOnTheStackSectionIsDisplayed() {
        Assert.assertTrue(
                "MyBatis icon on the Stack section isn't opened",
                core.elementByXpathIsVisible(AlfrescoDevelopmentPage.MY_BATIS_ICON)
        );
    }

    @Then("^Angular icon on the Stack section is displayed$")
    public void angularIconOnTheStackSectionIsDisplayed() {
        Assert.assertTrue(
                "Angular icon on the Stack section isn't opened",
                core.elementByXpathIsVisible(AlfrescoDevelopmentPage.ANGULAR_ICON)
        );
    }

    @Then("^Yui icon on the Stack section is displayed$")
    public void yuiIconOnTheStackSectionIsDisplayed() {
        Assert.assertTrue(
                "Yui icon on the Stack section isn't opened",
                core.elementByXpathIsVisible(AlfrescoDevelopmentPage.YUI_ICON)
        );
    }

    @Then("^Rhino icon on the Stack section is displayed$")
    public void rhinoIconOnTheStackSectionIsDisplayed() {
        Assert.assertTrue(
                "Rhino icon on the Stack section isn't opened",
                core.elementByXpathIsVisible(AlfrescoDevelopmentPage.RHINO_ICON)
        );
    }

    @Then("^Apache Tomcat icon on the Stack section is displayed$")
    public void apacheTomcatIconOnTheStackSectionIsDisplayed() {
        Assert.assertTrue(
                "Apache Tomcat icon on the Stack section isn't opened",
                core.elementByXpathIsVisible(AlfrescoDevelopmentPage.APACHE_TOMCAT_ICON)
        );
    }

    @Then("^Lucene icon on the Stack section is displayed$")
    public void luceneIconOnTheStackSectionIsDisplayed() {
        Assert.assertTrue(
                "Lucene icon on the Stack section isn't opened",
                core.elementByXpathIsVisible(AlfrescoDevelopmentPage.LUCENE_ICON)
        );
    }

    @Then("^Solr icon on the Stack section is displayed$")
    public void solrIconOnTheStackSectionIsDisplayed() {
        Assert.assertTrue(
                "Solr icon on the Stack section isn't opened",
                core.elementByXpathIsVisible(AlfrescoDevelopmentPage.SOLR_ICON)
        );
    }

    @Then("^BPMN icon on the Stack section is displayed$")
    public void bpmnIconOnTheStackSectionIsDisplayed() {
        Assert.assertTrue(
                "BPMN icon on the Stack section isn't opened",
                core.elementByXpathIsVisible(AlfrescoDevelopmentPage.BPMN_ICON)
        );
    }
}
