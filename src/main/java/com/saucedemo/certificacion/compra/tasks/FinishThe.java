package com.saucedemo.certificacion.compra.tasks;

import com.saucedemo.certificacion.compra.interactions.ConfirmOrder;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class FinishThe implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(ConfirmOrder.payment());

    }
    public static FinishThe theOrder() {
        return Tasks.instrumented(FinishThe.class);
    }
}
