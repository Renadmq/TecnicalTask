
package foodics;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class FoodicsTask2 {
	public static void main(String[] args) {
        String userName = "merchant@foodics.com";
        String password = "123456";
        String baseUrl = "https://pay2.foodics.dev/cp_internal/login";

        RestAssured.baseURI = baseUrl;
        RequestSpecification request = RestAssured.given();

        request.header("Authorization", "Lyz22cfYKMetFhKQybx5HAmVimF1i0xO");

        Response response = request.body("{ \"userName\":\"" + userName + "\", \"password\":\"" + password + "\"}")
                .post("/cp_internal/login);

        Assert.assertEquals(response.getStatusCode(), 200);

        String jsonString = response.asString();
        Assert.assertTrue(jsonString.contains("token"));

        String token = JsonPath.from(jsonString).get("token");

}
