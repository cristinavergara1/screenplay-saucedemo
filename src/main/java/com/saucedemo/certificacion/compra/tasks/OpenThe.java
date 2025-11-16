package com.saucedemo.certificacion.compra.tasks;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.OpenUrl;

public class OpenThe implements Task {
    private final String url;

    public OpenThe(String url) {
        this.url = url;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.url(url));

    }
    public static OpenThe url(String url) {
        return  Tasks.instrumented(OpenThe.class, url);
    }
}
