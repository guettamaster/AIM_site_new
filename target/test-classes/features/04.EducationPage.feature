Feature: verifying education page


  Scenario: 4.001 Check that "Education" page is opened
    Given open home page
    When navigate on "Industries" title in the header
    Then "Education" link is displayed
    When click "Education" link
    Then Education page is opened
    Then Educational Software Development Services title is displayed
    Then "Get started" button is displayed
    When click on "Get started" button
    Then Let us help with your title is displayed
    Then e-learning title is displayed
    When navigate on Educational Software Development Services title
    Then scroll down to Education discover link is presented
    When click on scroll down to Education discover link
    Then E-learning software development with Aimprosoft title is displayed

    Then "E-learning mobile apps" title is displayed
    Then "Learning management systems (LMS)" title is displayed
    Then "Educational websites" title is displayed
    Then "Educational platforms" title is displayed
    When navigate on right arrow in the carousel
    When click right arrow in the carousel
    Then "Educational portals" title is displayed