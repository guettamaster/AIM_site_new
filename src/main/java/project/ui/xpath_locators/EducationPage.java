package project.ui.xpath_locators;

/**
 *
 * @author Oleg Ivankovskiy
 * @version 1.0
 */

public interface EducationPage {


    String EDUCATION_TITLE = "//h1[@class='h2'][contains(text(), 'Educational Software Development Services')]";
    String EDUCATIONAL_SOFTWARE_DEVELOPMENT_SERVICES_TITLE = "//h1[contains(text(), 'Educational Software Development Services')]";
    String GET_STARTED_BUTTON = "//a[@class='btn-primary btn-light'][contains(text(), 'Get started')]";
    String LET_US_HELP_WITH_YOUR_TITLE = "//h2[contains(text(), 'Let us help with your ')]";
    String E_LEARNING_TITLE = "(//span[contains(text(), 'e-learning')])[17]";
    String SCROLL_DOWN_TO_EDUCATION_DISCOVER_LINK = "//a[@class='scroll-down__link'][contains(text(), 'scroll down to discover')]";
    String E_LEARNING_SOFTWARE_DEVELOPMENT_WITH_AIMPROSOFT_TITLE = "//h2[contains(text(), 'E-learning software development with Aimprosoft')]";

}
