package org.example.pom.exemplo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;


    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void acessar(){
        driver.get("https://the-internet.herokuapp.com/");
    }
    public void clicarEm(String link){
        driver.findElement(By.linkText(link)).click();
    }
}
