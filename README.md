# Selenium Automation

## Project Overview

This project focuses on web automation testing using Selenium WebDriver, Java, TestNG, and Maven. The project automates login scenarios, homepage validation, and product navigation while following the Page Object Model (POM) design pattern.

## Technologies Used

- Java
- Selenium WebDriver
- TestNG
- Maven
- IntelliJ IDEA

## Application Under Test

SauceDemo

https://www.saucedemo.com/

## Project Structure

 ## Project Structure

```text
Selenium-Automation/
├── pom.xml
└── src/
    ├── main/
    │   └── java/
    │       ├── pages/
    │       │   ├── LoginPage.java
    │       │   ├── HomePage.java
    │       │   └── ProductPage.java
    │       │
    │       └── utils/
    │           └── BasePage.java
    │
    └── test/
        └── java/
            └── tests/
                ├── LoginTest.java
                └── ProductTest.java
```


## Test Scenarios

### Login Failure

- Enter invalid username and password.
- Click the Login button.
- Verify that the error message is displayed.

### Successful Login

- Enter valid username and password.
- Click the Login button.
- Verify that the Products page is displayed.

### Product Navigation

- Login with valid credentials.
- Select a product.
- Navigate to the product details page.
- Verify product name, price, and description.

## Page Object Model

The project uses the Page Object Model (POM) design pattern.

- LoginPage.java contains login page locators and actions.
- HomePage.java contains homepage validation.
- ProductPage.java contains product details locators and validation.
- BasePage.java contains reusable Selenium methods.

## Reusable Methods

Reusable methods are created for common Selenium actions such as:

- Clicking elements
- Entering text
- Waiting for elements

## Test Execution

The tests are executed using TestNG and Selenium WebDriver.

The automated tests cover:

- Invalid login
- Successful login
- Homepage validation
- Product navigation
- Product details validation

## How to Run

1. Open the project in IntelliJ IDEA.
2. Allow Maven to download the required dependencies.
3. Open LoginTest.java or ProductTest.java.
4. Run the TestNG test methods.

## Assignment

Assignment No. 7 – Selenium Automation

This project implements the required Selenium automation tasks using Java, Selenium WebDriver, TestNG, Maven, reusable utilities, and Page Object Model (POM).

## Author

LAIBA
