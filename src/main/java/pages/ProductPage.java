package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {

    WebDriver driver;

    By productName = By.className("inventory_details_name");
    By productPrice = By.className("inventory_details_price");
    By productDescription = By.className("inventory_details_desc");

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isProductDisplayed() {
        return driver.findElement(productName).isDisplayed();
    }

    public boolean isPriceDisplayed() {
        return driver.findElement(productPrice).isDisplayed();
    }

    public boolean isDescriptionDisplayed() {
        return driver.findElement(productDescription).isDisplayed();
    }
}