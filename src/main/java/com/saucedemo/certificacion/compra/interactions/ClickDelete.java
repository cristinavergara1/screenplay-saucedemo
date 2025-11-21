package com.saucedemo.certificacion.compra.interactions;

import com.saucedemo.certificacion.compra.userinterfaces.ProductPage;;
import com.saucedemo.certificacion.compra.utils.WaitTime;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class ClickDelete implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ProductPage.DELETE_FROM_CART_BUTTON)
        );
        WaitTime.putWaitTimeOf(3000);

    }
    public static ClickDelete theProduct(){
        return Tasks.instrumented(ClickDelete.class);
    }
}
