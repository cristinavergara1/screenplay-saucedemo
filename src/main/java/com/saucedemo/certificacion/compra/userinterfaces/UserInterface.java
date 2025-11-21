package com.saucedemo.certificacion.compra.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;


public class UserInterface extends PageObject {
        public static final Target INPUT_USER = Target.the("INPUT USER").locatedBy("//*[@id='user-name']");
        public static final Target INPUT_PASSWORD = Target.the("INPUT PASSWORD").locatedBy("//*[@id='password']");
        public static final Target CLICK_LOGIN = Target.the("CLICK LOGIN").locatedBy("//*[@id='login-button']");
        public static final Target INVENTORY = Target.the("INVENTORY").locatedBy("//*[@id='header_container']/div[2]/span");
        public static final Target LOGIN_ERROR = Target.the("LOGIN ERROR").locatedBy("//*[@data-test='error']");



}