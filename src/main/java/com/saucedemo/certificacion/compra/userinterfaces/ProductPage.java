package com.saucedemo.certificacion.compra.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ProductPage extends PageObject {
    public static final Target ADD_TO_CART_BUTTON = Target.the("botón agregar al carrito")
            .locatedBy("//button[@id='add-to-cart']");
    public static final Target CART_BADGE = Target.the("shopping cart badge")
            .locatedBy("//span[@class='shopping_cart_badge']");
    public static final Target DELETE_FROM_CART_BUTTON = Target.the("Remove Sauce Labs Backpack button")
            .located(By.id("remove-sauce-labs-backpack"));}
