Feature: verifying IoT page

  Scenario: 8.001 Check that "IoT" page is opened
    Given open home page
    When navigate on "Industries" title in the header
    Then "IoT" link is displayed
    When click "IoT" link
    Then IoT page is opened
    Then "IoT Development Company" general title is displayed
    Then Get started button is displayed
    When click on Get started button
    Then "Let us help with your IoT project" subtitle is displayed
    When navigate on "IoT Development Company" general title
    Then "scroll down to discover" link is presented
    When click on "scroll down to discover" link
    Then "IoT software development services we provide" subtitle is displayed
    Then "IoT-based mobile app development" title is displayed
    Then "Web-based IoT solutions implementation" title is displayed
    Then "Software refactoring and functionality expansion" title is displayed
    Then "Connected products development" title is displayed
    When navigate on right arrow in the carousel
    When click right arrow in the carousel
    Then "Design services for IoT-powered solutions" title is displayed
    Then "IoT gateway development" title is displayed
    When navigate on "Need assistance with your IoT project?" title
    Then Talk to us button is displayed
    When click on Talk to us button
    Then "Let us help with your IoT project" subtitle is displayed
    When navigate on "Reasons to consider Aimprosoft" subtitle
    Then "Expertise in IoT software development" title is displayed
    Then "Vast technology stack" title is displayed
    Then "Machine learning expertise" title is displayed
    Then "Wide range of IoT complementary services" title is displayed
    When navigate on "IoT-powered software we developed" subtitle
    When navigate on "IoT smart home solutions" title in the Industries block
    Then "A complex IoT-powered smart home solution" title is displayed
    When navigate on "Mobile and web healthcare solutions" title in the Industries block
    When click "Mobile and web healthcare solutions" link in the Industries block
    Then "IoT-powered solution for wireless health monitoring" title is displayed
    When navigate on "Solutions for environmental monitoring" title in the Industries block
    When click "Solutions for environmental monitoring" link in the Industries block
    Then "Web-based platform to monitor changes in the food storages" title is displayed
    When navigate on right arrow inside Our Clients section
    When click right arrow inside Our Clients section
    Then A cross-platform mobile app to track changes in the food storage conditions title is displayed
    When navigate on "IoT solutions for technology maintenance" title in the Industries block
    When click "IoT solutions for technology maintenance" link in the Industries block
    Then "An efficient solution for enhanced technology maintenance" title is displayed
    When navigate on "IoT-powered marketing tools" title in the Industries block
    When click "IoT-powered marketing tools" link in the Industries block
    Then "Mobile solution to draw visitors’ attention" title is displayed
    When navigate on "Robust solutions for smart vehicles" title in the Industries block
    When click "Robust solutions for smart vehicles" link in the Industries block
    Then "EVhub: native mobile apps for remote charging of smart vehicles" title is displayed
    Then View project in portfolio link is displayed
    When click View project in portfolio link
    Then "EVhub" portfolio page is opened
    Given open home page
    When navigate on "Industries" title in the header
    Then "IoT" link is displayed
    When click "IoT" link
    Then IoT page is opened
    When navigate on "Most common challenges during custom IoT software development" subtitle
    Then "Security can be at stake" item is displayed
    Then "Poor resilience and recovery" item is displayed
    Then "Issues with scalability" item is displayed
    Then "Staffing for IoT-powered software development" item is displayed
    When navigate on "Our recent articles" subtitle
    Then first blog is displayed
    Then second blog is displayed
    Then third blog is displayed
