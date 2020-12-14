package DynamicJson;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import files.ReUsableMethods;
import files.payload;

public class Dynamicjson {
	
	@Test(dataProvider="BooksData")
	public void addbook(String isbn,String aisle)
	{
		
		RestAssured.baseURI="http://216.10.245.166";
		String response =given().log().all().header("Content-Type","application/json")
		.body(payload.Addbook(isbn,aisle)).when()
		.post("Library/Addbook.php")
		.then().log().all().assertThat().statusCode(200).extract()
		.response().asString();
		JsonPath js= ReUsableMethods.rawToJson(response);
		String ID = js.get("ID");
		System.out.println(ID);
		
		
	}

	@DataProvider(name="BooksData")
	public Object[][] getData()
	{
		//array = collection of elements
		//Multidimesionalarray = Collection of Arrays
		return new Object[][] {{"fafas","84038034"},{"fafaljlfaj","1399"},{"faljlal","840280"}};
	}
	
}
