package project.ui.xpath_locators;

/**
 *
 * @author Oleg Ivankovskiy
 * @version 1.0
 */

public interface ECommercePage {

    String ECOMMERCE_TITLE = "//h1[@class='h2'][contains(text(), 'eCommerce Development Services')]";
    String VIEW_PROJECT_IN_PORTFOLIO_LINK = "//span[@class='btn-icon icon-aim-arrow-right']";
    String PORTFOLIO_BREADCRUMBS = "//span[@itemprop='name'][contains(text(), '$1')]";

}


