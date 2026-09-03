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
import pages.ProductPage;

public class ProductTest {

    WebDriver driver;
    LoginPage loginPage;
    HomePage homePage;
    ProductPage productPage;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");

        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        productPage = new ProductPage(driver);

        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickLogin();
    }

    @Test
    public void productNavigationTest() {

        driver.findElement(By.className("inventory_item_name")).click();

        Assert.assertTrue(
                productPage.isProductDisplayed(),
                "Product name was not displayed"
        );

        Assert.assertTrue(
                productPage.isPriceDisplayed(),
                "Product price was not displayed"
        );

        Assert.assertTrue(
                productPage.isDescriptionDisplayed(),
                "Product description was not displayed"
        );
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
