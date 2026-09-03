package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest {

    WebDriver driver;
    LoginPage loginPage;
    HomePage homePage;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");

        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
    }

    @Test
    public void validLoginTest() {
        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickLogin();

        Assert.assertTrue(
                homePage.isProductsPageDisplayed(),
                "Products page was not displayed after successful login"
        );
    }

    @Test
    public void invalidLoginTest() {
        loginPage.enterUsername("wrong_user");
        loginPage.enterPassword("wrong_password");
        loginPage.clickLogin();

        Assert.assertTrue(
                driver.findElement(By.cssSelector("[data-test='error']")).isDisplayed(),
                "Error message was not displayed for invalid login"
        );
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
