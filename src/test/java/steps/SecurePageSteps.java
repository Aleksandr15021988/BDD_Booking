package steps;

import cucumber.api.java.en.And;
import driver.DriverSingleton;
import model.UserData;
import org.testng.Assert;
import page.SecurePage;
import service.UserCreator;

public class SecurePageSteps {

    SecurePage securePage = new SecurePage(DriverSingleton.getDriver());
    UserData userData = UserCreator.withCredentialsFromProperty();

    @And("^I verify that '(.*)' should be displayed in '(.*)' textfield on Secure Page")
    public void iClickButtonSearchResultsOnSearchResultPage(String text, String textFieldName) {
        String expectedText = userData.getUserData(text);
        String actualText = securePage.getValueFromTextField(textFieldName);
        Assert.assertEquals(expectedText,actualText);

    }
}
