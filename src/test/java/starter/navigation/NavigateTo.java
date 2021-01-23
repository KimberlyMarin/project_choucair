package starter.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {

    public static Performable theDuckDuckGoHomePage() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/webdriver/driver/chromedriver.exe");

        return Task.where("{0} ingresa a la pagina de compras",

                Open.browserOn().the(DuckDuckGoHomePage.class)
        );
    }
}