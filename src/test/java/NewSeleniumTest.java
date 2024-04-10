import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.util.*;


public class NewSeleniumTest {

    @Test
    public void myFirstTest() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com");

        List<WebElement> links = driver.findElements(By.tagName("a"));

        for (WebElement link : links) {
            System.out.println(link.getText());
        }

        links.get(10).click();

        driver.quit();
    }
}

