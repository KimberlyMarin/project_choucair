package starter.search;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class SearchFor {

    public static Performable selectForProduct(String term) {

        return Task.where("{0} attempts to search for #term",
                Click.on(SearchForm.LOGIN_BUTTON),
                Enter.theValue("essatucuz-1854@yopmail.com").into(SearchForm.INPUT_EMAIL),
                Enter.theValue("Kim*0508").into(SearchForm.INPUT_PASS),
                Click.on(SearchForm.BUTTON_LOGIN),
                Click.on(SearchForm.SEARCH_FIELD),
                Scroll.to(SearchForm.WOMEN_IMAGEN),
                Scroll.to(SearchForm.WOMEN_SUBMENU),
                Scroll.to(SearchForm.PRODUCT_WOMEN),
                WaitUntil.the(SearchForm.PRODUCT_WOMEN, WebElementStateMatchers.isVisible()),
                Click.on(SearchForm.PRODUCT_WOMEN)
        ).with("term").of(term);
    }
}
