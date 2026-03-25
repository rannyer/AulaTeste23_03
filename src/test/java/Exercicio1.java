import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;
import java.util.List;

public class Exercicio1 extends BaseTest {

//    Desenvolva um teste automatizado que realize os seguintes passos:
//              1.	Acesse a página indicada
//	            2.	Clique no botão “Add Element”
//              3.	Aguarde até que o botão “Delete” apareça na tela
//	            4.	Valide que o botão “Delete” está visível
//	            5.	Clique no botão “Delete”
//              6.	Valide que o botão “Delete” não está mais presente na página
    @Test
    void deveAdicionarEremoverBotato(){
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        driver.findElement(By.xpath("//button[text()='Add Element']")).click();


        WebElement btnDelete = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.className("added-manually"))
        );

        assertTrue(btnDelete.isDisplayed());

        btnDelete.click();

        wait.until(
                ExpectedConditions.invisibilityOfElementLocated(By.className("added-manually"))
        );

        List<WebElement> botoesDelete = driver.findElements(By.className("added-manually"));
        assertFalse(!botoesDelete.isEmpty());


    }
}
