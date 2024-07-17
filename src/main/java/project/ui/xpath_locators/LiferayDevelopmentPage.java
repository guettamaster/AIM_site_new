package project.ui.xpath_locators;

/**
 *
 * @author Oleg Ivankovskiy
 * @version 1.0
 */

public interface LiferayDevelopmentPage {

    String LIFERAY_DEVELOPMENT_TITLE = "//h1[@class='h2'][contains(text(), 'Liferay Application Development Services')]";
    String LIFERAY_COMMUNITY_OR_ENTERPRISE_EDITIONS_LINK = "//a[@href='https://www.aimprosoft.com/blog/liferay-enterprise-vs-liferay-community-difference/']";
    String ARTICLE_TITLE = "//h1[contains(text(), '$1')]";
    String ACTIVE_TAB = "//div[contains(text(), '$1')]";
    String TECHNOLOGY_TITLE = "//h3[contains(text(), '$1')]";
    String TILE_IN_THE_COOPERATION_WITH_US_SECTION = "//p[contains(text(), '$1')]";
    String RIGHT_ARROW_THIRD_IN_THE_CLIENTS_CAROUSEL = "(//span[@class='btn-icon dark icon-aim-chevron-right'])[4]";
}
