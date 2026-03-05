package tests;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetUserTest {
@Test
    public void getUsersTest(){
    given()
            .baseUri("https://jsonplaceholder.typicode.com")
            .when()
            .get("/posts/1")
            .then()
            .statusCode(200)
            .log().all();
        }
    }


