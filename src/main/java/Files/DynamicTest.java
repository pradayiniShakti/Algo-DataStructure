package Files;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import io.restassured.*;
import io.restassured.path.json.JsonPath;


public class DynamicTest {

	@Test(dataProvider = "BooksData")
	
	public static void addBooks(String ailse, String isnb) {
		RestAssured.baseURI = "http://216.10.245.166";
		
		
		  String addBookResponse = given().header("Content-Type",
		  "application/json").when()
		  .body(Payload.addBookRequest(ailse,isnb)).post("/Library/Addbook.php").then()
		  .log().all().assertThat().statusCode(200).extract().asString();
		 

		JsonPath js = ReusableCode.rawToJson(addBookResponse);
	
	String id = js.get("ID");
	
	System.out.println("ID: "+ id);
	
	}
	
	
	@DataProvider(name="BooksData")

	public Object[][]  getData()

	{
		return new Object[][] {{"ojfty","93963"},{"ctee","42853"}, {"okmfe","5337"}};
	
}
}
