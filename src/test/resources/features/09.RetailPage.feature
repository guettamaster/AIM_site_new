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
    Then "Let us help with your retail project" subtitle is displayed
    When navigate on "Retail Software Development Services" general title
    Then "scroll down to discover" link is presented
    When click on "scroll down to discover" link
    Then "Retail software development services we provide" subtitle is displayed
    Then "Solutions for store management" title is displayed
    Then "Data analytics retail software" title is displayed
    Then "Omnichannel retail platforms" title is displayed
    Then "Retail mobile apps" title is displayed
    When navigate on right arrow in the carousel
    When click right arrow in the carousel
    Then "Online retail stores" title is displayed
    Then "IoT-powered retail solutions" title is displayed
    When navigate on "Need assistance with your retail project?" title
    Then Talk to us button is displayed
    When click on Talk to us button
    Then "Let us help with your retail project" subtitle is displayed
    When navigate on "Key reasons to opt for Aimprosoft retail" subtitle
    Then "SAP Silver Partner" title is displayed
    Then "Profound domain expertise" title is displayed
    Then "Proven track record" title is displayed
    Then "Full-cycle development" title is displayed
    When navigate on "Retail software we developed" subtitle
    When navigate on "Online stores" title in the Industries block
    Then "Pharmaceutical chain of online stores" title is displayed
    When navigate on right arrow inside Our Clients section
    When click right arrow inside Our Clients section
    Then "Transformation of two outdated websites that sell sunglasses" title is displayed
    Then View project in portfolio link is displayed
    When click View project in portfolio link
    Then "Sunglasses E-Commerce website" portfolio page is opened
    Given open home page
    When navigate on "Industries" title in the header
    Then "Retail" link is displayed
    When click "Retail" link
    Then Retail page is opened
    When navigate on "Online stores" title in the Industries block
    Then "Pharmaceutical chain of online stores" title is displayed
    When navigate on right arrow inside Our Clients section
    When click right arrow inside Our Clients section
    Then "Transformation of two outdated websites that sell sunglasses" title is displayed
    When navigate on right arrow inside Our Clients section
    When click right arrow inside Our Clients section
    Then "Anacapri: full-fledged B2C website that sells shoes" title is displayed
    Then View project in portfolio link first is displayed
    When click View project in portfolio link first
    Then "Anacapri" portfolio page is opened
    Given open home page
    When navigate on "Industries" title in the header
    Then "Retail" link is displayed
    When click "Retail" link
    Then Retail page is opened
    When navigate on "Customized CMS" title in the Industries block
    When click "Customized CMS" link in the Industries block
    Then "Solution for a seamless content management" title is displayed
    When navigate on "Omnichannel retail platforms" title in the Industries block
    When click "Omnichannel retail platforms" link in the Industries block
    Then "Omnichannel retail platform for spare car parts seller" title is displayed
    When navigate on "IoT-powered retail solutions" title in the Industries block
    When click "IoT-powered retail solutions" link in the Industries block
    Then "Web-based platform to monitor changes in wine storages" title is displayed
    When navigate on "Solutions that will help your business flourish" subtitle
    Then "Omnichannel strategy" item is displayed
    Then "Personalization of shopping experience" item is displayed
    Then "Mobile commerce" item is displayed
    Then "Tools for in-depth and predictive analytics" item is displayed
    When navigate on "Our recent articles" subtitle
    Then first blog is displayed
    Then second blog is displayed
    Then third blog is displayed


