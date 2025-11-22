package com.saucedemo.certificacion.compra.tasks;

import com.saucedemo.certificacion.compra.interactions.LoginSuccessfull;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;


public class LoginInTheOfficialSite implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo( LoginSuccessfull.clickIt());
    }

    public static LoginInTheOfficialSite theUser() {
        return Tasks.instrumented(LoginInTheOfficialSite.class);
    }

}