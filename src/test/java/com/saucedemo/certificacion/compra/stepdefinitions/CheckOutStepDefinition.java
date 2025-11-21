package com.saucedemo.certificacion.compra.stepdefinitions;

import com.saucedemo.certificacion.compra.questions.CompleteOrderValidation;
import com.saucedemo.certificacion.compra.tasks.ClickCheckOut;
import com.saucedemo.certificacion.compra.tasks.ContinueProcess;
import com.saucedemo.certificacion.compra.tasks.FinishThe;
import com.saucedemo.certificacion.compra.tasks.TypeValidInformation;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class CheckOutStepDefinition {
    @Managed(driver = "chrome", uniqueSession = true)
    public WebDriver theDriver;


    @Before
    public void config() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("user").can(BrowseTheWeb.with(theDriver));
    }


    @When("the user proceeds to checkout")
    public void theUserProceedsToCheckout() {
       OnStage.theActorInTheSpotlight().attemptsTo(ClickCheckOut.process());

    }
    @And("the checkout information given is valid")
    public void theCheckoutInformationGivenIsValid() {
        OnStage.theActorCalled("user").attemptsTo(TypeValidInformation.details());
    }
    @And("the user continues with the purchase revision")
    public void theUserContinuesWithThePurchaseRevision() {
        OnStage.theActorCalled("user").attemptsTo(ContinueProcess.ofCheckout());
    }
    @Then("the order should be confirmed")
    public void theOrderShouldBeConfirmed() {
       OnStage.theActorInTheSpotlight().attemptsTo(FinishThe.theOrder());
    }
    @And("the purchase should be completed successfully")
    public void thePurchaseShouldBeCompletedSuccessfully() {
        OnStage.theActorInTheSpotlight().should(
                seeThat(CompleteOrderValidation.isSuccessful())
        );
    }
}


