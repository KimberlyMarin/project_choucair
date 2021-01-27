package starter.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import starter.navigation.NavigateTo;
import starter.search.SearchFor;
import starter.search.SearchResult;
import starter.search.SearchSecoundPagesFor;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static org.hamcrest.Matchers.*;
import static starter.matchers.StringContainsIgnoringCase.containsIgnoringCase;

public class SearchOnDuckDuckGoStepDefinitions {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^(.*) ingresa a la pagina de compras")
    public void ingresar_a_la_pagina(String actor) {
        theActorCalled(actor).attemptsTo(NavigateTo.theDuckDuckGoHomePage());
    }

    @When("^(.*) selecciona los productos")
    public void seleccionar_productos(String term) throws InterruptedException {

        withCurrentActor(
                SearchFor.selectForProduct(term),
                SearchSecoundPagesFor.paymentProccess(term)
        );
    }

    @Then("^(?:el|ella) deberia visualizar los productos agregados al carrito de compras")
    public void all_the_result_titles_should_contain_the_word() {
        theActorInTheSpotlight().should(
                seeThat("mensaje de exito al realizar compra",
                        SearchResult.titles(), everyItem(containsIgnoringCase("BANK-WIRE PAYMENT")))
        );
    }
}
