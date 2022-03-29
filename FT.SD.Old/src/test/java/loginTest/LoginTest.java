package loginTest;

import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class LoginTest {

    @Test
    public void validLogin() {
        System.out.println("myTest");
        Logger logger = (Logger) LogManager.getLogger(LoginTest.class.getName());
        logger.trace("We've just greeted the user!");
        logger.debug("We've just greeted the user!");
        logger.info("We've just greeted the user!");
        logger.warn("We've just greeted the user!");
        logger.error("We've just greeted the user!");
        logger.fatal("We've just greeted the user!");
        System.setProperty("webdriver.chrome.driver", "C:\\Workspace\\FT.SDproj\\FT.SD.Old\\src\\drivers\\chromedriver.exe");
//        ChromeDriver webdriver = new ChromeDriver();
//        webdriver.get("http://service-desk.test.k8s.mc.gcf/");
//
//        webdriver.quit();



//        File file = new File("./src/drivers/chromedriver.exe");
//        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
//
//        //System.setProperty("webdriver.chrome.driver", "C:\\Workspace\\FT.SDproj\\FT.SD.Old\\src\\drivers\\chromedriver.exe");
//        WebDriver webdriver = new ChromeDriver();
//        webdriver.manage().window().maximize();
//        webdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        webdriver.get("http://service-desk.test.k8s.mc.gcf/");
//
//
//        webdriver.quit();

    }
}
