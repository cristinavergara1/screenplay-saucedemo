package com.saucedemo.certificacion.compra.tasks;

import com.saucedemo.certificacion.compra.interactions.LoginSuccessfull;
import com.saucedemo.certificacion.compra.userinterfaces.UserInterface;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class LoginInTheOfficialSite implements Task {
       @Override
        public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo( LoginSuccessfull.clickIt());
        }

        public static LoginInTheOfficialSite theUser() {
            return Tasks.instrumented(LoginInTheOfficialSite.class);
        }

    }