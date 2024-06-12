package project.steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;
import project.ui.pageObj.CorePageObjects;
import project.ui.xpath_locators.ContactFormFromHomePage;

public class ContactFormFromHomePageSteps extends ScenarioSteps {

    private CorePageObjects core;

    @When("^navigate on Lets talk title$")
    public void navigateOnLetsTalkTitle() throws Throwable {
        core.hoverOnElement(ContactFormFromHomePage.LETS_TALK_TITLE);
    }

    @Then("^Full name input field is displayed$")
    public void fullNameInputFieldIsDisplayed() {
        Assert.assertTrue(
                "Full name input field isn't displayed",
                core.elementByXpathIsVisible(ContactFormFromHomePage.FULL_NAME_INPUT_FIELD)
        );
    }

    @Then("^Email input field is displayed$")
    public void emailInputFieldIsDisplayed() {
        Assert.assertTrue(
                "Email input field isn't displayed",
                core.elementByXpathIsVisible(ContactFormFromHomePage.EMAIL_INPUT_FIELD)
        );
    }

    @Then("^Phone number input field is displayed$")
    public void phoneNumberInputFieldIsDisplayed() {
        Assert.assertTrue(
                "Phone number input field isn't displayed",
                core.elementByXpathIsVisible(ContactFormFromHomePage.PHONE_NUMBER_INPUT_FIELD)
        );
    }

    @Then("^Message input field is displayed$")
    public void messageInputFieldIsDisplayed() {
        Assert.assertTrue(
                "Message input field isn't displayed",
                core.elementByXpathIsVisible(ContactFormFromHomePage.MESSAGE_INPUT_FIELD)
        );
    }

    @When("^type \"([^\"]*)\" in the Full name input field$")
    public void typeInTheFullNameInputField(String text) throws Throwable {
        core.typeTextIntoInputFieldByXpath(ContactFormFromHomePage.FULL_NAME_INPUT_FIELD, text);
    }

    @When("^type \"([^\"]*)\" in the Email input field$")
    public void typeInTheEmailInputField(String text) throws Throwable {
        core.typeTextIntoInputFieldByXpath(ContactFormFromHomePage.EMAIL_INPUT_FIELD, text);
    }

    @When("^type \"([^\"]*)\" in the Phone number input field$")
    public void typeInThePhoneNumberInputField(String text) throws Throwable {
        core.typeTextIntoInputFieldByXpath(ContactFormFromHomePage.PHONE_NUMBER_INPUT_FIELD, text);
    }

    @When("^type \"([^\"]*)\" in the Message input field$")
    public void typeInTheMessageInputField(String text) throws Throwable {
        core.typeTextIntoInputFieldByXpath(ContactFormFromHomePage.MESSAGE_INPUT_FIELD, text);
    }

    @When("^check I accept Aimprosoft Privacy Policy checkbox$")
    public void checkIAcceptAimprosoftPrivacyPolicyCheckbox() {
        core.clickUsingJSExecutor(ContactFormFromHomePage.PRIVACY_POLICY_CHECKBOX);
    }

    @Then("^Great! Thank you message is displayed$")
    public void greatThankYouMessageIsDisplayed() {
        waitABit(15000);
        Assert.assertTrue(
                "Great! Thank you message isn't displayed",
                core.elementByXpathIsVisible(ContactFormFromHomePage.GREAT_THANK_YOU_TEXT)
        );
    }

    @Then("^The form was submitted successfully message is displayed$")
    public void theFormWasSubmittedSuccessfullyMessageIsDisplayed() {
        Assert.assertTrue(
                "The form was submitted successfully message isn't displayed",
                core.elementByXpathIsVisible(ContactFormFromHomePage.THE_FORM_WAS_SUBMITTED_SUCCESSFULLY_TEXT)
        );
    }

    @Then("^Proceed to Clutch button is displayed$")
    public void proceedToClutchButtonIsDisplayed() {
        Assert.assertTrue(
                "Proceed to Clutch button isn't displayed",
                core.elementByXpathIsVisible(ContactFormFromHomePage.PROCEED_TO_CLUTCH)
        );
    }

    @When("^click Send message button$")
    public void clickSendMessageButton() {
        core.clickUsingJSExecutor(ContactFormFromHomePage.SEND_MESSAGE_BUTTON);
    }

    @Then("^validation message for the Full name input field is displayed$")
    public void validationMessageForTheFullNameInputFieldIsDisplayed() {
        Assert.assertTrue(
                "validation message for the Full name input field isn't displayed",
                core.elementByXpathIsVisible(ContactFormFromHomePage.VALIDATION_MESSAGE_FOR_FULL_NAME_INPUT_FIELD)
        );
    }

    @Then("^validation message for the Email input field is displayed$")
    public void validationMessageForTheEmailInputFieldIsDisplayed() {
        Assert.assertTrue(
                "validation message for the Email input field isn't displayed",
                core.elementByXpathIsVisible(ContactFormFromHomePage.VALIDATION_MESSAGE_FOR_EMAIL_INPUT_FIELD)
        );
    }

    @Then("^validation message for the Phone number input field is displayed$")
    public void validationMessageForThePhoneNumberInputFieldIsDisplayed() {
        Assert.assertTrue(
                "validation message for the Phone number input field isn't displayed",
                core.elementByXpathIsVisible(ContactFormFromHomePage.VALIDATION_MESSAGE_FOR_PHONE_NUMBER_INPUT_FIELD)
        );
    }

    @Then("^validation message for the Message input field is displayed$")
    public void validationMessageForTheMessageInputFieldIsDisplayed() {
        Assert.assertTrue(
                "validation message for the Message input field isn't displayed",
                core.elementByXpathIsVisible(ContactFormFromHomePage.VALIDATION_MESSAGE_FOR_MESSAGE_INPUT_FIELD)
        );
    }

    @Then("^validation is displayed for I accept Aimprosoft Privacy Policy checkbox$")
    public void validationIsDisplayedForIAcceptAimprosoftPrivacyPolicyCheckbox() {
        Assert.assertTrue(
                "validation isn't displayed for I accept Aimprosoft Privacy Policy checkbox",
                core.elementByXpathIsVisible(ContactFormFromHomePage.UNCHECKED_PRIVACY_POLICY_CHECKBOX)
        );
    }

}
