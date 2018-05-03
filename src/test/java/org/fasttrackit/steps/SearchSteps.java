package org.fasttrackit.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.fasttrackit.TestBase;
import org.fasttrackit.webviews.Header;
import org.fasttrackit.webviews.ProductDetailsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.hamcrest.MatcherAssert.assertThat;

public class SearchSteps extends TestBase {
    private Header header = initElements(Header.class);
    private ProductDetailsPage productDetailsPage = initElements(ProductDetailsPage.class);

    @And("^I search a product by \"([^\"]*)\"$")
    public void iSearchAProductBy(String keyword) {
        header.search(keyword);
    }


    @Then("^The \"([^\"]*)\" page is displayed$")
    public void thePageIsDisplayed(String keyword) {
        WebElement pageTitle = driver.findElement(By.cssSelector(".page-title h1"));

    }

    @Then("^I receive \"([^\"]*)\" message under page title$")
    public void iReceiveMessageUnderPageTitle(String keyword) {
        WebElement messageUnderPageTitle = driver.findElement(By.cssSelector("p.note-msg "));
    }

    @When("^I click the \"([^\"]*)\" button$")
    public void iClickTheButton(String keyword) {
        productDetailsPage.getViewDetailsButton().click();
    }

    @And("^I click the \"([^\"]*)\" tab$")
    public void iClickTheTab(String keyword) {
        productDetailsPage.getAdditionalInformationTab().click();
    }

    @When("^I click the \"([^\"]*)\" button for the first product displayed$")
    public void iClickTheButtonForTheFirstProductDisplayed(String arg0) {
        productDetailsPage.getViewDetailsButton().click();

    }

    @Then("^I expect to see \"([^\"]*)\" in the \"([^\"]*)\" description summary$")
    public void iExpectToSeeInTheDescriptionSummary(String label, String type){

       WebElement additionalInformationRow = driver.findElement(By.xpath("//tr[./th[text()='" +label+ "'] and ./td[text()='" +type+ "']]"));
        assertThat("In the Books & Music Type description summary is not diplayed the word books", additionalInformationRow.isDisplayed());


    }
}








