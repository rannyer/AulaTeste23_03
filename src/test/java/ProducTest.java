import org.example.pom.exemplo2.pages.CartPage;
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

        productsPage.addBackBackToCart();

        assertTrue(productsPage.header.hasItemsInCart());

        assertEquals("1", productsPage.header.getCartItemsCount());

        CartPage cartPage =  productsPage.header.openCart();

        assertEquals("Your Cart", cartPage.getTitle());
        assertTrue(cartPage.containsBackpack());



    }
}
