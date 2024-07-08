package project.ui.xpath_locators;

/**
 *
 * @author Oleg Ivankovskiy
 * @version 1.0
 */

public interface AlfrescoDevelopmentPage {

    String ALFRESCO_DEVELOPMENT_TITLE = "//h1[@class='h2'][contains(text(), 'Alfresco Development Company')]";
    String JAVA_ICON = "//img[@alt='Programming core']";
    String SURF_ICON = "(//img[@alt='Frameworks'])[1]";
    String MY_BATIS_ICON = "(//img[@alt='Frameworks'])[2]";
    String ANGULAR_ICON = "(//img[@alt='Frontend'])[1]";
    String YUI_ICON = "(//img[@alt='Frontend'])[2]";
    String RHINO_ICON = "(//img[@alt='Frontend'])[3]";
    String APACHE_TOMCAT_ICON = "//img[@alt='Web servers']";
    String LUCENE_ICON = "(//img[@alt='Search engines'])[1]";
    String SOLR_ICON = "(//img[@alt='Search engines'])[2]";
    String BPMN_ICON = "//img[@alt='Tools']";
}
