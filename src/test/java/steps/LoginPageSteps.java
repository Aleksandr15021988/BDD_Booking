package steps;

import constants.URL_Constants;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import driver.DriverWaiter;
import driver.DriverSingleton;
import model.UserData;
import page.AbstractPage;
import page.LoginPage;
import page.PasswordPage;
import service.UserCreator;

public class LoginPageSteps {

    LoginPage loginPage = new LoginPage(DriverSingleton.getDriver());
    UserData userData = UserCreator.withCredentialsFromProperty();

    @Given("^I open '(.*)' on Booking portal$")
    public void iOpenPageOnBookingPortal(String pageName) {
        loginPage.openPage(URL_Constants.getURL(pageName));
    }

    @When("^I feel '(.*)' as a login in '(.*)' field on Login Page$")
    public void givenNumber(String userName, String userTextField) {
        loginPage.getWebElement(userTextField).sendKeys(userData.getUserData(userName));
    }

    @And("^I click button '(.*)' on Login Page$")
    public void iClickButtonOnHomePage(String buttonName) {
        loginPage.clickOnButtonContinue(buttonName);
    }

}

