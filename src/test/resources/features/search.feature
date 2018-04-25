Feature: Search
  As a customer
  I want to Search products
  So that I can easily find the products I'm interested in.

  Scenario: Search a nonexistent product
    Given I open the homepage
    And I search a product by "yjhfytrdfju"
    Then I receive "Your search returns no results" message under page title


   Scenario: Page title for search after one keyword
     Given I open the homepage
     And I search a product by "books"
     Then The "SEARCH RESULTS FOR BOOKS" page is displayed

  Scenario: Page title for search after two keywords
      Given I open the homepage
      And I search a product by "geometric candle"
      Then The "SEARCH RESULTS FOR GEOMETRIC CANDLE" page is displayed


  Scenario: