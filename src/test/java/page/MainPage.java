package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.HashMap;
import java.util.Map;

public class MainPage extends AbstractPage {

    @FindBy(xpath = "//*[@id='b_tt_holder_3']")
    private WebElement btnEnterToAccount;

    @FindBy(xpath = "//a/span/img")
    private WebElement profilePicture;

    @FindBy(xpath = "//*[@id='ss']")
    private WebElement txtWhereAreYouGoing;

    @FindBy(xpath = "//*[@data-calendar2-title='Check-in']")
    private WebElement checkIn;

    @FindBy(xpath = "//*[@data-calendar2-title='Check-out']")
    private WebElement checkOut;

    @FindBy(xpath = "//*[@id='xp__guests__toggle']")
    private WebElement chooseTheNumberOfGuests;

    @FindBy(xpath = "//*[@class='sb-searchbox-submit-col -submit-button ']")
    private WebElement btnSearch;

    @FindBy(xpath = "//*[@data-id='language_selector']")
    private WebElement btnChooseLanguage;

    @FindBy(xpath = "//*[@class='lang_en-gb']")
    private WebElement btnChooseEnglish;

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public MainPage openPage(String MainPage) {
        driver.navigate().to(MainPage);
        return this;
    }

    public SearchResultPage clickOnButton(String nameOfButton) {
        getWebElement(nameOfButton).click();
        return new SearchResultPage(driver);
    }

    public WebElement getWebElement(String NameOfElement) {
        Map<String, WebElement> elements = new HashMap<String, WebElement>();
        elements.put("Profile picture", profilePicture);
        elements.put("Where are you going", txtWhereAreYouGoing);
        elements.put("Check in", checkIn);
        elements.put("Check out", checkOut);
        elements.put("Choose number of Guests", chooseTheNumberOfGuests);
        elements.put("Search", btnSearch);
        elements.put("Choose Language", btnChooseLanguage);
        elements.put("Choose English", btnChooseEnglish);
        return elements.get(NameOfElement);
    }
}
