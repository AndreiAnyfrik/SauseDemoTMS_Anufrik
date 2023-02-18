package by.teachmeskills;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ListOfLocatorsTest extends BaseTest {
    @Test
    public void listOfLocators() {
        driver.get("https://www.saucedemo.com");
        driver.findElement(By.id("root"));
        driver.findElement(By.name("viewport"));
        driver.findElement(By.className("login_wrapper"));
        driver.findElement(By.tagName("script"));
        driver.findElement(By.xpath("//h4[contains(text(),'Password for all')]"));
        driver.findElement(By.name("user-name")).sendKeys("standard_user");
        driver.findElement(By.name("password")).sendKeys("secret_sauce");
        driver.findElement(By.name("login-button")).click();
        driver.findElement(By.linkText("Twitter"));
        driver.findElement(By.id("react-burger-menu-btn")).click();
        driver.findElement(By.xpath("//span[@class='title']"));
        driver.findElement(By.xpath("//ancestor::div"));
        driver.findElement(By.xpath("//descendant::div"));
        driver.findElement(By.xpath("//div[contains(text(),'Sauce Labs Backpack')]/following::div"));
        driver.findElement(By.xpath("//div[contains(text(),'Sauce Labs Backpack')]/parent::a"));
        driver.findElement(By.xpath("//div[@class='inventory_item_description']/preceding::div[@class='bm-burger-button']"));
        driver.findElement(By.cssSelector(".btn.btn_primary"));
        driver.findElement(By.cssSelector(".pricebar .inventory_item_price"));
        driver.findElement(By.cssSelector("#root"));
        driver.findElement(By.cssSelector("div"));
        driver.findElement(By.cssSelector("div.inventory_list"));
        driver.findElement(By.cssSelector("[class=inventory_item]"));
        driver.findElement(By.cssSelector("[class~=btn_primary]"));
        driver.findElement(By.cssSelector("[class|=bm]"));
        driver.findElement(By.cssSelector("[class^=bm]"));
        driver.findElement(By.cssSelector("[class$=button]"));
        driver.findElement(By.cssSelector("[class*=button]"));

    }
}