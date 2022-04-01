package abstractParentTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import pages.LoginPage;

import java.io.File;
import java.time.Duration;

public class AbstractParentTest {
    WebDriver webDriver;
    protected LoginPage loginPage; //протектед чтоб была видна в наследниках
    protected  HomePage homePage;

    @BeforeMethod //перед кадыи тестом
    public void setUp(){
        File file = new File(".\\src\\drivers\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(5)); // явное ожидание
        //передаем вебдрайвер в страницу
        loginPage = new LoginPage(webDriver);
        homePage = new HomePage(webDriver);
    }

    @AfterTest
    public void tearDown(){
        webDriver.quit();
    }

    protected void checkExpectedResult(String message, boolean actualResult) {
        Assert.assertEquals(actualResult, true, message );

    }

}
