package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import javax.swing.plaf.TableHeaderUI;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.capgemini.com/");
        driver.manage().window().maximize();
        try {
            boolean consentFound = false;
            for (int i = 0; i < 10; i++) {
                try {
                    WebElement consentButton = driver.findElement(By.id("truste-consent-required"));
                    if (consentButton.isDisplayed() && consentButton.isEnabled()) {
                        consentButton.click();
                        consentFound = true;
                        break;
                    }
                } catch (Exception ignored) {}
                Thread.sleep(1000); // Aguarda 1 segundo antes de tentar novamente
            }
            if (!consentFound) {
                System.out.println("Botão de Decline All de cookies não encontrado ou não clicável, continuando sem clicar.");
            }
        } catch (Exception e) {
            System.out.println("Erro ao aguardar ou clicar no botão de cookies.");
        }
        try {
            // Clica no link 'News' no menu principal usando XPath
            WebElement newsLink = driver.findElement(By.xpath("//a[@aria-label='News menu']"));
            newsLink.click();
            Thread.sleep(5000);
        } catch (Exception e) {
            System.out.println("Link 'News' não encontrado ou erro ao clicar nele.");
        }
        driver.quit();
    }

}