package lab;

import org.json.JSONException;
import org.json.JSONObject;

public class json {

    public static void main(String[] args) throws JSONException {
        System.out.println("JSON Test");

        JSONObject parsedObj = new JSONObject("{\"name\":\"epickiwi\",\"awesome\":true,\"age\":20}");
        System.out.println(parsedObj);

    }

}
