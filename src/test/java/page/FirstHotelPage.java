package page;

import driver.DriverSingleton;
import driver.DriverWaiter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FirstHotelPage extends AbstractPage {

    @FindBy(xpath = "//*[@class='hprt-nos-select']")
    private List<WebElement> ddlSelectNumberOfRooms;

    @FindBy(xpath = "//*[@class='hprt-roomtype-link']")
    private List<WebElement> ListOfRooms;

    @FindBy(xpath = "//div[3]/form/button/span[contains(.,'Reserve')]")
    private WebElement btnReserve;

    public FirstHotelPage(WebDriver driver) {
        super(driver);
    }

    public FirstHotelPage openPage(String FirstHotelPage) {
        driver.navigate().to(FirstHotelPage);
        return this;
    }

    public WebElement getWebElement(String NameOfElement) {
        Map<String, WebElement> elements = new HashMap<String, WebElement>();
        elements.put("Number of rooms", ddlSelectNumberOfRooms.get(0));
        elements.put("Reserve", btnReserve);
        elements.put("First room", ListOfRooms.get(0));
        return elements.get(NameOfElement);
    }


    public void selectNumberOfRooms(String dropdown, String dropdownValue) {
        Select select = new Select(getWebElement(dropdown));
        select.selectByValue(dropdownValue);
    }

    public SecurePage clickOnReserveButton(String buttonName) {
        WebElement button = getWebElement(buttonName);
        DriverWaiter.waitToBeClickable(button).click();
        return new SecurePage(DriverSingleton.getDriver());
    }
}
