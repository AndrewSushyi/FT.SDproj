package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import parentPage.ParentPage;

public class LoginPage extends ParentPage {
    @FindBy (id = "username" )
    private WebElement inputLogin;

    @FindBy (id = "password")
    private WebElement inputPass;

    @FindBy (xpath = "//dx-button[@text='Login']")
    private WebElement btnLogin;

    @FindBy (id = "kc-login")
    private WebElement btnSignIn;


     public LoginPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void openPage() {
         try {
             webDriver.get("http://service-desk.test.k8s.mc.gcf");
         } catch (Exception e){
             Assert.fail("Can't work with browser");
         }
    }

    public void enterLoginInToInputLogin(String login) {
//        WebElement inputLogin = webDriver.findElement(By.id("username"));
//        inputLogin.clear();
//        inputLogin.sendKeys(login);
//        logger.info(login + " was inputed in to login");
        actionsWithOurElements.enterTextInToInput(inputLogin, login);
    }

    public void enterPassInToInputPassWord(String password) {
//        WebElement inputPass = webDriver.findElement(By.id("password"));
//        inputPass.clear();
//        inputPass.sendKeys(password);
//        logger.info(password + " was inputed in to passWord");
        actionsWithOurElements.enterTextInToInput(inputPass, password);
    }

    public void clickOnBtnLogin() {
//        WebElement btnLogin = webDriver.findElement(By.xpath("//dx-button[@text='Login']"));
//        btnLogin.click();
//        logger.info("btn Login was clicked");
        actionsWithOurElements.clickOnElement(btnLogin);
    }

    public void clickOnBtnSignIn() {
//        WebElement btnSignIn = webDriver.findElement(By.id("kc-login"));
//        btnSignIn.click();
//        logger.info("btn Sign in was clicked");
        actionsWithOurElements.clickOnElement(btnSignIn);
    }
}
