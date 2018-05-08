package org.fasttrackit.steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.fasttrackit.TestBase;
import org.fasttrackit.webviews.Header;
import org.fasttrackit.webviews.ProductDetailsPage;
import org.fasttrackit.webviews.ShoppingCartPage;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class ProductDetailsSteps extends TestBase {
    private Header header = initElements(Header.class);
    private ProductDetailsPage productDetailsPage = initElements(ProductDetailsPage.class);
    private ShoppingCartPage shoppingCartPage = initElements(ShoppingCartPage.class);

    @Then("^I receive \"([^\"]*)\" message under the Color and Size fields$")
    public void iReceiveMessageUnderTheColorAndSizeFields(String arg0) {
        String colorMessage = productDetailsPage.getRequiredColorField().getText();
        String sizeMessage = productDetailsPage.getRequiredSizeField().getText();

        assertThat("Unexpected message displayed", colorMessage, is("This is a required field."));
        assertThat("Unexpected message displayed", sizeMessage, is("This is a required field."));

    }

    @When("^I click the \"ADD TO CART\" button$")
    public void iClickTheButton() {
        productDetailsPage.getAddToCartButton().click();
    }


    @When("^I select a colour for my product and a size for my product$")
    public void iSelectAColourForMyProductAndASizeForMyProduct() {
        productDetailsPage.getIndigoColor().click();
        productDetailsPage.getXsSize().click();
    }


    @Then("^I should see the product \"([^\"]*)\" in my shopping cart$")
    public void iShouldSeeTheBookInMyShoppingCart(String productName) {
        assertThat("The product was not added to your shopping cart.",
                shoppingCartPage.getProductName().getText(),
                containsString(productName));


    }
}














