package Files;

public class Payload {
	 
	public static String addPlace() {
		
		return "{\n"
				+ "  \"location\": {\n"
				+ "    \"lat\": -38.383495,\n"
				+ "    \"lng\": 34.427362\n"
				+ "  },\n"
				+ "  \"accuracy\": 60,\n"
				+ "  \"name\": \"Test house\",\n"
				+ "  \"phone_number\": \"(+91) 983 894 3937\",\n"
				+ "  \"address\": \"30, side layout, cohen 09\",\n"
				+ "  \"types\": [\n"
				+ "    \"shoe park\",\n"
				+ "    \"shop\"\n"
				+ "  ],\n"
				+ "  \"website\": \"http://google.com\",\n"
				+ "  \"language\": \"IN-IN\"\n"
				+ "}";
	}
	
	public static String updatePlace(String placeId, String newAddress) {
		return "{\n"
				+ "\"place_id\":\""+placeId+"\",\n"
				+ "\"address\":\""+newAddress+"\",\n"
				+ "\"key\":\"qaclick123\"\n"
				+ "}";
	}
	
	public static String coursePrice() {
		return "{\n"
				+ "\"dashboard\": {\n"
				+ "\"purchaseAmount\": 910,\n"
				+ "\"website\": \"rahulshettyacademy.com\"\n"
				+ "},\n"
				+ "\"courses\": [\n"
				+ "{\n"
				+ "\"title\": \"Selenium Python\",\n"
				+ "\"price\": 50,\n"
				+ "\"copies\": 6\n"
				+ "},\n"
				+ "{\n"
				+ "\"title\": \"Cypress\",\n"
				+ "\"price\": 40,\n"
				+ "\"copies\": 4\n"
				+ "},\n"
				+ "{\n"
				+ "\"title\": \"RPA\",\n"
				+ "\"price\": 45,\n"
				+ "\"copies\": 10\n"
				+ "}\n"
				+ "]\n"
				+ "}\n"
				+ "";
		
	}
	
	public static String addBookRequest(String aisle, String isbn) {
		String addBookRequestJson = "{\n"
				+ "\"name\":\"Learn Appium Automation with Java\",\n"
				+ "\"isbn\":\""+isbn+"\",\n"
				+ "\"aisle\":\""+aisle+"\",\n"
				+ "\"author\":\"John foer\"\n"
				+ "}" ;
		return addBookRequestJson;
	}
	
}
