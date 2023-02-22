package by.teachmeskills;

import by.teachmeskills.page.CheckoutPage;
import by.teachmeskills.page.CheckoutTwoPage;
import by.teachmeskills.page.LoginPage;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CheckoutTest extends BaseTest {
    @Test
    public void checkEvidenceAndrei() {
        CheckoutTwoPage checkoutPage = new LoginPage(driver).open()
                .loginAsStandardUser()
                .openCart()
                .checkoutShoppingCart()
                .checkoutAsAndrei();
        assertThat(checkoutPage.isOpened())
                .isTrue()
                .as("Products page should be opened after user logged in with valid credentials");

    }
}
