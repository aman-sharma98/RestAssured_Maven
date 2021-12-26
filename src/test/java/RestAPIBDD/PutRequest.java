package RestAPIBDD;

import java.util.HashMap;
import java.util.Map;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class PutRequest {
	@Test
	public void PutCall() {
		

		Map<String,Object> PostBody = new HashMap<String, Object>();
		PostBody.put("name", "Ama");
		PostBody.put("salary", "5000");
		
		RestAssured.given()
        .baseUri("http://localhost:7000")
        .contentType(ContentType.JSON)
        .accept(ContentType.JSON)
        .body(PostBody)
        .when()
        .put("/employees/11")
        .then()
        .statusCode(200)
        .log()
        .all();
	}

}