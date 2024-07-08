Feature: verifying Liferay Development page

  Scenario: 14.001 Check that "Liferay Development" page is opened
    Given open home page
    When navigate on "Services" title in the header
    Then "Liferay Development" link is displayed
    When click "Liferay Development" link
    Then Liferay Development page is opened
    Then "Liferay Application Development Services" general title is displayed
    Then Get started button is displayed
    When click on Get started button
    Then "Let us help with your Liferay project" subtitle is displayed
    When navigate on "Liferay Application Development Services" general title
    Then "scroll down to discover" link is presented
    When click on "scroll down to discover" link
    Then "When you need to hire Liferay specialists" subtitle is displayed