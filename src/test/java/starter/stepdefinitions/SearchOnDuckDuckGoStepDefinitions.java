package starter.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import cucumber.api.java.eo.Se;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
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
                SearchFor.term(term),
                SearchSecoundPagesFor.term(term)
        );
    }

    @Then("^(.*) deberia visualizar los productos agregados al carrito de compras")
    public void all_the_result_titles_should_contain_the_word(String term) {
        withCurrentActor(
                Ensure.thatTheAnswersTo(SearchResult.titles())
                        .allMatch("a title containing '" + term + "'",
                                title -> title.toLowerCase().contains(term.toLowerCase()))

        );

        theActorInTheSpotlight().should(
                seeThat("search result titles",
                        SearchResult.titles(), hasSize(greaterThan(0))),
                seeThat("search result titles",
                        SearchResult.titles(), everyItem(containsIgnoringCase(term)))
        );
    }
}
