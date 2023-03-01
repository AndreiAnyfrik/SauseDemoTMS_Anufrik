package by.teachmeskills;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    @Test
    public void withoutUserName() {
        driver.get("https://www.saucedemo.com");
        driver.findElement(By.name("user-name")).sendKeys("");
        driver.findElement(By.name("password")).sendKeys("secret_sauce");
        driver.findElement(By.name("login-button")).click();
        WebElement errorRegistrationMessage = driver.findElement(By.xpath("//div[@class='error-message-container error']"));
        Assert.assertTrue(errorRegistrationMessage.isDisplayed(), "New page don't opened");
        Assert.assertEquals(errorRegistrationMessage.getText(), "Epic sadface: Username is required",
                "Check text of message error test without user name");
    }

    @Test
    public void withoutPassword() {
        driver.get("https://www.saucedemo.com");
        driver.findElement(By.name("user-name")).sendKeys("standard_user");
        driver.findElement(By.name("password")).sendKeys("");
        driver.findElement(By.name("login-button")).click();
        WebElement errorRegistrationMessage = driver.findElement(By.xpath("//div[@class='error-message-container error']"));
        Assert.assertTrue(errorRegistrationMessage.isDisplayed(), "New page don't opened");
        Assert.assertEquals(errorRegistrationMessage.getText(), "Epic sadface: Password is required",
                "Check text of message error test without password");
    }

    @Test
    public void withoutAllFields() {
        driver.get("https://www.saucedemo.com");
        driver.findElement(By.name("user-name")).sendKeys("");
        driver.findElement(By.name("password")).sendKeys("");
        driver.findElement(By.name("login-button")).click();
        WebElement errorRegistrationMessage = driver.findElement(By.xpath("//div[@class='error-message-container error']"));
        Assert.assertTrue(errorRegistrationMessage.isDisplayed(), "New page don't opened");
        Assert.assertEquals(errorRegistrationMessage.getText(), "Epic sadface: Username is required",
                "Check text of message error test without password");
    }

    @Test
    public void enterWithStandardUser() {
        driver.get("https://www.saucedemo.com");
        driver.findElement(By.name("user-name")).sendKeys("standard_user");
        driver.findElement(By.name("password")).sendKeys("secret_sauce");
        driver.findElement(By.name("login-button")).click();
        WebElement newOpenPage = driver.findElement(By.xpath("//span[text( )= 'Products']"));
        Assert.assertTrue(newOpenPage.isDisplayed(), "New page don't opened");

    }
    @Test
    public void enterWithProblemUser(){
        driver.get("https://www.saucedemo.com");
        driver.findElement(By.name("user-name")).sendKeys("problem_user");
        driver.findElement(By.name("password")).sendKeys("secret_sauce");
        driver.findElement(By.name("login-button")).click();
        WebElement newOpenPage = driver.findElement(By.xpath("//span[text( )= 'Products']"));
        Assert.assertTrue(newOpenPage.isDisplayed(), "New page don't opened");
    }
    @Test
    public void enterWithPerformanceGlitchUser() {
        driver.get("https://www.saucedemo.com");
        driver.findElement(By.name("user-name")).sendKeys("performance_glitch_user");
        driver.findElement(By.name("password")).sendKeys("secret_sauce");
        driver.findElement(By.name("login-button")).click();
        WebElement newOpenPage = driver.findElement(By.xpath("//span[text( )= 'Products']"));
        Assert.assertTrue(newOpenPage.isDisplayed(), "New page don't opened");
    }
}
