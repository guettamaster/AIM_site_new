package project.steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;
import project.ui.pageObj.CorePageObjects;
import project.ui.xpath_locators.HomePage;

public class HomePageSteps extends ScenarioSteps {

    private CorePageObjects core;

    @When("^navigate on \"([^\"]*)\" title in the header$")
    public void navigateOnTitleInTheHeader(String text) throws Throwable {
//        waitABit(500);
        core.hoverOnElement(HomePage.HEADER_TITLE.replace("$1", text));
    }

    @Then("^\"([^\"]*)\" link is displayed$")
    public void linkIsDisplayed(String text) throws Throwable {
        Assert.assertTrue(
                "link isn't displayed",
                core.elementByXpathIsVisible(HomePage.HEADER_LINK.replace("$1", text))
        );
    }

    @Then("^Custom Software Development Company title is displayed$")
    public void customSoftwareDevelopmentCompanyTitleIsDisplayed() throws Throwable {
        Assert.assertTrue(
                "Custom Software Development Company title isn't displayed",
                core.elementByXpathIsVisible(HomePage.CUSTOMER_SOFTWARE_DEVELOPMENT_COMPANY_TITLE)
        );
    }

    @Then("^scroll down to discover link is presented$")
    public void scrollDownToDiscoverLinkIsPresented() {
        Assert.assertTrue(
                "scroll down to discover link isn't presented",
                core.elementByXpathIsVisible(HomePage.SCROLL_DOWN_TO_DISCOVER_LINK)
        );
    }

    @Then("^Business process title is displayed$")
    public void businessProcessTitleIsDisplayed() throws Throwable {
        Assert.assertTrue(
                "Business process title isn't displayed",
                core.elementByXpathIsVisible(HomePage.BUSINESS_PROCESS_TITLE)
        );
    }

    @Then("^\"([^\"]*)\" title is displayed$")
    public void titleIsDisplayed(String text) throws Throwable {
        Assert.assertTrue(
                "title isn't displayed",
                core.elementByXpathIsVisible(HomePage.TITLE_INSIDE_BUSINESS_PROCESS.replace("$1", text))
        );
    }

    @Then("^\"([^\"]*)\" link in the Industries block is displayed$")
    public void linkInTheIndustriesBlockIsDisplayed(String text) throws Throwable {
        Assert.assertTrue(
                "link in the Industries block isn't displayed",
                core.elementByXpathIsVisible(HomePage.LINK_IN_THE_INDUSTRIES_BLOCK.replace("$1", text))
        );
    }

    @When("^click \"([^\"]*)\" link in the Industries block$")
    public void clickLinkInTheIndustriesBlock(String text) throws Throwable {
        core.clickUsingJSExecutor(HomePage.LINK_IN_THE_INDUSTRIES_BLOCK.replace("$1", text));
    }

    @When("^click on scroll down to discover link$")
    public void clickOnScrollDownToDiscoverLink() {
        core.clickOnElementByXpath(HomePage.SCROLL_DOWN_TO_DISCOVER_LINK);
    }

    @When("^navigate on \"([^\"]*)\" title in the Industries block$")
    public void navigateOnTitleInTheIndustriesBlockString(String text) throws Throwable {
        waitABit(1000);
        core.hoverOnElement(HomePage.LINK_IN_THE_INDUSTRIES_BLOCK.replace("$1", text));
    }

    @Then("^Services title is displayed$")
    public void servicesTitleIsDisplayed() throws Throwable {
        Assert.assertTrue(
                "Services title isn't displayed",
                core.elementByXpathIsVisible(HomePage.SERVICES_TITLE)
        );
    }

    @When("^navigate on Services title$")
    public void navigateOnServicesTitle() throws Throwable {
        core.hoverOnElement(HomePage.SERVICES_TITLE);
    }

    @When("^click right arrow in the carousel$")
    public void clickRightArrowInTheCarousel() {
        core.clickUsingJSExecutor(HomePage.RIGHT_ARROW_IN_THE_SERVICES_CAROUSEL);
    }

    @When("^navigate on right arrow in the carousel$")
    public void navigateOnRightArrowInTheCarousel() throws Throwable {
        core.scrollToElementByXpathUsingJsExecutor(HomePage.RIGHT_ARROW_IN_THE_SERVICES_CAROUSEL);
    }

    @When("^navigate on Technologies title$")
    public void navigateOnTechnologiesTitle() {
        core.hoverOnElement(HomePage.TECHNOLOGIES_TITLE);
    }

    @Then("^Technologies title is displayed$")
    public void technologiesTitleIsDisplayed() {
        Assert.assertTrue(
                "Technologies title isn't displayed",
                core.elementByXpathIsVisible(HomePage.TECHNOLOGIES_TITLE)
        );
    }

    @Then("^Web development title is displayed$")
    public void webDevelopmentTitleIsDisplayed() {
        Assert.assertTrue(
                "Web development title isn't displayed",
                core.elementByXpathIsVisible(HomePage.WEB_DEVELOPMENT_TITLE)
        );
    }

    @Then("^\"([^\"]*)\" word is displayed$")
    public void wordIsDisplayed(String text) throws Throwable {
        Assert.assertTrue(
                "word isn't displayed",
                core.elementByXpathIsVisible(HomePage.TECHNOLOGIES_WORD.replace("$1", text))
        );
    }

    @Then("^\"([^\"]*)\" icon is displayed$")
    public void iconIsDisplayed(String text) throws Throwable {
        Assert.assertTrue(
                "icon isn't displayed",
                core.elementByXpathIsVisible(HomePage.TECHNOLOGIES_ICON.replace("$1", text))
        );
    }

    @When("^click Mobile development title$")
    public void clickMobileDevelopmentTitle() {
        core.clickUsingJSExecutor(HomePage.MOBILE_DEVELOPMENT_TITLE);
    }

    @Then("^React icon is displayed$")
    public void reactIconIsDisplayed() {
        Assert.assertTrue(
                "React icon isn't displayed",
                core.elementByXpathIsVisible(HomePage.REACT_ICON)
        );
    }

    @Then("^Java icon is displayed$")
    public void javaIconIsDisplayed() {
        Assert.assertTrue(
                "Java icon isn't displayed",
                core.elementByXpathIsVisible(HomePage.JAVA_ICON)
        );
    }

    @Then("^Why choose us as your business software vendor title is displayed$")
    public void whyChooseUsAsYourBusinessSoftwareVendorTitleIsDisplayed() {
        Assert.assertTrue(
                "Why choose us as your business software vendor title isn't displayed",
                core.elementByXpathIsVisible(HomePage.WHY_CHOOSE_TITLE)
        );
    }

    @When("^navigate on Why choose us as your business software vendor title$")
    public void navigateOnWhyChooseUsAsYourBusinessSoftwareVendorTitle() {
        core.scrollToElementByXpathUsingJsExecutor(HomePage.WHY_CHOOSE_TITLE);
    }


    @When("^navigate on \"([^\"]*)\" title in the Why choose us section$")
    public void navigateOnTitleInTheWhyChooseUsSection(String text) throws Throwable {
        core.hoverOnElement(HomePage.TITLE_INSIDE_BUSINESS_PROCESS.replace("$1", text));
    }


    @When("^navigate on Clients title$")
    public void navigateOnClientsTitle() {
        core.scrollToElementByXpathUsingJsExecutor(HomePage.CLIENTS_TITLE);
    }

    @Then("^Clients title is displayed$")
    public void clientsTitleIsDisplayed() {
        Assert.assertTrue(
                "Clients title isn't displayed",
                core.elementByXpathIsVisible(HomePage.CLIENTS_TITLE)
        );
    }

    @When("^navigate on right arrow in the Clients carousel$")
    public void navigateOnRightArrowInTheClientsCarousel() {
        core.scrollToElementByXpathUsingJsExecutor(HomePage.RIGHT_ARROW_IN_THE_CLIENTS_CAROUSEL);
    }

    @When("^click right arrow in the Clients carousel$")
    public void clickRightArrowInTheClientsCarousel() {
        core.clickUsingJSExecutor(HomePage.RIGHT_ARROW_IN_THE_CLIENTS_CAROUSEL);
    }

    @When("^navigate on Aimprosoft Customers title$")
    public void navigateOnAimprosoftCustomersTitle() {
        core.hoverOnElement(HomePage.CUSTOMERS_TITLE);
    }

    @Then("^Aimprosoft Customers title is displayed$")
    public void aimprosoftCustomersTitleIsDisplayed() {
        Assert.assertTrue(
                "Aimprosoft Customers title isn't displayed",
                core.elementByXpathIsVisible(HomePage.CUSTOMERS_TITLE)
        );
    }

    @When("^navigate on Partners & Achievements title$")
    public void navigateOnPartnersAchievementsTitle() {
        core.hoverOnElement(HomePage.PARTNERS_AND_ACHIEVEMENTS_TITLE);
    }

    @Then("^Partners & Achievements title is displayed$")
    public void partnersAchievementsTitleIsDisplayed() {
        Assert.assertTrue(
                "Partners & Achievements title isn't displayed",
                core.elementByXpathIsVisible(HomePage.PARTNERS_AND_ACHIEVEMENTS_TITLE)
        );
    }

    @When("^navigate on right arrow in the Partners & Achievements carousel$")
    public void navigateOnRightArrowInThePartnersAchievementsCarousel() {
        core.scrollToElementByXpathUsingJsExecutor(HomePage.RIGHT_ARROW_IN_THE_PARTNERS_AND_ACHIEVEMENTS_CAROUSEL);
    }

    @When("^click right arrow in the Partners & Achievements carousel$")
    public void clickRightArrowInThePartnersAchievementsCarousel() {
        core.clickUsingJSExecutor(HomePage.RIGHT_ARROW_IN_THE_PARTNERS_AND_ACHIEVEMENTS_CAROUSEL);
    }

    @When("^navigate on Latest articles in our blog title$")
    public void navigateOnLatestArticlesInOurBlogTitle() {
        core.hoverOnElement(HomePage.LATEST_ARTICLES_IN_OUR_BLOG_TITLE);
    }

    @Then("^Latest articles in our blog title is displayed$")
    public void latestArticlesInOurBlogTitleIsDisplayed() {
        Assert.assertTrue(
                "Latest articles in our blog title isn't displayed",
                core.elementByXpathIsVisible(HomePage.LATEST_ARTICLES_IN_OUR_BLOG_TITLE)
        );
    }

    @Then("^first blog is displayed$")
    public void firstBlogIsDisplayed() {
        Assert.assertTrue(
                "first blog isn't displayed",
                core.elementByXpathIsVisible(HomePage.FIRST_BLOG_ON_HOME_PAGE)
        );
    }

    @Then("^second blog is displayed$")
    public void secondBlogIsDisplayed() {
        Assert.assertTrue(
                "second blog isn't displayed",
                core.elementByXpathIsVisible(HomePage.SECOND_BLOG_ON_HOME_PAGE)
        );
    }

    @Then("^third blog is displayed$")
    public void thirdBlogIsDisplayed() {
        Assert.assertTrue(
                "third blog isn't displayed",
                core.elementByXpathIsVisible(HomePage.THIRD_BLOG_ON_HOME_PAGE)
        );
    }

    @When("^navigate on first blog$")
    public void navigateOnFirstBlog() {
        core.hoverOnElement(HomePage.FIRST_BLOG_ON_HOME_PAGE);
    }

    @Then("^Explore Aimprosoft blog link is displayed$")
    public void exploreAimprosoftBlogLinkIsDisplayed() {
        Assert.assertTrue(
                "Explore Aimprosoft blog link isn't displayed",
                core.elementByXpathIsVisible(HomePage.EXPLORE_AIMPROSOFT_BLOG_LINK)
        );
    }

    @When("^navigate on Explore Aimprosoft blog link$")
    public void navigateOnExploreAimprosoftBlogLink() {
        core.hoverOnElement(HomePage.EXPLORE_AIMPROSOFT_BLOG_LINK);
    }

    @When("^click on Explore Aimprosoft blog link$")
    public void clickOnExploreAimprosoftBlogLink() {
        core.clickUsingJSExecutor(HomePage.EXPLORE_AIMPROSOFT_BLOG_LINK);
    }

    @Then("^Blogs page is opened$")
    public void blogsPageIsOpened() {
        Assert.assertTrue(
                "Blogs page isn't opened",
                core.elementByXpathIsVisible(HomePage.BLOG_BREADCRUMBS)
        );
    }

    @When("^navigate on Frequently Asked Questions title$")
    public void navigateOnFrequentlyAskedQuestionsTitle() {
        core.hoverOnElement(HomePage.FREQUENTLY_ASKED_QUESTIONS_TITLE);
    }

    @Then("^\"([^\"]*)\" item is displayed$")
    public void itemIsDisplayed(String text) throws Throwable {
        Assert.assertTrue(
                "item isn't displayed",
                core.elementByXpathIsVisible(HomePage.FREQUENTLY_ASKED_QUESTIONS_ITEM.replace("$1", text))
        );
    }

    @When("^navigate on Featured in title$")
    public void navigateOnFeaturedInTitle() {
        core.hoverOnElement(HomePage.FEATURED_IN_TITLE);
    }

    @Then("^logo BBC News in the Featured in section is displayed$")
    public void logoBBCNewsInTheFeaturedInSectionIsDisplayed() {
        Assert.assertTrue(
                "logo BBC News in the Featured in section isn't displayed",
                core.elementByXpathIsVisible(HomePage.BBC_NEWS_LOGO)
        );
    }

    @Then("^logo Insider in the Featured in section is displayed$")
    public void logoInsiderInTheFeaturedInSectionIsDisplayed() {
        Assert.assertTrue(
                "logo Insider in the Featured in section isn't displayed",
                core.elementByXpathIsVisible(HomePage.INSIDER_IN_LOGO)
        );
    }

    @Then("^logo CIO in the Featured in section is displayed$")
    public void logoCIOInTheFeaturedInSectionIsDisplayed() {
        Assert.assertTrue(
                "logo CIO in the Featured in section isn't displayed",
                core.elementByXpathIsVisible(HomePage.CIO_LOGO)
        );
    }

    @Then("^logo Der Spiegel in the Featured in section is displayed$")
    public void logoDerSpiegelInTheFeaturedInSectionIsDisplayed() {
        Assert.assertTrue(
                "logo Der Spiegel in the Featured in section isn't displayed",
                core.elementByXpathIsVisible(HomePage.DER_SPIEGEL_LOGO)
        );
    }

    @Then("^logo Tech Eu in the Featured in section is displayed$")
    public void logoTechEuInTheFeaturedInSectionIsDisplayed() {
        Assert.assertTrue(
                "logo Tech Eu in the Featured in section isn't displayed",
                core.elementByXpathIsVisible(HomePage.TECH_EU_LOGO)
        );
    }

    @Then("^logo Computer Weekly in the Featured in section is displayed$")
    public void logoComputerWeeklyInTheFeaturedInSectionIsDisplayed() {
        Assert.assertTrue(
                "logo Computer Weekly in the Featured in section isn't displayed",
                core.elementByXpathIsVisible(HomePage.COMPUTER_WEEKLY_LOGO)
        );
    }

    @Then("^logo Emerging Europe in the Featured in section is displayed$")
    public void logoEmergingEuropeInTheFeaturedInSectionIsDisplayed() {
        Assert.assertTrue(
                "logo Emerging Europe in the Featured in section isn't displayed",
                core.elementByXpathIsVisible(HomePage.EMERGING_EUROPE_LOGO)
        );
    }

    @When("^navigate on logo BBC News$")
    public void navigateOnLogoBBCNews() {
        core.hoverOnElement(HomePage.BBC_NEWS_LOGO);
    }

    @When("^navigate on Aimprosoft logo at the footer$")
    public void navigateOnAimprosoftLogoAtTheFooter() {
        core.hoverOnElement(HomePage.AIMPROSOFT_LOGO_AT_THE_FOOTER);
    }

    @Then("^\"([^\"]*)\" title in the footer is displayed$")
    public void titleInTheFooterIsDisplayed(String text) {
        Assert.assertTrue(
                "title in the footer isn't displayed",
                core.elementByXpathIsVisible(HomePage.TITLE_IN_THE_FOOTER.replace("$1", text))
        );
    }

    @Then("^\"([^\"]*)\" link in the footer is displayed$")
    public void linkInTheFooterIsDisplayed(String text) {
        Assert.assertTrue(
                "link in the footer isn't displayed",
                core.elementByXpathIsVisible(HomePage.LINK_IN_THE_FOOTER.replace("$1", text))
        );
    }

    @Then("^\"([^\"]*)\" address is displayed$")
    public void addressIsDisplayed(String text) {
        Assert.assertTrue(
                "address isn't displayed",
                core.elementByXpathIsVisible(HomePage.ADDRESS_TEXT_IN_THE_FOOTER.replace("$1", text))
        );
    }

    @Then("^Aim copyright is displayed$")
    public void aimCopyrightIsDisplayed() {
        Assert.assertTrue(
                "Aim copyright isn't displayed",
                core.elementByXpathIsVisible(HomePage.AIM_COPYRIGHT)
        );
    }

    @Then("^Instagram icon is displayed$")
    public void instagramIconIsDisplayed() {
        Assert.assertTrue(
                "Instagram icon isn't displayed",
                core.elementByXpathIsVisible(HomePage.INSTAGRAM_LOGO)
        );
    }

    @Then("^Facebook icon is displayed$")
    public void facebookIconIsDisplayed() {
        Assert.assertTrue(
                "Facebook icon isn't displayed",
                core.elementByXpathIsVisible(HomePage.FACEBOOK_LOGO)
        );
    }

    @Then("^Twitter icon is displayed$")
    public void twitterIconIsDisplayed() {
        Assert.assertTrue(
                "Twitter icon isn't displayed",
                core.elementByXpathIsVisible(HomePage.TWITTER_LOGO)
        );
    }

    @Then("^Linkedin icon is displayed$")
    public void linkedinIconIsDisplayed() {
        Assert.assertTrue(
                "Linkedin icon isn't displayed",
                core.elementByXpathIsVisible(HomePage.LINKEDIN_LOGO)
        );
    }

    @Then("^Behance icon is displayed$")
    public void behanceIconIsDisplayed() {
        Assert.assertTrue(
                "Behance icon isn't displayed",
                core.elementByXpathIsVisible(HomePage.BEHANCE_LOGO)
        );
    }

    @When("^navigate on Aimprosoft logo at the header$")
    public void navigateOnAimprosoftLogoAtTheHeader() {
        core.hoverOnElement(HomePage.AIMPROSOFT_LOGO_AT_THE_HEADER);
    }


    @When("^navigate on \"([^\"]*)\" link$")
    public void navigateOnLink(String text) throws Throwable {
        core.scrollToElementByXpathUsingJsExecutor(HomePage.HEADER_LINK.replace("$1", text));
    }

    @When("^navigate on Education link$")
    public void navigateOnEducationLink() {
        waitABit(500);
        core.hoverOnElement(HomePage.HEADER1_LINK);
    }

    @Then("^Education link is displayed$")
    public void educationLinkIsDisplayed() {
        Assert.assertTrue(
                "Education link isn't displayed",
                core.elementByXpathIsVisible(HomePage.HEADER1_LINK)
        );
    }

    @Then("^Projects link without sublinks is displayed$")
    public void projectsLinkWithoutSublinksIsDisplayed() {
        Assert.assertTrue(
                "Projects link without sublinks isn't displayed",
                core.elementByXpathIsVisible(HomePage.PROJECTS_LINK)
        );
    }

    @Then("^\"([^\"]*)\" client title is displayed$")
    public void clientTitleIsDisplayed(String text) throws Throwable {
        Assert.assertTrue(
                "client title isn't displayed",
                core.elementByXpathIsVisible(HomePage.CLIENTS_NAME_TITLE.replace("$1", text))
        );
    }

    @Then("^Superbcompanies AngularJS award icon is displayed$")
    public void superbcompaniesAngularJSAwardIconIsDisplayed() {
        Assert.assertTrue(
                "Superbcompanies AngularJS award icon isn't displayed",
                core.elementByXpathIsVisible(HomePage.TECH_ICON)
        );
    }

    @Then("^Superbcompanies AngularJS award first icon is displayed$")
    public void superbcompaniesAngularJSAwardFirstIconIsDisplayed() {
        Assert.assertTrue(
                "Superbcompanies AngularJS award first icon isn't displayed",
                core.elementByXpathIsVisible(HomePage.TECH_FIRST_ICON)
        );
    }

    @When("^click on \"([^\"]*)\" title$")
    public void clickOnTitle(String text) throws Throwable {
        core.clickOnElementByXpath(HomePage.TITLE_IN_THE_FOOTER.replace("$1", text));
    }

    @Then("^\"([^\"]*)\" company link in the footer is displayed$")
    public void companyLinkInTheFooterIsDisplayed(String text) {
        Assert.assertTrue(
                "link in the footer isn't displayed",
                core.elementByXpathIsVisible(HomePage.COMPANY_LINK_IN_THE_FOOTER.replace("$1", text))
        );
    }

    @When("^navigate on Expertise title$")
    public void navigateOnExpertiseTitle() {
        core.hoverOnElement(HomePage.EXPERTISE_TITLE);
    }

    @Then("^Hybris link in the footer is displayed$")
    public void hybrisLinkInTheFooterIsDisplayed() {
        Assert.assertTrue(
                "Hybris link in the footer isn't displayed",
                core.elementByXpathIsVisible(HomePage.HYBRIS_LINK_IN_THE_FOOTER)
        );
    }

    @Then("^Alfresco link in the footer is displayed$")
    public void alfrescoLinkInTheFooterIsDisplayed() {
        Assert.assertTrue(
                "Alfresco link in the footer isn't displayed",
                core.elementByXpathIsVisible(HomePage.ALFRESCO_LINK_IN_THE_FOOTER)
        );
    }

    @Then("^Liferay link in the footer is displayed$")
    public void liferayLinkInTheFooterIsDisplayed() {
        Assert.assertTrue(
                "Liferay link in the footer isn't displayed",
                core.elementByXpathIsVisible(HomePage.LIFERAY_LINK_IN_THE_FOOTER)
        );
    }

    @Then("^Web link in the footer is displayed$")
    public void webLinkInTheFooterIsDisplayed() {
        Assert.assertTrue(
                "Web link in the footer isn't displayed",
                core.elementByXpathIsVisible(HomePage.WEB_DEVELOPMENT_LINK_IN_THE_FOOTER)
        );
    }

    @Then("^Mobile link in the footer is displayed$")
    public void mobileLinkInTheFooterIsDisplayed() {
        Assert.assertTrue(
                "Mobile link in the footer isn't displayed",
                core.elementByXpathIsVisible(HomePage.MOBILE_LINK_IN_THE_FOOTER)
        );
    }

    @Then("^QA link in the footer is displayed$")
    public void qaLinkInTheFooterIsDisplayed() {
        Assert.assertTrue(
                "QA link in the footer isn't displayed",
                core.elementByXpathIsVisible(HomePage.QA_LINK_IN_THE_FOOTER)
        );
    }

    @Then("^Dedicated link in the footer is displayed$")
    public void dedicatedLinkInTheFooterIsDisplayed() {
        Assert.assertTrue(
                "Dedicated link in the footer isn't displayed",
                core.elementByXpathIsVisible(HomePage.DEDICATED_TEAM_LINK_IN_THE_FOOTER)
        );
    }

    @Then("^Business Analysis link in the footer is displayed$")
    public void businessAnalysisLinkInTheFooterIsDisplayed() {
        Assert.assertTrue(
                "Business Analysis link in the footer isn't displayed",
                core.elementByXpathIsVisible(HomePage.BUSINESS_ANALYSIS_LINK_IN_THE_FOOTER)
        );
    }

    @Then("^UX/UI link in the footer is displayed$")
    public void uxUILinkInTheFooterIsDisplayed() {
        Assert.assertTrue(
                "UX/UI link in the footer isn't displayed",
                core.elementByXpathIsVisible(HomePage.UX_UI_DESIGN_LINK_IN_THE_FOOTER)
        );
    }
    
    @Then("^Data Science link in the footer is displayed$")
    public void dataScienceLinkInTheFooterIsDisplayed() {
        Assert.assertTrue(
                "Data Science link in the footer isn't displayed",
                core.elementByXpathIsVisible(HomePage.DATA_SCIENCE_LINK_IN_THE_FOOTER)
        );
    }

    @Then("^IT Outsourcing link in the footer is displayed$")
    public void itOutsourcingLinkInTheFooterIsDisplayed() {
        Assert.assertTrue(
                "IT Outsourcing link in the footer isn't displayed",
                core.elementByXpathIsVisible(HomePage.IT_OUTSOURCING_LINK_IN_THE_FOOTER)
        );
    }

    @Then("^Front end link in the footer is displayed$")
    public void frontEndLinkInTheFooterIsDisplayed() {
        Assert.assertTrue(
                "Front end link in the footer isn't displayed",
                core.elementByXpathIsVisible(HomePage.FRONT_END_LINK_IN_THE_FOOTER)
        );
    }

    @Then("^Backend link in the footer is displayed$")
    public void backendLinkInTheFooterIsDisplayed() {
        Assert.assertTrue(
                "Backend link in the footer isn't displayed",
                core.elementByXpathIsVisible(HomePage.BACKEND_LINK_IN_THE_FOOTER)
        );
    }

    @Then("^Java Outsourcing link in the footer is displayed$")
    public void javaOutsourcingLinkInTheFooterIsDisplayed() {
        Assert.assertTrue(
                "Java Outsourcing link in the footer isn't displayed",
                core.elementByXpathIsVisible(HomePage.JAVA_OUTSOURCING_LINK_IN_THE_FOOTER)
        );
    }

    @Then("^Python Development link in the footer is displayed$")
    public void pythonDevelopmentLinkInTheFooterIsDisplayed() {
        Assert.assertTrue(
                "Python Development link in the footer isn't displayed",
                core.elementByXpathIsVisible(HomePage.PYTHON_DEVELOPMENT_LINK_IN_THE_FOOTER)
        );
    }

    @Then("^Outsourcing Web link in the footer is displayed$")
    public void outsourcingWebLinkInTheFooterIsDisplayed() {
        Assert.assertTrue(
                "Outsourcing Web link in the footer isn't displayed",
                core.elementByXpathIsVisible(HomePage.OUTSOURCING_WEB_LINK_IN_THE_FOOTER)
        );
    }

    @Then("^IT Staff Augumentation link in the footer is displayed$")
    public void itStaffAugumentationLinkInTheFooterIsDisplayed() {
        Assert.assertTrue(
                "IT Staff Augumentation link in the footer isn't displayed",
                core.elementByXpathIsVisible(HomePage.IT_STAFF_AUGUMENTATION_LINK_IN_THE_FOOTER)
        );
    }

    @Then("^Offshore Software link in the footer is displayed$")
    public void offshoreSoftwareLinkInTheFooterIsDisplayed() {
        Assert.assertTrue(
                "Offshore Software link in the footer isn't displayed",
                core.elementByXpathIsVisible(HomePage.OFFSHORE_SOFTWARE_LINK_IN_THE_FOOTER)
        );
    }

    @Then("^Nearshore Software link in the footer is displayed$")
    public void nearshoreSoftwareLinkInTheFooterIsDisplayed() {
        Assert.assertTrue(
                "Nearshore Software link in the footer isn't displayed",
                core.elementByXpathIsVisible(HomePage.NEARSHORE_SOFTWARE_LINK_IN_THE_FOOTER)
        );
    }

    @Then("^Java link in the footer is displayed$")
    public void javaLinkInTheFooterIsDisplayed() {
        Assert.assertTrue(
                "Java link in the footer isn't displayed",
                core.elementByXpathIsVisible(HomePage.JAVA_LINK_IN_THE_FOOTER)
        );
    }

    @Then("^Python link in the footer is displayed$")
    public void pythonLinkInTheFooterIsDisplayed() {
        Assert.assertTrue(
                "Python link in the footer isn't displayed",
                core.elementByXpathIsVisible(HomePage.PYTHON_LINK_IN_THE_FOOTER)
        );
    }

    @Then("^\\.NET link in the footer is displayed$")
    public void netLinkInTheFooterIsDisplayed() {
        Assert.assertTrue(
                "Dot NET link in the footer isn't displayed",
                core.elementByXpathIsVisible(HomePage.DOT_NET_LINK_IN_THE_FOOTER)
        );
    }

    @Then("^JavaScript link in the footer is displayed$")
    public void javascriptLinkInTheFooterIsDisplayed() {
        Assert.assertTrue(
                "JavaScript link in the footer isn't displayed",
                core.elementByXpathIsVisible(HomePage.JAVASCRIPT_LINK_IN_THE_FOOTER)
        );
    }

    @Then("^Swift link in the footer is displayed$")
    public void swiftLinkInTheFooterIsDisplayed() {
        Assert.assertTrue(
                "Swift link in the footer isn't displayed",
                core.elementByXpathIsVisible(HomePage.SWIFT_LINK_IN_THE_FOOTER)
        );
    }

    @Then("^Kotlin link in the footer is displayed$")
    public void kotlinLinkInTheFooterIsDisplayed() {
        Assert.assertTrue(
                "Kotlin link in the footer isn't displayed",
                core.elementByXpathIsVisible(HomePage.KOTLIN_LINK_IN_THE_FOOTER)
        );
    }

    @Then("^React\\.js link in the footer is displayed$")
    public void reactJsLinkInTheFooterIsDisplayed() {
        Assert.assertTrue(
                "React js link in the footer isn't displayed",
                core.elementByXpathIsVisible(HomePage.REACT_JS_LINK_IN_THE_FOOTER)
        );
    }

    @Then("^Angular link in the footer is displayed$")
    public void angularLinkInTheFooterIsDisplayed() {
        Assert.assertTrue(
                "Angular link in the footer is displayed",
                core.elementByXpathIsVisible(HomePage.ANGULAR_LINK_IN_THE_FOOTER)
        );
    }

    @Then("^Node\\.js link in the footer is displayed$")
    public void nodeJsLinkInTheFooterIsDisplayed() {
        Assert.assertTrue(
                "Node js link in the footer isn't displayed",
                core.elementByXpathIsVisible(HomePage.NODE_JS_LINK_IN_THE_FOOTER)
        );
    }

    @Then("^Hire Node\\.js link in the footer is displayed$")
    public void hireNodeJsLinkInTheFooterIsDisplayed() {
        Assert.assertTrue(
                "Hire Node js link in the footer isn't displayed",
                core.elementByXpathIsVisible(HomePage.HIRE_NODE_JS_LINK_IN_THE_FOOTER)
        );
    }

    @Then("^Hire React Native link in the footer is displayed$")
    public void hireReactNativeLinkInTheFooterIsDisplayed() {
        Assert.assertTrue(
                "Hire React Native link in the footer isn't displayed",
                core.elementByXpathIsVisible(HomePage.HIRE_REACT_NATIVE_LINK_IN_THE_FOOTER)
        );
    }

    @Then("^Hire \\.NET link in the footer is displayed$")
    public void hireNETLinkInTheFooterIsDisplayed() {
        Assert.assertTrue(
                "Hire .NET link in the footer isn't displayed",
                core.elementByXpathIsVisible(HomePage.HIRE_DOT_NET_LINK_IN_THE_FOOTER)
        );
    }

    @Then("^Hire Web link in the footer is displayed$")
    public void hireWebLinkInTheFooterIsDisplayed() {
        Assert.assertTrue(
                "Hire Web link in the footer isn't displayed",
                core.elementByXpathIsVisible(HomePage.HIRE_WEB_LINK_IN_THE_FOOTER)
        );
    }

    @Then("^Hire Laravel link in the footer is displayed$")
    public void hireLaravelLinkInTheFooterIsDisplayed() {
        Assert.assertTrue(
                "Hire Laravel link in the footer isn't displayed",
                core.elementByXpathIsVisible(HomePage.HIRE_LARAVEL_LINK_IN_THE_FOOTER)
        );
    }

    @Then("^Hire Backend link in the footer is displayed$")
    public void hireBackendLinkInTheFooterIsDisplayed() {
        Assert.assertTrue(
                "Hire Backend link in the footer isn't displayed",
                core.elementByXpathIsVisible(HomePage.HIRE_BACKEND_LINK_IN_THE_FOOTER)
        );
    }

    @Then("^Hire Full Stack link in the footer is displayed$")
    public void hireFullStackLinkInTheFooterIsDisplayed() {
        Assert.assertTrue(
                "Hire Full Stack link in the footer isn't displayed",
                core.elementByXpathIsVisible(HomePage.HIRE_FULL_STACK_LINK_IN_THE_FOOTER)
        );
    }

    @Then("^Hire Frontend link in the footer is displayed$")
    public void hireFrontendLinkInTheFooterIsDisplayed() {
        Assert.assertTrue(
                "Hire Frontend link in the footer isn't displayed",
                core.elementByXpathIsVisible(HomePage.HIRE_FRONTEND_LINK_IN_THE_FOOTER)
        );
    }

    @When("^navigate on Node\\.js link at the footer$")
    public void navigateOnNodeJsLinkAtTheFooter() {
        core.hoverOnElement(HomePage.NODE_JS_LINK_IN_THE_FOOTER);
    }

    @Then("^DevOps Consulting link in the footer is displayed$")
    public void devopsConsultingLinkInTheFooterIsDisplayed() {
        Assert.assertTrue(
                "DevOps Consulting link in the footer isn't displayed",
                core.elementByXpathIsVisible(HomePage.DEVOPS_CONSULTING_LINK_IN_THE_FOOTER)
        );
    }

    @Then("^Ecommerce Consulting link in the footer is displayed$")
    public void ecommerceConsultingLinkInTheFooterIsDisplayed() {
        Assert.assertTrue(
                "Ecommerce Consulting link in the footer isn't displayed",
                core.elementByXpathIsVisible(HomePage.ECOMMERCE_CONSULTING_LINK_IN_THE_FOOTER)
        );
    }

    @Then("^Machine Learning link in the footer is displayed$")
    public void machineLearningLinkInTheFooterIsDisplayed() {
        Assert.assertTrue(
                "Machine Learning link in the footer isn't displayed",
                core.elementByXpathIsVisible(HomePage.MACHINE_LEARNING_LINK_IN_THE_FOOTER)
        );
    }

    @Then("^AWS Consulting Partner link in the footer is displayed$")
    public void awsConsultingPartnerLinkInTheFooterIsDisplayed() {
        Assert.assertTrue(
                "AWS Consulting Partner link in the footer isn't displayed",
                core.elementByXpathIsVisible(HomePage.AWS_CONSULTING_PARTNER_LINK_IN_THE_FOOTER)
        );
    }

    @Then("^Agile Consulting link in the footer is displayed$")
    public void agileConsultingLinkInTheFooterIsDisplayed() {
        Assert.assertTrue(
                "Agile Consulting link in the footer isn't displayed",
                core.elementByXpathIsVisible(HomePage.AGILE_CONSULTING_LINK_IN_THE_FOOTER)
        );
    }

    @Then("^Web Development title in the footer is displayed$")
    public void webDevelopmentTitleInTheFooterIsDisplayed() {
        Assert.assertTrue(
                "Web Development title in the footer isn't displayed",
                core.elementByXpathIsVisible(HomePage.WEB_DEVELOPMENT_TITLE_IN_THE_FOOTER)
        );
    }

    @Then("^Arizona link in the footer is displayed$")
    public void arizonaLinkInTheFooterIsDisplayed() {
        Assert.assertTrue(
                "Arizona link in the footer isn't displayed",
                core.elementByXpathIsVisible(HomePage.ARIZONA_LINK_IN_THE_FOOTER)
        );
    }

    @Then("^London link in the footer is displayed$")
    public void londonLinkInTheFooterIsDisplayed() {
        Assert.assertTrue(
                "London link in the footer isn't displayed",
                core.elementByXpathIsVisible(HomePage.LONDON_LINK_IN_THE_FOOTER)
        );
    }

    @Then("^Winston Salem link in the footer is displayed$")
    public void winstonSalemLinkInTheFooterIsDisplayed() {
        Assert.assertTrue(
                "Winston Salem link in the footer isn't displayed",
                core.elementByXpathIsVisible(HomePage.WINSTON_SALEM_LINK_IN_THE_FOOTER)
        );
    }

    @Then("^Our offices title in the footer is displayed$")
    public void ourOfficesTitleInTheFooterIsDisplayed() {
        Assert.assertTrue(
                "Our offices title in the footer isn't displayed",
                core.elementByXpathIsVisible(HomePage.OUR_OFFICES_TITLE)
        );
    }

    @Then("^Company title in the footer is displayed$")
    public void companyTitleInTheFooterIsDisplayed() {
        Assert.assertTrue(
                "Company title in the footer isn't displayed",
                core.elementByXpathIsVisible(HomePage.COMPANY_TITLE_IN_THE_FOOTER)
        );
    }

    @When("^click Accept button$")
    public void clickAcceptButton() {
        core.clickUsingJSExecutor(HomePage.ACCEPT_BUTTON);
    }
    @When("^navigate on Accept button$")
    public void navigateOnAcceptButton() {
        core.hoverOnElement(HomePage.ACCEPT_BUTTON);

    }

    @Then("^SAP award banner is displayed$")
    public void sapAwardBannerIsDisplayed() {
        Assert.assertTrue(
                "SAP award banner isn't displayed",
                core.elementByXpathIsVisible(HomePage.SAP_AWARD_BANNER)
        );
    }

    @Then("^Clutch Eastern Europe award is displayed$")
    public void clutchEasternEuropeAwardIsDisplayed() {
        Assert.assertTrue(
                "Clutch Eastern Europe award isn't displayed",
                core.elementByXpathIsVisible(HomePage.CLUTCH_EASTERN_EUROPE_AWARD_BANNER)
        );
    }

    @Then("^Top Node JS Developers award is displayed$")
    public void topNodeJSDevelopersAwardIsDisplayed() {
        Assert.assertTrue(
                "Top Node JS Developers award isn't displayed",
                core.elementByXpathIsVisible(HomePage.TOP_NODE_JS_DEVELOPERS_AWARD_BANNER)
        );
    }

    @Then("^DMCA Protected banner is displayed$")
    public void dmcaProtectedBannerIsDisplayed() {
        Assert.assertTrue(
                "DMCA Protected banner isn't displayed",
                core.elementByXpathIsVisible(HomePage.DMCA_PROTECTED_BANNER)
        );
    }
}
