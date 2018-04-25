Feature: Login
  As a customer
  I want to Login
  So that I can easily use the shopping cart and the wish list.


  Scenario: Login with wrong credentials
    Given I open the homepage and I enter the Login section
    And I enter "abcd@gmail.com" in the email address field and "123456" in the password field
    When I click the LOGIN button
    Then I receive "Invalid login or password." message


  Scenario: Login with missing password
   Given I open the homepage and I enter the Login section
   And I enter "abcd@gmail.com" in the email address field and "" in the password field
   When I click the LOGIN button
   Then I receive "This is a required field" message under the password field


  Scenario: Login with missing email address
    Given I open the homepage and I enter the Login section
    And I enter "" in the email address field and "123456" in the password field
    When I click the LOGIN button
    Then I receive "This is a required field" message under the email address field


  Scenario: Login with missing email address and password
    Given I open the homepage and I enter the Login section
    And I enter "" in the email address field and "" in the password field
    When I click the LOGIN button
    Then I receive "This is a required field" message under the email address field
    And I receive "This is a required field" message under the password field

  Scenario: Login with correct email address and password
    Given I open the homepage and I enter the Login section
    And I enter "gasparel.emaria@gmail.com" in the email address field and "Qwerasdf1234" in the password field
    When I click the LOGIN button
    Then MyAccount Page is displayed








