package loginTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.time.Duration;

public class LoginTest {

    @Test
    public void validLogin() {
        System.setProperty("webdriver.chrome.driver", ".\\src\\drivers\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        webDriver.get("http://service-desk.test.k8s.mc.gcf/");


        webDriver.quit();

    }
}
