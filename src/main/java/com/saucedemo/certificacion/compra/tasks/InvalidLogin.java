package com.saucedemo.certificacion.compra.tasks;
import com.saucedemo.certificacion.compra.interactions.LoginUnsuccessful;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class InvalidLogin implements Task {
    private final String username;
    private final String password;

    public InvalidLogin(String username, String password) {
        this.username = username;
        this.password = password;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo( LoginUnsuccessful.ClickIt(username, password));
    }

    public static InvalidLogin withCredentials(String username, String password) {
            return Tasks.instrumented(InvalidLogin.class,username,password);
        }
    }

