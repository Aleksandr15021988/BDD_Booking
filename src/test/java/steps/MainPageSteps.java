package steps;

import constants.URL_Constants;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import driver.DriverSingleton;
import driver.DriverWaiter;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import page.MainPage;

import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.util.Date;
import java.util.List;

public class MainPageSteps {
     private MainPage mainPage= new MainPage(DriverSingleton.getDriver());

    @Then("^I verify that  login in with correct user and password is successfully and '(.*)' is displayed")
    public void iVerifyThatLoginInWithCorrectUserAndPasswordIsSuccessfullyAndIComeToMainPage(String pageName) {
        WebElement userPicture =mainPage.getWebElement(pageName);
                DriverWaiter.waitToBePresenceOfElementLocated(userPicture);
        Assert.assertTrue(userPicture.isDisplayed());
    }

    @Then("^Verify that button '(.*)' is enabled on Main Page")
    public void verifyThatButtonSearchIsEnabledOnMainPage(String buttonName) throws InterruptedException {
        //Thread.sleep(5000);
        WebElement buttonSearch = mainPage.getWebElement(buttonName);
        DriverWaiter.waitToBeClickable(buttonSearch);
        Assert.assertTrue(buttonSearch.isEnabled());
        }

    @And("^Verify that following filter fields should be displayed on Main Page")
    public void verifyThatFollowingFilterFieldsShouldBeDisplayedOnMainPage(List<String> fields) {
        for(int i=0;  i<fields.size();i++){
            WebElement element =mainPage.getWebElement(fields.get(i));
            DriverWaiter.waitToBePresenceOfElementLocated(element);
            Assert.assertTrue(element.isDisplayed());
        }

    }

    @And("^I feel '(.*)' on '(.*)' field on Main Page")
    public void iFeelLondonOnWhereAreYouGoingFieldOnMainPage(String text, String fieldName) {
        DriverWaiter.waitToBePresenceOfElementLocated(mainPage.getWebElement(fieldName));
        mainPage.getWebElement(fieldName).clear();
        mainPage.getWebElement(fieldName).sendKeys(text);
    }

    @And("^I click button '(.*)' on Main Page")
    public void iClickButtonSearchOnMainPage(String buttonName) {

        mainPage.clickOnButton(buttonName);
    }

    @And("^I click on button '(.*)' on Main Page$")
    public void iClickOnButton(String buttonName) throws InterruptedException {
        Thread.sleep(5000);
      WebElement button = mainPage.getWebElement(buttonName);
     // DriverWaiter.waitToBePresenceOfElementLocated(button);
      button.click();
    }
}
