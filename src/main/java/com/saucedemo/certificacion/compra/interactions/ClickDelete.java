package com.saucedemo.certificacion.compra.interactions;

import com.saucedemo.certificacion.compra.userinterfaces.ProductPage;;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class ClickDelete implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ProductPage.DELETE_FROM_CART_BUTTON)
        );

    }
    public static ClickDelete theProduct(){
        return Tasks.instrumented(ClickDelete.class);
    }
}
