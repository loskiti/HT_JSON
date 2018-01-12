/**
 * Created by eloseva on 12.01.2018
 */
class JsonError {

    private int code;
    private String message;
    private String place;
    private String resource;
    private int request_id;

    /*
    * Constructor is fill all fields of error
    * */
    JsonError(int code, String message, String place, String resource, int request_id) {
        this.code = code;
        this.message = message;
        this.place = place;
        this.resource = resource;
        this.request_id = request_id;
    }
}
