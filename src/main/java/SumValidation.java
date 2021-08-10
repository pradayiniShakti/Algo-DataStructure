import org.testng.Assert;
import org.testng.annotations.Test;

import Files.Payload;
import Files.ReusableCode;
import io.restassured.path.json.JsonPath;

public class SumValidation {

	@Test
public static int  getSumOfCourses() {
	JsonPath js = new JsonPath(Payload.coursePrice());
	
	int finalAmount = js.getInt("dashboard.purchaseAmount");
	
	int count = js.getInt("courses.size()");
	
	int totalAmount = 0;
	
	for(int i = 0; i< count ; i++) {
		int price = js.getInt("courses["+i+"].price");
		int total_price = price * js.getInt("courses["+i+"].copies");
		totalAmount = totalAmount + total_price;
	}
	
	//Assert.assertEquals(finalAmount, totalAmount);
	return totalAmount;
}

}
