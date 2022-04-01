package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import parentPage.ParentPage;

import java.time.Duration;

public class HomePage extends ParentPage {

    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }

    public  boolean isAvatarDisplayed(){
        try {
            WebElement avatar = webDriver.findElement(By.xpath(".//*[@class='toolbar-avatar']"));
            //WebElement avatar = (new WebDriverWait(webDriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@class='toolbar-avatar']"))));
            System.out.println("avatar.isDisplayed()= " + avatar.isDisplayed());
            System.out.println("avatar.isEnabled()= " + avatar.isEnabled());
            return avatar.isEnabled();
        }catch (Exception e) {
            logger.info("webelement avatar not found");
            return false;
        }

    }

}
