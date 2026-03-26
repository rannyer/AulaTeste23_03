package org.example.pom.exemplo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    private WebDriver driver;
    private WebDriverWait wait;

    private By usernameInput =  By.id("username");
    private By passwordInput =  By.id("password");
    private By loginButton =  By.cssSelector("button[type='submit']");
    private By mensagem =  By.id("flash");


    public LoginPage(WebDriver driver, WebDriverWait wait){
        this.driver = driver;
        this.wait =  wait;
    }

    public void acessarPagina(){
        driver.get("https://the-internet.herokuapp.com/login");
    }

    public void preencherUsuario(String usuario){
        driver.findElement(usernameInput).sendKeys(usuario);
    }

    public void preencherSenha(String senha){
        driver.findElement(passwordInput).sendKeys(senha);
    }

    public void clicarLogin(){
        driver.findElement(loginButton).click();
    }


    public void login(String usuario, String senha){
        preencherUsuario(usuario);
        preencherSenha(senha);
        clicarLogin();
    }

    public String getMensagem(){
        return driver.findElement(mensagem).getText();
    }







}

