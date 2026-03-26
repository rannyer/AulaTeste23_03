package org.example.pom.exemplo2.pages;

import org.example.pom.exemplo2.components.HeaderComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends BasePage {

    @FindBy(className = "title")
    private WebElement pageTitle;

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    private WebElement addBackPackButton;

    private HeaderComponent header;

    public ProductsPage(WebDriver driver) {
        super(driver);
        this.header = new HeaderComponent(driver);
    }
    public String getTitle(){
        return pageTitle.getText();
    }


    public ProductsPage addBackBackToCart(){
        addBackPackButton.click();
        return this;
    }


}
