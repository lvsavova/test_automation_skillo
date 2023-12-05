import com.google.gson.JsonArray;
import com.google.gson.JsonParser;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pojos.ActionPOJO;
import pojos.CommentPOJO;
import pojos.LoginPOJO;
import pojos.PostPOJO;
import utils.ConfigurationLoader;

import java.io.IOException;

import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class APITests {

    final String baseUrl = "http://training.skillo-bg.com:3100";
    String accessToken;
    int userId;
    int postId;
    RequestSpecification spec;
    @BeforeClass
    public void login() throws IOException {

        LoginPOJO login = new LoginPOJO();
        login.setUsernameOrEmail(ConfigurationLoader.getUser());
        login.setPassword(ConfigurationLoader.getPass());

        ValidatableResponse response =
                given()
                        .baseUri(baseUrl)
                        .header("Content-Type", "application/json")
                        .basePath("/users/login")
                        .body(login)
                .when()
                        .post()
                .then()
                        .statusCode(201);
        accessToken = response.extract().jsonPath().get("token");
        userId = response.extract().jsonPath().get("user.id");
        spec = new RequestSpecBuilder()
                .setBaseUri(baseUrl)
                .addHeader("Authorization", "Bearer " + accessToken)
                .addHeader("Content-Type", "application/json")
                .build();
    }

    @Test
    public void getUserPosts() {
        ValidatableResponse response =
                given()
                        .spec(spec)
                        .pathParam("userId", userId)
                        .queryParam("postStatus", "public")
                        .queryParam("take", 10)
                        .queryParam("skip", 0)
                .when()
                        .get("/users/{userId}/posts")
                .then()
                        .statusCode(200);

        String responseBody = response.extract().asString();
        JsonArray responseArray = JsonParser.parseString(responseBody).getAsJsonArray();

        Assert.assertTrue(responseArray.size() <= 10, "Response should contain exactly 10 posts");
    }

    @Test
    public void createNewPost() {
        PostPOJO post = new PostPOJO();
        post.setCaption("Matrix");
        post.setCoverUrl("https://i.imgur.com/zY7dp6C.gif");
        post.setPostStatus("private");

        ValidatableResponse response = given()
                .spec(spec)
                .basePath("/posts")
                .body(post)
        .when()
                .post()
        .then()
                .statusCode(201)
                .body("caption", equalTo(post.getCaption()))
                .body("coverUrl", equalTo(post.getCoverUrl()))
                .body("postStatus", equalTo(post.getPostStatus()))
                .body("user.id", equalTo(userId));
        postId = response.extract().jsonPath().get("id");
    }

    @Test(dependsOnMethods = "createNewPost")
    public void updatePost() {
        PostPOJO post = new PostPOJO();
        post.setPostStatus("public");

        given()
                .spec(spec)
                .pathParam("postId", postId)
                .body(post)
        .when()
                .put("/posts/{postId}")
        .then()
                .statusCode(200)
                .body("postStatus", equalTo(post.getPostStatus()));
    }

    @Test(dependsOnMethods = "createNewPost")
    public void addComment() {
        CommentPOJO comment = new CommentPOJO();
        comment.setContent("I escaped the matrix!");

        given()
                .spec(spec)
                .pathParam("postId", postId)
                .body(comment)
        .when()
                .post("/posts/{postId}/comment")
        .then()
                .statusCode(201)
                .body("content", equalTo(comment.getContent()));
    }

    @Test(dependsOnMethods = "createNewPost")
    public void likePost() {
        ActionPOJO action = new ActionPOJO();
        action.setAction("likePost");

        ValidatableResponse response =
                given()
                        .spec(spec)
                        .body(action)
                        .pathParam("postId", postId)
                        .when()
                        .patch("/posts/{postId}")
                        .then()
                        .statusCode(200)
                        .body("post.likesCount", equalTo(1));
    }

    @AfterClass
    public void deletePost() {
        Response response =
                given()
                        .spec(spec)
                        .pathParam("postId", postId)
                        .when()
                        .delete("/posts/{postId}");

        response.then()
                .statusCode(200)
                .body("msg", equalTo("Post was deleted!"));

        assertThat(response.getBody().jsonPath().getString("msg"), equalTo("Post was deleted!"));
    }
}
