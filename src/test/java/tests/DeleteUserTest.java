package tests;

import base.BaseTest;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class DeleteUserTest extends BaseTest {
  @Test
    public void deleteUserTest(){
        given()
                .when()
                .delete("/posts/1")
                .then()
                .statusCode(200);
    }

}
