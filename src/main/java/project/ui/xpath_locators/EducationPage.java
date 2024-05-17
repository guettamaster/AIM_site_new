package project.ui.xpath_locators;

/**
 *
 * @author Oleg Ivankovskiy
 * @version 1.0
 */

public interface EducationPage {


    String EDUCATION_TITLE = "//h1[@class='h2'][contains(text(), 'Educational Software Development Services')]";
    String EDUCATIONAL_SOFTWARE_DEVELOPMENT_SERVICES_TITLE = "//h1[contains(text(), 'Educational Software Development Services')]";
    String GET_STARTED_BUTTON = "(//a[@href='#contact-us'])[1]";
    String TALK_TO_US_BUTTON = "(//a[@href='#contact-us'])[2]";
    String SCROLL_DOWN_TO_DISCOVER_LINK = "//a[@class='scroll-down__link'][contains(text(), '$1')]";
    String E_LEARNING_SOFTWARE_DEVELOPMENT_WITH_AIMPROSOFT_TITLE = "//h2[contains(text(), 'E-learning software development with Aimprosoft')]";
    String SUBTITLE_INSIDE_PAGE = "//h2[contains(text(), '$1')]";
    String NEED_ASSISTANCE_WITH_YOUR_PROJECT_TITLE = "//span[@class='h4 cta__text'][contains(text(), '$1')]";
    String RIGHT_ARROW_INSIDE_OUR_CLIENTS_SECTION = "(//span[@class='btn-icon light icon-aim-chevron-right'])[1]";
    String RIGHT_ARROW_FIRST_INSIDE_OUR_CLIENTS_SECTION = "(//span[@class='btn-icon light icon-aim-chevron-right'])[2]";
    String RIGHT_ARROW_SECOND_INSIDE_OUR_CLIENTS_SECTION = "(//span[@class='btn-icon light icon-aim-chevron-right'])[3]";
    String READ_CASE_STUDY_LINK = "(//span[@class='btn-icon icon-aim-arrow-right'])[1]";
    String READ_CASE_STUDY_LINK_FIRST = "(//span[@class='btn-icon icon-aim-arrow-right'])[2]";
    String CASE_STUDY_BREADCRUMBS = "//span[@itemprop='name'][contains(text(), '$1')]";

}
