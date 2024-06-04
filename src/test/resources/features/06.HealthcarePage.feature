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
    When navigate on "Custom Healthcare Software Development Company" general title
    Then "scroll down to discover" link is presented
    When click on "scroll down to discover" link
    Then "Medical software development services we provide" subtitle is displayed
    Then "EHR & EMR" title is displayed
    Then "Telemedicine & Telehealth" title is displayed
    Then "mHealth solutions" title is displayed
    When navigate on right arrow in the carousel
    When click right arrow in the carousel
    Then "Document management software" title is displayed
    Then "Hospital management software" title is displayed
    Then "Online drugstores" title is displayed
    When navigate on right arrow in the carousel
    When click right arrow in the carousel
    Then "Healthcare data analytics solutions" title is displayed
    Then "Smart medical solutions" title is displayed
    When navigate on "Need assistance with your healthcare project?" title
    Then Talk to us button is displayed
    When click on Talk to us button
    Then "Let us help with your healthcare project" subtitle is displayed
    When navigate on "Key reasons to develop a healthcare" subtitle
    Then "Healthcare domain knowledge" title is displayed
    Then "Security & regulatory compliance" title is displayed
    Then "Vast technology stack" title is displayed
    Then "Fast delivery" title is displayed
    When navigate on "Healthcare software we developed" subtitle
    When navigate on "Patient engagement software" title in the Industries block
    Then "Healthcare provider portal" title is displayed
    When navigate on right arrow inside Our Clients section
    When click right arrow inside Our Clients section
    Then "Medical software for monitoring patients with heart disease" title is displayed
    Then View project in portfolio link is displayed
    When click View project in portfolio link
    Then "Medical software for monitoring patients" portfolio page is opened
    Given open home page
    When navigate on "Industries" title in the header
    Then "Healthcare" link is displayed
    When click "Healthcare" link
    Then Healthcare page is opened
    When navigate on "Patient engagement software" title in the Industries block