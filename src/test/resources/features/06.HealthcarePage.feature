Feature: verifying healthcare page

  Scenario: 6.001 Check that "Healthcare" page is opened
    Given open home page
    When navigate on "Industries" title in the header
    Then "Healthcare" link is displayed
    When click "Healthcare" link
    Then Healthcare page is opened
    Then "Custom Healthcare Software Development Company" general title is displayed
    Then Get started button is displayed
    When click on Get started button
    Then "Let us help with your healthcare project" subtitle is displayed