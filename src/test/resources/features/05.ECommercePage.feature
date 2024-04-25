Feature: verifying eCommerce page

  Scenario: 5.001 Check that "eCommerce" page is opened
    Given open home page
    When navigate on "Industries" title in the header
    Then "eCommerce" link is displayed
    When click "eCommerce" link