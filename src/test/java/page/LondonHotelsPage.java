package page;

import driver.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LondonHotelsPage extends AbstractPage {

    @FindBy(xpath = "//span[contains(.,'See availability')]")
    private List<WebElement> btnsSelectYourRoom;

    public WebElement getWebElement(String NameOfElement) {
        Map<String, WebElement> elements = new HashMap<String, WebElement>();
        elements.put("Select Your Room",btnsSelectYourRoom.get(0));
        return elements.get(NameOfElement);
    }

    public FirstHotelPage clickButtonSeeAvailability(String button){
        getWebElement(button).click();
        return new FirstHotelPage(DriverSingleton.getDriver());
    }

    public LondonHotelsPage openPage (String LoginPage) {
        driver.navigate().to(LoginPage);
        return this;
    }
    public LondonHotelsPage(WebDriver driver) {
        super(driver);
    }
}
