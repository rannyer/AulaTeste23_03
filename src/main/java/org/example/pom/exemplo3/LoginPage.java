package org.example.pom.exemplo3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {


    private WebDriver driver;

    @FindBy(id = "username")
    private WebElement inputUsername;

    @FindBy(id = "password")
    private WebElement inputPassword;

    @FindBy(css = "button[type='submit']")
    private WebElement btnLogin;

    @FindBy(id = "flash")
    private WebElement mensagem;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public LoginPage abrir(){
        driver.get("https://the-internet.herokuapp.com/login");
        return this;
    }
    public LoginPage preencharUser(String user){
        inputUsername.sendKeys(user);
        return this;
    }
    public LoginPage preencherSenha(String password){
        inputPassword.sendKeys(password);
        return this;
    }
    public void clicarBtnLogin(){
        btnLogin.click();
    }
    public String obterMensagem(){
        return mensagem.getText();
    }


}
