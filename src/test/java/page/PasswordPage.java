package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.HashMap;
import java.util.Map;

public class PasswordPage extends AbstractPage {
    private final String PASSWORD_PAGE_URL= "https://account.booking.com/sign-in/password";

    @FindBy(xpath = "//*[@id='password']")
    private WebElement txtPassword;

    @FindBy(xpath = "//*[@type='submit']")
    private WebElement btnSignIn;



    public WebElement getWebElement(String NameOfElement) {
        Map<String, WebElement> elements = new HashMap<String, WebElement>();
        elements.put("Password", txtPassword);
        elements.put("Sign in",btnSignIn);
        return elements.get(NameOfElement);
    }

    public PasswordPage(WebDriver driver) {
        super(driver);
    }

    public PasswordPage openPage(String pageName) {
        driver.navigate().to(PASSWORD_PAGE_URL);
        return this;
    }

    public MainPage clickOnButtonSignIn(String nameOfButton){
        getWebElement(nameOfButton).click();
        return new MainPage(driver);
    }
}
