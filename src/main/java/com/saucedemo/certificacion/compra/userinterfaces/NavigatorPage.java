package com.saucedemo.certificacion.compra.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;


public class NavigatorPage extends PageObject {
    public static final Target INPUT_TEXT = Target.the("Input text").locatedBy("//input[@name='q']");
}