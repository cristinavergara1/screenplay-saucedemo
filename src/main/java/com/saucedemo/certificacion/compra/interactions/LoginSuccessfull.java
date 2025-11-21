package com.saucedemo.certificacion.compra.interactions;
import com.saucedemo.certificacion.compra.utils.WaitTime;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.saucedemo.certificacion.compra.userinterfaces.UserInterface.*;

public class LoginSuccessfull implements Interaction {


    public <T extends Actor> void performAs(T actor ) {
        actor.attemptsTo(Enter.theValue("standard_user").into(INPUT_USER));
        actor.attemptsTo(Enter.theValue("secret_sauce").into(INPUT_PASSWORD));
        actor.attemptsTo(Click.on(CLICK_LOGIN));
        WaitTime.putWaitTimeOf(3000);

    }
    public static LoginSuccessfull  clickIt(){
        return Tasks.instrumented(LoginSuccessfull.class);
    }
}