import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.time.Duration;

public class BaseTest {

    protected WebDriver driver;
    protected WebDriverWait wait;
    protected Actions actions;

    @BeforeEach
    void setup(){
        driver =  new ChromeDriver();
        driver.manage().window().maximize();
        wait =  new WebDriverWait(driver, Duration.ofSeconds(10));
        actions =  new Actions(driver);
    }
    @AfterEach
    void tearDown() throws InterruptedException {
        Thread.sleep(6000);
        if(driver!=null){
            driver.quit();
        }
    }

}
