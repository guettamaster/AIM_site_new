package project.ui.xpath_locators;

/**
 *
 * @author Oleg Ivankovskiy
 * @version 1.0
 */

public interface UIUXDesignPage {

    String UIUX_DESIGN_TITLE = "//h1[@class='h2'][contains(text(), 'UI/UX Design Services Company')]";
    String BEHANCE_LINK = "(//span[@class='icon-aim-behance'])[1]";
    String AIM_LINK_ON_BEHANCE = "//a[@href='https://www.aimprosoft.com']";
    String RIGHT_ARROW_FIFTH_IN_THE_CLIENTS_CAROUSEL = "(//span[@class='btn-icon dark icon-aim-chevron-right'])[6]";

}
