package com.saucedemo.certificacion.compra.tasks;

import com.saucedemo.certificacion.compra.interactions.TickOn;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class ClickCheckOut implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(TickOn.CheckoutButton()
        );
    }
    public static ClickCheckOut process(){
        return Tasks.instrumented(ClickCheckOut.class);
    }
}
