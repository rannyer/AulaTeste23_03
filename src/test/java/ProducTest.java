import org.example.pom.exemplo2.pages.LoginPage;
import org.example.pom.exemplo2.pages.ProductsPage;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProducTest extends BaseTest {
    @Test
    void deveAdicionarItemNoCarrinho(){
        LoginPage loginPage =  new LoginPage(driver);

        ProductsPage productsPage = loginPage
                .open()
                .loginAs("standard_user", "secret_sauce" );

        assertEquals("Products",productsPage.getTitle());


    }
}
