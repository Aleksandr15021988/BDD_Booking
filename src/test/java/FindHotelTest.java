import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import driver.DriverSingleton;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Listeners;
import util.TestListener;

@Listeners({TestListener.class})
@CucumberOptions(features = "src/test/java/features/SearchResult.feature",
tags ="@morethan3hotels")
public class FindHotelTest extends AbstractTestNGCucumberTests {

    @AfterTest
    public void tearDown(){DriverSingleton.closeDriver();
    }
}
