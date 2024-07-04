package project.ui.xpath_locators;

/**
 *
 * @author Oleg Ivankovskiy
 * @version 1.0
 */

public interface HybrisDevelopmentPage {

    String HYBRIS_DEVELOPMENT_TITLE = "//h1[@class='h2'][contains(text(), 'Hybris Development Company')]";
    String TILE_INSIDE_BUSINESS_PROCESS = "//span[contains(text(), '$1')]";
    String ANIMATION_TILE_IN_THE_BENEFITS = "//div[@data-title='$1']";
    String SAP_SILVER_PARTNER_LINK = "(//a[@href='https://store.sap.com/dcp/en/product/display-0000058351_live_v1/Cloud%20Backup%20and%20Migration%20for%20SAP%C2%AE%20Commerce'])[1]";
    String SAP_LOGO = "(//p[contains(text(), 'Cloud Backup and Migration for SAP® Commerce')])[1]";
    String RIGHT_ARROW_IN_THE_TILES_SECTION = "//span[@class='btn-icon light white icon-aim-chevron-right']";
    String SAP_APP_CENTER_LINK = "(//a[@href='https://store.sap.com/dcp/en/product/display-0000058351_live_v1/Cloud%20Backup%20and%20Migration%20for%20SAP%C2%AE%20Commerce'])[2]";


}
