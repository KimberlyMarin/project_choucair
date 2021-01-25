package starter.search;

import net.serenitybdd.core.pages.WebElementFacadeWait;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.matchers.statematchers.IsPresentMatcher;
import net.serenitybdd.screenplay.matchers.statematchers.IsVisibleMatcher;
import net.serenitybdd.screenplay.questions.Enabled;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.beans.Visibility;

import static org.hamcrest.CoreMatchers.is;

public class SearchFor {

    public static Performable term(String term) {

        return Task.where("{0} attempts to search for #term",
                Click.on(SearchForm.LOGIN_BUTTON),
                Enter.theValue("essatucuz-1854@yopmail.com").into(SearchForm.INPUT_EMAIL),
                Enter.theValue("Kim*0508").into(SearchForm.INPUT_PASS),
                Click.on(SearchForm.BUTTON_LOGIN),
                Click.on(SearchForm.SEARCH_FIELD),
                Scroll.to(SearchForm.WOMEN_IMAGEN),
                Scroll.to(SearchForm.WOMEN_SUBMENU),
                WaitUntil.the(SearchForm.PRODUCT_WOMEN, WebElementStateMatchers.isVisible()),
                Click.on(SearchForm.PRODUCT_WOMEN),
                WaitUntil.the(SearchForm.ADD_TO_CARD, WebElementStateMatchers.isPresent()),
                WaitUntil.the(SearchForm.ADD_TO_CARD, WebElementStateMatchers.isVisible()),
                 Click.on(SearchForm.ADD_TO_CARD),
                Click.on(SearchForm.PROCESS_TO_CHECKOUT)
        ).with("term").of(term);
    }
}
