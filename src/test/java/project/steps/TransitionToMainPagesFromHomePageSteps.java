package project.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;
import project.ui.pageObj.CorePageObjects;
import project.ui.xpath_locators.HomePage;
import project.ui.xpath_locators.TransitionToMainPagesFromHomePage;
public class TransitionToMainPagesFromHomePageSteps extends ScenarioSteps {

    private CorePageObjects core;

    @Then("^\"([^\"]*)\" general title is displayed$")
    public void generalTitleIsDisplayed(String text) throws Throwable {
        Assert.assertTrue(
                "link isn't displayed",
                core.elementByXpathIsVisible(TransitionToMainPagesFromHomePage.GENERAL_TITLE_ON_THE_MAIN_PAGE.replace("$1", text))
        );
    }

    @When("^navigate on Projects title in the header$")
    public void navigateOnProjectsTitleInTheHeader() {
        core.hoverOnElement(HomePage.PROJECTS_LINK);
    }

    @When("^click Projects link$")
    public void clickProjectsLink() {
        core.clickUsingJSExecutor(HomePage.PROJECTS_LINK);
    }

    @Then("^\"([^\"]*)\" general title is displayed on the Projects page$")
    public void generalTitleIsDisplayedOnTheProjectsPage(String text) throws Throwable {
        Assert.assertTrue(
                "general title isn't displayed on the Projects page",
                core.elementByXpathIsVisible(TransitionToMainPagesFromHomePage.GENERAL_TITLE_ON_THE_PROJECTS_PAGE.replace("$1", text))
        );
    }

    @Then("^eCommerce explore link is displayed$")
    public void ecommerceExploreLinkIsDisplayed() throws Throwable {
            Assert.assertTrue(
                    "eCommerce explore link isn't displayed",
                    core.elementByXpathIsVisible(TransitionToMainPagesFromHomePage.EXPLORE_LINK_FOR_ECOMMERCE)
            );

    }

    @When("^click eCommerce explore link$")
    public void clickECommerceExploreLink() {
        waitABit(500);
        core.clickUsingJSExecutor(TransitionToMainPagesFromHomePage.EXPLORE_LINK_FOR_ECOMMERCE);
    }

    @Then("^Healthcare explore link is displayed$")
    public void healthcareExploreLinkIsDisplayed() {
        Assert.assertTrue(
                "Healthcare explore link isn't displayed",
                core.elementByXpathIsVisible(TransitionToMainPagesFromHomePage.HEALTHCARE_LINK_FOR_ECOMMERCE)
        );
    }

    @When("^click Healthcare explore link$")
    public void clickHealthcareExploreLink() {
        core.clickUsingJSExecutor(TransitionToMainPagesFromHomePage.HEALTHCARE_LINK_FOR_ECOMMERCE);
    }

    @Then("^IoT explore link is displayed$")
    public void iotExploreLinkIsDisplayed() {
        Assert.assertTrue(
                "IoT explore link isn't displayed",
                core.elementByXpathIsVisible(TransitionToMainPagesFromHomePage.IOT_LINK_FOR_ECOMMERCE)
        );
    }

    @When("^click IoT explore link$")
    public void clickIoTExploreLink() {
        core.clickUsingJSExecutor(TransitionToMainPagesFromHomePage.IOT_LINK_FOR_ECOMMERCE);
    }

    @Then("^Real Estate explore link is displayed$")
    public void realEstateExploreLinkIsDisplayed() {
        Assert.assertTrue(
                "Real Estate explore link isn't displayed",
                core.elementByXpathIsVisible(TransitionToMainPagesFromHomePage.REAL_ESTATE_LINK_FOR_ECOMMERCE)
        );
    }

    @When("^click Real Estate explore link$")
    public void clickRealEstateExploreLink() {
        core.clickUsingJSExecutor(TransitionToMainPagesFromHomePage.REAL_ESTATE_LINK_FOR_ECOMMERCE);
    }

    @Then("^Education explore link is displayed$")
    public void educationExploreLinkIsDisplayed() {
        Assert.assertTrue(
                "Education explore link isn't displayed",
                core.elementByXpathIsVisible(TransitionToMainPagesFromHomePage.EDUCATION_LINK_FOR_ECOMMERCE)
        );
    }

    @When("^click Education explore link$")
    public void clickEducationExploreLink() {
        core.clickUsingJSExecutor(TransitionToMainPagesFromHomePage.EDUCATION_LINK_FOR_ECOMMERCE);
    }

    @Then("^Telecom explore link is displayed$")
    public void telecomExploreLinkIsDisplayed() {
        Assert.assertTrue(
                "Telecom explore link isn't displayed",
                core.elementByXpathIsVisible(TransitionToMainPagesFromHomePage.TELECOM_LINK_FOR_ECOMMERCE)
        );
    }

    @When("^click Telecom explore link$")
    public void clickTelecomExploreLink() {
        core.clickUsingJSExecutor(TransitionToMainPagesFromHomePage.TELECOM_LINK_FOR_ECOMMERCE);
    }

    @Then("^Retail explore link is displayed$")
    public void retailExploreLinkIsDisplayed() {
        Assert.assertTrue(
                "Retail explore link isn't displayed",
                core.elementByXpathIsVisible(TransitionToMainPagesFromHomePage.RETAIL_LINK_FOR_ECOMMERCE)
        );
    }

    @When("^click Retail explore link$")
    public void clickRetailExploreLink() {
        core.clickUsingJSExecutor(TransitionToMainPagesFromHomePage.RETAIL_LINK_FOR_ECOMMERCE);
    }

    @When("^click Hybris Development link$")
    public void clickHybrisDevelopmentLink() {
        core.clickUsingJSExecutor(HomePage.HYBRIS_LINK_IN_THE_FOOTER);
    }

    @When("^click Alfresco Development link$")
    public void clickAlfrescoDevelopmentLink() {
        core.clickUsingJSExecutor(HomePage.ALFRESCO_LINK_IN_THE_FOOTER);
    }

    @When("^click Liferay Development link$")
    public void clickLiferayDevelopmentLink() {
        core.clickUsingJSExecutor(HomePage.LIFERAY_LINK_IN_THE_FOOTER);
    }

    @When("^click Web Development link$")
    public void clickWebDevelopmentLink() {
        core.clickUsingJSExecutor(HomePage.WEB_DEVELOPMENT_LINK_IN_THE_FOOTER);
    }

    @When("^click Mobile Development link$")
    public void clickMobileDevelopmentLink() {
        core.clickUsingJSExecutor(HomePage.MOBILE_LINK_IN_THE_FOOTER);
    }

    @When("^click QA and Software Testing link$")
    public void clickQAAndSoftwareTestingLink() {
        core.clickUsingJSExecutor(HomePage.QA_LINK_IN_THE_FOOTER);
    }

    @When("^click Dedicated Team link$")
    public void clickDedicatedTeamLink() {
        core.clickUsingJSExecutor(HomePage.DEDICATED_TEAM_LINK_IN_THE_FOOTER);
    }

    @When("^click Business Analysis link$")
    public void clickBusinessAnalysisLink() {
        core.clickUsingJSExecutor(HomePage.BUSINESS_ANALYSIS_LINK_IN_THE_FOOTER);
    }

    @When("^click UX/UI link$")
    public void clickUXUILink() {
        core.clickUsingJSExecutor(HomePage.UX_UI_DESIGN_LINK_IN_THE_FOOTER);
    }

    @When("^click Data Science link$")
    public void clickDataScienceLink() {
        core.clickUsingJSExecutor(HomePage.DATA_SCIENCE_LINK_IN_THE_FOOTER);
    }

    @When("^click IT Outsourcing link$")
    public void clickITOutsourcingLink() {
        core.clickUsingJSExecutor(HomePage.IT_OUTSOURCING_LINK_IN_THE_FOOTER);
    }

    @When("^click Front end link$")
    public void clickFrontEndLink() {
        core.clickUsingJSExecutor(HomePage.FRONT_END_LINK_IN_THE_FOOTER);
    }

    @When("^click Backend link$")
    public void clickBackendLink() {
        core.clickUsingJSExecutor(HomePage.BACKEND_LINK_IN_THE_FOOTER);
    }

    @When("^click Java Outsourcing link$")
    public void clickJavaOutsourcingLink() {
        core.clickUsingJSExecutor(HomePage.JAVA_OUTSOURCING_LINK_IN_THE_FOOTER);
    }

    @When("^click Python Development link$")
    public void clickPythonDevelopmentLink() {
        core.clickUsingJSExecutor(HomePage.PYTHON_DEVELOPMENT_LINK_IN_THE_FOOTER);
    }

    @When("^click Outsourcing Web link$")
    public void clickOutsourcingWebLink() {
        core.clickUsingJSExecutor(HomePage.OUTSOURCING_WEB_LINK_IN_THE_FOOTER);
    }

    @When("^click IT Staff Augumentation link$")
    public void clickITStaffAugumentationLink() {
        core.clickUsingJSExecutor(HomePage.IT_STAFF_AUGUMENTATION_LINK_IN_THE_FOOTER);
    }

    @When("^click Offshore Software link$")
    public void clickOffshoreSoftwareLink() {
        core.clickUsingJSExecutor(HomePage.OFFSHORE_SOFTWARE_LINK_IN_THE_FOOTER);
    }

    @When("^click Nearshore Software link$")
    public void clickNearshoreSoftwareLink() {
        core.clickUsingJSExecutor(HomePage.NEARSHORE_SOFTWARE_LINK_IN_THE_FOOTER);
    }

    @When("^click Java link$")
    public void clickJavaLink() {
        core.clickUsingJSExecutor(HomePage.JAVA_LINK_IN_THE_FOOTER);
    }

    @When("^click Python link$")
    public void clickPythonLink() {
        core.clickUsingJSExecutor(HomePage.PYTHON_LINK_IN_THE_FOOTER);
    }

    @When("^click \\.NET link$")
    public void clickNETLink() {
        core.clickUsingJSExecutor(HomePage.DOT_NET_LINK_IN_THE_FOOTER);
    }

    @When("^click JavaScript link$")
    public void clickJavaScriptLink() {
        core.clickUsingJSExecutor(HomePage.JAVASCRIPT_LINK_IN_THE_FOOTER);
    }

    @When("^click Swift link$")
    public void clickSwiftLink() {
        core.clickUsingJSExecutor(HomePage.SWIFT_LINK_IN_THE_FOOTER);
    }

    @When("^click Kotlin link$")
    public void clickKotlinLink() {
        core.clickUsingJSExecutor(HomePage.KOTLIN_LINK_IN_THE_FOOTER);
    }

    @When("^click React\\.js link$")
    public void clickReactJsLink() {
        core.clickUsingJSExecutor(HomePage.REACT_JS_LINK_IN_THE_FOOTER);
    }

    @When("^click Angular link$")
    public void clickAngularLink() {
        core.clickUsingJSExecutor(HomePage.ANGULAR_LINK_IN_THE_FOOTER);
    }

    @When("^click Node\\.js link$")
    public void clickNodeJsLink() {
        core.clickUsingJSExecutor(HomePage.NODE_JS_LINK_IN_THE_FOOTER);
    }

    @When("^click Hire Node\\.js link$")
    public void clickHireNodeJsLink() {
        core.clickUsingJSExecutor(HomePage.HIRE_NODE_JS_LINK_IN_THE_FOOTER);
    }

    @When("^click Hire React Native link$")
    public void clickHireReactNativeLink() {
        core.clickUsingJSExecutor(HomePage.HIRE_REACT_NATIVE_LINK_IN_THE_FOOTER);
    }

    @When("^click Hire \\.NET link$")
    public void clickHireNETLink() {
        core.clickUsingJSExecutor(HomePage.HIRE_DOT_NET_LINK_IN_THE_FOOTER);
    }

    @When("^click Hire Web link$")
    public void clickHireWebLink() {
        core.clickUsingJSExecutor(HomePage.HIRE_WEB_LINK_IN_THE_FOOTER);
    }

    @When("^click Hire Laravel link$")
    public void clickHireLaravelLink() {
        core.clickUsingJSExecutor(HomePage.HIRE_LARAVEL_LINK_IN_THE_FOOTER);
    }

    @When("^click Hire Backend link$")
    public void clickHireBackendLink() {
        core.clickUsingJSExecutor(HomePage.HIRE_BACKEND_LINK_IN_THE_FOOTER);
    }

    @When("^click Hire Full Stack link$")
    public void clickHireFullStackLink() {
        core.clickUsingJSExecutor(HomePage.HIRE_FULL_STACK_LINK_IN_THE_FOOTER);
    }

    @When("^click Hire Frontend link$")
    public void clickHireFrontendLink() {
        core.clickUsingJSExecutor(HomePage.HIRE_FRONTEND_LINK_IN_THE_FOOTER);
    }

    @When("^click DevOps Consulting link$")
    public void clickDevOpsConsultingLink() {
        core.clickUsingJSExecutor(HomePage.DEVOPS_CONSULTING_LINK_IN_THE_FOOTER);
    }

    @When("^click Ecommerce Consulting link$")
    public void clickEcommerceConsultingLink() {
        core.clickUsingJSExecutor(HomePage.ECOMMERCE_CONSULTING_LINK_IN_THE_FOOTER);
    }

    @When("^click Machine Learning link$")
    public void clickMachineLearningLink() {
        core.clickUsingJSExecutor(HomePage.MACHINE_LEARNING_LINK_IN_THE_FOOTER);
    }

    @When("^click AWS Consulting Partner link$")
    public void clickAWSConsultingPartnerLink() {
        core.clickUsingJSExecutor(HomePage.AWS_CONSULTING_PARTNER_LINK_IN_THE_FOOTER);
    }

    @When("^click Agile Consulting link$")
    public void clickAgileConsultingLink() {
        core.clickUsingJSExecutor(HomePage.AGILE_CONSULTING_LINK_IN_THE_FOOTER);
    }

    @When("^click Arizona link$")
    public void clickArizonaLink() {
        core.clickUsingJSExecutor(HomePage.ARIZONA_LINK_IN_THE_FOOTER);
    }

    @When("^click London link$")
    public void clickLondonLink() {
        core.clickUsingJSExecutor(HomePage.LONDON_LINK_IN_THE_FOOTER);
    }

    @When("^click Winston Salem link$")
    public void clickWinstonSalemLink() {
        core.clickUsingJSExecutor(HomePage.WINSTON_SALEM_LINK_IN_THE_FOOTER);
    }

    @When("^click on \"([^\"]*)\" company link in the footer$")
    public void clickOnCompanyLinkInTheFooter(String text) throws Throwable {
        core.clickOnElementByXpath(HomePage.COMPANY_LINK_IN_THE_FOOTER.replace("$1", text));
    }

    @Then("^View open vacancies button is displayed$")
    public void viewOpenVacanciesButtonIsDisplayed() {
        Assert.assertTrue(
                "View open vacancies button isn't displayed",
                core.elementByXpathIsVisible(TransitionToMainPagesFromHomePage.VIEW_OPEN_VACANCIES_BUTTON)
        );
    }

    @Then("^Explore the way Aimprosoft helps businesses breathe life into mere ideas and go through digital transformation journey successfully\\. text is displayed$")
    public void exploreTheWayAimprosoftHelpsBusinessesBreatheLifeIntoMereIdeasAndGoThroughDigitalTransformationJourneySuccessfullyTextIsDisplayed() {
        Assert.assertTrue(
                "General text on the projects page isn't displayed",
                core.elementByXpathIsVisible(TransitionToMainPagesFromHomePage.GENERAL_TEXT_ON_THE_PROJECTS_PAGE)
        );
    }

    @Then("^\"([^\"]*)\" tab is displayed$")
    public void tabIsDisplayed(String text) throws Throwable {
        Assert.assertTrue(
                "tab isn't displayed",
                core.elementByXpathIsVisible(TransitionToMainPagesFromHomePage.TAB_ON_THE_PROJECTS_OR_BLOGS_PAGE.replace("$1", text))
        );
    }

    @Then("^Our knowledge and skill set are constantly growing, and we enjoy sharing obtained insights in the form of engaging and comprehensible content\\. Explore our blog posts for useful development tips, step-by-step guides, current trends, and company news\\. text is displayed$")
    public void ourKnowledgeAndSkillSetAreConstantlyGrowingAndWeEnjoySharingObtainedInsightsInTheFormOfEngagingAndComprehensibleContentExploreOurBlogPostsForUsefulDevelopmentTipsStepByStepGuidesCurrentTrendsAndCompanyNewsTextIsDisplayed() {
        Assert.assertTrue(
                "General text on the blog page isn't displayed",
                core.elementByXpathIsVisible(TransitionToMainPagesFromHomePage.GENERAL_TEXT_ON_THE_BLOG_PAGE)
        );
    }

    @Then("^We are here to help with your questions\\. Write us a message, and we will get back to you shortly\\. text is displayed$")
    public void weAreHereToHelpWithYourQuestionsWriteUsAMessageAndWeWillGetBackToYouShortlyTextIsDisplayed() {
        Assert.assertTrue(
                "General text on the contact page isn't displayed",
                core.elementByXpathIsVisible(TransitionToMainPagesFromHomePage.GENERAL_TEXT_ON_THE_CONTACT_PAGE)
        );
    }

    @Then("^Table of contents title is displayed$")
    public void tableOfContentsTitleIsDisplayed() {
        Assert.assertTrue(
                "Table of contents title isn't displayed",
                core.elementByXpathIsVisible(TransitionToMainPagesFromHomePage.TITLE1_ON_THE_PRIVACY_POLICY_PAGE)
        );
    }

    @Then("^Personal information we collect and use title is displayed$")
    public void personalInformationWeCollectAndUseTitleIsDisplayed() {
        Assert.assertTrue(
                "Personal information we collect and use title isn't displayed",
                core.elementByXpathIsVisible(TransitionToMainPagesFromHomePage.TITLE2_ON_THE_PRIVACY_POLICY_PAGE)
        );
    }

    @Then("^\"([^\"]*)\" sitemap title is displayed$")
    public void sitemapTitleIsDisplayed(String text) throws Throwable {
        Assert.assertTrue(
                "sitemap title isn't displayed",
                core.elementByXpathIsVisible(TransitionToMainPagesFromHomePage.SITEMAP_TITLE.replace("$1", text))
        );
    }

    @Then("^Hybris Development service title is displayed$")
    public void hybrisDevelopmentServiceTitleIsDisplayed() {
        Assert.assertTrue(
                "Hybris Development service title isn't displayed",
                core.elementByXpathIsVisible(TransitionToMainPagesFromHomePage.HYBRIS_DEVELOPMENT_SERVICE_LINK)
        );
    }

    @When("^click Hybris Development service link$")
    public void clickHybrisDevelopmentServiceLink() {
        core.clickOnElementByXpath(TransitionToMainPagesFromHomePage.HYBRIS_DEVELOPMENT_SERVICE_LINK);
    }

    @Then("^QA and Software Testing service title is displayed$")
    public void qaAndSoftwareTestingServiceTitleIsDisplayed() {
        Assert.assertTrue(
                "QA and Software Testing service title isn't displayed",
                core.elementByXpathIsVisible(TransitionToMainPagesFromHomePage.QA_AND_SOFTWARE_TESTING_SERVICE_LINK)
        );
    }
    @When("^click QA and Software Testing service link$")
    public void clickQAAndSoftwareTestingServiceLink() {
        core.clickOnElementByXpath(TransitionToMainPagesFromHomePage.QA_AND_SOFTWARE_TESTING_SERVICE_LINK);
    }

    @Then("^Alfresco Development service title is displayed$")
    public void alfrescoDevelopmentServiceTitleIsDisplayed() {
        Assert.assertTrue(
                "Alfresco Development service title isn't displayed",
                core.elementByXpathIsVisible(TransitionToMainPagesFromHomePage.ALFRESCO_DEVELOPMENT_SERVICE_LINK)
        );
    }
    @When("^click Alfresco Development service link$")
    public void clickAlfrescoDevelopmentServiceLink() {
        core.clickOnElementByXpath(TransitionToMainPagesFromHomePage.ALFRESCO_DEVELOPMENT_SERVICE_LINK);
    }

    @Then("^Liferay Development service title is displayed$")
    public void liferayDevelopmentServiceTitleIsDisplayed() {
        Assert.assertTrue(
                "Liferay Development service title isn't displayed",
                core.elementByXpathIsVisible(TransitionToMainPagesFromHomePage.LIFERAY_DEVELOPMENT_SERVICE_LINK)
        );
    }
    @When("^click Liferay Development service link$")
    public void clickLiferayDevelopmentServiceLink() {
        core.clickOnElementByXpath(TransitionToMainPagesFromHomePage.LIFERAY_DEVELOPMENT_SERVICE_LINK);
    }

    @Then("^Web Development service title is displayed$")
    public void webDevelopmentServiceTitleIsDisplayed() {
        Assert.assertTrue(
                "Web Development service title isn't displayed",
                core.elementByXpathIsVisible(TransitionToMainPagesFromHomePage.WEB_DEVELOPMENT_SERVICE_LINK)
        );
    }
    @When("^click Web Development service link$")
    public void clickWebDevelopmentServiceLink() {
        core.clickOnElementByXpath(TransitionToMainPagesFromHomePage.WEB_DEVELOPMENT_SERVICE_LINK);
    }
    @Then("^Mobile Development service title is displayed$")
    public void mobileDevelopmentServiceTitleIsDisplayed() {
        Assert.assertTrue(
                "Mobile Development service title isn't displayed",
                core.elementByXpathIsVisible(TransitionToMainPagesFromHomePage.MOBILE_DEVELOPMENT_SERVICE_LINK)
        );
    }
    @When("^click Mobile Development service link$")
    public void clickMobileDevelopmentServiceLink() {
        core.clickOnElementByXpath(TransitionToMainPagesFromHomePage.MOBILE_DEVELOPMENT_SERVICE_LINK);
    }
    @Then("^Business Analysis service title is displayed$")
    public void businessAnalysisServiceTitleIsDisplayed() {
        Assert.assertTrue(
                "Business Analysis service title isn't displayed",
                core.elementByXpathIsVisible(TransitionToMainPagesFromHomePage.BUSINESS_ANALYSIS_SERVICE_LINK)
        );
    }
    @When("^click Business Analysis service link$")
    public void clickBusinessAnalysisServiceLink() {
        core.clickOnElementByXpath(TransitionToMainPagesFromHomePage.BUSINESS_ANALYSIS_SERVICE_LINK);
    }

    @Then("^Dedicated Team service title is displayed$")
    public void dedicatedTeamServiceTitleIsDisplayed() {
        Assert.assertTrue(
                "Dedicated Team service title isn't displayed",
                core.elementByXpathIsVisible(TransitionToMainPagesFromHomePage.DEDICATED_TEAM_SERVICE_LINK)
        );
    }

    @When("^click Dedicated Team service link$")
    public void clickDedicatedTeamServiceLink() {
        core.clickOnElementByXpath(TransitionToMainPagesFromHomePage.DEDICATED_TEAM_SERVICE_LINK);
    }

    @Then("^UX/UI Design service title is displayed$")
    public void uxUIDesignServiceTitleIsDisplayed() {
        Assert.assertTrue(
                "UX/UI Design service title isn't displayed",
                core.elementByXpathIsVisible(TransitionToMainPagesFromHomePage.UX_UI_DESIGN_SERVICE_LINK)
        );
    }

    @When("^click UX/UI Design service link$")
    public void clickUXUIDesignServiceLink() {
        core.clickOnElementByXpath(TransitionToMainPagesFromHomePage.UX_UI_DESIGN_SERVICE_LINK);
    }

    @Then("^Data Science service title is displayed$")
    public void dataScienceServiceTitleIsDisplayed() {
        Assert.assertTrue(
                "Data Science service title isn't displayed",
                core.elementByXpathIsVisible(TransitionToMainPagesFromHomePage.DATA_SCIENCE_SERVICE_LINK)
        );
    }

    @When("^click Data Science service link$")
    public void clickDataScienceServiceLink() {
        core.clickOnElementByXpath(TransitionToMainPagesFromHomePage.DATA_SCIENCE_SERVICE_LINK);
    }
}