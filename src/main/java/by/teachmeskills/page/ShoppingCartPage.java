package by.teachmeskills.page;


import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@Log4j2
public class ShoppingCartPage extends BasePage {
    private By SHOPPING_CART_LOCATOR = By.xpath("//span[@class='title']");
    private By CHECKOUT_SHOPPING_CART = By.id("checkout");
    private String PRODUCT_CARD_LOCATOR = "//div[text()='%s']/following::div[@class='inventory_item_price']";

    private String PRODUCT_PRICE_LOCATOR = PRODUCT_CARD_LOCATOR + "//div[@class='item_pricebar']";

    public ShoppingCartPage(WebDriver driver) {
        super(driver);
    }

    public CheckoutPage checkoutShoppingCart() {
        driver.findElement(CHECKOUT_SHOPPING_CART).click();
        log.info("Checkout shopping cart");
        return new CheckoutPage(driver);
    }

    public boolean isOpened() {
        return driver.findElement(SHOPPING_CART_LOCATOR).isDisplayed();
    }

    public boolean isProductInCart(String productName) {
        WebElement productCart = driver.findElement(By.xpath(String.format(PRODUCT_CARD_LOCATOR, productName)));
        return productCart.isDisplayed();
    }
}
