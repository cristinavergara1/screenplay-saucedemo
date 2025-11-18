package com.saucedemo.certificacion.compra.stepdefinitions;


import com.saucedemo.certificacion.compra.questions.ShoppingCartValidation;
import com.saucedemo.certificacion.compra.tasks.ClickOn;
import com.saucedemo.certificacion.compra.tasks.OpenThe;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Managed;
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


    @Given("the user is on the product page")
    public void theUserIsOnTheProductPage() {
            OnStage.theActorCalled("user").attemptsTo(
                    OpenThe.url("https://www.saucedemo.com/inventory-item.html?id=4ya")
            );
        }
    @When("the user adds {string} to the shopping cart")
    public void theUserAddsToTheShoppingCart(String string) {
         OnStage.theActorCalled("user").attemptsTo(ClickOn.ShoppingButton());
    }
    @Then("the shopping cart should display {int} item")
    public void theUserSeeProductInTheShoppingCart(Integer int1) {
        OnStage.theActorInTheSpotlight().should(seeThat(ShoppingCartValidation.product(),equalTo(1)));
    }

}
