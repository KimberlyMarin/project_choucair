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
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.beans.Visibility;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import static org.hamcrest.CoreMatchers.is;

public class SearchFor {
    public static Performable term(String term) throws InterruptedException {
        return Task.where("{0} attempts to search for #term",
                Click.on(SearchForm.LOGIN_BUTTON),
                Enter.theValue("essatucuz-1854@yopmail.com").into(SearchForm.INPUT_EMAIL),
                Enter.theValue("Kim*0508").into(SearchForm.INPUT_PASS),
                Click.on(SearchForm.BUTTON_LOGIN),
                Click.on(SearchForm.SEARCH_FIELD),
                Scroll.to(SearchForm.WOMEN_IMAGEN),
                Scroll.to(SearchForm.WOMEN_SUBMENU),
               // Scroll.to(SearchForm.PRODUCT_WOMEN),
                WaitUntil.the(SearchForm.PRODUCT_WOMEN, WebElementStateMatchers.isVisible()),
                Click.on(SearchForm.PRODUCT_WOMEN)
        ).with("term").of(term);
    }

}
