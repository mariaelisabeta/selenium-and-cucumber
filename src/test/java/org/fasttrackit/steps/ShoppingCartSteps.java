package org.fasttrackit.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.fasttrackit.TestBase;
import org.fasttrackit.webviews.Header;
import org.fasttrackit.webviews.ProductDetailsPage;
import org.fasttrackit.webviews.ShoppingCartPage;

public class ShoppingCartSteps extends TestBase {
    private Header header = initElements(Header.class);
    private ProductDetailsSteps productDetailsSteps = new ProductDetailsSteps();
    private LoginSteps loginSteps = new LoginSteps();
    private SearchSteps searchSteps = new SearchSteps();
    private ShoppingCartPage shoppingCartPage = initElements(ShoppingCartPage.class);


    @Given("^I have added an item to my shopping cart$")
    public void iHaveAddedAtLeastAnItemToMyShoppingCart() {
        loginSteps.iOpenTheHomepageAndIEnterTheLoginSection();
        loginSteps.iEnterInTheEmailaddressFieldAndInThePasswordField("gasparel.emaria@gmail.com", "Qwerasdf1234");
        loginSteps.iClickTheButton();
        searchSteps.iSearchAProductBy("Shirt");
        searchSteps.iClickTheButtonForTheFirstProductDisplayed("VIEW DETAILS");
        productDetailsSteps.iSelectAColourForMyProductAndASizeForMyProduct();
        productDetailsSteps.iClickTheButton();
    }

    @When("^I click the shopping cart icon$")
    public void iClickTheShoppingCartIcon() {
        header.getMinicartButton().click();

    }

    @Then("^I land on the \"([^\"]*)\" page$")
    public void iLandOnThePage(String arg0) {
        shoppingCartPage.getCartLink().click();


    }

    @And("^I can see the products in my shopping cart$")
    public void iCanSeeTheProductsInMyShoppingCart() {










    }
}
