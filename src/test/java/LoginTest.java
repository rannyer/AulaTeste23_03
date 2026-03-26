import org.example.pom.exemplo1.HomePage;
import org.example.pom.exemplo1.LoginPage;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LoginTest extends BaseTest {

    @Test
    void deveFazerLoginComSucesso(){
        LoginPage loginPage =  new LoginPage(driver, wait);

        loginPage.acessarPagina();
        loginPage.login("tomsmith", "SuperSecretPassword!");
        assertTrue(loginPage.getMensagem().contains("You logged into a secure area!"));

    }

    @Test
    void deveRealiarFluxoCompletoDeLogin(){
        HomePage home =  new HomePage(driver);
        LoginPage login = new LoginPage(driver, wait);

        home.acessar();
        home.clicarEm("Form Authentication");

        login.login("tomsmith", "SuperSecretPassword!");
        assertTrue(login.getMensagem().contains("You logged into a secure area!"));


    }
}
