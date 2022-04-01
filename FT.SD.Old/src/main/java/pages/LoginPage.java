package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import parentPage.ParentPage;

public class LoginPage extends ParentPage {

     public LoginPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void openPage() {
         try {
             webDriver.get("http://service-desk.test.k8s.mc.gcf/");
         } catch (Exception e){
             Assert.fail("Can't work with browser");
         }
    }

    public void enterLoginInToInputLogin(String login) {
        WebElement inputLogin = webDriver.findElement(By.id("username"));
        inputLogin.clear();
        inputLogin.sendKeys(login);
        logger.info(login + " was inputed in to login");


    }

    public void enterPassInToInputPassWord(String password) {
        WebElement inputPass = webDriver.findElement(By.id("password"));
        inputPass.clear();
        inputPass.sendKeys(password);;
        logger.info(password + " was inputed in to passWord");
    }

    public void clickOnBtnLogin() {
        WebElement btnLogin = webDriver.findElement(By.xpath("//dx-button[@text='Login']"));
        btnLogin.click();
        logger.info("btn Login was clicked");
    }

    public void clickOnBtnSignIn() {
        WebElement btnSignIn = webDriver.findElement(By.id("kc-login"));
        btnSignIn.click();
        logger.info("btn Sign in was clicked");
    }
}
