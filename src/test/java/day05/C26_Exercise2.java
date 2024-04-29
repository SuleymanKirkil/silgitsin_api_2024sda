package day05;

import baseUrls.DummyRestBaseUrl;
import baseUrls.GorestBaseUrl;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class C26_Exercise2 extends GorestBaseUrl {
        /*
        Given
            https://gorest.co.in/public/v1/users
        When
            User send GET Request
        Then
            The value of "pagination limit" is 10
        And
            The "current link" should be "https://gorest.co.in/public/v1/users?page=1"
        And
            The number of users should  be 10
        And
            We have at least one "active" status
        And
            "Abhaidev Kaur", "Fr. Deenabandhu Adiga", "Akshita Singh DC" are among the users -> Data may change
        And
            The female users are less than or equals to male users -> Data may change
*/
    @Test
    public void test(){
        spec.pathParam("first","users");

        Response response = given(spec).when().get("{first}");
        response.prettyPrint();



        JsonPath json = response.jsonPath();
        assertEquals("https://gorest.co.in/public/v1/users?page=1",json.getString("meta.pagination.links.current"));
    }









}