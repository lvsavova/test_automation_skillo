import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class FirstApiTest {

    @Test
    public void getPublicPost() {
        // Given conditions ( baseUri, path, rewuest header, body )
        // When ( method )
        // Then expectations ( status, conditions )
        given().
            when()
                .log().all()
                .get("http://training.skillo-bg.com:3100/posts?take=100&skip=0")
            .then()
                .log().all()
                .statusCode(200);
    }
}
