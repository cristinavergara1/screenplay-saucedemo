package com.saucedemo.certificacion.compra.tasks;

import com.saucedemo.certificacion.compra.interactions.ClickDelete;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class Remove implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(ClickDelete.theProduct()
        );

    }
    public static Remove FromShoppingCart() {
        return Tasks.instrumented(Remove.class);
    }
}
