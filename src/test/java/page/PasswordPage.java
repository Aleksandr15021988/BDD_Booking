package page;

import constants.URL_Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.HashMap;
import java.util.Map;

public class PasswordPage extends AbstractPage {

    @FindBy(xpath = "//*[@id='password']")
    private WebElement txtPassword;

    @FindBy(xpath = "//*[@type='submit']")
    private WebElement btnSignIn;

    public PasswordPage(WebDriver driver) {
        super(driver);
    }

    public PasswordPage openPage(String pageName) {
        driver.navigate().to(URL_Constants.getURL(pageName));
        return this;
    }


    public WebElement getWebElement(String NameOfElement) {
        Map<String, WebElement> elements = new HashMap();
        elements.put("Password", txtPassword);
        elements.put("Sign in", btnSignIn);
        return elements.get(NameOfElement);
    }

    public MainPage clickOnButtonSignIn(String nameOfButton) {
        getWebElement(nameOfButton).click();
        return new MainPage(driver);
    }
}
