package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.plaf.TableHeaderUI;
import java.time.Duration;

public class SeleniumWait {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.capgemini.com/");
        WebDriverWait wait =  new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement elemento = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.ByXPath.xpath("//a[text()='Show all results']"))
        );


        System.out.println("Oooooi");
        elemento.click();



    }
}
