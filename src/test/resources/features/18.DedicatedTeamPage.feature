Feature: verifying Dedicated Team page

  Scenario: 18.001 Check that "Dedicated Team" page is opened
    Given open home page
    When navigate on "Services" title in the header
    Then "Dedicated Team" link is displayed
    When click "Dedicated Team" link
    Then Dedicated Team page is opened
    Then "Dedicated Software Development Team" general title is displayed
    Then "GoodFirms" link in Find More section is displayed
    Then "Upwork" link in Find More section is displayed
    Then "Clutch" link in Find More section is displayed
    When click on the "GoodFirms" link
    Then switch to the GoodFirms tab first
    Then GoodFirms logo is displayed
    Then switch to the AIM tab
    When click on the "Upwork" link
    Then switch to the Upwork tab first
    Then Upwork logo is displayed
    Then switch to the AIM tab
    When click on the "Clutch" link
    Then switch to the Clutch tab first
    Then Clutch logo is displayed
    Then switch to the AIM tab
    Then Get started button is displayed
    When click on Get started button
    Then "Let our dedicated team help with your project" subtitle is displayed
    When navigate on "Dedicated Software Development Team" general title
    Then "scroll down to discover" link is presented
    When click on "scroll down to discover" link
    Then "When you need to hire a dedicated development team" subtitle is displayed
    Then "Your project is long-term and complex in terms of implementation" tile is displayed