import org.example.pom.exemplo3.GooglePage;
import org.junit.jupiter.api.Test;

public class GoogleTest extends BaseTest{

    @Test
    void deveBuscarNoGoogle(){
        GooglePage google = new GooglePage(driver);

        google.abrir();
        google.buscar("Selenium Java");

        driver.quit();
    }
}
