package starter.search;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class SearchSecoundPagesFor {
    public static Performable term(String term) throws InterruptedException {
       // WebDriverWait wait = new WebDriverWait(driver, 12);
        return Task.where("{0} attempts to search for #term",
                Click.on(SearchForm.ADD_TO_CARD),
                Click.on(SearchForm.PROCESS_TO_CHECKOUT),
                Scroll.to(SearchForm.CART_QUALITY),
                Scroll.to(SearchForm.PRICE),
                Click.on(SearchForm.END_PAYMENT),
                Scroll.to(SearchForm.UPDATE),
                Click.on(SearchForm.END_PAYMENT1),
                Scroll.to(SearchForm.CART_QUALITY),
                Click.on(SearchForm.AGGRE),
                Click.on(SearchForm.END_PAYMENT2),
                Scroll.to(SearchForm.CART_QUALITY),
                Click.on(SearchForm.PAYMENT_METHOD),
                Scroll.to(SearchForm.CART_QUALITY),
                Click.on(SearchForm.CONFIRM_ORDER),
                Scroll.to(SearchForm.CART_QUALITY)
                ).with("term").of(term);
    }

}
