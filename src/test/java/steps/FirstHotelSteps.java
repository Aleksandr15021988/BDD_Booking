package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import driver.DriverHelper;
import driver.DriverSingleton;
import driver.DriverWaiter;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import page.FirstHotelPage;

public class FirstHotelSteps {

    FirstHotelPage firstHotelPage = new FirstHotelPage(DriverSingleton.getDriver());

    @And("^I select '(.*)' in '(.*)' dropdown on First Hotel Page$")
    public void selectValue(String value,String dropdown){
        DriverHelper.switchToNewWindow();
        firstHotelPage.selectNumberOfRooms(dropdown,value);
    }

    @Then("^I verify that '(.*)' button is Enabled on First Hotel Page$")
    public void verifyThatButtonIsEnabledOnFirstHotelPage(String buttonName) {
        WebElement button = firstHotelPage.getWebElement(buttonName);
        DriverWaiter.waitToBeClickable(button);
        Assert.assertTrue(button.isEnabled());
    }

    @And("^I click button '(.*)' on First Hotel Page$")
    public void ClickButton(String buttonName) {
        DriverWaiter.waitToBeClickable(firstHotelPage.getWebElement(buttonName)).click();
    }

    @Then("^I click '(.*)' button is Enabled on First Hotel Page$")
    public void ClickReserveButton(String buttonName) {
        firstHotelPage.clickOnReserveButton(buttonName);
    }
}
