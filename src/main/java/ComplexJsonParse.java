import org.testng.Assert;

import Files.Payload;
import Files.ReusableCode;
import io.restassured.path.json.JsonPath;

public class ComplexJsonParse {
 
	/*
	 * 1. Print No of courses returned by API 2.Print Purchase Amount 3. Print Title
	 * of the first course 4. Print All course titles and their respective Prices 5.
	 * Print no of copies sold by RPA Course 6. Verify if Sum of all Course prices
	 * matches with Purchase Amount
	 */
	public static void main(String[] args) {
	String complexResponse = Payload.coursePrice();
	JsonPath js = ReusableCode.rawToJson(complexResponse);
	//1. Print No of courses returned by API 
	int count = js.getInt("courses.size()");
	
	System.out.println("Total number of courses is "+ count);
	
	//2.Purchase amount
	int totalPurchaseAmount = js.getInt("dashboard.purchaseAmount");
	System.out.println("Total purchase amount is "+ totalPurchaseAmount);
	
	//3.Print Title of the first course
	
	String titleofFirstcourse = js.getString("courses[0].title");
	
	System.out.println("Title of first course is "+titleofFirstcourse);
	
	////4. Print All course titles and their respective Prices
	
	for(int i =0; i < count ; i++) {
		String title = js.getString("courses["+i+"].title");
		String price = js.getString("courses["+i+"].price");
		
		System.out.println("Title of the book : "+title+" Price: "+price);
	}
	
	//5.Print no of copies sold by RPA Course 6
	
	for(int i =0; i < count ; i++) {
		String title = js.getString("courses["+i+"].title");
		
		if(title == "RPA") {
		
		System.out.println("Number of copies sold by RPA course is "+js.getString("courses["+i+"].copies") );}
		break;
	}
	
	//6. Verify if Sum of all Course prices matches with Purchase Amount
	int totalSum = SumValidation.getSumOfCourses();
	
	Assert.assertEquals(totalPurchaseAmount, totalSum);
	
	if(totalPurchaseAmount ==totalSum ) {
		System.out.println("Validation successful");
	}
	
}
	
	
}
