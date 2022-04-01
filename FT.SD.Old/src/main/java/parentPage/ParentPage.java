package parentPage;


import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ParentPage {
    //объект на браузер: запустить браузер, открыть в нем страницу,найти элемен, закрыть браузер
    protected WebDriver webDriver;
    protected Logger logger = Logger.getLogger(getClass());


    //конструктор: сразу передаем драйвер браузера
    public ParentPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }


}
