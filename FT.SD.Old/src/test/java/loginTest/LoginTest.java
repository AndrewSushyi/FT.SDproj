package loginTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.time.Duration;

public class LoginTest {
    WebDriver webDriver;

    @Test
    public void validLogin() {

        File file = new File(".\\src\\drivers\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());

        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(5)); // явное ожидание
        webDriver.get("http://service-desk.test.k8s.mc.gcf/");
        webDriver.findElement(By.xpath("//dx-button[@text='Login']")).click();
        //sign in page
        webDriver.findElement(By.id("username")).clear();
        webDriver.findElement(By.id("username")).sendKeys("sushyi-a-");
        webDriver.findElement(By.id("password")).clear();
        webDriver.findElement(By.id("password")).sendKeys("foxyGT33@#@#");
        webDriver.findElement(By.name("login")).click();
        //проверка
        Assert.assertTrue(isAvatarPresent(), "avatar is not present");

        webDriver.quit();

    }

    private boolean isAvatarPresent() {
        try {
            return webDriver.findElement(By.className("toolbar-avatar")).isDisplayed();

        }catch (Exception e){
            return false;

        }
    }
}
