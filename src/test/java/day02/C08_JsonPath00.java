package day02;

import baseUrls.BookerBaseUrl;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class C08_JsonPath00 extends BookerBaseUrl
{

    /*
    Given
        https://restful-booker.herokuapp.com/booking/32
    When
        User send a GET request to the URL
    Then
        HTTP Status Code should be 200
    And
        Response content type is “application/json”
    And
        Response body should be like;
        {
            "firstname": "Josh",
            "lastname": "Allen",
            "totalprice": 111,
            "depositpaid": true,
            "bookingdates": {
                "checkin": "2018-01-01",
                "checkout": "2019-01-01"
            },
            "additionalneeds": "super bowls"
        }
*/

    @Test
    public void jsonPathTest() {

        //Set the Url

        //Set the expected data


        //Send the request and get the response


        //Do assertion
        //1st way: then() method with hamcrest matchers


        //2nd way: By extracting data outside the body with JSONPath
        //Convert Response to JsonPath object


        //Retrieve the desired data by using JsonPath object


                                        //If this assertion fails, the subsequent lines won't execute. Because this is Hard Assertion.


        //How to use Soft Assertion
        //1st step: Create SoftAssert object

        //2nd step: Do assertion
                                                //If this assertion fails, the subsequent lines will execute as well. Because this is Soft Assertion.


        //3rd step: Use assertAll() method.

        //Not: Hard assertion is used commonly in market. Because if any failure occurs we must fix it immediately.

    }
}
