package org.example.pom.exemplo2.components;

import org.example.pom.exemplo2.pages.CartPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeaderComponent {
    private WebDriver driver;

    @FindBy(id = "shopping_cart_container")
    private WebElement cartButton;

    @FindBy(className = "shopping_cart_badge")
    private WebElement  cartBadge;

    public HeaderComponent(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public CartPage openCart(){
        cartButton.click();
        return new CartPage(driver);
    }
    public String getCartItemsCount(){
        return cartBadge.getText();
    }

    public boolean hasItemsInCart(){
        return cartBadge.isDisplayed();
    }



}
