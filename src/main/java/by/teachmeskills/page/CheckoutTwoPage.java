package by.teachmeskills.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckoutTwoPage extends BasePage {
    private By CANCEL_BUTTON_TWO = By.id("cancel");
    private By FINISH_BUTTON = By.id("finish");
    private By PRODUCTS_TITLE = By.xpath("//span[text()='Checkout: Overview']");
    public CheckoutTwoPage(WebDriver driver) {
        super(driver);
    }
    public void opened() {
        driver.get("https://www.saucedemo.com/checkout-step-two.html");
    }
    public CheckoutTwoPage open() {
        driver.get("https://www.saucedemo.com/inventory.html");
        isOpened();
        waitForPageLoaded();
        return this;
    }


    public boolean isOpened() {
       wait.until(ExpectedConditions.visibilityOfElementLocated(PRODUCTS_TITLE));
        return driver.findElement(PRODUCTS_TITLE).isDisplayed();
    }

}
