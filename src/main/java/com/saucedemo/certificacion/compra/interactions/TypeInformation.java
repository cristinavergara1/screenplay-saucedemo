package com.saucedemo.certificacion.compra.interactions;

import com.saucedemo.certificacion.compra.utils.WaitTime;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;


import static com.saucedemo.certificacion.compra.userinterfaces.ProductPage.*;

public class TypeInformation implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("Cristina").into(FIRST_NAME_FIELD));
        actor.attemptsTo(Enter.theValue("Vergara").into( LAST_NAME_FIELD ));
        actor.attemptsTo(Enter.theValue("1025").into(POSTAL_CODE_FIELD));
        WaitTime.putWaitTimeOf(3000);

}

public static TypeInformation inTheCheckoutPage() {
        return Tasks.instrumented(TypeInformation.class);}}
