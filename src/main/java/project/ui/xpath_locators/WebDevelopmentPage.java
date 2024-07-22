package project.ui.xpath_locators;

/**
 *
 * @author Oleg Ivankovskiy
 * @version 1.0
 */

public interface WebDevelopmentPage {

    String WEB_DEVELOPMENT_TITLE = "//h1[@class='h2'][contains(text(), 'Web Development Services')]";
    String LINK_IN_FIND_MORE_SECTION = "(//a[@aria-label='$1'])[1]";
    String AIM_LOGO_ON_GITHUB = "//img[@alt='@Aimprosoft']";
    String GOODFIRMS_LOGO = "//a[@title='GoodFirms']";
    String UPWORK_LOGO = "//span[@class='nav-logo']";
    String CLUTCH_LOGO = "//div[@class='header__primary-logotype']";
    String VIEW_PROJECT_IN_PORTFOLIO_LINK_SECOND = "(//span[@class='btn-icon icon-aim-arrow-right'])[4]";
    String VIEW_PROJECT_IN_PORTFOLIO_LINK_THIRD = "(//span[@class='btn-icon icon-aim-arrow-right'])[5]";
    String READ_CASE_STUDY_LINK_ON_THE_WEB_DEVELOPMENT_PAGE = "(//span[@class='btn-icon icon-aim-arrow-right'])[3]";
    String RIGHT_ARROW_FOURTH_IN_THE_CLIENTS_CAROUSEL = "(//span[@class='btn-icon dark icon-aim-chevron-right'])[5]";
    String LEARN_MORE_BUTTON = "(//a[@class='btn-secondary dark'])[6]";
    String WEB_DEVELOPMENT_OUTSOURCING_TITLE = "//h1[@class='h2'][contains(text(), 'Outsourcing Web Development Services')]";
}
