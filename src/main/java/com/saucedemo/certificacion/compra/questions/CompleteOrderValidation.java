package com.saucedemo.certificacion.compra.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static com.saucedemo.certificacion.compra.userinterfaces.ProductPage.ORDER_COMPLETE_HEADER ;

public class CompleteOrderValidation implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        String inventoryText = Text.of(ORDER_COMPLETE_HEADER ).answeredBy(actor);
        return inventoryText.equals("Thank you for your order!");
    }

    public static CompleteOrderValidation isSuccessful() {
        return new CompleteOrderValidation();
    }}
