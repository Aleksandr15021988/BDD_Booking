package driver;

import java.util.ArrayList;

public class DriverHelper {

    public static void switchToNewWindow() {
        ArrayList<String> tabs = new ArrayList(DriverSingleton.getDriver().getWindowHandles());
        DriverSingleton.getDriver().switchTo().window(tabs.get(tabs.size() - 1));
    }

}
