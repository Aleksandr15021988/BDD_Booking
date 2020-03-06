package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.HashMap;
import java.util.Map;

public abstract class AbstractPage {
    private final int WAIT_TIME_OUT = 10;
    private final int LONG_WAIT_TIME_OUT = 180;

    protected WebDriver driver;

    protected abstract AbstractPage openPage(String pageName);

    protected AbstractPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    public abstract WebElement getWebElement(String NameOfElement);

}
