package org.example.pom.exemplo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;

    private By usernameInput =  By.id("username");
    private By passwordInput =  By.id("password");
    private By loginButton =  By.cssSelector("button[type='submit']");
    private By mensagem =  By.id("flash");


    public LoginPage(WebDriver driver){
        this.driver = driver;
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

