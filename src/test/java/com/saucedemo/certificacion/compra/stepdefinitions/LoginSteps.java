package com.saucedemo.certificacion.compra.stepdefinitions;

import com.saucedemo.certificacion.compra.tasks.LoginInTheOfficialSite;
import com.saucedemo.certificacion.compra.tasks.OpenThe;
import com.saucedemo.certificacion.compra.questions.LoginErrorMessage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;

public class LoginSteps {
    @Given("the user logs in using valid credentials")
    public void theUserLogsIn() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                OpenThe.url("https://www.saucedemo.com/"),
                LoginInTheOfficialSite.theUser()
        );
    }

}
