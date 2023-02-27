package by.teachmeskills;

import by.teachmeskills.page.LoginPage;
import by.teachmeskills.page.ProductsPage;
import by.teachmeskills.page.ShoppingCartPage;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

public class ProductTest extends BaseTest {
    @Test
    public void addProductOne() {
        String name = "Sauce Labs Backpack";
        LoginPage loginPage = new LoginPage(driver);
        ProductsPage productsPage = loginPage.open()
                .loginAsStandardUser()
                .addProductToCart(name);
        Assertions.assertThat(productsPage.isRemoveButtonDisplayed(name)).
                as("Remove button doesn't displayed in the products page").isTrue();
        ShoppingCartPage shoppingCartPage = productsPage.openCart();
        shoppingCartPage.isProductInCart(name);
        Assertions.assertThat(shoppingCartPage.isProductInCart(name)).isTrue()
                .as("Product isn't in the shopping cart");
    }

    @Test
    public void addProductTwo() {
        String name = "Sauce Labs Bike Light";
        LoginPage loginPage = new LoginPage(driver);
        ProductsPage productsPage = loginPage.open()
                .loginAsStandardUser()
                .addProductToCart(name);
        Assertions.assertThat(productsPage.isRemoveButtonDisplayed(name)).
                as("Remove button doesn't displayed in the products page").isTrue();
        ShoppingCartPage shoppingCartPage = productsPage.openCart();
        shoppingCartPage.isProductInCart(name);
        Assertions.assertThat(shoppingCartPage.isProductInCart(name)).isTrue()
                .as("Product isn't in the shopping cart");
    }

    @Test
    public void addProductThree() {
        String name = "Sauce Labs Bolt T-Shirt";
        LoginPage loginPage = new LoginPage(driver);
        ProductsPage productsPage = loginPage.open()
                .loginAsStandardUser()
                .addProductToCart(name);
        Assertions.assertThat(productsPage.isRemoveButtonDisplayed(name)).
                as("Remove button doesn't displayed in the products page").isTrue();
        ShoppingCartPage shoppingCartPage = productsPage.openCart();
        shoppingCartPage.isProductInCart(name);
        Assertions.assertThat(shoppingCartPage.isProductInCart(name)).isTrue()
                .as("Product isn't in the shopping cart");
    }

    @Test
    public void addProductFour() {
        String name = "Sauce Labs Fleece Jacket";
        LoginPage loginPage = new LoginPage(driver);
        ProductsPage productsPage = loginPage.open()
                .loginAsStandardUser()
                .addProductToCart(name);
        Assertions.assertThat(productsPage.isRemoveButtonDisplayed(name)).
                as("Remove button doesn't displayed in the products page").isTrue();
        ShoppingCartPage shoppingCartPage = productsPage.openCart();
        shoppingCartPage.isProductInCart(name);
        Assertions.assertThat(shoppingCartPage.isProductInCart(name)).isTrue()
                .as("Product isn't in the shopping cart");
    }

    @Test
    public void addProductFive() {
        String name = "Sauce Labs Onesie";
        LoginPage loginPage = new LoginPage(driver);
        ProductsPage productsPage = loginPage.open()
                .loginAsStandardUser()
                .addProductToCart(name);
        Assertions.assertThat(productsPage.isRemoveButtonDisplayed(name)).
                as("Remove button doesn't displayed in the products page").isTrue();
        ShoppingCartPage shoppingCartPage = productsPage.openCart();
        shoppingCartPage.isProductInCart(name);
        Assertions.assertThat(shoppingCartPage.isProductInCart(name)).isTrue()
                .as("Product isn't in the shopping cart");
    }

    @Test
    public void addProductSix() {
        String name = "Sauce Labs Onesie";
        LoginPage loginPage = new LoginPage(driver);
        ProductsPage productsPage = loginPage.open()
                .loginAsStandardUser()
                .addProductToCart(name);
        Assertions.assertThat(productsPage.isRemoveButtonDisplayed(name)).
                as("Remove button doesn't displayed in the products page").isTrue();
        ShoppingCartPage shoppingCartPage = productsPage.openCart();
        shoppingCartPage.isProductInCart(name);
        Assertions.assertThat(shoppingCartPage.isProductInCart(name)).isTrue()
                .as("Product isn't in the shopping cart");
    }
}
