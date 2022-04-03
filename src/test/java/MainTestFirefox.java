import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class MainTestFirefox {

    public String basePath;
    public static WebDriver driver;

    @BeforeEach
    public void getReady() {
        driver = new FirefoxDriver();
        basePath = "https://github.com";
        driver.get(basePath + "/murshmelloww/repInfo");
    }

    @Test
    public void test ()
    {
        String xpath = "//*[@id=\"repository-container-header\"]/div[1]/div/h1/strong/a";
        WebElement found = driver.findElement(By.xpath(xpath));
        String txt = found.getText();
        assertEquals("repInfo", txt);

    }
}
