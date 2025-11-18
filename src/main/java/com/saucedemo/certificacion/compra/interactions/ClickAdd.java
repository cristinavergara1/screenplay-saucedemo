package com.saucedemo.certificacion.compra.interactions;

import com.saucedemo.certificacion.compra.userinterfaces.ProductPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class ClickAdd implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        //Actividad
        actor.attemptsTo(Click.on(ProductPage.ADD_TO_CART_BUTTON)
        );

    }
    public static ClickAdd theProduct(){
        return Tasks.instrumented(ClickAdd.class);
    }
}
