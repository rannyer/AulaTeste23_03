package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.SQLOutput;
import java.time.Duration;

public class TestandoElementoDisplayNone {
    public static void main(String[] args) {

        WebDriver driver =  new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
        driver.findElement(By.cssSelector("#start button")).click();

        WebDriverWait wait =  new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement texto =  wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("finish"))
        );
        System.out.println(texto.getTagName()+" -- "+texto.getText());

    }
}
