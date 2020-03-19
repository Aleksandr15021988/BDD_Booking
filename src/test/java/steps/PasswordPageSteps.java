package steps;

import cucumber.api.java.en.And;
import driver.DriverSingleton;
import driver.DriverWaiter;
import model.UserData;
import page.PasswordPage;
import service.UserCreator;

public class PasswordPageSteps {
    PasswordPage passwordPage = new PasswordPage(DriverSingleton.getDriver());
    UserData userData = UserCreator.withCredentialsFromProperty();

    @And("^I feel '(.*)' as a password in '(.*)' field on Password Page$")
    public void iFeelNAsAPassword(String password, String passwordTextField) {
        DriverWaiter.waitToBePresenceOfElementLocated(passwordPage.getWebElement(passwordTextField)).sendKeys(userData.getUserData(password));

    }

    @And("^I click button '(.*)' on Password Page$")
    public void iClickButtonSignInOnPasswordPage(String buttonName) {
        passwordPage.clickOnButtonSignIn(buttonName);
    }
}
