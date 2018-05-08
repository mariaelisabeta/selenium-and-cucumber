Feature: Checkout
  As a customer
  I want to checkout
  So that I can easily buy the products I want.

  Scenario: Add unsuccessfully a specific product to cart
    Given I open the homepage and I enter the Login section
    And I enter "gasparel.emaria@gmail.com" in the email address field and "Qwerasdf1234" in the password field
    Then I click the LOGIN button
    When I search a product by "shirt"
    When I click the "VIEW DETAILS" button for the first product displayed
    And I click the "ADD TO CART" button
    Then I receive "This is a required field" message under the Color and Size fields


  Scenario: Add successfully a product to cart
    Given I open the homepage and I enter the Login section
    And I enter "gasparel.emaria@gmail.com" in the email address field and "Qwerasdf1234" in the password field
    Then I click the LOGIN button
    And I search a product by "CORE STRIPED SPORT SHIRT"
    Then I click the "VIEW DETAILS" button for the first product displayed
    And I select a colour for my product and a size for my product
    When I click the "ADD TO CART" button
    Then I should see the product "CORE STRIPED SPORT SHIRT" in my shopping cart


  Scenario: Opening the shopping cart
    Given I have added an item to my shopping cart
    When I click the shopping cart icon
    Then I land on the "VIEW SHOPPING CART" page
    And I can see the products in my shopping cart





#  Scenario: Proceed to checkout
  # sCENARIO: empty cart






