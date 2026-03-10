package api;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class PostService {
    public Response createPost(String body) {

        Response res =
                given()
                        .header("Content-Type", "application/json")
                        .body(body)
                        .when()
                        .post("/posts");

        return res;
    }
}