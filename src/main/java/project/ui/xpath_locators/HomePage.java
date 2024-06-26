package project.ui.xpath_locators;

/**
 *
 * @author Oleg Ivankovskiy
 * @version 1.0
 */

public interface HomePage {


    String HEADER1_LINK = "//li[@class='nav__submenu-item']/a[@href='www.aimprosoft.com/industries/education/'][contains(text(), 'Education')]";
//    String HEADER1_LINK = "//li[@class='nav__submenu-item']/a[@href='https://aim-dev.aimprosoft.com/industries/education/'][contains(text(), 'Education')]";
    String HEADER_TITLE = "//span[@class='nav__link accordion-title'][contains(text(), '$1')]";
    String HEADER_LINK = "//a[@class='nav__submenu-link animated-text-black'][contains(text(), '$1')]";
    String CUSTOMER_SOFTWARE_DEVELOPMENT_COMPANY_TITLE = "//h1[contains(text(), 'Custom Software Development Company')]";
    String SCROLL_DOWN_TO_DISCOVER_LINK = "//a[@class='scroll-down__link'][contains(text(), 'scroll down to discover')]";
    String BUSINESS_PROCESS_TITLE = "//h2[contains(text(), 'Business process')]";
    String TITLE_INSIDE_BUSINESS_PROCESS = "//h3[contains(text(), '$1')]";
    String LINK_IN_THE_INDUSTRIES_BLOCK = "(//span[contains(text(), '$1')])[2]";
    String SERVICES_TITLE = "//h2[contains(text(), 'Services')]";
    String RIGHT_ARROW_IN_THE_SERVICES_CAROUSEL = "(//span[@class='btn-icon dark icon-aim-chevron-right'])[1]";
    String RIGHT_ARROW_IN_THE_CLIENTS_CAROUSEL = "(//span[@class='btn-icon dark icon-aim-chevron-right'])[2]";
    String RIGHT_ARROW_IN_THE_PARTNERS_AND_ACHIEVEMENTS_CAROUSEL = "(//span[@class='btn-icon dark icon-aim-chevron-right'])[3]";
    String TECHNOLOGIES_TITLE = "//h2[contains(text(), 'Technologies')]";
    String WEB_DEVELOPMENT_TITLE = "//span[contains(text(), 'Web development')]";
    String TECHNOLOGIES_WORD = "//span[contains(text(), '$1')]";
    String TECHNOLOGIES_ICON = "//img[@alt='$1']";
    String TECH_ICON = "(//img[@alt='Superbcompanies AngularJS award'])[2]";
    String TECH_FIRST_ICON = "(//img[@alt='Superbcompanies AngularJS award'])[3]";
    String MOBILE_DEVELOPMENT_TITLE = "//span[contains(text(), 'Mobile development')]";
    String REACT_ICON = "(//img[@alt='React'])[2]";
    String JAVA_ICON = "(//img[@alt='Java'])[2]";
    String WHY_CHOOSE_TITLE = "(//div[@class='vertical-reveal-outer'])[6]";
    String CLIENTS_TITLE = "//h2[contains(text(), 'Clients about Aimprosoft')]";
    String CUSTOMERS_TITLE = "//h2[contains(text(), 'Aimprosoft Customers')]";
    String PARTNERS_AND_ACHIEVEMENTS_TITLE = "//h2[contains(text(), 'Partners & Achievements')]";
    String LATEST_ARTICLES_IN_OUR_BLOG_TITLE = "//h2[contains(text(), 'Latest articles in our blog')]";
    String FIRST_BLOG_ON_HOME_PAGE = "(//h3[@class='h4 h-dark blog-item__title'])[1]";
    String SECOND_BLOG_ON_HOME_PAGE = "(//h3[@class='h4 h-dark blog-item__title'])[2]";
    String THIRD_BLOG_ON_HOME_PAGE = "(//h3[@class='h4 h-dark blog-item__title'])[3]";
    String EXPLORE_AIMPROSOFT_BLOG_LINK = "(//a[@href='https://www.aimprosoft.com/blog/'])[2]";
//    String EXPLORE_AIMPROSOFT_BLOG_LINK = "(//a[@href='https://aim-dev.aimprosoft.com/blog/'])[2]";
    String BLOG_BREADCRUMBS = "//span[@itemprop='name'][contains(text(), 'Blog')]";
    String FREQUENTLY_ASKED_QUESTIONS_TITLE = "//h2[contains(text(), 'Frequently Asked Questions')]";
    String FREQUENTLY_ASKED_QUESTIONS_ITEM = "//span[contains(text(), '$1')]";
    String FEATURED_IN_TITLE = "//p[contains(text(), 'Featured in')]";
    String BBC_NEWS_LOGO = "//img[@alt='Media logo 1']";
    String INSIDER_IN_LOGO = "//img[@alt='Media logo 2']";
    String CIO_LOGO = "//img[@alt='Media logo 3']";
    String DER_SPIEGEL_LOGO = "//img[@alt='Media logo 4']";
    String TECH_EU_LOGO = "//img[@alt='Media logo 5']";
    String COMPUTER_WEEKLY_LOGO = "//img[@alt='Media logo 6']";
    String EMERGING_EUROPE_LOGO = "//img[@alt='Media logo 7']";
    String AIMPROSOFT_LOGO_AT_THE_FOOTER = "(//img[@alt='Aimprosoft'])[3]";
    String TITLE_IN_THE_FOOTER = "//div/ul[@class='footer-menu footer-submenu sub-accordion-active sub-accordion-init']//ancestor::div[@class='h-dark sub-accordion-title'][.='$1']";
    String COMPANY_LINK_IN_THE_FOOTER = "//a[@class='footer-menu__link animated-text-grey'][contains(text(), '$1')]";
    String LINK_IN_THE_FOOTER = "//a[@class='animated-text-grey'][.='$1']";
    String ADDRESS_TEXT_IN_THE_FOOTER = "//span[contains(text(), '$1')]";
    String AIM_COPYRIGHT = "//span[contains(text(), '© Aimprosoft 2005 - 2024 | All rights reserved')]";
    String INSTAGRAM_LOGO = "//span[@class='icon-aim-insta']";
    String FACEBOOK_LOGO = "//span[@class='icon-aim-facebook']";
    String TWITTER_LOGO = "//span[@class='icon-aim-twitter']";
    String LINKEDIN_LOGO = "//span[@class='icon-aim-linkedin']";
    String BEHANCE_LOGO = "//span[@class='icon-aim-behance']";
    String AIMPROSOFT_LOGO_AT_THE_HEADER = "(//img[@alt='Aimprosoft'])[1]";
    String PROJECTS_LINK = "//a[@class='nav__link'][contains(text(), 'Projects')]";
    String CLIENTS_NAME_TITLE = "//span[.='$1']";
    String EXPERTISE_TITLE = "//div[.='Expertise']";
    String OUR_OFFICES_TITLE = "//div[.='Our offices']";
    String HYBRIS_LINK_IN_THE_FOOTER = "(//a[@href='https://www.aimprosoft.com/services/hybris-development/'])[3]";
//    String HYBRIS_LINK_IN_THE_FOOTER = "(//a[@href='https://aim-dev.aimprosoft.com/services/hybris-development/'])[3]";
    String ALFRESCO_LINK_IN_THE_FOOTER = "(//a[@href='https://www.aimprosoft.com/services/alfresco-development/'])[3]";
//    String ALFRESCO_LINK_IN_THE_FOOTER = "(//a[@href='https://aim-dev.aimprosoft.com/services/alfresco-development/'])[3]";
    String LIFERAY_LINK_IN_THE_FOOTER = "(//a[@href='https://www.aimprosoft.com/services/liferay-development/'])[3]";
//    String LIFERAY_LINK_IN_THE_FOOTER = "(//a[@href='https://aim-dev.aimprosoft.com/services/liferay-development/'])[3]";
    String WEB_DEVELOPMENT_LINK_IN_THE_FOOTER = "(//a[@href='https://www.aimprosoft.com/services/web-development/'])[3]";
//    String WEB_DEVELOPMENT_LINK_IN_THE_FOOTER = "(//a[@href='https://aim-dev.aimprosoft.com/services/web-development/'])[3]";
    String MOBILE_LINK_IN_THE_FOOTER = "(//a[@href='https://www.aimprosoft.com/services/mobile-app-development/'])[3]";
//    String MOBILE_LINK_IN_THE_FOOTER = "(//a[@href='https://aim-dev.aimprosoft.com/services/mobile-app-development/'])[3]";
    String QA_LINK_IN_THE_FOOTER = "(//a[@href='https://www.aimprosoft.com/services/qa-software-testing/'])[3]";
//    String QA_LINK_IN_THE_FOOTER = "(//a[@href='https://aim-dev.aimprosoft.com/services/qa-software-testing/'])[3]";
    String DEDICATED_TEAM_LINK_IN_THE_FOOTER = "(//a[@href='https://www.aimprosoft.com/services/dedicated-software-development-team/'])[3]";
//    String DEDICATED_TEAM_LINK_IN_THE_FOOTER = "(//a[@href='https://aim-dev.aimprosoft.com/services/dedicated-software -development-team/'])[3]";
    String BUSINESS_ANALYSIS_LINK_IN_THE_FOOTER = "(//a[@href='https://www.aimprosoft.com/services/business-analysis/'])[3]";
//    String BUSINESS_ANALYSIS_LINK_IN_THE_FOOTER = "(//a[@href='https://aim-dev.aimprosoft.com/services/business-analysis/'])[3]";
    String UX_UI_DESIGN_LINK_IN_THE_FOOTER = "(//a[@href='https://www.aimprosoft.com/services/ui-ux-design/'])[3]";
//    String UX_UI_DESIGN_LINK_IN_THE_FOOTER = "(//a[@href='https://aim-dev.aimprosoft.com/services/ui-ux-design/'])[3]";
    String DATA_SCIENCE_LINK_IN_THE_FOOTER = "(//a[@href='https://www.aimprosoft.com/services/data-science-services/'])[3]";
//    String DATA_SCIENCE_LINK_IN_THE_FOOTER = "(//a[@href='https://aim-dev.aimprosoft.com/services/data-science-services/'])[3]";
    String IT_OUTSOURCING_LINK_IN_THE_FOOTER = "(//a[@href='https://www.aimprosoft.com/services/it-outsourcing/'])[2]";
//    String IT_OUTSOURCING_LINK_IN_THE_FOOTER = "(//a[@href='https://aim-dev.aimprosoft.com/services/it-outsourcing/'])[2]";
    String FRONT_END_LINK_IN_THE_FOOTER = "(//a[@href='https://www.aimprosoft.com/services/front-end-development-company/'])[2]";
//    String FRONT_END_LINK_IN_THE_FOOTER = "(//a[@href='https://aim-dev.aimprosoft.com/services/front-end-development-company/'])[2]";
    String BACKEND_LINK_IN_THE_FOOTER = "(//a[@href='https://www.aimprosoft.com/services/backend-development-services/'])[2]";
//    String BACKEND_LINK_IN_THE_FOOTER = "(//a[@href='https://aim-dev.aimprosoft.com/services/backend-development-services/'])[2]";
    String JAVA_OUTSOURCING_LINK_IN_THE_FOOTER = "//a[@href='https://www.aimprosoft.com/services/java-outsourcing-company/']";
//    String JAVA_OUTSOURCING_LINK_IN_THE_FOOTER = "//a[@href='https://aim-dev.aimprosoft.com/services/java-outsourcing-company/']";
    String PYTHON_DEVELOPMENT_LINK_IN_THE_FOOTER = "//a[@href='https://www.aimprosoft.com/services/python-development-outsourcing/']";
//    String PYTHON_DEVELOPMENT_LINK_IN_THE_FOOTER = "//a[@href='https://aim-dev.aimprosoft.com/services/python-development-outsourcing/']";
    String OUTSOURCING_WEB_LINK_IN_THE_FOOTER = "//a[@href='https://www.aimprosoft.com/services/outsourcing-web-development-services/']";
//    String OUTSOURCING_WEB_LINK_IN_THE_FOOTER = "//a[@href='https://aim-dev.aimprosoft.com/services/outsourcing-web-development-services/']";
    String IT_STAFF_AUGUMENTATION_LINK_IN_THE_FOOTER = "(//a[@href='https://www.aimprosoft.com/services/it-staff-augmentation-company/'])[2]";
//    String IT_STAFF_AUGUMENTATION_LINK_IN_THE_FOOTER = "(//a[@href='https://aim-dev.aimprosoft.com/services/it-staff-augmentation-company/'])[2]";
    String OFFSHORE_SOFTWARE_LINK_IN_THE_FOOTER = "//a[@href='https://www.aimprosoft.com/services/offshore-software-development-company/']";
//    String OFFSHORE_SOFTWARE_LINK_IN_THE_FOOTER = "//a[@href='https://aim-dev.aimprosoft.com/services/offshore-software-development-company/']";
    String NEARSHORE_SOFTWARE_LINK_IN_THE_FOOTER = "//a[@href='https://www.aimprosoft.com/services/nearshore-software-development-company/']";
//    String NEARSHORE_SOFTWARE_LINK_IN_THE_FOOTER = "//a[@href='https://aim-dev.aimprosoft.com/services/nearshore-software-development-company/']";
    String JAVA_LINK_IN_THE_FOOTER = "(//a[@href='https://www.aimprosoft.com/technologies/java-development/'])[2]";
//    String JAVA_LINK_IN_THE_FOOTER = "(//a[@href='https://aim-dev.aimprosoft.com/technologies/java-development/'])[2]";
    String PYTHON_LINK_IN_THE_FOOTER = "(//a[@href='https://www.aimprosoft.com/technologies/python-development/'])[2]";
//    String PYTHON_LINK_IN_THE_FOOTER = "(//a[@href='https://aim-dev.aimprosoft.com/technologies/python-development/'])[2]";
    String DOT_NET_LINK_IN_THE_FOOTER = "(//a[@href='https://www.aimprosoft.com/technologies/dot-net-development/'])[2]";
//    String DOT_NET_LINK_IN_THE_FOOTER = "(//a[@href='https://aim-dev.aimprosoft.com/technologies/dot-net-development/'])[2]";
    String JAVASCRIPT_LINK_IN_THE_FOOTER = "(//a[@href='https://www.aimprosoft.com/technologies/javascript-development/'])[2]";
//    String JAVASCRIPT_LINK_IN_THE_FOOTER = "(//a[@href='https://aim-dev.aimprosoft.com/technologies/javascript-development/'])[2]";
    String SWIFT_LINK_IN_THE_FOOTER = "(//a[@href='https://www.aimprosoft.com/technologies/swift-development/'])[2]";
//    String SWIFT_LINK_IN_THE_FOOTER = "(//a[@href='https://aim-dev.aimprosoft.com/technologies/swift-development/'])[2]";
    String KOTLIN_LINK_IN_THE_FOOTER = "(//a[@href='https://www.aimprosoft.com/technologies/kotlin-development/'])[2]";
//    String KOTLIN_LINK_IN_THE_FOOTER = "(//a[@href='https://aim-dev.aimprosoft.com/technologies/kotlin-development/'])[2]";
    String REACT_JS_LINK_IN_THE_FOOTER = "(//a[@href='https://www.aimprosoft.com/technologies/react-development/'])[2]";
//    String REACT_JS_LINK_IN_THE_FOOTER = "(//a[@href='https://aim-dev.aimprosoft.com/technologies/react-development/'])[2]";
    String ANGULAR_LINK_IN_THE_FOOTER = "(//a[@href='https://www.aimprosoft.com/technologies/angular-development/'])[2]";
//    String ANGULAR_LINK_IN_THE_FOOTER = "(//a[@href='https://aim-dev.aimprosoft.com/technologies/angular-development/'])[2]";
    String NODE_JS_LINK_IN_THE_FOOTER = "(//a[@href='https://www.aimprosoft.com/technologies/node-development/'])[2]";
//    String NODE_JS_LINK_IN_THE_FOOTER = "(//a[@href='https://aim-dev.aimprosoft.com/technologies/node-development/'])[2]";
    String HIRE_NODE_JS_LINK_IN_THE_FOOTER = "//a[@href='https://www.aimprosoft.com/services/hire-node-js-developers/']";
//    String HIRE_NODE_JS_LINK_IN_THE_FOOTER = "//a[@href='https://aim-dev.aimprosoft.com/services/hire-node-js-developers/']";
    String HIRE_REACT_NATIVE_LINK_IN_THE_FOOTER = "//a[@href='https://www.aimprosoft.com/services/hire-react-native-developers/']";
//    String HIRE_REACT_NATIVE_LINK_IN_THE_FOOTER = "//a[@href='https://aim-dev.aimprosoft.com/services/hire-react-native-developers/']";
    String HIRE_DOT_NET_LINK_IN_THE_FOOTER = "//a[@href='https://www.aimprosoft.com/services/hire-net-developers/']";
//    String HIRE_DOT_NET_LINK_IN_THE_FOOTER = "//a[@href='https://aim-dev.aimprosoft.com/services/hire-net-developers/']";
    String HIRE_WEB_LINK_IN_THE_FOOTER = "//a[@href='https://www.aimprosoft.com/services/hire-web-developers/']";
//    String HIRE_WEB_LINK_IN_THE_FOOTER = "//a[@href='https://aim-dev.aimprosoft.com/services/hire-web-developers/']";
    String HIRE_LARAVEL_LINK_IN_THE_FOOTER = "//a[@href='https://www.aimprosoft.com/services/hire-laravel-developers/']";
//    String HIRE_LARAVEL_LINK_IN_THE_FOOTER = "//a[@href='https://aim-dev.aimprosoft.com/services/hire-laravel-developers/']";
    String HIRE_BACKEND_LINK_IN_THE_FOOTER = "//a[@href='https://www.aimprosoft.com/services/hire-backend-developers/']";
//    String HIRE_BACKEND_LINK_IN_THE_FOOTER = "//a[@href='https://aim-dev.aimprosoft.com/services/hire-backend-developers/']";
    String HIRE_FULL_STACK_LINK_IN_THE_FOOTER = "//a[@href='https://www.aimprosoft.com/services/hire-full-stack-developers/']";
//    String HIRE_FULL_STACK_LINK_IN_THE_FOOTER = "//a[@href='https://aim-dev.aimprosoft.com/services/hire-full-stack-developers/']";
    String HIRE_FRONTEND_LINK_IN_THE_FOOTER = "//a[@href='https://www.aimprosoft.com/services/hire-frontend-developers/']";
//    String HIRE_FRONTEND_LINK_IN_THE_FOOTER = "//a[@href='https://aim-dev.aimprosoft.com/services/hire-frontend-developers/']";
    String DEVOPS_CONSULTING_LINK_IN_THE_FOOTER = "//a[@href='https://www.aimprosoft.com/services/devops-consulting-company/']";
//    String DEVOPS_CONSULTING_LINK_IN_THE_FOOTER = "//a[@href='https://aim-dev.aimprosoft.com/services/devops-consulting-company/']";
    String ECOMMERCE_CONSULTING_LINK_IN_THE_FOOTER = "//a[@href='https://www.aimprosoft.com/services/ecommerce-consulting-services/']";
//    String ECOMMERCE_CONSULTING_LINK_IN_THE_FOOTER = "//a[@href='https://aim-dev.aimprosoft.com/services/ecommerce-consulting-services/']";
    String MACHINE_LEARNING_LINK_IN_THE_FOOTER = "//a[@href='https://www.aimprosoft.com/services/machine-learning-consulting/']";
//    String MACHINE_LEARNING_LINK_IN_THE_FOOTER = "//a[@href='https://aim-dev.aimprosoft.com/services/machine-learning-consulting/']";
    String AWS_CONSULTING_PARTNER_LINK_IN_THE_FOOTER = "//a[@href='https://www.aimprosoft.com/services/aws-consulting-partner-services/']";
//    String AWS_CONSULTING_PARTNER_LINK_IN_THE_FOOTER = "//a[@href='https://aim-dev.aimprosoft.com/services/aws-consulting-partner-services/']";
    String AGILE_CONSULTING_LINK_IN_THE_FOOTER = "//a[@href='https://www.aimprosoft.com/services/agile-consulting-services/']";
//    String AGILE_CONSULTING_LINK_IN_THE_FOOTER = "//a[@href='https://aim-dev.aimprosoft.com/services/agile-consulting-services/']";
    String WEB_DEVELOPMENT_TITLE_IN_THE_FOOTER = "//div[@class='sub-accordion-service-title'][.='Web development']";
    String ARIZONA_LINK_IN_THE_FOOTER = "//a[@href='https://www.aimprosoft.com/web-development-company-in-arizona/']";
//    String ARIZONA_LINK_IN_THE_FOOTER = "//a[@href='https://aim-dev.aimprosoft.com/web-development-company-in-arizona/']";
    String LONDON_LINK_IN_THE_FOOTER = "//a[@href='https://www.aimprosoft.com/web-development-company-in-london/']";
//    String LONDON_LINK_IN_THE_FOOTER = "//a[@href='https://aim-dev.aimprosoft.com/web-development-company-in-london/']";
    String WINSTON_SALEM_LINK_IN_THE_FOOTER = "//a[@href='https://www.aimprosoft.com/web-development-company-in-winston-salem/']";
//    String WINSTON_SALEM_LINK_IN_THE_FOOTER = "//a[@href='https://aim-dev.aimprosoft.com/web-development-company-in-winston-salem/']";
    String COMPANY_TITLE_IN_THE_FOOTER = "//div[@class='h4 h-dark accordion-title'][.='Company']";
    String ACCEPT_BUTTON = "//span[@class='btn-primary'][.='Accept']";
    String SAP_AWARD_BANNER = "//img[@alt='SAP award']";
    String CLUTCH_EASTERN_EUROPE_AWARD_BANNER = "//img[@alt='clutch eastern europe_2023 award']";
    String TOP_NODE_JS_DEVELOPERS_AWARD_BANNER = "//img[@alt='top node.js developers award']";
    String DMCA_PROTECTED_BANNER = "//img[@alt='DMCA.com Protection Status']";


}