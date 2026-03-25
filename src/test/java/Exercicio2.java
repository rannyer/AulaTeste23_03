import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import static org.junit.jupiter.api.Assertions.*;

public class Exercicio2 extends BaseTest{
//    Hovers
//    https://the-internet.herokuapp.com/hovers
//
//    Desenvolva um teste automatizado que realize os seguintes passos:
//            1.	Localize as imagens exibidas na página
//	2.	Passe o mouse sobre a primeira imagem
//	3.	Aguarde até que as informações do usuário sejam exibidas
//	4.	Valide que o texto exibido contém “name: user1”
//            5.	Clique no link “View profile” que aparece após o hover
//	6.	Valide que a navegação ocorreu corretamente (por exemplo, verificando o texto da nova página ou a URL)

    @Test
    void deveExibirInformacoesDoUsuarioAoExecutarHover() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/hovers");
        WebElement img1 = driver.findElement(By.cssSelector(".figure:nth-of-type(1) img"));

        Thread.sleep(1000);

        actions.moveToElement(img1).perform();

        Thread.sleep(1000);

        WebElement userData = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("(//div[@class='figcaption'])[1]//h5")
                )
        );

        assertTrue(userData.getText().contains("name: user1"));

        WebElement link =  wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("(//div[@class='figcaption'])[1]//a")
                )
        );
        link.click();

        assertTrue(driver.getCurrentUrl().contains("/users/1"));




    }
}