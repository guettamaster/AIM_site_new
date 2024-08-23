Feature: verifying Data Science page

  Scenario: 22.001 Check that "IT Outsourcing" page is opened
    Given open home page
    When navigate on "Services" title in the header
    Then "IT Outsourcing" link is displayed
    When click "IT Outsourcing" link
    Then IT Outsourcing page is opened
    Then "IT Outsourcing Company" general title is displayed
    Then Get started button is displayed
    When click on Get started button
    Then "Let us help with your project" subtitle is displayed
    When navigate on "IT Outsourcing Company" general title
    Then "scroll down to discover" link is presented
    When click on "scroll down to discover" link
    Then "When you need to outsource your project" subtitle is displayed
    Then "Lack of in-house/local resources" tile is displayed