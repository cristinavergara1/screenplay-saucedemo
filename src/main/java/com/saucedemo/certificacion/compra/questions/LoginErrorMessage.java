package com.saucedemo.certificacion.compra.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import static com.saucedemo.certificacion.compra.userinterfaces.UserInterface.LOGIN_ERROR;

public class LoginErrorMessage implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return Text.of(LOGIN_ERROR).answeredBy(actor).trim();
    }
    public static LoginErrorMessage displayed() {
        return new LoginErrorMessage();
    }
}

