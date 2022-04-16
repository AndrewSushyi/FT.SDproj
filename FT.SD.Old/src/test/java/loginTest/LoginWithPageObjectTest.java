package loginTest;

import abstractParentTest.AbstractParentTest;
import org.testng.annotations.Test;

public class LoginWithPageObjectTest extends AbstractParentTest {
    @Test
    public  void  validLogin() {
        loginPage.openPage();
        loginPage.clickOnBtnLogin();
        loginPage.enterLoginInToInputLogin("sushyi-a");
        loginPage.enterPassInToInputPassWord("foxyGT33@#@#");
        loginPage.clickOnBtnSignIn();
        checkExpectedResult ("Avatar is not present",
                homePage.isAvatarDisplayed());

    }


}
