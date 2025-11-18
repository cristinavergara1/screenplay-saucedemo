package com.saucedemo.certificacion.compra.tasks;

import com.saucedemo.certificacion.compra.interactions.ClickAdd;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class ClickOn implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(ClickAdd.theProduct()
        );

    }

    public static ClickOn ShoppingButton() {
        return Tasks.instrumented(ClickOn.class);
    }

}
