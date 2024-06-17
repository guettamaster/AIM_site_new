Feature: verifying Retail page

  Scenario: 9.001 Check that "Retail" page is opened
    Given open home page
    When navigate on "Industries" title in the header
    Then "Retail" link is displayed
    When click "Retail" link
    Then Retail page is opened
    Then "Retail Software Development Services" general title is displayed
    Then Get started button is displayed
    When click on Get started button