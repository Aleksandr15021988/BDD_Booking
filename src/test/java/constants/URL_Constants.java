package constants;

import java.util.HashMap;
import java.util.Map;

public class URL_Constants {
    private final static String MAIN_URL="https://www.booking.com/";
    private final static String LOGIN_PAGE_URL="https://account.booking.com/";
    private final static String PASSWORD_PAGE_URL= "https://account.booking.com/sign-in/password";
    private final static String LONDON_SEARCH_RESULT_URL = "https://www.booking.com/searchresults.en-us.html";
    private final static String LONDON_HOTELS_AFTER_CLICK_SEARCH = "https://www.booking.com/searchresults.html?aid=304142&label=gen173bo-1DCA8oggI46AdIMVgDaCWIAQGYATG4ARfIAQzYAQPoAQH4AQaIAgGYAiGoAgO4ArPB-PIFwAIB&lang=en-us&sid=670b560dfcb023c500ab0f346dbafaf5&sb=1&src=searchresults&src_elem=sb&error_url=https%3A%2F%2Fwww.booking.com%2Fsearchresults.html%3Faid%3D304142%3Blabel%3Dgen173bo-1DCA8oggI46AdIMVgDaCWIAQGYATG4ARfIAQzYAQPoAQH4AQaIAgGYAiGoAgO4ArPB-PIFwAIB%3Bsid%3D670b560dfcb023c500ab0f346dbafaf5%3Btmpl%3Dsearchresults%3Bclass_interval%3D1%3Bdest_id%3D-2601889%3Bdest_type%3Dcity%3Bdtdisc%3D0%3Bfrom_sf%3D1%3Bgroup_adults%3D2%3Bgroup_children%3D0%3Binac%3D0%3Bindex_postcard%3D0%3Blabel_click%3Dundef%3Bno_rooms%3D1%3Boffset%3D0%3Bpostcard%3D0%3Braw_dest_type%3Dcity%3Broom1%3DA%252CA%3Bsb_price_type%3Dtotal%3Bshw_aparth%3D1%3Bslp_r_match%3D0%3Bsrc%3Dindex%3Bsrc_elem%3Dsb%3Bsrpvid%3D60b0415ca4580112%3Bss%3DLondon%3Bss_all%3D0%3Bssb%3Dempty%3Bsshis%3D0%3Bssne%3DLondon%3Bssne_untouched%3DLondon%3Btop_ufis%3D1%26%3B&sr_autoscroll=1&ss=London&is_ski_area=0&ssne=London&ssne_untouched=London&city=-2601889&checkin_year=2020&checkin_month=3&checkin_monthday=7&checkout_year=2020&checkout_month=3&checkout_monthday=8&group_adults=2&group_children=0&no_rooms=1&from_sf=1";
    private final static String FIRST_HOTEL_PAGE_URL = "https://www.booking.com/hotel/gb/queenshotellondon.html?aid=304142;label=gen173bo-1DCA8oggI46AdIMVgDaCWIAQGYATG4ARfIAQzYAQPoAQH4AQaIAgGYAiGoAgO4AsXX-PIFwAIB;sid=7726bbcce2e072aaac985ed5de3359e7;all_sr_blocks=11800605_99043272_0_2_0;checkin=2020-03-07;checkout=2020-03-08;dest_id=-2601889;dest_type=city;dist=0;group_adults=2;group_children=0;hapos=1;highlighted_blocks=11800605_99043272_0_2_0;hpos=1;no_rooms=1;room1=A%2CA;sb_price_type=total;sr_order=popularity;sr_pri_blocks=11800605_99043272_0_2_0__6300;srepoch=1583229910;srpvid=308846ea83000012;type=total;ucfs=1&#_";

    public static String getURL(String URL) {
        Map<String, String> elements = new HashMap<String, String>();
        elements.put("Main page", MAIN_URL);
        elements.put("Login page", LOGIN_PAGE_URL);
        elements.put("Password page", PASSWORD_PAGE_URL);
        elements.put("London Search Result page", LONDON_SEARCH_RESULT_URL);
        elements.put("Chosen hotels",LONDON_HOTELS_AFTER_CLICK_SEARCH);
        return elements.get(URL);
    }
}
