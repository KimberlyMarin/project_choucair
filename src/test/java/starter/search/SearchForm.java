package starter.search;

import org.openqa.selenium.By;

public class SearchForm {
    public static By LOGIN_BUTTON = By.ByClassName.className("login");
    public static By INPUT_EMAIL =  By.id("email");
    public static By INPUT_PASS = By.id("passwd");
    public static By BUTTON_LOGIN = By.id("SubmitLogin");
    public static By SEARCH_FIELD = By.ByClassName.className("sf-with-ul");
    public static By WOMEN_IMAGEN = By.ByClassName.className("content_scene_cat_bg");
    public static By WOMEN_SUBMENU = By.ByClassName.className("subcategory-image");
    public static By WOMEN_SUBMENU1 = By.ByClassName.className("subcategory-image");
    public static By PRODUCT_WOMEN = By.xpath("//span[contains(@class,'available-now')]");
    public static By ADD_TO_CARD = By.xpath("//div[contains(@class,'button-container')]/a[contains(@rel,'nofollow')]/*[text() = 'Add to cart']");
    public static By PROCESS_TO_CHECKOUT = By.xpath("//div[contains(@class,'layer_cart')]//*[contains(@rel,'nofollow')]");
    public static By  CART_QUALITY = By.xpath("//*[contains(@id,'step_end')]");
    public static By  PRICE = By.xpath("//*[contains(@class,'cart_total_price')]/td[contains(@id,'price')]");
    public static By  END_PAYMENT = By.xpath ("//*[contains(@class,'cart_navigation clearfix')]/a[contains(@class,'button btn btn-default standard-checkout button-medium')]");
    public static By UPDATE = By.xpath("//*[contains(@class,'address_update')]");
    public static By  END_PAYMENT1 = By.xpath ("//*[contains(@name,'processAddress')]");
    public static By  AGGRE = By.xpath ("//*[contains(@type,'checkbox')]");
    public static By  END_PAYMENT2 = By.xpath ("//*[contains(@name,'processCarrier')]");
    public static By  PAYMENT_METHOD = By.xpath("//*[contains(@class,'payment_module')]/a[contains(@class,'bankwire')]");
    public static By CONFIRM_ORDER = By.xpath("//*[contains(@id,'cart_navigation')]/button");
}
