import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import static org.junit.jupiter.api.Assertions.*;

public class Exercicio3 extends BaseTest {

//    Key Presses
//
//    https://the-internet.herokuapp.com/key_presses
//
//    Desenvolva um teste automatizado que realize os seguintes passos:
//      1.	Localize o campo de entrada da página
//	    2.	Envie a tecla ENTER para o campo
//	    3.	Aguarde a atualização do texto exibido na tela
//	    4.	Valide que o texto exibido contém “You entered: ENTER”
//      5.	Envie a tecla ESCAPE
//	    6.	Valide que o texto exibido contém “You entered: ESCAPE”
//      7.	Envie a tecla SHIFT
//	    8.	Valide que o texto exibido contém “You entered: SHIFT”
    //target
    // result

    @Test
    void deveValidarTeclasPressionadas() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/key_presses");

        WebElement input = driver.findElement(By.id("target"));

        //ENTER
        input.sendKeys(Keys.F10);

        WebElement resultadoEnter = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("result"))
        );

        assertTrue(resultadoEnter.getText().contains("F10"));


        //ESC
        input.sendKeys(Keys.ESCAPE);

        WebElement resultadoEsc = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("result"))
        );

        assertTrue(resultadoEnter.getText().contains("ESCAPE"));

        //SHIFT
        input.sendKeys(Keys.SHIFT);

        WebElement resultadoShift = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("result"))
        );

        assertTrue(resultadoEnter.getText().contains("SHIFT"));


    }
}
