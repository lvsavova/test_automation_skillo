import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class FirstApiTest {

    @Test
    public void getPublicPost() {
        // Given conditions ( baseUri, path, request headers, params, body )
        // When ( method )
        // Then expectations ( status, conditions )

        // Option 1:
//        given().
//        when()
//                .get("http://training.skillo-bg.com:3100/posts?take=100&skip=0")
//        .then()
//                .statusCode(200);

        // Option 2:
        ValidatableResponse validatableResponse = given()
                .baseUri("http://training.skillo-bg.com:3100")
                .basePath("/posts")
                .queryParam("take", 100)
                .queryParam("skip", 0)
        .when()
                .get()
        .then()
                .statusCode(200);

        System.out.println(validatableResponse.extract().body().asString());

        // Option 3:
//        Response response =
//                given()
//                        .baseUri("http://training.skillo-bg.com:3100")
//                        .basePath("/posts")
//                        .queryParam("take", 100)
//                        .queryParam("skip", 0)
//                .when()
//                        .get();
//
//        response.then().statusCode(200);

    }
}
