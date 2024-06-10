Feature: verifying IoT page

  Scenario: 7.001 Check that "IoT" page is opened
    Given open home page
    When navigate on "Industries" title in the header
    Then "IoT" link is displayed
    When click "IoT" link
    Then IoT page is opened
    Then "IoT Development Company" general title is displayed