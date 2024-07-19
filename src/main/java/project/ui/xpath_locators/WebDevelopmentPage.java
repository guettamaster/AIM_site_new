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
}
