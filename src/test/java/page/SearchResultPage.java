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

public class SearchResultPage extends AbstractPage {

    @FindBy(xpath = "//*[@class='c2-day c2-day-s-weekend']")
    private List<WebElement> nextWeekends;

    @FindBy(xpath = "//*[@class='hotel_image']")
    private List<WebElement> hotels;

    @FindBy(xpath = "//button[contains(.,'Search')]")
    WebElement btnSearchResults;

    @FindBy(xpath = "//*[@class='c2-calendar-body']")
    WebElement calendar;

    @FindBy(xpath = "//*[@id='group_adults']")
    WebElement ddlGroupAdults;

    @FindBy(xpath = "//*[@id='group_children']")
    WebElement ddlNumberOfChildren;

    @FindBy(xpath = "//*[@class='bui-link']")
    private List<WebElement> hotelsLocation;

    public SearchResultPage(WebDriver driver) {
        super(driver);
    }

    public SearchResultPage openPage(String LondonSearhResult) {
        driver.navigate().to(LondonSearhResult);
        return this;
    }

    public WebElement getWebElement(String NameOfElement) {
        Map<String, WebElement> elements = new HashMap();
        elements.put("Date of next weekends", nextWeekends.get(0));
        elements.put("Search results", btnSearchResults);
        elements.put("Group Adults", ddlGroupAdults);
        elements.put("Number of children", ddlNumberOfChildren);
        return elements.get(NameOfElement);
    }

    public void chooseNextWeekends(String dateOfNextWeekends) {
        WebElement element = DriverWaiter.waitToBeClickable(getWebElement(dateOfNextWeekends));
        DriverWaiter.waitToBePresenceOfElementLocated(calendar);
        element.click();
    }

    public List<WebElement> getHotelList() {
        return hotels;
    }

    public List<WebElement> getHotelIsLocationList() {
        return hotelsLocation;
    }

    public void selectValueFromDropDown(String dropdown, String dropdownValue) {
        Select select = new Select(getWebElement(dropdown));
        select.selectByVisibleText(dropdownValue);

    }

    public String getSelectedOption(String dropdown) {
        Select select = new Select(getWebElement(dropdown));
        return select.getFirstSelectedOption().getText();
    }

    public LondonHotelsPage clickSearch(String buttonName) {
        DriverWaiter.waitToBeClickable(getWebElement(buttonName)).click();
        return new LondonHotelsPage(DriverSingleton.getDriver());
    }

}
