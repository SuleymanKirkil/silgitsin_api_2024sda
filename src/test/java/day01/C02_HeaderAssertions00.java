package day01;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Test;


public class C02_HeaderAssertions00 {
/*
    Given
        https://restful-booker.herokuapp.com/booking
    When
        User sends a GET Request to the url
    Then
        HTTP Status Code should be 200
    And
        Content Type should be JSON
    And
        Status Line should be HTTP/1.1 200 OK
    And
        Connection should be keep-alive
*/

    @Test
    public void asserHeaderMethod(){
//        https://restful-booker.herokuapp.com/booking
//        User sends a GET Request to the url
        //response.prettyPrint();

//        HTTP Status Code should be 200
        // Direct assertion can be performed with the then() method.

//        Content Type should be JSON

//        Status Line should be HTTP/1.1 200 OK

//        Connection should be keep-alive

    }

}
