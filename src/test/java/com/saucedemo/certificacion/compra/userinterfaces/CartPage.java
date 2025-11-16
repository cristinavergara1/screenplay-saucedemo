package com.saucedemo.certificacion.compra.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class CartPage {
    public static final Target ADD_PRODUCT_BUTTON = Target.the("add to cart button")
            .locatedBy("//button[contains(@id,'add-to-cart-sauce-labs-backpack')]");
    public static final Target REMOVE_PRODUCT_BUTTON = Target.the("remove from cart button")
            .locatedBy("//button[contains(@id,'remove-sauce-labs-backpack')]");
    public static final Target CART_BADGE = Target.the("cart badge")
            .locatedBy("//span[@class='shopping_cart_badge']");
    public static final Target CART_ICON = Target.the("cart icon")
            .locatedBy("//a[@class='shopping_cart_link']");
}

