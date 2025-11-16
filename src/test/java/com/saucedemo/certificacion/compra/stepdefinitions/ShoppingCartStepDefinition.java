package com.saucedemo.certificacion.compra.stepdefinitions;

import com.saucedemo.certificacion.compra.tasks.LoginInTheOfficialSite;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

public class ShoppingCartStepDefinition {


    @Given("I see the product Sauce Labs Backpack on the products page")
    public void iAmOnThePageOfTheProducts() {
        OnStage.theActorInTheSpotlight()
                .attemptsTo(LoginInTheOfficialSite.theUser());
    }
    @When("I add {string} to the shopping cart")
    public void iAddToTheShoppingCart(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("I should see {int} product in the shopping cart")
    public void iShouldSeeProductInTheShoppingCart(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
