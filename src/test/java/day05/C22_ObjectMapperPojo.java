package day05;

import baseUrls.JsonPlaceHolderBaseUrl;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import pojos.JsonPlaceHolderPojo;

import static io.restassured.RestAssured.given;

public class C22_ObjectMapperPojo extends JsonPlaceHolderBaseUrl {

/*
         Given
           1) https://jsonplaceholder.typicode.com/todos
           2) {
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

Note: Use map and POJO seperately
*/

    @Test
    public void test() throws JsonProcessingException {
        // Set Url
        spec.pathParam("first","todos");

        // Set expected data
        String expectedString = """
                {
                                "userId": 55,
                               "title": "Tidy your room",
                               "completed": false
                               }""";
        ObjectMapper objectMapper = new ObjectMapper();
         JsonPlaceHolderPojo payload2 = objectMapper.readValue(expectedString, JsonPlaceHolderPojo.class);

        System.out.println("payload2 = " + payload2);
        // Sent request and get response
        Response response = given(spec).body(payload2).when().post("{first}");
        response.prettyPrint();

        // Do assertions
        JsonPlaceHolderPojo actualData;
        try {
            actualData = objectMapper.readValue(response.asString(),JsonPlaceHolderPojo.class);

        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

        System.out.println("actualData = " + actualData);
    }
}
