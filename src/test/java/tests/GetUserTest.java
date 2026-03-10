package tests;

import base.BaseTest;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetUserTest extends BaseTest {
@Test
    public void getUsersTest  (){
    given()
            .when()
            .get("/posts/1")
            .then()
            .statusCode(200)
            .log().all();
        }
    }


