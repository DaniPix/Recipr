package constants;

/**
 * Created by Domnica on 12/2/2016.
 */

public final class Constants {

    // API key
    public static final String API_KEY = "ab704156f81d2af1445dc076bb9c869f";

    // API base endpoint
    public static final String BASE_ENDPOINT = "https://api.themoviedb.org/3";

    //Authentication queries constants
    public static final String QUERY_API_KEY = "api_key=%$s";
    public static final String QUERY_REQUEST_TOKEN = "request_token=%$s";

    //Authentication constants
    public static final String CREATE_REQUEST_TOKEN = "/authentication/token/new";
    public static final String VALIDATE_REQUEST_TOKEN = "/authentication/token/validate_with_login";
    public static final String CREATE_SESSION = "/authentication/session/new";
    public static final String CREATE_GUEST_SESSION = "/authentication/guest_session/new";

    private Constants() {
        // avoid instantiation
    }
}
