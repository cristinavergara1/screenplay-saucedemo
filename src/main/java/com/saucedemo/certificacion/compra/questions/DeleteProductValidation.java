package com.saucedemo.certificacion.compra.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static com.saucedemo.certificacion.compra.userinterfaces.ProductPage.CART_BADGE;

public class DeleteProductValidation implements Question<Integer> {

    @Override
    public Integer answeredBy(Actor actor) {
        if (!CART_BADGE.resolveAllFor(actor).isEmpty()) {

            String text = CART_BADGE.resolveFor(actor).getText().trim();

            if (text.isEmpty()) {
                return 0;
            }
            return Integer.parseInt(text);
        }

        // Badge NO existe → carrito vacío
        return 0;
    }


    public static DeleteProductValidation product() {
        return new DeleteProductValidation();
    }
}
