package steps;

import cucumber.api.java.en.And;
import driver.DriverSingleton;
import driver.DriverWaiter;
import org.openqa.selenium.WebElement;
import page.LondonHotelsPage;

public class LondonHotelsSteps {

    LondonHotelsPage londonHotelsPage = new LondonHotelsPage(DriverSingleton.getDriver());

    @And("^I choose first hotel and click '(.*)' button")
    public void ClickSelectYourRoomButton(String buttonName) {
       londonHotelsPage.getWebElement(buttonName).click();

    }
}
