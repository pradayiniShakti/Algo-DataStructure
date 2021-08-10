package Files;

import io.restassured.path.json.JsonPath;

public class ReusableCode {

	public static JsonPath rawToJson(String response) {
		JsonPath js = new JsonPath(response);
		return js;
	}
}
