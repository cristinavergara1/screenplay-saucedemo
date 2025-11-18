package com.saucedemo.certificacion.compra.stepdefinitions;


import com.saucedemo.certificacion.compra.questions.ShoppingCartValidation;
import com.saucedemo.certificacion.compra.tasks.ClickOn;
import com.saucedemo.certificacion.compra.tasks.LoginInTheOfficialSite;
import com.saucedemo.certificacion.compra.tasks.OpenThe;
import com.saucedemo.certificacion.compra.userinterfaces.ProductPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.openqa.selenium.WebDriver;
import static org.hamcrest.Matchers.equalTo;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class ShoppingCartStepDefinition {


    @Managed(driver = "chrome", uniqueSession = true)
    public WebDriver theDriver;


    @Before
    public void config() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("user").can(BrowseTheWeb.with(theDriver));
    }

    @Given("the user logs in using valid credentials")
    public void theUserLogsInUsingValidCredentials() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                OpenThe.url("https://www.saucedemo.com/"),
                LoginInTheOfficialSite.theUser()
        );

    }

    @Given("the user are on the product page")
    public void theUserAreOnTheProductPage() {
            OnStage.theActorCalled("user").attemptsTo(
                    OpenThe.url("https://www.saucedemo.com/inventory-item.html?id=4ya")
            );
        }
    @When("the user {string} to the shopping cart")
    public void theUserToTheShoppingCart(String string) {
         OnStage.theActorCalled("user").attemptsTo(ClickOn.ShoppingButton());
    }
    @Then("the user see {int} product in the shopping cart")
    public void theUserSeeProductInTheShoppingCart(Integer int1) {
        OnStage.theActorInTheSpotlight().should(seeThat(ShoppingCartValidation.product(),equalTo(1)));
    }

}
