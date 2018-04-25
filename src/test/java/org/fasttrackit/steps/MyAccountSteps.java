package org.fasttrackit.steps;

import cucumber.api.java.en.Then;
import org.fasttrackit.TestBase;
import org.fasttrackit.webviews.MyAccountPage;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.StringContains.containsString;
import static org.junit.Assert.assertThat;
import static org.openqa.selenium.support.PageFactory.initElements;

public class MyAccountSteps extends TestBase {
    private MyAccountPage myAccountPage = initElements(MyAccountPage.class);


    @Then("^MyAccount Page is displayed$")
    public void myAccountPageIsDisplayed() {
        assertThat("My Dashboard title is not displayed",
                myAccountPage.getDashboardTitle().getText(),
                is("MY DASHBOARD"));

    }
}