package ao.morgado.bootstrapper;

public class AnywhereRestClient {

    protected void testConfig () { // access: class, package and subclass
        int httpStatusCode = Integer.parseInt(getStatus(204));
    }

    private String getStatus (int statusCode) { // access: only class
        return switch (statusCode) {
            case 400 -> "BAD_REQUEST";
            case 401 -> "UNAUTHORIZED";
            case 403 -> "FORBIDDEN";
            case 404 -> "NOT_FOUND";
            case 405 -> "METHOD_NOT_ALLOWED";
            case 406 -> "NOT_ACCEPTABLE";
            case 407 -> "PROXY_AUTHENTICATION_REQUIRED";
            case 408 -> "REQUEST_TIMEOUT";
            case 409 -> "CONFLICT";
            case 410 -> "GONE";
            case 411 -> "LENGTH_REQUIRED";
            case 412 -> "PRECONDITION_FAILED";
            case 413 -> "TOO_MANY_REQUESTS";
            case 414 -> "REQUEST_ENTITY_TOO_LARGE";
            case 415 -> "UNSUPPORTED_MEDIA_TYPE";
            case 416 -> "REQUESTED_RANGE_NOT_SATISFIABLE";
            case 417 -> "EXPECTATION_FAILED";
            case 418 -> "UNPROCESSABLE_ENTITY";
            case 420 -> "UNSUPPORTED_MEDIA_TYPE";
            case 200 -> "";
            case 201 -> "CREATED";
            case 202 -> "ACCEPTED";
            case 203 -> "NO_CONTENT";
            case 204 -> "NOT_MODIFIED";
            case 205 -> "NO_AUTHENTICATION_REQUIRED";
            case 206 -> "BAD_GATEWAY";
            case 207 -> "SERVICE_UNAVAILABLE";
            case 208 -> "GATEWAY_TIMEOUT";
            case 226 -> "HTTP_VERSION_NOT_SUPPORTED";
            case 227 -> "VARIANT_ALSO_NEGOTIATES";
            case 228 -> "INSUFFICIENT_STORAGE";
            default -> "INTERNAL_SERVER_ERROR";
        };
    }

    void requestExternalHost () {} // access: class and packages

    public void requestExternalHost (String host) {} // access: class, package, subclass and world
}
