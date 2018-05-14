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

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

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
        loginSteps.iClickTheLoginButton();
        searchSteps.iSearchAProductBy("Shirt");
        searchSteps.iClickTheButtonForTheFirstProductDisplayed("VIEW DETAILS");
        productDetailsSteps.iSelectAColourForMyProductAndASizeForMyProduct();
        productDetailsSteps.iClickTheAddToCartButton();
    }

    @When("^I click the shopping cart icon$")
    public void iClickTheShoppingCartIcon() {
        header.getMinicartButton().click();

    }

    @Then("^I land on the \"([^\"]*)\" page$")
    public void iLandOnThePage(String arg0) {
        shoppingCartPage.getCartLink().click();

    }

    @And("^I can see the product in my shopping cart$")
    public void iCanSeeTheProductsInMyShoppingCart() {
        shoppingCartPage.getProductList().getText();
    }


    @Given("^Opening the shopping cart$")
    public void openingTheShoppingCart() {
        loginSteps.iOpenTheHomepageAndIEnterTheLoginSection();
        loginSteps.iEnterInTheEmailaddressFieldAndInThePasswordField("qatestmnb@gmail.com", "QaTestMnb");
        loginSteps.iClickTheLoginButton();
        searchSteps.iSearchAProductBy("Shirt");
        searchSteps.iClickTheButtonForTheFirstProductDisplayed("VIEW DETAILS");
        productDetailsSteps.iSelectAColourForMyProductAndASizeForMyProduct();
        productDetailsSteps.iClickTheAddToCartButton();
        header.getMinicartButton().click();
        shoppingCartPage.getCartLink().click();

    }


    @When("^I click the \"CONTINUE\" button$")
    public void iClickTheButton() {
        shoppingCartPage.getContinueButton().click();
    }

    @Then("^I land on the PROCEED TO CHECKOUT page$")
    public void iLandOnThePROCEEDTOCHECKOUTPage() {
        shoppingCartPage.getProceedToCheckoutButton().click();
    }


    @And("^I select the the first shipping option$")
    public void iSelectTheTheFirstShippingOption() {
        shoppingCartPage.getFreeShippingOption().click();

    }

    @And("^I enter \"([^\"]*)\" in the Address field, \"([^\"]*)\" in the City field, \"([^\"]*)\" in the Zip/code field and \"([^\"]*)\" in the Telephone field$")
    public void iEnterInTheAddressFieldInTheCityFieldInTheZipCodeFieldAndInTheTelephoneField(String address, String city, String zip, String telephone) {

        shoppingCartPage.getAddressField().sendKeys(address);
        shoppingCartPage.getCityField().sendKeys(city);
        shoppingCartPage.getZipField().sendKeys(zip);
        shoppingCartPage.getTelephoneField().sendKeys(telephone);


    }

    @Then("^I receive This is a required field and Please select an option message under some fields$")
    public void iReceiveMessageUnderSomeFields() {
        String addressMessage = shoppingCartPage.getRequiredAddressField().getText();
        String cityMessage = shoppingCartPage.getRequiredCityField().getText();
        String zipMessage = shoppingCartPage.getRequiredZipField().getText();
        String telephoneMessage = shoppingCartPage.getRequiredTelephoneField().getText();
        String stateMessage = shoppingCartPage.getRequiredStateField().getText();
//        String countryMessage = shoppingCartPage.getRequiredCountryField().getText();

        assertThat("Unexpected message displayed", addressMessage, is("This is a required field."));
        assertThat("Unexpected message displayed", cityMessage, is("This is a required field."));
        assertThat("Unexpected message displayed", zipMessage, is("This is a required field."));
        assertThat("Unexpected message displayed", telephoneMessage, is("This is a required field."));
//        assertThat("Unexpected message displayed", countryMessage, is("Please select an option"));
        assertThat("Unexpected message displayed", stateMessage, is("Please select an option."));


    }

    @When("^I click the \"([^\"]*)\" button from the Shipping Information section$")
    public void iClickTheButtonFromTheShippingInformationSection(String arg2) {
        shoppingCartPage.getContinueButtonFromShippingInformationSection().click();

    }


    @Given("^Opening the shopping cart and adding at least an item to cart$")
    public void openingTheShoppingCartAndAddingAtLeatAnItemToCart() {
        loginSteps.iOpenTheHomepageAndIEnterTheLoginSection();
        loginSteps.iEnterInTheEmailaddressFieldAndInThePasswordField("123testmnb@gmail.com", "123testmnb");
        loginSteps.iClickTheLoginButton();
        searchSteps.iSearchAProductBy("Shirt");
        searchSteps.iClickTheButtonForTheFirstProductDisplayed("VIEW DETAILS");
        productDetailsSteps.iSelectAColourForMyProductAndASizeForMyProduct();
        productDetailsSteps.iClickTheAddToCartButton();
        header.getMinicartButton().click();
        shoppingCartPage.getCartLink().click();


    }

    @And("^I click the \"([^\"]*)\" button from the Billing Information Section$")
    public void iClickTheButtonFromTheBillingInformationSection(String arg1) {
        shoppingCartPage.getContinueButtonFromBillingInformationSection().click();
    }

    @And("^I select \"([^\"]*)\" from the State/province field and \"([^\"]*)\" from the Country field$")
    public void iSelectFromTheStateProvinceFieldAndFromTheCountryField(String state, String country) {
        shoppingCartPage.getCountryField().selectByVisibleText(country);
        shoppingCartPage.getStateField().selectByVisibleText(state);


    }

    @When("^I click the \"([^\"]*)\" button from the Checkout Method Section$")
    public void iClickTheButtonFromTheCheckoutMethodSection(String arg0) {
        shoppingCartPage.getContinueButtonFromCheckoutMethodSection().click();
    }

    @Then("^I click the \"([^\"]*)\" button from the Payment Information Section$")
    public void iClickTheButtonFromThePaymentInformationSection(String arg0) throws InterruptedException {
        Thread.sleep(1000);
        shoppingCartPage.getContinueButtonFromPaymentInformationSection().click();
    }

    @And("^I click the \"([^\"]*)\" button from the Order Review Section$")
    public void iClickTheButtonFromTheOrderReviewSection(String arg0) {
        shoppingCartPage.getPlaceOrderButton().click();
    }
}










