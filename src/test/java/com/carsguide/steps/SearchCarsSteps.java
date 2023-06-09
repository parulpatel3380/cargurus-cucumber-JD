package com.carsguide.steps;

import com.carsguide.pages.HomePage;
import com.carsguide.pages.SearchCarsPage;
import com.carsguide.pages.SearchCarsResultPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchCarsSteps {
    @When("^I click \"([^\"]*)\" link$")
    public void iClickLink(String subMenuItem) {
        new HomePage().selectFromSubMenu(subMenuItem);
    }

    @Then("^I navigate to \"([^\"]*)\" page$")
    public void iNavigateToPage(String expectedContains) {
        new SearchCarsPage().verifyHeadingText(expectedContains);
    }

    @And("^I select make \"([^\"]*)\"$")
    public void iSelectMake(String make) {
        new SearchCarsPage().selectMake(make);
    }

    @And("^I select model \"([^\"]*)\"$")
    public void iSelectModel(String model) {
        new SearchCarsPage().selectModel(model);
    }

    @And("^I select location \"([^\"]*)\"$")
    public void iSelectLocation(String location) {
        new SearchCarsPage().selectLocation(location);
    }

    @And("^I select price \"([^\"]*)\"$")
    public void iSelectPrice(String priceTo) {
        new SearchCarsPage().selectPriceTo(priceTo);
    }

    @And("^I click on Find My Next Car tab$")
    public void iClickOnFindMyNextCarTab() {
        new SearchCarsPage().clickOnFindMyNextCarButton();
    }


    @Then("^I should see the make \"([^\"]*)\" in results$")
    public void iShouldSeeTheMakeInResults(String make) {
        new SearchCarsResultPage().verifySearchFilter(make);
    }
}
