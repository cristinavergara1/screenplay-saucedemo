package com.saucedemo.certificacion.compra.stepdefinitions;
import com.saucedemo.certificacion.compra.questions.LoginErrorMessage;
import com.saucedemo.certificacion.compra.questions.LoginValidation;
import com.saucedemo.certificacion.compra.tasks.InvalidLogin;
import com.saucedemo.certificacion.compra.tasks.LoginInTheOfficialSite;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.openqa.selenium.WebDriver;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;


public class StepDefinition {
    @Managed(driver = "chrome", uniqueSession = true)
    WebDriver theDriver;


    @Before
    public void config() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("user").can(BrowseTheWeb.with(theDriver));
    }


    @Given("the user opens the SauceDemo login page")
    public void theUserOpensTheSauceDemoLoginPage() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Open.url("https://www.saucedemo.com")
        );
    }

    @When("the user logs in with username {string} and password {string}")
    public void theUserLogsInWithUsernameAndPassword(String username, String password) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                LoginInTheOfficialSite.theUser()
        );
    }

    @When("the user logs in with invalid username {string} and password {string}")
    public void theUserLogsInWithInvalidUsernameAndPassword(String username, String password) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                InvalidLogin.withCredentials(username, password)
        );
    }

    // Validación exitosa
    @Then("the user should see the products inventory")
    public void theUserShouldSeeTheProductsInventory() {
        OnStage.theActorInTheSpotlight()
                .should(seeThat(LoginValidation.isSuccessful(), equalTo(true)));
    }

    // Validación de error
    @Then("the user should see an error message indicating invalid credentials")
    public void theUserShouldSeeAnErrorMessageIndicatingInvalidCredentials() {
        OnStage.theActorInTheSpotlight().should(
                seeThat(LoginErrorMessage.displayed(), containsString("Epic sadface"))
        );
    }
    }




