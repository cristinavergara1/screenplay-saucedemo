package com.saucedemo.certificacion.compra.stepdefinitions;

import com.saucedemo.certificacion.compra.tasks.ClickOn;
import com.saucedemo.certificacion.compra.tasks.OpenThe;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.actors.OnStage;

public class AddProductSteps {
    @Given("the user has a product added to the shopping cart")
    public void theUserHasAProductAddedToTheShoppingCart() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                OpenThe.url("https://www.saucedemo.com/inventory-item.html?id=4"),
                ClickOn.ShoppingButton());
    }
}
