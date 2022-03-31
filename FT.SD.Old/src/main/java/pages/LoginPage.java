package pages;

import org.openqa.selenium.WebDriver;
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
}
