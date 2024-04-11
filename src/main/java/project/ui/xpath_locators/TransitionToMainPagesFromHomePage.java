package project.ui.xpath_locators;

/**
 *
 * @author Oleg Ivankovskiy
 * @version 1.0
 */

public interface TransitionToMainPagesFromHomePage {

    String GENERAL_TITLE_ON_THE_MAIN_PAGE = "//h1[.='$1']";
    String GENERAL_TITLE_ON_THE_PROJECTS_PAGE = "//p[.='$1']";
    String EXPLORE_LINK_FOR_ECOMMERCE = "(//a[@href='https://www.aimprosoft.com/industries/ecommerce/'])[2]";
//    String EXPLORE_LINK_FOR_ECOMMERCE = "(//a[@href='https://aim-dev.aimprosoft.com/industries/ecommerce/'])[2]";
    String HEALTHCARE_LINK_FOR_ECOMMERCE = "(//a[@href='https://www.aimprosoft.com/industries/healthcare/'])[2]";
//    String HEALTHCARE_LINK_FOR_ECOMMERCE = "(//a[@href='https://aim-dev.aimprosoft.com/industries/healthcare/'])[2]";
    String IOT_LINK_FOR_ECOMMERCE = "(//a[@href='https://www.aimprosoft.com/industries/internet-of-things/'])[2]";
//    String IOT_LINK_FOR_ECOMMERCE = "(//a[@href='https://aim-dev.aimprosoft.com/industries/internet-of-things/'])[2]";
    String REAL_ESTATE_LINK_FOR_ECOMMERCE = "(//a[@href='www.aimprosoft.com/industries/real-estate/'])[2]";
//    String REAL_ESTATE_LINK_FOR_ECOMMERCE = "(//a[@href='https://aim-dev.aimprosoft.com/industries/real-estate/'])[2]";
    String EDUCATION_LINK_FOR_ECOMMERCE = "(//a[@href='www.aimprosoft.com/industries/education/'])[2]";
//    String EDUCATION_LINK_FOR_ECOMMERCE = "(//a[@href='https://aim-dev.aimprosoft.com/industries/education/'])[2]";
    String TELECOM_LINK_FOR_ECOMMERCE = "(//a[@href='www.aimprosoft.com/industries/telecom-software-development/'])[2]";
//    String TELECOM_LINK_FOR_ECOMMERCE = "(//a[@href='https://aim-dev.aimprosoft.com/industries/telecom-software-development/'])[2]";
    String RETAIL_LINK_FOR_ECOMMERCE = "(//a[@href='www.aimprosoft.com/industries/retail-software-development/'])[2]";
//    String RETAIL_LINK_FOR_ECOMMERCE = "(//a[@href='https://aim-dev.aimprosoft.com/industries/retail-software-development/'])[2]";
    String VIEW_OPEN_VACANCIES_BUTTON = "//a[@class='btn-primary btn-dark btn-light'][contains(text(), 'View open vacancies')]";
    String GENERAL_TEXT_ON_THE_PROJECTS_PAGE = "//p[@class='p-dark'][contains(text(), 'Explore the way Aimprosoft helps businesses breathe life into mere ideas and go through digital transformation journey successfully.')]";
    String TAB_ON_THE_PROJECTS_OR_BLOGS_PAGE = "//div[@class='swiper-wrapper']//div[contains(text(), '$1')]";
    String GENERAL_TEXT_ON_THE_BLOG_PAGE = "//p[@class='p-dark surfaced'][contains(text(), 'Our knowledge and skill set are constantly growing, and we enjoy sharing obtained insights in the form of engaging and comprehensible content. Explore our blog posts for useful development tips, step-by-step guides, current trends, and company news.')]";
    String GENERAL_TEXT_ON_THE_CONTACT_PAGE = "//p[@data-aos-custom='fade-up'][contains(text(), 'We are here to help with your questions. Write us a message, and we will get back to you shortly.')]";
    String TITLE1_ON_THE_PRIVACY_POLICY_PAGE = "//div[@class='h5 h-dark toc__title'][contains(text(), 'Table of contents')]";
    String TITLE2_ON_THE_PRIVACY_POLICY_PAGE = "//h2[@id='personal-information-we-collect-and-use'][contains(text(), 'Personal information we collect and use')]";
    String SITEMAP_TITLE = "//h2[@class='h3 h-dark aos-init aos-animate'][contains(text(), '$1')]";
}
