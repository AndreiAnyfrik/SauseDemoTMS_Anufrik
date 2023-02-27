package by.teachmeskills.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage extends BasePage {
    private By FIRST_NAME = By.id("first-name");
    private By LAST_NAME = By.id("last-name");
    private By ZIP_POSTAL_CODE = By.id("postal-code");
    private By CONTINUE_BUTTON = By.id("continue");
    private By CANCEL_BUTTON = By.id("cancel");
    private By ERROR = By.xpath("//h3[@data-test='error']");

    private By CHECKOUT_INFO_TITLE = By.xpath("//span[text()='Checkout: Your Information']");

    public CheckoutPage(WebDriver driver) {
        super(driver);
    }
    public CheckoutPage open() {
    driver.get("https://www.saucedemo.com/checkout-step-one.html");
        return new CheckoutPage(driver);
    }

    public void checkoutAs(String firstName, String lastName,String zipPostalCode) {
        driver.findElement(FIRST_NAME).sendKeys(firstName);
        driver.findElement(LAST_NAME).sendKeys(lastName);
        driver.findElement(ZIP_POSTAL_CODE).sendKeys(zipPostalCode);
        driver.findElement(CONTINUE_BUTTON).click();
    }
    public CheckoutTwoPage checkoutAsAndrei() {
        checkoutAs("Andrei","Anufrik","20-002");
        return new CheckoutTwoPage(driver);
    }
    public String getErrorText() {
        return driver.findElement(ERROR).getText();
    }
}
