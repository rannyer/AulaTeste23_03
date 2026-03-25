package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TestandoElementoEnable {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver =  new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        driver.findElement(By.xpath("//button[text()='Enable']")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement input =  wait.until(
                ExpectedConditions.elementToBeClickable(By.cssSelector("#input-example input"))
        );
        String palavra = "Funcionou";
        for (int i = 0; i < palavra.length(); i++) {
            input.sendKeys(String.valueOf(palavra.charAt(i)));
            Thread.sleep(100);
        }


    }
}
