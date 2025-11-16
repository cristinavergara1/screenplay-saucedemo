package com.saucedemo.certificacion.compra.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ProductPage extends PageObject {
    public static final Target ADD_TO_CART_BUTTON = Target.the("botón agregar al carrito")
            .locatedBy("//button[@id='add-to-cart']");
}
