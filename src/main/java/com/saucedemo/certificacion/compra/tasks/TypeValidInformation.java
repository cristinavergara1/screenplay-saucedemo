package com.saucedemo.certificacion.compra.tasks;

import com.saucedemo.certificacion.compra.interactions.TypeInformation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class TypeValidInformation implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(TypeInformation.inTheCheckoutPage());
    }

    public static TypeValidInformation details() {
        return Tasks.instrumented(TypeValidInformation.class);
    }
}
