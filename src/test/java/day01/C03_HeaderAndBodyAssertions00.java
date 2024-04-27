package day01;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Test;

import static org.junit.Assert.*;

public class C03_HeaderAndBodyAssertions00 {

/*
   Given
       https://restful-booker.herokuapp.com/booking/0
   When
       User sends a GET Request to the URL
   Then
       HTTP Status code should be 404
   And
       Status Line should be HTTP/1.1 404 Not Found
   And
       Response body contains "Not Found"
   And
       Response body does not contain "Clarusway"
   And
       Server is "Cowboy"
*/

    @Test
    void assertionMethod() {
//        https://restful-booker.herokuapp.com/booking/0
//        User sends a GET Request to the URL

        //response.prettyPrint();

//        HTTP Status code should be 404
//        Status Line should be HTTP/1.1 404 Not Found
//        Server is "Cowboy"

        //1st way: We can assert headers with method chain.


        //2nd way:



//        Response body contains "Not Found"

                                //If the boolean value between parenthesis is TRUE test will pass

//        Response body does not contain "Clarusway"
                                //If the boolean value between parenthesis is FALSE test will pass

    }
}
