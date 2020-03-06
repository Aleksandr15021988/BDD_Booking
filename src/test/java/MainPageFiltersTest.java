import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import driver.DriverSingleton;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Listeners;
import util.TestListener;

@Listeners({TestListener.class})
@CucumberOptions(features = "src/test/java/features/MainPage.feature")
public class MainPageFiltersTest extends AbstractTestNGCucumberTests {

    @AfterTest
    public void tearDown(){
        DriverSingleton.closeDriver();
    }
}
