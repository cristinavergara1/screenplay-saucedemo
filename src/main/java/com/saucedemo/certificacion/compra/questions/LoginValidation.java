package com.saucedemo.certificacion.compra.questions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static com.saucedemo.certificacion.compra.userinterfaces.UserInterface.INVENTORY;

public class LoginValidation implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        String inventoryText = Text.of(INVENTORY).answeredBy(actor);
        return inventoryText.equals("Products");
    }

    public static LoginValidation isSuccessful() {
        return new LoginValidation();
    }

}