package org.example.pom.exemplo2.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(id = "user-name")
    private WebElement usernameInput;

    @FindBy(id = "password")
    private WebElement passwordInput;

    @FindBy(id = "login-button")
    private WebElement loginButton;


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage open(){
        driver.get("https://www.saucedemo.com/");
        return this;
    }

    public LoginPage fillUsername(String username){
        usernameInput.sendKeys(username);
        return this;
    }

    public LoginPage fillPassword(String passwod){
        passwordInput.sendKeys(passwod);
        return this;
    }

    public ProductsPage submitLogin(){
        loginButton.click();
        return new ProductsPage(driver);
    }

    public ProductsPage loginAs(String username, String password){
        fillUsername(username);
        fillPassword(password);
        return submitLogin();
    }










}
