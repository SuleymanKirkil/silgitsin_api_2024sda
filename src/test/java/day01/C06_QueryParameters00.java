package day01;

import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.hasSize;
import static org.junit.Assert.assertTrue;

public class C06_QueryParameters00 {
    /*
    Given
       https://restful-booker.herokuapp.com/booking
    When
       User sends a GET request to the URL
    Then
       Status code is 200
    And
       Among the data, there should be someone whose first name is "Jane" and last name is "Doe"
*/

    @Test
    public void queryParametersTest() {

//        1. Set the URL

//        2. Set the expected data

//        3. Send the request and get the response


//        4. Do Assertion

        //1st way:

        //2nd way:

    }


}
