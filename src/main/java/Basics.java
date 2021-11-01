import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.testng.Assert;

import Files.Payload;
import Files.ReusableCode;
import  io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class Basics {

	public static void main(String[] args) {
		RestAssured.baseURI = "https://rahulshettyacademy.com";
		String response = given().log().all().queryParam("key", "qaclick123").header("Content-Type", "application/json")
		.body(Payload.addPlace()).when().post("maps/api/place/add/json")
		.then().assertThat().statusCode(200).body("scope", equalTo("APP")).extract().response().asString();
	

		JsonPath js = ReusableCode.rawToJson(response);
		String place_id = js.getString("place_id");
		System.out.println("Place_Id : "+place_id);
		
		//////Update place
		String newAddress = "84 wintrrr walk, USA";
		
		given().log().all().queryParam("key", "qaclick123").header("Content-Type", "application/json")
		.body(Payload.updatePlace(place_id,newAddress)).when().put("maps/api/place/update/json").then()
		.assertThat().body("msg", equalTo("Address successfully updated"));
		
		System.out.println("PlaceId is updated");
		
		
		
		////Get place
		String getResponse = given().log().all().queryParam("key", "qaclick123").queryParam("place_id", place_id)
		.when().put("maps/api/place/get/json").then()
		.assertThat().statusCode(200).extract().asString();
		
		JsonPath js1 = ReusableCode.rawToJson(getResponse);
		 String currentAddress = js.getString("address");
		 //Assert.assertEquals(currentAddress, newAddress);
		 
		 try {
			String addBookResponse = given().header("Content-Type",
					  "application/json").when()
					  .log().all().body(new String(Files.readAllBytes(Paths.get("src/main/resources/Files/addBookRequest.json")))).post("/Library/Addbook.php").then()
					  .log().all().assertThat().statusCode(200).extract().asString();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("Validation done");
	}
	
}
	
	
 