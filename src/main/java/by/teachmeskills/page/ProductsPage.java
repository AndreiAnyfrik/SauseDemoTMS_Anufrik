package by.teachmeskills.page;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
@Log4j2
public class ProductsPage extends BasePage {

    private By PRODUCTS_TITLE = By.xpath("//span[text()='Products']");
    private By CART = By.id("shopping_cart_container");
    private By ALL_PRODUCTS = By.xpath("//div[@class='inventory_item']");
    private By SHOPPING_CART = By.xpath("//a[@class='shopping_cart_link']");

    private String PRODUCT_CARD_LOCATOR = "//div[text()='%s']/ancestor::div[@class='inventory_item']";
    private String PRODUCT_PRICE_LOCATOR = PRODUCT_CARD_LOCATOR + "//div[@class='inventory_item_price']";
    private String ADD_TO_CART_BUTTON_LOCATOR = PRODUCT_CARD_LOCATOR + "//button[@class='btn btn_primary btn_small btn_inventory']";
    private String REMOVE_BUTTON_LOCATOR = PRODUCT_CARD_LOCATOR + "//button[@class='btn btn_secondary btn_small btn_inventory']";


    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOpened() {
        return driver.findElement(PRODUCTS_TITLE).isDisplayed();
    }

    public List<WebElement> getProducts() {
        return driver.findElements(ALL_PRODUCTS);
    }

    public WebElement getProductCard(String productName) {
        log.info("Get Product Card {}",productName);
        String fullProductLocator = String.format(PRODUCT_CARD_LOCATOR, productName);
        return driver.findElement(By.xpath(fullProductLocator));
    }

    public ShoppingCartPage openCart() {
        driver.findElement(SHOPPING_CART).click();
        return new ShoppingCartPage(driver);
    }

    public ProductsPage addProductToCart(String productName) {
//        getProduct(productName).findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt"));
        WebElement button = driver.findElement(By.xpath(String.format(ADD_TO_CART_BUTTON_LOCATOR, productName)));
        button.click();
        return this;
    }
    public boolean isRemoveButtonDisplayed(String productName) {
        return driver.findElement(By.xpath(String.format(REMOVE_BUTTON_LOCATOR,productName))).isDisplayed();
    }
}
//addProductToCart - productName