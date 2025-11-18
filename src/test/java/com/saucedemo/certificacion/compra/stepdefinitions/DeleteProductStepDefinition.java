package com.saucedemo.certificacion.compra.stepdefinitions;

import com.saucedemo.certificacion.compra.questions.DeleteProductValidation;
import com.saucedemo.certificacion.compra.tasks.ClickOn;
import com.saucedemo.certificacion.compra.tasks.OpenThe;
import com.saucedemo.certificacion.compra.tasks.Remove;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class DeleteProductStepDefinition {

    @Managed(driver = "chrome", uniqueSession = true)
    public WebDriver theDriver;

    @Before
    public void config() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("user").can(BrowseTheWeb.with(theDriver));
    }


    @Given("the user has a product added to the shopping cart")
    public void theUserHasAProductAddedToTheShoppingCart() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                OpenThe.url("https://www.saucedemo.com/inventory-item.html?id=4"),
                ClickOn.ShoppingButton());
    }

    @Given("the user is on shopping cart page")
    public void theUserIsOnShoppingCartPage() {
        OnStage.theActorCalled("user").attemptsTo(
                OpenThe.url("https://www.saucedemo.com/cart.html")
        );
    }

    @When("the user deletes {string} from the shopping cart")
    public void theUserDeletesFromTheShoppingCart(String string) {
        OnStage.theActorCalled("user").attemptsTo(Remove.FromShoppingCart());
    }

    @Then("the shopping cart should be empty")
    public void theShoppingCartShouldBeEmpty() {
        OnStage.theActorInTheSpotlight().should(seeThat(DeleteProductValidation.product(), equalTo(0)));
    }
}





