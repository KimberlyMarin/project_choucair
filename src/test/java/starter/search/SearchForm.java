package starter.search;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.By;

public class SearchForm {
    public static By LOGIN_BUTTON = By.ByClassName.className("login");
    public static By INPUT_EMAIL =  By.id("email");
    public static By INPUT_PASS = By.id("passwd");
    public static By BUTTON_LOGIN = By.id("SubmitLogin");
    public static By SEARCH_FIELD = By.ByClassName.className("sf-with-ul");
    public static By WOMEN_IMAGEN = By.ByClassName.className("content_scene_cat_bg");
    public static By WOMEN_SUBMENU = By.ByClassName.className("subcategory-image");
    public static By PRODUCT_WOMEN = By.ByClassName.className("product-container");
    public static By ADD_TO_CARD = By.ByClassName.className("exclusive");
    public static By PROCESS_TO_CHECKOUT = By.ByClassName.className("btn btn-default button button-medium");
}
