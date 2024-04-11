package project.ui.xpath_locators;

/**
 *
 * @author Oleg Ivankovskiy
 * @version 1.0
 */

public interface ContactFormFromHomePage {


    String LETS_TALK_TITLE = "//h2[contains(text(), 'Let’s talk')]";
    String FULL_NAME_INPUT_FIELD = "//input[@name='contact-name']";
    String EMAIL_INPUT_FIELD = "//input[@name='contact-email']";
    String PHONE_NUMBER_INPUT_FIELD = "//input[@name='contact-phone']";
    String MESSAGE_INPUT_FIELD = "//input[@name='contact-message']";
    String PRIVACY_POLICY_CHECKBOX = "//span[@class='wpcf7-list-item-label']";
    String GREAT_THANK_YOU_TEXT = "(//div[contains(text(), 'Great! Thank you')])[1]";
    String THE_FORM_WAS_SUBMITTED_SUCCESSFULLY_TEXT = "(//p[contains(text(), 'The form was submitted successfully. We will contact you shortly. Meanwhile, we suggest checking out what our clients say about software development with Aimprosoft.')])[1]";
    String PROCEED_TO_CLUTCH = "(//a[contains(text(), 'Proceed to Clutch')])[1]";
    String SEND_MESSAGE_BUTTON = "//label[@for='contact__form-submit']";
    String VALIDATION_MESSAGE_FOR_FULL_NAME_INPUT_FIELD = "//span[@data-name='contact-name']//ancestor::span[contains(text(), 'The field is required')]";
    String VALIDATION_MESSAGE_FOR_EMAIL_INPUT_FIELD = "//span[@data-name='contact-email']//ancestor::span[contains(text(), 'The field is required')]";
    String VALIDATION_MESSAGE_FOR_PHONE_NUMBER_INPUT_FIELD = "//span[@data-name='contact-phone']//ancestor::span[contains(text(), 'The field is required')]";
    String VALIDATION_MESSAGE_FOR_MESSAGE_INPUT_FIELD = "//span[@data-name='contact-message']//ancestor::span[contains(text(), 'The field is required')]";
    String UNCHECKED_PRIVACY_POLICY_CHECKBOX = "//span[@class='wpcf7-list-item-label']//ancestor::span[@class='wpcf7-list-item']/label/input[@aria-invalid='true']";


}
