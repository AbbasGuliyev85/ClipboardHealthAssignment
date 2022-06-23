Feature: User validations for Amazon Product page


  Scenario: User verifies that the About section exists in the product page
    When user navigates to Amazon homepage
    Then user clicks on the hamburger menu
     And user clicks on the 'TV, Appliances and Electronics' menu item
     And user clicks on 'Televisions' under the 'Tv, Audio & Cameras' submenu
     And user scrolls to the 'Brands' section
     And user checks the 'Samsung' checkbox
     And user sorts the results with price High to Low.
     And user clicks on the 2nd item on the results
     And user switches to the product tab
     And user should see 'About this item' section in the page
