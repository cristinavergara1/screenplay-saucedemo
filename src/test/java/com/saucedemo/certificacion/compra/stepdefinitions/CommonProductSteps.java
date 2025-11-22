package com.saucedemo.certificacion.compra.stepdefinitions;

import com.saucedemo.certificacion.compra.tasks.ClickOn;
import com.saucedemo.certificacion.compra.tasks.OpenThe;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.actors.OnStage;

public class CommonProductSteps {
    
    @Given("the user has a product added to the shopping cart")
    public void theUserHasAProductAddedToTheShoppingCart() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                OpenThe.url("https://www.saucedemo.com/inventory-item.html?id=4"),
                ClickOn.ShoppingButton());
    }

    @Given("the user is on the shopping cart page")
    public void theUserIsOnShoppingCartPage() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                OpenThe.url("https://www.saucedemo.com/cart.html")
        );
    }
}
