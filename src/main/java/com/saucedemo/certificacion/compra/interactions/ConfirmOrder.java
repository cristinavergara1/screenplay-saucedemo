package com.saucedemo.certificacion.compra.interactions;

import com.saucedemo.certificacion.compra.userinterfaces.ProductPage;
import com.saucedemo.certificacion.compra.utils.WaitTime;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import static com.saucedemo.certificacion.compra.userinterfaces.ProductPage.FINISH_BUTTON;

public class ConfirmOrder implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ProductPage.FINISH_BUTTON)
        );
        WaitTime.putWaitTimeOf(3000);
    }

    public static ConfirmOrder payment() {
        return Tasks.instrumented(ConfirmOrder.class);
    }
}
