package page;

import driver.DriverWaiter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.HashMap;
import java.util.Map;


public class LoginPage extends AbstractPage {
    @FindBy(xpath = "//*[@id='username']")
    private WebElement txtUserName;

    @FindBy(xpath = "//*[@id='root']//button/span")
    private WebElement btnContinue;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage openPage(String LoginPage) {
        driver.navigate().to(LoginPage);
        return this;
    }

    public WebElement getWebElement(String NameOfElement) {
        Map<String, WebElement> elements = new HashMap<String, WebElement>();
        elements.put("User Name", txtUserName);
        elements.put("Continue", btnContinue);
        return elements.get(NameOfElement);
    }

    public PasswordPage clickOnButtonContinue(String nameOfButton) {
        DriverWaiter.waitToBeClickable(getWebElement(nameOfButton)).click();
        return new PasswordPage(driver);
    }


}
