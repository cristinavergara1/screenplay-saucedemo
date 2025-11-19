package com.saucedemo.certificacion.compra.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.saucedemo.certificacion.compra.userinterfaces.UserInterface.*;

public class LoginUnsuccessful implements Interaction {
    private final String username;
    private final String password;

    public LoginUnsuccessful(String username, String password) {
        this.username = username;
        this.password = password;
    }


    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(username).into(INPUT_USER),
                Enter.theValue(password).into(INPUT_PASSWORD),
                Click.on(CLICK_LOGIN)
        );
    }

    public static LoginUnsuccessful ClickIt(String username, String password) {
        return Tasks.instrumented(LoginUnsuccessful.class, username, password);
    }

}
