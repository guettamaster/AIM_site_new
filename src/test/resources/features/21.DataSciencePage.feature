Feature: verifying Data Science page

  Scenario: 21.001 Check that "Data Science" page is opened
    Given open home page
    When navigate on "Services" title in the header
    Then "Data Science" link is displayed
    When click "Data Science" link
    Then Data Science page is opened
    Then "Data Science Consulting Services" general title is displayed
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
    Then "Let our data scientists help with your project" subtitle is displayed
    When navigate on "Data Science Consulting Services" general title
    Then "scroll down to discover" link is presented
    When click on "scroll down to discover" link
    Then "When you need to hire web developers" subtitle is displayed
    Then "You need to automate and optimize time-consuming, manual tasks" tile is displayed
    Then "You want to extract valuable data insights for further business improvements" tile is displayed
    Then "There is a need to understand customer behavior and preferences" tile is displayed
    Then "You aim to offer customers personalized experiences and offers" tile is displayed
    Then "There is a necessity to improve business operations across the company" tile is displayed
    Then "You want to identify opportunities for potential business growth" tile is displayed
