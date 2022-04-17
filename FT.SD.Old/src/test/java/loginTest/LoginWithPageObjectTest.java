package loginTest;

import abstractParentTest.AbstractParentTest;
import org.testng.annotations.Test;

public class LoginWithPageObjectTest extends AbstractParentTest {
    @Test
    public  void  validLogin() {
        loginPage.openPage();
        loginPage.clickOnBtnLogin();
        loginPage.enterLoginInToInputLogin("");
        loginPage.enterPassInToInputPassWord("");
        loginPage.clickOnBtnSignIn();
        checkExpectedResult ("Avatar is not present",
                homePage.isAvatarDisplayed());

    }


}
