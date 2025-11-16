package com.saucedemo.certificacion.compra.stepdefinitions;

import com.saucedemo.certificacion.compra.tasks.OpenTheNavigator;
import com.saucedemo.certificacion.compra.userinterfaces.NavigatorPage;
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

public class AccessStepDefinition {

    public final Actor user = OnStage.theActorCalled("user");
    @Managed(driver = "chrome",uniqueSession = true)
    public WebDriver theDriver;

    @Before
    public void config(){
        user.can(BrowseTheWeb.with(theDriver));
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("user");
    }
    @Given("I am in the navigator")
    public void iAmInTheNavigator() {
        user.attemptsTo(OpenTheNavigator.google(new NavigatorPage()));
        // Write code here that turns the phrase above into concrete actions
    }
    @When("I navigate to the SauceDemo official site")
    public void iNavigateToTheSauceDemoOfficialSite() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("I should see the SauceDemo login page")
    public void iShouldSeeTheSauceDemoLoginPage() {
        // Write code here that turns the phrase above into concrete actions
        //question
    }



}
