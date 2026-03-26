package org.example.pom.exemplo2.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage{

    @FindBy(className = "title")
    private WebElement cartTitle;

    @FindBy(xpath = "//div[text()='Sauce Labs Backpack']")
    private WebElement backpackItem;

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public String getTitle(){
        return cartTitle.getText();
    }
    public boolean containsBackpack(){
        return backpackItem.isDisplayed();
    }

}
