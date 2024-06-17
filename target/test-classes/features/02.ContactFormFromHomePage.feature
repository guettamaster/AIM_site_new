Feature: verifying contact form from home page

  Scenario: 2.001 Check that form was submitted successfully with valid data
    Given open home page
    When navigate on Lets talk title
    Then Full name input field is displayed
    Then Email input field is displayed
    Then Phone number input field is displayed
    Then Message input field is displayed
    When type "Mike" in the Full name input field
    When type "guettamaster@gmail.com" in the Email input field
    When type "+380951112223" in the Phone number input field
    When type "Hello World" in the Message input field
    When check I accept Aimprosoft Privacy Policy checkbox
    When click Send message button
    Then Great! Thank you message is displayed
    Then The form was submitted successfully message is displayed
    Then Proceed to Clutch button is displayed


  Scenario: 2.002 Check that validation messages appears after entering invalid data into the form
    Given open home page
    When navigate on Lets talk title
    Then Full name input field is displayed
    Then Email input field is displayed
    Then Phone number input field is displayed
    Then Message input field is displayed
    When click Send message button
    Then validation message for the Full name input field is displayed
    Then validation message for the Email input field is displayed
    Then validation message for the Phone number input field is displayed
    Then validation message for the Message input field is displayed
#    Then validation is displayed for I accept Aimprosoft Privacy Policy checkbox



