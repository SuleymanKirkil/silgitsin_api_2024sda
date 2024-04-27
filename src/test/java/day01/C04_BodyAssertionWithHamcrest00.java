package day01;

import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class C04_BodyAssertionWithHamcrest00 {

    /*
    Given
        https://jsonplaceholder.typicode.com/todos/23
    When
        User sends a GET request to the URL
    Then
        HTTP Status Code should be 200
    And
        Response format should be “application/json”
    And
        “title” is “et itaque necessitatibus maxime molestiae qui quas velit”
    And
        “completed” is false
    And
        “userId” is 2
*/

/*
    Steps to follow in API Testing:
    1. Set the URL
    2. Set the expected data
    3. Send the request and get the response
    4. Do Assertion
*/

    @Test
    public void assertBodyMethod() {

        //1. Set the url
//        https://jsonplaceholder.typicode.com/todos/23

        //2. Set the expected data --> We will do this in post and put requests

        //3. Send the request and get the response
//        User sends a GET request to the URL


        //4. Do Assertion
//        HTTP Status Code should be 200
//        Response format should be “application/json”
//        “title” is “et itaque necessitatibus maxime molestiae qui quas velit”
//        “completed” is false
//        “userId” is 2

        //1st Way:

                        //To do multiple assertion in multiple body methods works as HARD ASSERTION


        //2nd Way:
                        //To do multiple assertion in one single body method works as SOFT ASSERTION


        //Hard assertion stops the execution in the first failure but soft assertion do not.

    }
}
