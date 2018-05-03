Feature Checkout
  As a customer
  I want to checkout
  So that I can easily buy the products I want.

  Scenario Add unsuccessfully a specific product to cart
    Given I open the homepage and I enter the Login section
    And I enter "gasparel.emaria@gmail.com" in the email address field and "Qwerasdf1234" in the password field
    Then I click the LOGIN button
    When I search a product by "shirt"
  ?  And I add the first product to cart - CLICK PE EL SI CLICK VIEW DETAILS
    And I click the "Add to cart" button
    Then And I receive "This is a required field" message under the Color and Size fields

  Scenario Add successfully a product to cart
    Given I open the homepage and I enter the Login section
    And I enter "gasparel.emaria@gmail.com" in the email address field and "Qwerasdf1234" in the password field
    Then I click the LOGIN button
    When I search a product by "shirt"
    And I add the first product to cart
   ??  Then I receive "This is a required field" message under the Color and Size fields
    When I select a colour for my product
    And I select a size for my product
    And I click the "Add to cart" button
    Then I should see the book in my shopping cart ASSERT SHIRT IN SHOPPING CART

  Scenario Opening the shopping cart
    Given I have added at least an item to my shopping cart
    When I click the shopping cart icon
    Then I land on the "VIEW SHOPPING CART" page
    And I can see the products in my shopping cart    LIST WEEB ELEMENTS CU 3 IMAGINI PE RANDURI

  Scenario Proceed to checkout







