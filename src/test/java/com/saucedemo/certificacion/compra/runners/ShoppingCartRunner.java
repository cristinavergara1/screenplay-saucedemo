package com.saucedemo.certificacion.compra.runners;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/add_product_to_shopping_cart.feature",
        glue = "com.saucedemo.certificacion.compra.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class ShoppingCartRunner { }
