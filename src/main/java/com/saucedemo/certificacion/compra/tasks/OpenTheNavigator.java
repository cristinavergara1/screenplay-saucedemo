package com.saucedemo.certificacion.compra.tasks;

import com.saucedemo.certificacion.compra.userinterfaces.NavigatorPage;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenTheNavigator implements Task {


    PageObject page;
    public OpenTheNavigator(PageObject page) {
        this.page = page;
    }
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo((Open.browserOn(page)));
    }

    public static OpenTheNavigator google (NavigatorPage NavigatorPage) {
        return Tasks.instrumented(OpenTheNavigator.class, NavigatorPage);
    }
}