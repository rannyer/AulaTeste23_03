import org.example.pom.exemplo1.LoginPage;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LoginTest extends BaseTest {

    @Test
    void deveFazerLoginComSucesso(){
        LoginPage loginPage =  new LoginPage(driver);

        loginPage.acessarPagina();
        loginPage.login("tomsmith", "SuperSecretPassword!");
        assertTrue(loginPage.getMensagem().contains("You logged into a secure area!"));

    }
}
