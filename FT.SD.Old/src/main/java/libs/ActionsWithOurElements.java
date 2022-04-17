package libs;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class ActionsWithOurElements {
    WebDriver webDriver;

    public ActionsWithOurElements(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    Logger logger = LogManager.getLogger(getClass());

    public void enterTextInToInput(WebElement webElement, String text){
        try {
            webElement.clear();
            webElement.sendKeys(text);
            logger.info(text + " was inputted in to input");

        }catch (Exception e){
            stopTestAndPrintMassage();
        }
    }

    public void clickOnElement(WebElement webElement){
        try {
            webElement.click();
            logger.info("Element was clicked");

        }catch (Exception e){
            stopTestAndPrintMassage();
        }
    }

    public boolean isElementDisplayed(WebElement webElement){
        try {
            boolean state = webElement.isDisplayed();
            logger.info("Is element displayed -> " + state);
            return state;
        }catch (Exception e){
            logger.info("Is element displayed -> false");
            return false;

        }
    }

    private void stopTestAndPrintMassage() {
        logger.error("Can not work with element");
        Assert.fail("Can not work with element");
    }


}
