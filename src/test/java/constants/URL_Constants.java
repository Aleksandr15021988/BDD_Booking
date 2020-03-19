package constants;

import java.util.HashMap;
import java.util.Map;

public class URL_Constants {
    private final static String MAIN_URL="https://www.booking.com/";
    private final static String LOGIN_PAGE_URL="https://account.booking.com/";
    private final static String PASSWORD_PAGE_URL= "https://account.booking.com/sign-in/password";
    private final static String LONDON_SEARCH_RESULT_URL = "https://www.booking.com/searchresults.en-us.html";

    public static String getURL(String URL) {
        Map<String, String> elements = new HashMap<String, String>();
        elements.put("Main page", MAIN_URL);
        elements.put("Login page", LOGIN_PAGE_URL);
        elements.put("Password page", PASSWORD_PAGE_URL);
        elements.put("London Search Result page", LONDON_SEARCH_RESULT_URL);
        return elements.get(URL);
    }
}
