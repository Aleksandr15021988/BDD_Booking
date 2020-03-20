package page;

import driver.DriverWaiter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.HashMap;
import java.util.Map;

public class SecurePage extends AbstractPage {

    @FindBy(xpath = "//*[@id='email']")
    private WebElement txtEmail;

    public SecurePage(WebDriver driver) {
        super(driver);
    }

    public SecurePage openPage(String SecurePage) {
        driver.navigate().to(SecurePage);
        return this;
    }

    public WebElement getWebElement(String NameOfElement) {
        Map<String, WebElement> elements = new HashMap();
        elements.put("Email", txtEmail);
        return elements.get(NameOfElement);
    }

    public String getValueFromTextField(String textFieldName) {
        WebElement textField = getWebElement(textFieldName);
        DriverWaiter.waitToBePresenceOfElementLocated(textField);
        return textField.getAttribute("value");
    }
}
