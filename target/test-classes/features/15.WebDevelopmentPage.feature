Feature: verifying Web Development page

  Scenario: 15.001 Check that "Web Development" page is opened
    Given open home page
    When navigate on "Services" title in the header
    Then "Web Development" link is displayed
    When click "Web Development" link
    Then Web Development page is opened
    Then "Web Development Services" general title is displayed
#    Then "Github" link in Find More section is displayed
#    Then "GoodFirms" link in Find More section is displayed
#    Then "Upwork" link in Find More section is displayed
#    Then "Clutch" link in Find More section is displayed


    Then Get started button is displayed
    When click on Get started button
    Then "Let us help with your web project" subtitle is displayed
    When navigate on "Web Development Services" general title
    Then "scroll down to discover" link is presented
    When click on "scroll down to discover" link
    Then "When you need to hire web developers" subtitle is displayed