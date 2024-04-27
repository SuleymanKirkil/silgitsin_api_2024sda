package day02;

import baseUrls.JsonPlaceHolderBaseUrl;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class C10_PostRequest00 extends JsonPlaceHolderBaseUrl {

    /*
     Given
       1) https://jsonplaceholder.typicode.com/todos
       2)  {
             "userId": 55,
             "title": "Tidy your room",
             "completed": false
          }
    When
        I send POST Request to the Url

    Then
        Status code is 201
    And
        response body is like {
                                "userId": 55,
                                "title": "Tidy your room",
                                "completed": false,
                                "id": 201
                                }
*/

    @Test
    public void postRequestTest() {

        //Set the Url

        //Set the expected data(Payload) --> Preparing expected data as String is not recommended. Because we can not extract specific field from String body for assertion.

                                        //For serialization, we need to declare content type. This process is repetitive action, to avoid repeation we will put this in spec object.

        //Send the request and get the response


        //Do assertion


    }
}
