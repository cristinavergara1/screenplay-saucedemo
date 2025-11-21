package com.saucedemo.certificacion.compra.tasks;

import com.saucedemo.certificacion.compra.interactions.ContinueCheckout;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class ContinueProcess implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(ContinueCheckout.thePurchaseProcess()
        );
    }
    public static ContinueProcess ofCheckout() {
        return Tasks.instrumented(ContinueProcess.class);
    }
}
