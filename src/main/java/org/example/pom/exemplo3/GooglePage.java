package org.example.pom.exemplo3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePage {
    private WebDriver driver;

    @FindBy(name = "q")
    private WebElement inputBusca;

    public GooglePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void abrir(){
        driver.get("https://google.com");
    }

    public void buscar(String texto){
        inputBusca.sendKeys(texto);
        inputBusca.submit();
    }

}
