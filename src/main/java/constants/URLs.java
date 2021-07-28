package constants;

public class URLs {

    private URLs() {}

    public static final String HOMEPAGE = System.getProperty("base_url", "https://the-internet.herokuapp.com/challenging_dom");
    public static final String DESTINATIONS_PAGE = String.format("%sdestinations", HOMEPAGE);

}
