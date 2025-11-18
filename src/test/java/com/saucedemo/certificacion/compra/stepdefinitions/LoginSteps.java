package com.saucedemo.certificacion.compra.stepdefinitions;

import com.saucedemo.certificacion.compra.tasks.LoginInTheOfficialSite;
import com.saucedemo.certificacion.compra.tasks.OpenThe;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.actors.OnStage;

public class LoginSteps {
    @Given("the user logs in using valid credentials")
    public void theUserLogsIn() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                OpenThe.url("https://www.saucedemo.com/"),
                LoginInTheOfficialSite.theUser()
        );
    }
}
