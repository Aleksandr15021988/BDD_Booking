package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import driver.DriverSingleton;
import driver.DriverWaiter;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import page.SearchResultPage;

public class SearchResultSteps {
    SearchResultPage searchResultPage = new SearchResultPage(DriverSingleton.getDriver());

    @And("^I choose '(.*)' in the calendar on Search Result Page")
    public void ChooseWeekend(String dateOfNextWeekend){
        searchResultPage.chooseNextWeekends(dateOfNextWeekend);
    }

    @And("^I click button '(.*)' on Search Result Page$")
    public void iClickButtonSearchResultsOnSearchResultPage(String buttonName) {
       searchResultPage.clickSearch(buttonName);
    }

    @Then("^Verify that over the next weekend I can find more than '(\\d+)' hotels")
    public void verifyThatOverTheNextWeekendICanFindMoreThanHotels(int numberOfHotels) {
        for(int i = 0; i< searchResultPage.getHotelList().size(); i++){
            DriverWaiter.waitToBePresenceOfElementLocated(searchResultPage.getHotelList().get(i));
        }
        Assert.assertTrue(searchResultPage.getHotelList().size()>numberOfHotels);
    }

    @Then("^I verify that all choosen hotels is located in '(.*)'")
    public void iVerifyThatAllChoosenHotelsIsLocatedInLondon(String location) {
       for(int i = 0; i< searchResultPage.getHotelIsLocationList().size(); i++){
           DriverWaiter.waitToBePresenceOfElementLocated(searchResultPage.getHotelIsLocationList().get(i));
           Assert.assertTrue(searchResultPage.getHotelIsLocationList().get(i).getText().contains(location));
       }
    }

    @And("^I select '(.*)' in '(.*)' dropdown on Search Result Page")
    public void selectValue(String value,String dropdown) {
        searchResultPage.selectValueFromDropDown(dropdown,value);
    }

    @Then("^Verify that '(.*)' should be selected in '(.*)' on Search Result Page")
    public void verifyValueShouldBeSelectedOnSearchResultPage(String expectedValue,String dropdown) {
        String actualValue = searchResultPage.getSelectedOption(dropdown).trim();
       Assert.assertEquals(expectedValue,actualValue);
    }
}
