package loginTest;

import abstractParentTest.AbstractParentTest;
import org.testng.annotations.Test;

public class LoginWithPageObject extends AbstractParentTest {
    @Test
    public  void  validLogin() {
        loginPage.openPage();

    }
}
