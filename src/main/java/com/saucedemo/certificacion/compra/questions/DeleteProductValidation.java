package com.saucedemo.certificacion.compra.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static com.saucedemo.certificacion.compra.userinterfaces.ProductPage.CART_BADGE;

public class DeleteProductValidation implements Question<Integer> {

    @Override
    public Integer answeredBy(Actor actor) {
        String quantityText = Text.of(CART_BADGE).answeredBy(actor).trim();
        return Integer.parseInt(quantityText);
    }

    public static DeleteProductValidation product() {
        return new DeleteProductValidation();
    }
}
