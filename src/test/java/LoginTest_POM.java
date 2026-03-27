import org.apache.commons.logging.Log;
import org.example.pom.exemplo3.LoginPage;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;


public class LoginTest_POM extends BaseTest {
    private static final Logger log = LoggerFactory.getLogger(LoginTest_POM.class);

    @Test
    void deveFazerLoginComSucesso(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.abrir()
                .preencharUser("tomsmith")
                .preencherSenha("SuperSecretPassword!")
                .clicarBtnLogin();

        assertTrue(loginPage.obterMensagem().contains("You logged into a secure area!"));

    }
    @Test
    void deveDarErroQuandoTentarLoginSemSenha(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.abrir()
                .preencharUser("tomsmith")
                .clicarBtnLogin();
        assertTrue(loginPage.obterMensagem().contains("Your password is invalid!"));
    }
    @Test
    void deveDarErroQuandoTentarLoginComUsuarioInvalido(){
        LoginPage loginPage =  new LoginPage(driver);
        loginPage.abrir()
                .clicarBtnLogin();
        assertTrue(loginPage.obterMensagem().contains("Your username is invalid!"));

    }
}
