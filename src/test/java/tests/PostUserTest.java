package tests;

import api.PostService;
import io.restassured.response.Response;
import models.PostResponse;
import org.testng.annotations.Test;
import utils.BaseTest;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

public class PostUserTest extends BaseTest {


    @Test
    public void postUerTest (){
        PostService postService = new PostService();
        String requestBody=
                "{\"title\":\"Automation\",\"body\":\"RestAssured\",\"userId\":1}";
        Response res = postService.createPost(requestBody);
                PostResponse response = res.as(PostResponse.class);
        System.out.println("Generated ID:" + response.getId());
        System.out.println("Title:" + response.getTitle());
        System.out.println("User ID:" + response.getUserId());
    }
}
