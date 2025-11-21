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
            .located(By.id("remove-sauce-labs-backpack"));
    public static final Target CHECKOUT_BUTTON = Target.the("botón checkout").located(By.id("checkout"));
    public static final Target FIRST_NAME_FIELD = Target.the("first name field").located(By.id("first-name"));
    public static final Target LAST_NAME_FIELD = Target.the("last name field").located(By.id("last-name"));
    public static final Target POSTAL_CODE_FIELD = Target.the("postal code field").located(By.name("postalCode"));
    public static final Target CONTINUE_BUTTON = Target.the("continue button").located(By.id("continue"));
    public static final Target FINISH_BUTTON = Target.the("finish button").located(By.id("finish"));
    public static final Target ORDER_COMPLETE_HEADER = Target.the("order completion header").located(By.xpath("//h2[text()='Thank you for your order!']"));




}

