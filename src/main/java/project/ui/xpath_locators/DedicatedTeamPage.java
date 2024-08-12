package project.ui.xpath_locators;

/**
 *
 * @author Oleg Ivankovskiy
 * @version 1.0
 */

public interface DedicatedTeamPage {

    String DEDICATED_TEAM_TITLE = "//h1[@class='h2'][contains(text(), 'Dedicated Software Development Team')]";
    String ANIMATION_TILE_WITH_HIGHLIGHT_IN_THE_BENEFITS = "//span[@class='hightlight'][contains(text(), '$1')]";
    String TECHNOLOGY_IN_STACK = "//li[contains(text(), '$1')]";
    String IT_OUTSOURCING_COMPANY_TITLE = "//h1[.='IT Outsourcing Company']";
    String LEARN_MORE_BUTTON_FIRST = "(//a[@class='btn-secondary dark'])[7]";
    String OFFSHORE_SOFTWARE_DEVELOPMENT_COMPANY_TITLE = "//h1[.='Offshore Software Development Company']";
    String LEARN_MORE_BUTTON_SECOND = "(//a[@class='btn-secondary dark'])[8]";
    String IT_STAFF_AUGUMENTATION_COMPANY_TITLE = "//h1[.='IT Staff Augmentation Company']";
    String LEARN_MORE_BUTTON_THIRD = "(//a[@class='btn-secondary dark'])[9]";
    String HIRE_FULL_STACK_DEVELOPERS_TITLE = "//h1[.='Hire Full Stack Developers']";

}
